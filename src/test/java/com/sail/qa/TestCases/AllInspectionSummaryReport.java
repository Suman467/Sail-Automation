package com.sail.qa.TestCases;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
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
		
		
		@Test
		public void GenerateSireInspectionSummaryReport() throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n***************SIRE Inspection Summary Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			Thread.sleep(2000);
			
			clickElement(inspReport.getSireCheckBox());
			log.info("SIRE external inspection checkbox is selected");
			System.out.println("SIRE external inspection checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			inspSummaryRpt.InspectionSummary();		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();

		}
		
		
		@Test
		public void GenerateCdiInspectionSummaryReport() throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n***************CDI Inspection Summary Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			Thread.sleep(2000);
			
			clickElement(inspReport.getCdiCheckBox());
			log.info("CDI external inspection checkbox is selected");
			System.out.println("CDI external inspection checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			inspSummaryRpt.InspectionSummary();		
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();

		}
		
		
		@Test
		public void GeneratePscInspectionSummaryReport() throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n***************PSC Inspection Summary Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			Thread.sleep(2000);
			
			clickElement(inspReport.getPscCheckBox());
			log.info("PSC external inspection checkbox is selected");
			System.out.println("PSC external inspection checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			inspSummaryRpt.InspectionSummary();		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
			

		}
		
		
		
		@Test
		public void GenerateSupdtInspectionSummaryReport() throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n***************SUPERINTENDENT Inspection Summary Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			Thread.sleep(2000);
			
			clickElement(inspReport.getSupdtInspCheckBox());
			log.info("Supdt. internal inspection checkbox is selected");
			System.out.println("Supdt. internal checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			inspSummaryRpt.InspectionSummary();		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
			

		}
		
		
		@Test
		public void GenerateSireObservationReport() throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n***************SIRE Inspection All Observation Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", inspReport.getAllInspSummaryCheckBox());

			log.info("All Inspection Summary Checkbox is selected");
			System.out.println("All Inspection Summary Checkbox is selected on the report page");
			Thread.sleep(2000);
			
			clickElement(inspReport.getAllObservationCheckBox());
			System.out.println("All Observation check box is selected");
			
			clickElement(inspReport.getSireCheckBox());
			log.info("SIRE external inspection checkbox is selected");
			System.out.println("SIRE external inspection checkbox is selected on the report page");
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			inspSummaryRpt.AllObservation();		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();

		}
		
		
		
		@Test
		public void GeneratePscObservationReport() throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InspectionSummaryReportPage inspReport = new InspectionSummaryReportPage(driver);
			InspectionReportOfAllInspectionSummary inspSummaryRpt= new InspectionReportOfAllInspectionSummary(); 
			getFluentWait();
			clickElement(report.getRefreshIcon());
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
			
			inspSummaryRpt.AllObservation();		
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
			

		}
		
		
		
	}
