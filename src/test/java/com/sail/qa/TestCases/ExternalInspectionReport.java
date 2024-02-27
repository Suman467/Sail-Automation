package com.sail.qa.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.GeneratedReports.ExternalInspectionReports;
import com.sail.qa.base.TestBase;
import com.sail.qa.pages.ReportPage;

public class ExternalInspectionReport extends TestBase {
	
	public JavascriptExecutor js ;
	SwitchTab switchTab = new SwitchTab();
	CloseTab closeTAb= new CloseTab();
	ExternalInspectionReports extReport= new ExternalInspectionReports();
		
	    @Parameters({"currentYear","reportYear"})
		@Test
		public void GenerateSireReport(int currentYear, int reportYear ) throws InterruptedException, AWTException {
			ReportPage report = new ReportPage(driver);		
			
			report.getRefreshIcon();
			driver.navigate().refresh();
			getFluentWait();
			clickElement(report.getClearBtn());		
			
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			
			
			Thread.sleep(2000);
			
			System.out.println("\n***************SIRE Inspection Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			// jsExecutor.executeScript("arguments[0].click();",
			// report.selectInspection(inspec_index));

			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			Thread.sleep(2000);
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
					
			extReport.GeneratedExternalInspectionReport(currentYear);
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
			getFluentWait();

		}
		
		
	    @Parameters({"currentYear","reportYear"})
		@Test
		public void GeneratePSCReport(int currentYear, int reportYear) throws InterruptedException, AWTException {
			
			
			ReportPage report = new ReportPage(driver);
			
			report.getRefreshIcon();
			driver.navigate().refresh();
			getFluentWait();
			clickElement(report.getClearBtn());		
			
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			
			
			Thread.sleep(2000);
			
			System.out.println("\n\n***************PSC Inspection Report***************\n\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getPsc());
			

			log.info("PSC inspection has been selected on the report page");
			System.out.println("PSC inspection has been selected on the report page");
			Thread.sleep(3000);
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			
			switchTab.switchToNewTab();
			Thread.sleep(3000);
			extReport.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
			getFluentWait();

			

		}

}
