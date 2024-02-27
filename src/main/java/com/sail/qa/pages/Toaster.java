package com.sail.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Toaster {
	

	WebDriver ldriver;

	public Toaster(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@id='toast-container']")
	WebElement toaster;

	public WebElement getToaster() {
		return toaster;
	}
	

}
