package com.sail.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.LoginPage;

public class TearDown extends TestBase {
	
	@Parameters({"Domain"})
	@Test
    public void tearDown(@Optional() String Domain) {
           // if (driver != null) {
		LoginPage lp= new LoginPage(driver);
		clickElement(lp.getUserprofile());
		System.out.println("User profile is open");
		getFluentWait();
		clickElement(lp.getLogOut());
		System.out.println("Logout button is clicked");
		getFluentWait();
		Assert.assertTrue(lp.getUserName().isDisplayed());
		System.out.println("User successfully logout");
		getFluentWait();
		
            driver.quit();
            log.info("Test cases are executed Successfully");
            System.out.println("Browser is closed");
            
            getFluentWait();
            System.out.println("Logging out Domain: " + Domain);
            
            
        }
	
	
    }



