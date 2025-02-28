package com.sail.qa.TestCases;


import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.LoginPage;




public class LoginPageTest extends TestBase {
	public static Logger log = LogManager.getLogger(LoginPageTest.class.getName());
	
	
	
	@Test
	@Parameters({"browser", "execution", "URL", "Email", "Password", "Domain"})
	public void OfflineLogin(String browser, @Optional() String execution, String URL, 
	                         String Email, String Password, String Domain) throws IOException, InterruptedException {
	    
	    getFluentWait();
	    this.setup(browser, execution);
	    LoginPage login = new LoginPage(driver);
	    driver.get(URL);
	    log.info("URL is entered in browser");

	    System.out.println("URL is entered");
	    getFluentWait();

	    // Validate Page Title
	    String pageTitle = driver.getTitle();
	    System.out.println("Page title: " + pageTitle);
	    
	    // Assert.assertEquals(pageTitle, "Login");
	    
	    getFluentWait();
	    Assert.assertTrue(login.getLogo().isDisplayed(), "Login page logo is not displayed");
	    System.out.println("Login page logo is displayed");

	    // Enter login details
	    sendKeys(login.getUserName(), Email);
	    log.info("Username entered");
	    System.out.println("Username entered");

	    sendKeys(login.getPassword(), Password);
	    log.info("Password entered");
	    System.out.println("Password entered");

	    sendKeys(login.getDomainName(), Domain);
	    log.info("Domain name entered");
	    System.out.println("Domain name entered");

	    getFluentWait();

	    // Handle CAPTCHA manually
	    System.out.println("Please complete the CAPTCHA and press Enter to continue...");
	    new Scanner(System.in).nextLine();  // Wait for user input before proceeding

	    clickElement(login.getSubmitBtn());
	    log.info("Login button clicked");
	    System.out.println("Login button clicked");

	    getFluentWait();

	    // Handle incorrect CAPTCHA scenario
	    try {
	        if (login.getIncorrectCaptcha().isDisplayed()) {
	            System.out.println("Incorrect CAPTCHA. Please complete the CAPTCHA again and press Enter...");
	            new Scanner(System.in).nextLine();
	            clickElement(login.getSubmitBtn());
	            log.info("Login button clicked again");
	            System.out.println("Login button clicked again");
	        }
	    } catch (NoSuchElementException e) {
	        log.info("CAPTCHA was correct, proceeding...");
	    }

	    // Wait until Dashboard appears
	    getFluentWait();
	    Assert.assertTrue(login.getDashboard().isDisplayed(), "Dashboard is not visible after login");
	    System.out.println("Dashboard tab is visible");
	}
  
	
	
	
	
	@Test
	@Parameters({"browser", "execution", "URL", "Email", "Password", "Domain"})
	public void AdminLogin(String browser, @Optional() String execution, String URL, String Email, String Password, String Domain) throws IOException, InterruptedException {
	    getFluentWait();
	    this.setup(browser, execution);
	    LoginPage login = new LoginPage(driver);
	    driver.get(URL);
	    log.info("URL is entered on chrome browser");
	    System.out.println("URL is entered");
	    getFluentWait();
	    
	    String pageTitle = driver.getTitle();
	    System.out.println("Page title is: " + pageTitle);
	    getFluentWait();
	    Assert.assertTrue(login.getLogo().isDisplayed(), "Logo is not displayed");
	    System.out.println("Page logo is displaying");
	    getFluentWait();
	    
	    sendKeys(login.getUserName(), Email);
	    log.info("User name is entered");
	    System.out.println("User name is entered");
	    sendKeys(login.getPassword(), Password);
	    log.info("Password is entered");
	    System.out.println("Password is entered");
	    sendKeys(login.getDomainName(), Domain);
	    log.info("Domain name is entered");
	    System.out.println("Domain name is entered");
	    Thread.sleep(1000);
	        
	        clickElement(login.getSubmitBtn());
	        log.info("Login button is clicked");
	        System.out.println("Login button is clicked");
	       //Thread.sleep(1000);
	       try {

	       if (login.getConfirmationPopUp().isDisplayed()) {
	           // If confirmation pop-up is displayed
	           System.out.println("Confirmation pop-up is displayed");
	           System.out.println(getText(login.getConfirmationPopUp()));
	           clickElement(login.getProceed());
	           System.out.println("Proceed Button is clicked on confirmation pop-up");

	           // Wait for next action after confirmation
	           getFluentWait();
	       }
	       }
	       
	      
	       catch (NoSuchElementException  e) {
	           // If the pop-up is not found or timed out, handle this scenario
	           System.out.println("No confirmation pop-up displayed.");
	       }

	       // Final validation and logging
	       Thread.sleep(1000);
	       Assert.assertTrue(login.getDashboard().isDisplayed(), "Dashboard tab is not visible after login attempt.");
	       System.out.println("Dashboard tab is visible post-login");

	      
	       Thread.sleep(2000);
	       
	       
	       
	       
	       
	   
	}

	
	
	
	
	@Test
	@Parameters({"browser" , "execution", "URL","Email" ,"Password" ,"Domain"})
	public void AdminLoginWithInvaildCredentials(String browser,@Optional() String execution,String URL , String Email , String Password, String Domain) throws IOException, InterruptedException
	{
		getFluentWait();
		this.setup(browser, execution);
		LoginPage login = new LoginPage(driver);
		driver.get(URL);
		log.info("url is entered on chrome browser");
		System.out.println("URL is entered");
		getFluentWait();
		String pageTitle = driver.getTitle();
		
		//Assert.assertEquals(pageTitle, "Login");
		System.out.println("page title is : "+pageTitle);
		getFluentWait();
		Assert.assertTrue(login.getLogo().isDisplayed());
		System.out.println("Page logo is displaying");
		getFluentWait();
	    sendKeys(login.getUserName(),Email);
	    log.info("User name  is entered");
	    System.out.println("User name  is entered");
	    sendKeys(login.getPassword(),Password);
	    log.info("Password is entered");
	    System.out.println("Password is entered");
	    sendKeys(login.getDomainName(), Domain);
	    log.info("Domain name is entered");
	    System.out.println("Domain name is entered");
	    
	    
	    
	  
	    clickElement(login.getSubmitBtn());
	    log.info("Login button is clicked");	    
	    System.out.println("Login button is clicked");
	    
	    
	    try {
	        if (login.getInvalidDetails().isDisplayed()) {
	            System.out.println("Login Unsuccessful- " +getText(login.getInvalidDetails())); // Print domain error message
	        }
	    } catch (NoSuchElementException e) {
	    	
	    	System.out.println(e);
	    }
	    
	    
	 
	   
	   	    
	}
	
	
	
	
	public void handleCaptcha() throws InterruptedException {
        LoginPage loginpage = new LoginPage(driver);

        // Check if CAPTCHA is visible
        try {
            // Wait for the CAPTCHA to be visible (using WebDriverWait)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Wait for 10 seconds
            WebElement captchaElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Captcha'])[1]"))); // Correct locator for CAPTCHA element

            // If CAPTCHA is visible, clear the username and re-enter the email
            if (captchaElement != null && captchaElement.isDisplayed()) {
                
            	
            	 
        	    System.out.println("Please complete the captcha and press Enter to continue...");
        	    new Scanner(System.in).nextLine();
        	    
        	    
            	
            } else {
                // If CAPTCHA is not visible, just log that we're proceeding with login
            	
                System.out.println("Captcha not visible, proceeding with login.");
            }
        } catch (Exception e) {
            // If CAPTCHA is not found (i.e., the element is not visible), just proceed with login
            System.out.println("Captcha not found or not visible. Proceeding with login.");
        }
    }

}

