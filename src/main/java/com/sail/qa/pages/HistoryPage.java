package com.sail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryPage {
	
	WebDriver ldriver;

	public HistoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[7]")
	WebElement historyPage ;
	
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[16]")
	WebElement newRecordButton;
	
	@FindBy(xpath="//button[@class='table-filter-btn md-raised mat-stroked-button btn-field-bt-mg ng-star-inserted']//span[@class='mat-button-wrapper']")
	WebElement filterBtn;
	
	@FindBy(xpath="//label[normalize-space()='HISTORY']")
	WebElement historyTab;
	
	@FindBy(xpath="//label[normalize-space()='REQUESTED']")
	WebElement requestedTab;
	
	@FindBy(xpath="//label[normalize-space()='ALL VESSEL']")
	WebElement allVesselTab;
	
	@FindBy(xpath="//label[normalize-space()='MY VESSEL']")
	WebElement myVesselTab;
	
	@FindBy(xpath="//span[@ref='lbRecordCount']")
	WebElement totalInsRecords;
	
	@FindBy(xpath="//div[contains(text(),'Manual Data Entry')]")
	WebElement manulaDataEntryLabel;
	
	@FindBy(xpath="//div[contains(text(),'SIRE/ CDI XML Upload')]")
	WebElement uploadXmlLabel;
	
	@FindBy(xpath="//*[@formcontrolname='vesselId']")
	WebElement vesselDropdownList;
	
	@FindBy(xpath="//span[normalize-space()='ADD NEW']")
	WebElement addNewButton;
	
	@FindBy(xpath="//span[normalize-space()='UPLOAD']")
	WebElement uploadButton;
	
	@FindBy(xpath="//div[contains(text(),'*Vessel is required')]")
	WebElement error;
	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c150-13']")
	WebElement inspectionList;
	
	public WebElement selectInspectionFromDropdown(int indexToSelectInspection) {
        WebElement inspection = ldriver.findElement(By.xpath("(//span[@class='mat-option-text'])[" + indexToSelectInspection + "]"));
		return inspection;
	}
       
	
	
	public WebElement selectVesselFromDropdown(int indexToSelectVessel) {
        WebElement vesselList = ldriver.findElement(By.xpath("(//span[@class='mat-option-text'])[" + indexToSelectVessel + "]"));
		return vesselList;
       
    }
	
	@FindBy(xpath="//app-toolbar[@class='ng-star-inserted']//span[@class='mat-button-wrapper']")
	WebElement inspectionsBtn;
	
	
	
	
	}
