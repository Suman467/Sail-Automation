package com.sail.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InspectionComparisionReportPage {

	WebDriver ldriver;

	public InspectionComparisionReportPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
		@FindBy(xpath="//b[normalize-space()='Inspections Comparison']")
		WebElement inspcComparisionCheckBox;
		
		
		@FindBy(xpath="(//div[@class='mat-radio-label-content'])[2]")
		WebElement excludeRadioBtn;
		
		@FindBy(xpath="(//div[@class='mat-radio-label-content'])[3]")
		WebElement includeRadioBtn;
		
		@FindBy(xpath="(//div[@class='mat-radio-label-content'])[4]")
		WebElement seprateRadioBtn;
	
		@FindBy(xpath="//div[contains(text(),'INSPECTION COMPARISON')]")
		WebElement inspComparison;
		
		@FindBy(xpath="//*[name()='tspan' and text()='Inspection comparison']")
		WebElement inspComparisonGrph;
		
		
		@FindBy(xpath="//*[name()='tspan' and text()='Internal Vs External']")
		WebElement internalVsExternal;
		
		
		@FindBy(xpath="//*[name()='tspan' and text()='Vessel Comparison']")
		WebElement vesselComparision;
		
		@FindBy(xpath="//*[name()='tspan' and text()='Vessel Comparison']")
		WebElement chapterFindingComparisionYear;
		
		@FindBy(xpath="//*[name()='tspan' and text()='Findings Comparison Year']")
		WebElement findingComparisionYear;
		
		@FindBy(xpath="//strong[contains(text(),'Filters Applie')]")
		WebElement ReportFilter;
		

		
		public WebElement getReportFilter() {
			return ReportFilter;
		}

		public WebElement getInspcComparisionCheckBox() {
			return inspcComparisionCheckBox;
		}

		public WebElement getExcludeRadioBtn() {
			return excludeRadioBtn;
		}

		public WebElement getIncludeRadioBtn() {
			return includeRadioBtn;
		}

		public WebElement getSeprateRadioBtn() {
			return seprateRadioBtn;
		}

		public WebElement getInspComparison() {
			return inspComparison;
		}

		public WebElement getInspComparisonGrph() {
			return inspComparisonGrph;
		}


		public WebElement getInternalVsExternal() {
			return internalVsExternal;
		}

		public WebElement getVesselComparision() {
			return vesselComparision;
		}

		public WebElement getChapterFindingComparisionYear() {
			return chapterFindingComparisionYear;
		}

		public WebElement getFindingComparisionYear() {
			return findingComparisionYear;
		}


		
		@FindBy(xpath="(//span[@class='mat-checkbox-label'])[21]")
		WebElement sireCheckBox;
		
		@FindBy(xpath="(//span[@class='mat-checkbox-label'])[23]")
		WebElement cdiCheckBox;
		
		@FindBy(xpath="(//span[@class='mat-checkbox-label'])[25]")
		WebElement pscCheckBox;
		
		@FindBy(xpath="//span[normalize-space()='Navigation Audit']")
		WebElement navigationAuditCheckBox;
		
		@FindBy(xpath="//span[normalize-space()='Cargo Audit']")
		WebElement cargoAuditCheckBox;
		
		@FindBy(xpath="//span[normalize-space()='Mooring Audit']")
		WebElement mooringAuditCheckBox;
		
		@FindBy(xpath="//span[normalize-space()='Bunkering Audit']")
		WebElement bunkeringAuditCheckBox;
		


		public WebElement getSireCheckBox() {
			return sireCheckBox;
		}

		public WebElement getCdiCheckBox() {
			return cdiCheckBox;
		}

		public WebElement getPscCheckBox() {
			return pscCheckBox;
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


	

	}
