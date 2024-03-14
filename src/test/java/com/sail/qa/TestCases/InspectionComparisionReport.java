package com.sail.qa.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.GeneratedReports.InspectionComparisonReport;
import com.sail.qa.base.TestBase;
import com.sail.qa.pages.InspectionComparisionReportPage;
import com.sail.qa.pages.InspectionSummaryReportPage;
import com.sail.qa.pages.ReportFilterPage;
import com.sail.qa.pages.ReportPage;

public class InspectionComparisionReport extends TestBase {
	
	public JavascriptExecutor js ;
	SwitchTab switchTab = new SwitchTab();
	CloseTab closeTAb= new CloseTab();
	InspectionComparisonReport inspCom = new InspectionComparisonReport();
	
	
		
	    @Parameters({"reportYear"})
		@Test
		public void GenerateInspectionComparisionReport(int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionComparisionReportPage inspComp = new InspectionComparisionReportPage(driver);
			
			
			
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
            getFluentWait();
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			
			
			getFluentWait();
			
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspComp.getInspcComparisionCheckBox());

			log.info("Inspection Comparision Checkbox is selected");
			System.out.println("Inspection Comparision Checkbox is selected on the report page");
			
			getFluentWait();
			clickElement(inspComp.getSireCheckBox());
			log.info("SIRE external inspection checkbox is selected");
			System.out.println("SIRE  inspection checkbox is selected on the report page");
			getFluentWait();
			
			clickElement(inspComp.getCdiCheckBox());
			log.info("CDI external inspection checkbox is selected");
			System.out.println("CDI inspection checkbox is selected on the report page");
			getFluentWait();
			
			clickElement(inspComp.getPscCheckBox());
			log.info("PSC external inspection checkbox is selected");
			System.out.println("PSC inspection checkbox is selected on the report page");
			getFluentWait();
			
			jsExecutor.executeScript("arguments[0].click();", inspComp.getNavigationAuditCheckBox());
			log.info("NAVIGATION AUDIT  inspection checkbox is selected");
			System.out.println("NAVIGATION AUDIT  inspection checkbox is selected on the report page");
			getFluentWait();
			
			clickElement(inspComp.getCargoAuditCheckBox());
			log.info("CARGO AUDIT  inspection checkbox is selected");
			System.out.println("CARGO AUDIT  inspection checkbox is selected on the report page");
			getFluentWait();
			
			clickElement(inspComp.getMooringAuditCheckBox());
			log.info("MOORING AUDIT  inspection checkbox is selected");
			System.out.println("MOORING AUDIT  inspection checkbox is selected on the report page");
			getFluentWait();
			
			clickElement(inspComp.getBunkeringAuditCheckBox());
			log.info("BUNKERING AUDIT inspection checkbox is selected");
			System.out.println("BUNKERING AUDIT inspection checkbox is selected on the report page");	
			getFluentWait();
			
			

		}	
	    @Parameters({"reportYear"})
		@Test
		public void GenerateExcludingThirdParty(int reportYear) throws InterruptedException, AWTException
		{
			
			ReportPage report = new ReportPage(driver);
			InspectionComparisionReportPage inspComp = new InspectionComparisionReportPage(driver);
			
			GenerateInspectionComparisionReport(reportYear);
			getFluentWait();
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", inspComp.getExcludeRadioBtn());
			//clickElement(inspComp.getExcludeRadioBtn());
			log.info("Exclude Radio Button is selected");
			System.out.println("Exclude Radio Button is selected on the report page");	
			
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			System.out.println("\n***************Inspection Comparision Report With Exculde 3RD PARTY***************\n");
			inspCom.InspectionComaprision(reportYear);		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
		}
		
		
	    @Parameters({"reportYear"})
		@Test
		public void GenerateIncludingThirdParty(int reportYear) throws InterruptedException, AWTException
		{
			ReportPage report = new ReportPage(driver);
			InspectionComparisionReportPage inspComp = new InspectionComparisionReportPage(driver);
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
            getFluentWait();
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			getFluentWait();
			
			GenerateInspectionComparisionReport(reportYear);
			clickElement(inspComp.getIncludeRadioBtn());
			log.info("Include Radio Button is selected");
			System.out.println("Include Radio Button is selected on the report page");	
			
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			System.out.println("\n***************Inspection Comparision Report With Include 3RD PARTY***************\n");
			inspCom.InspectionComaprision(reportYear);		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
		}
		
		@Parameters({"reportYear"})
		@Test
		public void GenerateSeprateThirdParty(int  reportYear) throws InterruptedException, AWTException
		{
		
			ReportPage report = new ReportPage(driver);
			InspectionComparisionReportPage inspComp = new InspectionComparisionReportPage(driver);
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
            getFluentWait();
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			getFluentWait();
			
			GenerateInspectionComparisionReport(reportYear);
			clickElement(inspComp.getSeprateRadioBtn());
			log.info("Seprate Radio Button is selected");
			System.out.println("Seprate Radio Button is selected on the report page");	
			
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			System.out.println("\n***************Inspection Comparision Report With Separate 3RD PARTY***************\n");
			inspCom.InspectionComaprision(reportYear);		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
		}
		
		
	}
