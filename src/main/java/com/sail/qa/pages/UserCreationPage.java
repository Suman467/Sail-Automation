package com.sail.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCreationPage {
	
	//PageFactory
	
	
	WebDriver ldriver;

	public UserCreationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-menu-trigger menu-button mat-button mat-button-base']"
			+ "//mat-icon[@role='img']//*[name()='svg']")
	WebElement menu;
	
	@FindBy(xpath="//button[normalize-space()='Admin Area']")
	WebElement adminArea;
	
	@FindBy(xpath="(//button[@class='mat-focus-indicator menu-button mat-button mat-button-base ng-star-inserted'])[6]")
	WebElement userManagement;
	
	@FindBy(xpath="//mat-icon[normalize-space()='add']")
	WebElement addUserBtn;
	
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[5]")
	WebElement userBtn;
	
	@FindBy(xpath="//mat-card-title[normalize-space()='New User']")
	WebElement newUserTitle;
	
	@FindBy(xpath="//strong[normalize-space()='Basic Details:']")
	WebElement basicDetailsText;
	
	@FindBy(xpath="//div[@class='mg-around']")
	WebElement userType;
	
	@FindBy(xpath="(//div[@class='mat-radio-outer-circle'])[1]")
	WebElement officeRadioBtn;
	
	@FindBy(xpath="(//div[@class='mat-radio-outer-circle'])[2]")
	WebElement vesselRadioBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter User Name']")
	WebElement userNameInputBox;
	
	
	@FindBy(xpath="//input[@placeholder='Enter password']")
	WebElement passwordInputBox;
	
	@FindBy(xpath="//input[@placeholder='Enter User first name']")
	WebElement firstNameInputBox;
	
	@FindBy(xpath="//input[@placeholder='Enter User last name']")
	WebElement lastNameInputBox;
	
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement emailInputBox;
}
