package com.sail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage {

	WebDriver ldriver;

	public ReportPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//@FindBy(xpath = "//span[normalize-space()='Report']")
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[9]")
	WebElement reportTab;

	@FindBy(xpath = "//div[normalize-space()='TIME PERIOD']")
	WebElement timePeriod;

	@FindBy(xpath = "//div[normalize-space()='CONSOLIDATED REPORTS']")
	WebElement consolidateReport;

	@FindBy(xpath = "//div[normalize-space()='INSPECTION SPECIFIC REPORT']")
	WebElement inspectionReport;

	@FindBy(xpath = "//a[normalize-space()='Generate']")
	WebElement generateBtn;

	// @FindBy(xpath="(//div[@class='mat-radio-outer-circle'])[2]")
	@FindBy(xpath = "//b[normalize-space()='SIRE']")
	WebElement sire;

	/*
	 * public WebElement selectInspection(int index) { WebElement prepTableRow =
	 * ldriver.findElement(By.xpath("(//div[@class='mat-radio-outer-circle'])[" +
	 * index + "]")); return prepTableRow; }
	 * 
	 */

	@FindBy(xpath = "(//mat-icon[contains(text(),'create')])[1]")
	WebElement sireEditIcon;

	@FindBy(xpath = "(//mat-icon[contains(text(),'create')])[3]")
	WebElement cdiEditIcon;

	@FindBy(xpath = "(//mat-icon[contains(text(),'create')])[3]")
	WebElement pscEditIcon;
	
	@FindBy(xpath="//span[contains(text(),'refresh')]")
	WebElement refreshIcon;
	
	@FindBy(xpath="//span[normalize-space()='Clear']")
	WebElement clearBtn;
	
	@FindBy(xpath="//span[@class='mat-select-placeholder ng-tns-c150-2 ng-star-inserted']")
	WebElement yearDrpDown;
	
	
	
	public WebElement getYearDrpDown() {
		return yearDrpDown;
	}


	public WebElement getSireEditIcon() {
		return sireEditIcon;
	}


	public WebElement getCdiEditIcon() {
		return cdiEditIcon;
	}


	public WebElement getPscEditIcon() {
		return pscEditIcon;
	}


	public WebElement getClearBtn() {
		return clearBtn;
	}


	public WebElement selectYear(int reportYear) {
	    WebElement report_Year = ldriver.findElement(By.xpath("//span[normalize-space()='" + reportYear + "']"));
	    return report_Year;
	}
	
	
		public WebElement getRefreshIcon() {
		return refreshIcon;
	}

	public WebElement getReportTab() {
		return reportTab;
	}

	public WebElement getTimePeriod() {
		return timePeriod;
	}

	public WebElement getConsolidateReport() {
		return consolidateReport;
	}

	public WebElement getInspectionReport() {
		return inspectionReport;
	}

	public WebElement getGenerateBtn() {
		return generateBtn;
	}

	public WebElement getSire() {
		return sire;
	}

	// CDI Reports
	@FindBy(xpath = "//b[normalize-space()='CDI']")
	WebElement cdi;

	public WebElement getCdi() {
		return cdi;
	}

	// PSC Reports
	@FindBy(xpath = "//b[normalize-space()='PSC']")
	WebElement psc;

	public WebElement getPsc() {
		return psc;
	}
	
	// Internal Audit
	@FindBy(xpath = "//b[normalize-space()='Internal Audit']")
	WebElement internalAudit;
	
	public WebElement getInternalAudit() {
		return internalAudit;
	}

	// Navigation Audit


	

	@FindBy(xpath = "//b[normalize-space()='Navigation Audit']")
	WebElement navAudit;

	public WebElement getNavAudit() {
		return navAudit;
	}

	// Supdt. Inspection

	@FindBy(xpath = "//b[normalize-space()='Supdt. Inspection']")
	WebElement supdtInspection;

	public WebElement getSupdtInspection() {
		return supdtInspection;
	}

	@FindBy(xpath="(//mat-icon[contains(text(),'create')])[1]")
	WebElement editSireIcon;
	
	@FindBy(xpath="//div[normalize-space()='All Observation']")
	WebElement allObsCheckBox;
	
	//@FindBy(xpath="//div[@class='row ng-star-inserted']//a[@class='generate-btn'][normalize-space()='Generate']")
	@FindBy(xpath="//a[normalize-space()='Generate']")
	WebElement generateBtton;

	public WebElement getAllObsCheckBox() {
		return allObsCheckBox;
	}


	public WebElement getGenerateBtton() {
		return generateBtton;
	}


	public WebElement getEditSireIcon() {
		return editSireIcon;
	}

	public WebElement selectReportName(String Report) {
		WebElement rep_Name = ldriver.findElement(By.xpath("//b[normalize-space()='" + Report + "']"));
	    return rep_Name;
	}

	

}
