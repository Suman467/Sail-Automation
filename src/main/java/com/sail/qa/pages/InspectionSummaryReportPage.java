package com.sail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InspectionSummaryReportPage {

	WebDriver ldriver;

	public InspectionSummaryReportPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// All Inspection summary
	
		@FindBy(xpath="//b[normalize-space()='All Inspections Summary']")
		WebElement allInspSummaryCheckBox;
		
		@FindBy(xpath="(//span[@class='mat-checkbox-label'])[4]")
		WebElement allReportContent;
		
		
		@FindBy(xpath="//span[normalize-space()='Inspection Summary']")
		WebElement inspSummaryCheckBox ;
		
		@FindBy(xpath="//span[normalize-space()='All Observation']")
		WebElement allObservationCheckBox;
		
		
		@FindBy(xpath="(//span[@class='mat-checkbox-label'])[9]")
		WebElement internalInspectionAllCheckBox;
		
		@FindBy(xpath="//span[normalize-space()='Supdt. Inspection']")
		WebElement supdtInspCheckBox;
		
		@FindBy(xpath="//span[normalize-space()='Navigation Audit']")
		WebElement navigationAuditCheckBox;
		
		@FindBy(xpath="//span[normalize-space()='Cargo Audit']")
		WebElement cargoAuditCheckBox;

		@FindBy(xpath="//span[normalize-space()='Mooring Audit']")
		WebElement mooringAuditCheckBox;
		
		@FindBy(xpath="//span[normalize-space()='Bunkering Audit']")
		WebElement bunkeringAuditCheckBox;
		
		@FindBy(xpath="(//span[@class='mat-checkbox-label'])[21]")
		WebElement externalInspAllCheckBox;
		
		
		@FindBy(xpath="(//div[@class='mat-checkbox-inner-container'])[22]")
		WebElement sireCheckBox ;
		
		
		@FindBy(xpath="(//span[@class='mat-checkbox-label'])[24]")
		WebElement cdiCheckBox ;
		
		@FindBy(xpath="(//span[@class='mat-checkbox-label'])[26]")
		WebElement pscCheckBox ;
		
		
		
		
	
	// Generated report
		
	@FindBy(xpath="//div[contains(text(),'INSPECTION -')]")
	WebElement reportTitle;
	
	@FindBy(xpath="//div[contains(text(),'AUDIT -')]")
	WebElement reportTitleAudit;

	@FindBy(xpath="//div[@class='top-heading spt-2 spb-1']")
	WebElement reportHeading;
	
	@FindBy(xpath="//div[contains(text(),'INSPECTION - Summary ')]")
	WebElement inspSummary;
	
	
	@FindBy(xpath="//div[contains(text(),'INSPECTION - List of Inspections')]")
	WebElement listOfInsp;
	
	@FindBy(xpath="//div[contains(text(),'AUDIT - Summary')]")
	WebElement auditSummary;
	
	@FindBy(xpath="//div[contains(text(),' AUDIT (Static)')]")
	WebElement auditStatic;
	
	@FindBy(xpath="//div[contains(text(), 'INSPECTION Performance')]")
	WebElement inspPerformance ;
	
	@FindBy(xpath="//div[contains(text(),'AUDIT - Finding')]")
	WebElement auditFinding;
	
	
	@FindBy(xpath="//div[contains(text(),'Performance - All Observations')]")
	WebElement allObservation;
	
	  public WebElement scrollOnReport(int index) { 
		  WebElement scrollIndex =
	  ldriver.findElement(By.xpath("(//div[contains(text(),'Open')])[" +
	  index + "]")); 
		  return scrollIndex; 
		  
		  }
	  
		
		public WebElement getAllInspSummaryCheckBox() {
			return allInspSummaryCheckBox;
		}

		
		public WebElement getAllReportContent() {
			return allReportContent;
		}

		public WebElement getInspSummaryCheckBox() {
			return inspSummaryCheckBox;
		}

		public WebElement getAllObservationCheckBox() {
			return allObservationCheckBox;
		}

		public WebElement getInternalInspectionAllCheckBox() {
			return internalInspectionAllCheckBox;
		}

		public WebElement getSupdtInspCheckBox() {
			return supdtInspCheckBox;
		}

		public WebElement getNavigationAuditCheckBox() {
			return navigationAuditCheckBox;
		}
		
		public WebElement getCargoAuditCheckBox() {
			return cargoAuditCheckBox;
		}


		public WebElement getMooringAuditCheckBox() {
			return mooringAuditCheckBox;
		}


		public WebElement getBunkeringAuditCheckBox() {
			return bunkeringAuditCheckBox;
		}

		public WebElement getExternalInspAllCheckBox() {
			return externalInspAllCheckBox;
		}

		public WebElement getSireCheckBox() {
			return sireCheckBox;
		}

		public WebElement getCdiCheckBox() {
			return cdiCheckBox;
		}

		public WebElement getPscCheckBox() {
			return pscCheckBox;
		}

		public WebElement getReportTitle() {
			return reportTitle;
		}

		public WebElement getReportHeading() {
			return reportHeading;
		}

		public WebElement getInspSummary() {
			return inspSummary;
		}

		public WebElement getListOfInsp() {
			return listOfInsp;
		}

		public WebElement getAuditSummary() {
			return auditSummary;
		}

		public WebElement getAuditStatic() {
			return auditStatic;
		}

		public WebElement getInspPerformance() {
			return inspPerformance;
		}

		public WebElement getAuditFinding() {
			return auditFinding;
		}

		public WebElement getAllObservation() {
			return allObservation;
		}
		
		
		public WebElement getReportTitleAudit() {
			return reportTitleAudit;
		}

	
		@FindBy(xpath="//div[@class='my-modal-content']//p//b")
		WebElement popUp;
		
				@FindBy(xpath="//i[contains(text(),'To generate \"Selected Obs Export\" please make row ')]")
		WebElement selectObsText;
		
		@FindBy(xpath="//span[@aria-hidden='true']")
		WebElement xBtn;
		
		public WebElement getPopUp() {
			return popUp;
		}


		public WebElement getSelectObsText() {
			return selectObsText;
		}


		public WebElement getxBtn() {
			return xBtn;
		}
		

	}
