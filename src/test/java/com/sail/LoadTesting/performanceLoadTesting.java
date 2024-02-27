package com.sail.LoadTesting;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.LoginPage;

public class performanceLoadTesting extends TestBase {
	
	@Test(invocationCount=3,threadPoolSize = 5)
	@Parameters({"browser" , "execution", "URL","Email" ,"Password" ,"Domain"})
	public void AdminLogin(String browser,@Optional() String execution,String URL , String Email , String Password, String Domain) throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		this.setup(browser, execution);
		LoginPage login = new LoginPage(driver);
		driver.get(URL);
		log.info("url is entered on chrome browser");
		System.out.println("URL is entered");
		getFluentWait();
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Login");
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
	    getFluentWait();
	    Assert.assertTrue(login.getDashboard().isDisplayed());
	    System.out.println("Dashoard tab is visible");
	   
	}

	

}
