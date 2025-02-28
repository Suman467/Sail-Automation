package com.sail.qa.TestCases.login;

import java.io.IOException;
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

public class LoginForMultipleClients2 {

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

    @Parameters({"url","Email", "Password", "Domain1", "Domain2", "Domain3", "Domain4", "Domain5", "Domain6", "Domain7", 
                 "Domain8", "Domain9", "Domain10", "Domain11", "Domain12", "Domain13", "Domain14", "Domain15"})
    @Test
    public void testLoginLogoutForMultipleUsers(String url,String Email, String Password, String... domains) throws IOException, InterruptedException {
        // Loop through the domains dynamically and login/logout for each one
        for (String domain : domains) {
            loginAndLogout(url,Email, Password, domain);
        }
    }

    // Method to perform login with credentials (username, password, domain)
    public void loginAndLogout(String url,String Email, String Password, String Domain) throws IOException, InterruptedException {
        Thread.sleep(1000); // Optional: can be improved using WebDriverWait
        
        LoginPage login = new LoginPage(getDriver());
        
        // Perform login steps
        getDriver().get(url);

        login.getUserName().sendKeys(Email);
        login.getPassword().sendKeys(Password);
        login.getDomainName().sendKeys(Domain);

      // handleCaptcha(Email);       
        // Handle captcha if required
        
        login.getSubmitBtn().click(); 
        Thread.sleep(1000);// Click Login
        
        handleConfirmationPopUp();
        
        login.getUserprofile().click();  // Click on user profile
        System.out.println("User profile is open");
        
        login.getLogOut().click();  // Click logout
        System.out.println("Logout button is clicked");
        Thread.sleep(1000);
        login.getUserName().clear();
        login.getPassword().clear();
        login.getDomainName().clear();
        
        
        
    }
        
        
        
        
        
    
        
        
        
        
        /*
        
        // Handle confirmation pop-up if displayed
        handleConfirmationPopUp();
        
        // Validate successful login
        Assert.assertTrue(login.getDashboard().isDisplayed(), "Dashboard tab is not visible after login.");
        System.out.println("Logged in as: " + Email + " with domain: " + Domain);

        // Perform logout after successful login
        logoutUser(login);
        
        // Optional: Clear the fields for the next iteration
        Thread.sleep(1000);
        clearFields(login);
    }

    // Handle captcha if it appears
    public void handleCaptcha(String email) throws InterruptedException {
        LoginPage loginpage = new LoginPage(getDriver());

        try {
            WebDriverWait wait = new WebDriverWait(driver.get(), Duration.ofSeconds(10));
            WebElement captchaElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Captcha'])[1]")));
            
            if (captchaElement != null && captchaElement.isDisplayed()) {
                System.out.println("Captcha is visible, retrying username.");
                loginpage.getUserName().clear();  // Clear username field
                Thread.sleep(2000); // Optional wait before retry
                loginpage.getUserName().sendKeys(email); // Retry entering email
            } else {
                System.out.println("Captcha not visible, proceeding with login.");
            }
        } catch (Exception e) {
            System.out.println("Captcha not found or not visible. Proceeding with login.");
        }
    }


*/
    // Handle confirmation pop-up
    public void handleConfirmationPopUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        
        try {
            WebElement confirmationPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Proceed')]")));
            
            if (confirmationPopUp != null && confirmationPopUp.isDisplayed()) {
                confirmationPopUp.click();
                System.out.println("Confirmation pop-up displayed, 'Proceed' button clicked.");
            }
        } catch (Exception e) {
            System.out.println("No confirmation pop-up displayed.");
        }
    }
    
    
    

    // Method to log out the user
    public void logoutUser(LoginPage login) throws InterruptedException {
        login.getUserprofile().click();  // Click on user profile
        System.out.println("User profile is open");
        
        login.getLogOut().click();  // Click logout
        System.out.println("Logout button is clicked");
        
        // Optional assertion or log to confirm logout
        System.out.println("User successfully logged out");
    }
    
    
    
    

    // Clear fields for the next login attempt
    public void clearFields(LoginPage login) {
        login.getUserName().clear();
        login.getPassword().clear();
        login.getDomainName().clear();
    }


    @AfterTest
    public void tearDown() {
        // Close the browser after all tests are done
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
