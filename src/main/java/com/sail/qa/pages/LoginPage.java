package com.sail.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//PageFactory
	
	
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@class='front']//img[@alt='Logo']")
	WebElement logo;

	@FindBy(xpath= "//input[@id='mat-input-0']")
	WebElement userName ;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement password ;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement domainName;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement submitBtn;
	
	@FindBy(xpath="//a[normalize-space()='Forgot Password']")
	WebElement forgotPwd;
	
	@FindBy(xpath="//span[contains(text(),'Reset Password')]")
	WebElement resetPwd;
	
	@FindBy(xpath="//a[normalize-space()='Back To Login']")
	WebElement bckToLogin;
	
	@FindBy(xpath="//span[@class='mat-slide-toggle-content']")
	WebElement rememberMe ;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-button mat-button-base menu-button active']")
	WebElement dashboard;
	
	

	
	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDomainName() {
		return domainName;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getForgotPwd() {
		return forgotPwd;
	}

	public WebElement getResetPwd() {
		return resetPwd;
	}

	public WebElement getBckToLogin() {
		return bckToLogin;
	}

	public WebElement getRememberMe() {
		return rememberMe;
	}
	
	
	

	
}
