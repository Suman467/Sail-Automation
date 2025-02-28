package com.sail.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//PageFactory
	
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='front']//img[@alt='Logo']")
	WebElement logo;

	@FindBy(xpath= "(//input[@placeholder='Username'])[1]")
	WebElement userName ;
	
	@FindBy(xpath="(//input[@placeholder='Password'])[1]")
	WebElement password ;
	
	@FindBy(xpath="(//input[@placeholder='Domain'])[1]")
	WebElement domainName;
	
	@FindBy(xpath="(//input[@placeholder='Captcha'])[1]")
	WebElement captcha;
	

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

	public WebElement getCaptcha() {
		return captcha;
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
	
	
	// For Invalid credentials
	
	//@FindBy(xpath="//span[normalize-space()='Tenant not found']")
	@FindBy(xpath="//snack-bar-container[@role='status']")
	WebElement invalidDeatils;

	
	

	
	
	public WebElement getInvalidDetails() {
		return invalidDeatils;
	}

	
	@FindBy(xpath="(//div[@class='mat-slide-toggle-thumb'])[1]")
	WebElement remeberToggleBtn;
	
	@FindBy(xpath="(//input[@id='mat-slide-toggle-1-input'])[1]")
	WebElement toggleBtnState;
	
	
	@FindBy(xpath="//input[@placeholder='Enter OTP']")
	WebElement optPage;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement submitOTP;

	public WebElement getSubmitOTP() {
		return submitOTP;
	}

	public WebElement getInvalidDeatils() {
		return invalidDeatils;
	}

	public WebElement getRemeberToggleBtn() {
		return remeberToggleBtn;
	}

	public WebElement getToggleBtnState() {
		return toggleBtnState;
	}

	public WebElement getOptPage() {
		return optPage;
	}
	
	@FindBy(xpath="//div[@class='profile-image ng-star-inserted']")
    WebElement userprofile;	
	
	
	@FindBy(xpath="//button[normalize-space()='Logout']")
	WebElement logOut;

	public WebElement getUserprofile() {
		return userprofile;
	}

	public WebElement getLogOut() {
		return logOut;
	}
	
	
	@FindBy(xpath="(//div[@class='login-error ng-star-inserted'][normalize-space()='Incorrect captcha. Please try again.'])[1]")
	WebElement incorrectCaptcha;
	
	

	public WebElement getIncorrectCaptcha() {
		return incorrectCaptcha;
	}
	
	@FindBy(xpath="//div[@class='confirmation-content ng-star-inserted']")
	WebElement confirmationPopUp;
	
	
	@FindBy(xpath="//span[contains(text(),'Proceed')]")
	WebElement proceed;
	
	
	@FindBy(xpath="//mat-dialog-container[@id='mat-dialog-0']")
	WebElement conformationPopUpDialogBox;
	
	public WebElement getConformationPopUpDialogBox() {
		return conformationPopUpDialogBox;
	}

	public WebElement getConfirmationPopUp() {
		return confirmationPopUp;
	}

	public WebElement getProceed() {
		return proceed;
	}

	
}
