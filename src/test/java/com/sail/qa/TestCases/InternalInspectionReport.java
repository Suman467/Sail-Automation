package com.sail.qa.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.GeneratedReports.InternalInspectionReports;
import com.sail.qa.base.TestBase;
import com.sail.qa.pages.ReportPage;

public class InternalInspectionReport extends TestBase {
	
	public JavascriptExecutor js ;
	public SwitchTab switchTab = new SwitchTab();
	public CloseTab closeTAb= new CloseTab();
	public InternalInspectionReports intrnlInsRep = new InternalInspectionReports();
		
	    @Parameters({"pageEndIndex","currentYear","reportYear"})
		@Test
		public void GenerateNavigationAuditReport(int pageEndIndex, int currentYear, int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
			
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			
			getFluentWait();
			
			System.out.println("\n***************Navigation Audit Inspection Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getNavAudit());

			log.info("Navigation audit inspection has been selected on the report page");
			System.out.println("Navigation audit inspection has been selected on the report page");
			Thread.sleep(2000);
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();	
			getFluentWait();
			intrnlInsRep.GenerateInternalInspectionReport(pageEndIndex, currentYear);

			

		}
		
	    @Parameters({"pageEndIndex","currentYear","reportYear"})
		@Test
		public void GenerateSupdtInspectionReport(@Optional int pageEndIndex, int currentYear, int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			report.getRefreshIcon();
			driver.navigate().refresh();
			getFluentWait();
			clickElement(report.getClearBtn());		
			
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			
			
			Thread.sleep(2000);
			System.out.println("\n***************Supdt.Inspection Report***************\n");
			
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSupdtInspection());

			log.info("Supdt. Inspection has been selected on the report page");
			System.out.println("Supdt. Inspection has been selected on the report page");
			Thread.sleep(2000);
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			
			switchTab.switchToNewTab();
			Thread.sleep(3000);

			intrnlInsRep.GenerateInternalInspectionReport(pageEndIndex, currentYear);
			closeTAb.closeTab();	
			switchTab.switchToOldTab();	
			
			getFluentWait();
			

		}
		
		
	}
