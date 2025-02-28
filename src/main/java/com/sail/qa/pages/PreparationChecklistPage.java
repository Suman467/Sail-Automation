package com.sail.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PreparationChecklistPage {
	
	WebDriver ldriver;

	public PreparationChecklistPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[@class='dialog-header-label ng-star-inserted']")
	WebElement vesselName;
	
	@FindBy(xpath="//div[@class='online-status ng-star-inserted']")
	WebElement onlineGreenBtn;
	
	@FindBy(xpath="//span[normalize-space()='Go Offline']")
	WebElement goOfflineBtn;
	
	@FindBy(xpath="//mat-icon[normalize-space()='chat']")
	WebElement chatIcon;
	
	@FindBy(xpath="(//span[normalize-space()='Back'])[1]")
	WebElement backBtnOnTop;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//span[normalize-space()='View']")
	WebElement viewBtn;
	
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[5]")
	WebElement filterBtn;
	
	@FindBy(xpath="//button[@id='mat-button-toggle-19-button']//div[1]")
	WebElement allQuestions;
	
	@FindBy(xpath="//span[@class='ng-tns-c150-355 ng-star-inserted']")
	WebElement chapter;
	
	@FindBy(xpath="//span[@class='mat-option-text']")
	WebElement chapters;

	
}
