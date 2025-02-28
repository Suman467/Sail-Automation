package com.sail.qa.TestCases.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginForMultipleClients {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeTest
    public void setupBrowser() {
        // Set up the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Set Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Initialize WebDriver for the current thread
        driver.set(new ChromeDriver(options));
        getDriver().manage().window().maximize(); // Maximize window after initializing the driver
    }

    public WebDriver getDriver() {
        WebDriver driverInstance = driver.get();
        if (driverInstance == null) {
            System.out.println("WebDriver instance is null!");
        }
        return driverInstance;
    }

    @Test
    @Parameters({"Email", "Password", "Domain"})
    public void login(String Email, String Password, String Domain) throws InterruptedException {
        LoginPage loginpage = new LoginPage(getDriver());

        // Open the login page
        getDriver().get("https://dev2.sl-sail.com/login");

        // Interact with login elements
        loginpage.getUserName().sendKeys(Email);
        System.out.println("Email id is entered");

        loginpage.getPassword().sendKeys(Password);
        System.out.println("Password is entered");
        
        loginpage.getDomainName().sendKeys(Domain);
        System.out.println("Domain name entered");
        Thread.sleep(2000);

        // CAPTCHA Handling
       // handleCaptcha(Email);
       // Thread.sleep(2000);

        // Click the login button
        loginpage.getSubmitBtn().click();
        System.out.println("Login Button is clicked");
        Thread.sleep(3000);

        // Handle confirmation pop-up if it appears
        handleConfirmationPopUp();
       // Thread.sleep(5000);

        // Validate successful login by checking dashboard visibility
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(80)); // Set the wait time
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='mat-focus-indicator mat-button mat-button-base menu-button active']"))); // Wait for element visibility
        
        Assert.assertTrue(element.isDisplayed()); // Assert that the element is displayed, indicating successful login
        System.out.println("Logged in as: " + Email + " with domain: " + Domain);
        
        
        loginpage.getUserprofile().click();  // Click on user profile
        System.out.println("User profile is open");
        
        loginpage.getLogOut().click();  // Click logout
        System.out.println("Logout button is clicked");
        Thread.sleep(1000);
        loginpage.getUserName().clear();
        loginpage.getPassword().clear();
        loginpage.getDomainName().clear();
        
        
        
    }

    // Method to handle CAPTCHA if it appears
    public void handleCaptcha(String email) throws InterruptedException {
        LoginPage loginpage = new LoginPage(getDriver());

        // Check if CAPTCHA is visible
        try {
            // Wait for the CAPTCHA to be visible (using WebDriverWait)
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30)); // Wait for 10 seconds
            WebElement captchaElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Captcha'])[1]"))); // Correct locator for CAPTCHA element

            // If CAPTCHA is visible, clear the username and re-enter the email
            if (captchaElement != null && captchaElement.isDisplayed()) {
                System.out.println("Captcha is visible, retrying username.");
                loginpage.getUserName().clear();  // Clear the username field
                Thread.sleep(2000); // Optional: brief wait before retrying
                loginpage.getUserName().sendKeys(email); // Retry entering the email
            } else {
                // If CAPTCHA is not visible, just log that we're proceeding with login
                System.out.println("Captcha not visible, proceeding with login.");
            }
        } catch (Exception e) {
            // If CAPTCHA is not found (i.e., the element is not visible), just proceed with login
            System.out.println("Captcha not found or not visible. Proceeding with login.");
        }
    }


    // Method to handle confirmation pop-up if it appears
    public void handleConfirmationPopUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30)); // Wait for 10 seconds
        WebElement confirmationPopUp = null;
        
        try {
            // Wait for the confirmation pop-up (if it exists)
            confirmationPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Proceed')]"))); // Adjust locator as needed

            if (confirmationPopUp != null && confirmationPopUp.isDisplayed()) {
                // If pop-up is visible, click the 'Yes' button
                confirmationPopUp.click();
                System.out.println("Confirmation pop-up displayed, 'Proceed' button clicked.");
            }
        } catch (Exception e) {
            // If no confirmation pop-up is displayed, proceed with the rest of the logic
            System.out.println("No confirmation pop-up displayed.");
        }
    }


    @AfterTest
    public void closeBrowser() {
        // Quit the browser after tests are done
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
