package com.sail.qa.TestCases;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.GeneratedReports.InspectionReportOfAllInspectionSummary;
import com.sail.qa.GeneratedReports.NavigationAuditReport;
import com.sail.qa.GeneratedReports.ExternalInspectionReports;
import com.sail.qa.base.TestBase;
import com.sail.qa.pages.GeneratedReport;
import com.sail.qa.pages.InspectionSummaryReportPage;
import com.sail.qa.pages.ReportPage;

public class AllInspectionSummaryReport extends TestBase {
	
	public JavascriptExecutor js ;
	SwitchTab switchTab = new SwitchTab();
	CloseTab closeTAb= new CloseTab();
		
	    @Parameters({"currentYear","reportYear"})
		@Test
		public void GenerateSireInspectionSummaryReport(int currentYear,int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
            getFluentWait();
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			
			Thread.sleep(1000);
			
			
			System.out.println("\n***************SIRE Inspection Summary Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			
			Thread.sleep(1000);
			clickElement(inspReport.getInspSummaryCheckBox());
			log.info("Inspection summaray checkbox is selected");
			System.out.println("Inspection summary checkbox is selected on the report page");
			Thread.sleep(1000);
			 
			clickElement(inspReport.getSireCheckBox());
			log.info("SIRE external inspection checkbox is selected");
			System.out.println("SIRE external inspection checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			Thread.sleep(3000);
			
			inspSummaryRpt.InspectionSummary(currentYear);		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();

		}
		
	    @Parameters({"currentYear","reportYear"})
		@Test
		public void GenerateCdiInspectionSummaryReport(int currentYear,int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			
			
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
			
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));			
			getFluentWait();
			
			System.out.println("\n***************CDI Inspection Summary Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			getFluentWait();
			
			clickElement(inspReport.getCdiCheckBox());
			log.info("CDI external inspection checkbox is selected");
			System.out.println("CDI external inspection checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			Thread.sleep(3000);
			inspSummaryRpt.InspectionSummary(currentYear);		
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();

		}
		
	    @Parameters({"currentYear","reportYear"})
		@Test
		public void GeneratePscInspectionSummaryReport(int currentYear,int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
			
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));			
			getFluentWait();
			
			System.out.println("\n***************PSC Inspection Summary Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			getFluentWait();
			
			clickElement(inspReport.getPscCheckBox());
			log.info("PSC external inspection checkbox is selected");
			System.out.println("PSC external inspection checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			Thread.sleep(3000);
			inspSummaryRpt.InspectionSummary(currentYear);		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
			

		}
		
		
	    @Parameters({"currentYear","reportYear"})
		@Test
		public void GenerateSupdtInspectionSummaryReport(int currentYear,int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
			
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));			
			getFluentWait();
			
			System.out.println("\n***************SUPERINTENDENT Inspection Summary Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			getFluentWait();
			
			clickElement(inspReport.getSupdtInspCheckBox());
			log.info("Supdt. internal inspection checkbox is selected");
			System.out.println("Supdt. internal checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			inspSummaryRpt.InspectionSummary(currentYear);		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
			

		}
		
	    @Parameters({"currentYear","reportYear"})
		@Test
		public void GenerateSireObservationReport(int currentYear,int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
			
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));			
			getFluentWait();
			
			
			System.out.println("\n***************SIRE Inspection All Observation Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			
			
			clickElement(inspReport.getAllObservationCheckBox());
			System.out.println("All Observation check box is selected");
			getFluentWait();
			clickElement(inspReport.getSireCheckBox());
			log.info("SIRE external inspection checkbox is selected");
			System.out.println("SIRE external inspection checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			Thread.sleep(3000);
			inspSummaryRpt.AllObservation(currentYear);		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();

		}
		
		
	    @Parameters({"currentYear","reportYear"})
		@Test
		public void GeneratePscObservationReport(int currentYear,int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
			
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));			
			getFluentWait();
			
			System.out.println("\n***************PSC Inspection All Observation Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			Thread.sleep(2000);
			
			clickElement(inspReport.getAllObservationCheckBox());
			System.out.println("All Observation check box is selected");
			
			clickElement(inspReport.getPscCheckBox());
			log.info("PSC external inspection checkbox is selected");
			System.out.println("PSC external inspection checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			Thread.sleep(3000);
			inspSummaryRpt.AllObservation(currentYear);		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
			

		}
		
		
		
	}
