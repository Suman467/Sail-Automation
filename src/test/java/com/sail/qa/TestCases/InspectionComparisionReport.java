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
	
	
		
		
		@Test
		public void GenerateinspectionComparisionReport() throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionComparisionReportPage inspComp = new InspectionComparisionReportPage(driver);
			
			
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n***************Inspection Comparision Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspComp.getInspcComparisionCheckBox());

			log.info("Inspection Comparision Checkbox is selected");
			System.out.println("Inspection Comparision Checkbox is selected on the report page");
			Thread.sleep(2000);
			
			clickElement(inspReport.getSireCheckBox());
			log.info("SIRE external inspection checkbox is selected");
			System.out.println("SIRE  inspection checkbox is selected on the report page");
			
			clickElement(inspReport.getCdiCheckBox());
			log.info("CDI external inspection checkbox is selected");
			System.out.println("CDI inspection checkbox is selected on the report page");
			
			clickElement(inspReport.getPscCheckBox());
			log.info("PSC external inspection checkbox is selected");
			System.out.println("PSC inspection checkbox is selected on the report page");
			
			clickElement(inspReport.getNavigationAuditCheckBox());
			log.info("NAVIGATION AUDIT  inspection checkbox is selected");
			System.out.println("NAVIGATION AUDIT  inspection checkbox is selected on the report page");
			
			clickElement(inspReport.getCargoAuditCheckBox());
			log.info("CARGO AUDIT  inspection checkbox is selected");
			System.out.println("CARGO AUDIT  inspection checkbox is selected on the report page");
			
			clickElement(inspReport.getMooringAuditCheckBox());
			log.info("MOORING AUDIT  inspection checkbox is selected");
			System.out.println("MOORING AUDIT  inspection checkbox is selected on the report page");
			
			clickElement(inspReport.getBunkeringAuditCheckBox());
			log.info("BUNKERING AUDIT inspection checkbox is selected");
			System.out.println("BUNKERING AUDIT inspection checkbox is selected on the report page");	
			
			
			

		}	
		
		@Test
		public void generateExcludingThirdParty() throws InterruptedException, AWTException
		{
			
			ReportPage report = new ReportPage(driver);
			InspectionComparisionReportPage inspComp = new InspectionComparisionReportPage(driver);
			
			GenerateinspectionComparisionReport();
			clickElement(inspComp.getExcludeRadioBtn());
			log.info("Exclude Radio Button is selected");
			System.out.println("Exclude Radio Button is selected on the report page");	
			
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			inspCom.InspectionComaprision();		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
		}
		
		
		@Parameters({"Year"})
		@Test
		public void generateIncludingThirdParty(String year) throws InterruptedException, AWTException
		{
			ReportPage report = new ReportPage(driver);
			InspectionComparisionReportPage inspComp = new InspectionComparisionReportPage(driver);
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			clickElement(filter.getClearBtn());
			log.info("Clear button is pressed");
			clickElement(filter.getYear());
			clickElement(filter.selectYear(year));
			getFluentWait();
			
			GenerateinspectionComparisionReport();
			clickElement(inspComp.getIncludeRadioBtn());
			log.info("Include Radio Button is selected");
			System.out.println("Include Radio Button is selected on the report page");	
			
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			inspCom.InspectionComaprision();		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
		}
		
		@Parameters({"Year"})
		@Test
		public void generateSeprateThirdParty(String year) throws InterruptedException, AWTException
		{
		
			ReportPage report = new ReportPage(driver);
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			
			InspectionComparisionReportPage inspComp = new InspectionComparisionReportPage(driver);
			clickElement(filter.getClearBtn());
			log.info("Clear button is pressed");
			clickElement(filter.getYear());
			clickElement(filter.selectYear(year));
			getFluentWait();
			
			GenerateinspectionComparisionReport();
			clickElement(inspComp.getSeprateRadioBtn());
			log.info("Seprate Radio Button is selected");
			System.out.println("Seprate Radio Button is selected on the report page");	
			
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			inspCom.InspectionComaprision();		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
		}
		
		
	}
