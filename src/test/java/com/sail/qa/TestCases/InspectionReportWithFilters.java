package com.sail.qa.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.GeneratedReports.ExternalInspectionReports;
import com.sail.qa.GeneratedReports.InternalInspectionReports;
import com.sail.qa.base.TestBase;
import com.sail.qa.pages.GeneratedReport;
import com.sail.qa.pages.ReportFilterPage;
import com.sail.qa.pages.ReportPage;

public class InspectionReportWithFilters extends TestBase {
	
	public JavascriptExecutor js ;
	SwitchTab switchTab = new SwitchTab();
	CloseTab closeTAb= new CloseTab();
	ExternalInspectionReports externalInsp = new ExternalInspectionReports();
	
		
	@Parameters({"currentYear", "reportYear"})
		@Test
		public void GenerateSireReportWithVesselFilter(int currentYear , int reportYear ) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			report.getRefreshIcon();
			getFluentWait();
			driver.navigate().refresh();
			getFluentWait();
			
            clickElement(report.getClearBtn());		
            getFluentWait();	
			clickElement(report.getYearDrpDown());
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			
			Thread.sleep(2000);			
			
			System.out.println("\n***************SIRE Inspection Report With Vessels Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			
			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			
			getFluentWait();
			
			js.executeScript("arguments[0].click();", filter.getArrowIconInVessel());
			log.info("Vessels filter button has been clicked");
			System.out.println("Vessels filter button has been clicked");
			
			
			
			for (int vessel_index = 7; vessel_index < 10; vessel_index++) {
			    getFluentWait();

			    int maxAttempts = 3;
			    int attempt = 0;

			    while (attempt < maxAttempts) {
			        try {
			            jsExecutor.executeScript("arguments[0].click();", filter.selectFilters(vessel_index));
			           			            break; // Break out of the loop if interaction is successful
			        } catch (StaleElementReferenceException e) {
			            // Retry the operation
			            attempt++;
			        }
			    }
			}
			
			 System.out.println("Vesses fliter have been selected");
			log.info("Vessel has been selected");
			
			
						
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("Vessel filter drop down is closed");
			log.info("Vessel filter drop down is closed");
						
			getFluentWait();
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			Thread.sleep(3000);
			System.out.println(getText(genRep.getFilterApplied()));
			log.info(getText(genRep.getFilterApplied()));
			
			externalInsp.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();	
			Thread.sleep(2000);
		}
		
		
	    @Parameters({"currentYear" , "reportYear"})
		@Test
		public void GenerateSireReportWithOwnerFilter(int currentYear , int reportYear ) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
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
			
			System.out.println("\n***************SIRE Inspection Report With Owner Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			
			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			
			getFluentWait();
			jsExecutor.executeScript("arguments[0].click();", filter.getArrowIconInOwner());
			//clickElement(filter.getArrowIconInOwner());
			log.info("Owner filter button has been clicked");
			System.out.println("Owner filter button has been clicked");
			getFluentWait();	
			
		
			for(int owner_index =20;owner_index <24;owner_index++ ) {
			getFluentWait();
			
			jsExecutor.executeScript("arguments[0].click();", filter.selectFilters(owner_index));
			
			//clickElement(filter.selectFilters(owner_index));			
			}
			System.out.println("Owner has been selected");
			log.info("Owner has been selected");
			
			
			
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("Owner filter drop down is closed");
			log.info("Owner filter drop down is closed");	
			
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			Thread.sleep(3000);
			System.out.println(getText(genRep.getFilterApplied()));
			log.info(getText(genRep.getFilterApplied()));
			externalInsp.GeneratedExternalInspectionReport(currentYear);			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();	
			Thread.sleep(2000);

		}
		
		
		
		@Parameters({ "currentYear" , "reportYear"})
		@Test
		public void GenerateSireReportWithVIQChapterFilter(int currentYear , int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
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
			
						
			System.out.println("\n***************SIRE Inspection Report With VIQ Chapter Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			
			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			
			Thread.sleep(2000);
			//clickElement(filter.getArrowIconInVIQChap());
			jsExecutor.executeScript("arguments[0].click();", filter.getArrowIconInVIQChap());
			log.info("VIQ Chapter filter button has been clicked");
			System.out.println("VIQ Chapter filter button has been clicked");
			
			for(int chapter =1;chapter <5;chapter++ ) {
			getFluentWait();
			//clickElement(filter.selectFilters(chapter));
			jsExecutor.executeScript("arguments[0].click();", filter.selectFilters(chapter));			
			}
			System.out.println("Chapters have been selected");
			log.info("Chapters have been selected");
			
						
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("VIQ Chapter filter drop down is closed");
			log.info("VIQ Chapter filter drop down is closed");			
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			Thread.sleep(3000);
			
			System.out.println(getText(genRep.getFilterApplied()));
			log.info(getText(genRep.getFilterApplied()));
			externalInsp.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();		
			Thread.sleep(2000);

		}
		
		
		
		@Parameters({"Location","currentYear" , "reportYear"})
		@Test
		public void GenerateSireReportWithLocationFilter(String location, int currentYear , int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
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
			
			System.out.println("\n***************SIRE Inspection Report With Location Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			
			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			
			Thread.sleep(2000);
			//clickElement(filter.getArrowIconInLocation());
			jsExecutor.executeScript("arguments[0].click();", filter.getArrowIconInLocation());
			log.info("Location filter button has been clicked");
			System.out.println("Location  filter button has been clicked");
			
			
			//clickElement(filter.selectLocation(location));
			jsExecutor.executeScript("arguments[0].click();", filter.selectLocation(location));
			System.out.println("Location has been selected");	
			log.info("Location has been selected");	
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			Thread.sleep(3000);
			
			System.out.println(getText(genRep.getFilterApplied()));
			log.info(getText(genRep.getFilterApplied()));
			externalInsp.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();
			Thread.sleep(2000);

		}
		
		
		
		@Parameters({"currentYear" , "reportYear"})
		@Test
		public void GeneratePscReportWithPscActionFilter(int currentYear , int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
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
			
			
			System.out.println("\n***************PSC Inspection Report PSC action Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getPsc());
			
			log.info("PSC inspection has been selected on the report page");
			System.out.println("PSC inspection has been selected on the report page");
			
			Thread.sleep(2000);
			//clickElement(filter.getPscActionCheckBox());
			jsExecutor.executeScript("arguments[0].click();", filter.getPscActionCheckBox());
			log.info("PSC Action filter button has been clicked");
			System.out.println("PSC Action button has been clicked");			
			
			for(int pscActionIndex =1;pscActionIndex <5;pscActionIndex++ ) {
				getFluentWait();
				//clickElement(filter.selectFilters(pscActionIndex));	
				jsExecutor.executeScript("arguments[0].click();", filter.selectFilters(pscActionIndex));
				
				}
			   System.out.println("PSC Action have been selected");
			
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("PSC Action filter  drop down is closed");
			
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			Thread.sleep(3000);
			
			System.out.println(getText(genRep.getFilterApplied()));
			getFluentWait();
			externalInsp.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();		
			Thread.sleep(2000);

		}
		
		
		
		@Parameters({"Location","currentYear", "reportYear" , "pageEndIndex"})
		@Test
		public void GenerateSupdtInspectionReportWithLocationFilter(String location , int currentYear, int reportYear,int pageEndIndex) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			InternalInspectionReports extInspReport= new InternalInspectionReports();
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			report.getRefreshIcon();
			driver.navigate().refresh();
			getFluentWait();
			clickElement(report.getClearBtn());		
			getFluentWait();
			clickElement(report.getYearDrpDown());
			getFluentWait();
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", report.selectYear(reportYear));
			
			getFluentWait();	
			System.out.println("\n***************Supdt. Inspection Report Location and Port Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSupdtInspection());
			
			log.info("Supdt. inspection has been selected on the report page");
			System.out.println("Supdt. inspection has been selected on the report page");
			
			getFluentWait();
			
			jsExecutor.executeScript("arguments[0].click();",filter.getArrowIconInLocation());
			log.info("Location filter button has been clicked");
			System.out.println("Location  filter button has been clicked");
			
			getFluentWait();
			
			jsExecutor.executeScript("arguments[0].click();", filter.selectLocation(location));
			System.out.println("Location has been selected");								
			
			
			getFluentWait();
			 Actions action = new Actions(driver);
			 action.moveToElement(filter.getArrowIconInPort()).click().perform();
			
			//jsExecutor.executeScript("arguments[0].click();", filter.getArrowIconInPort());
		
			 getFluentWait();
			for (int port = 1; port < 5; port++) {
				// getFluentWait();
			    
			    int maxAttempts = 3;
			    int attempt = 0;

			    while (attempt < maxAttempts) {
			        try {
			            jsExecutor.executeScript("arguments[0].click();", filter.selectFilters(port));
			            
			            break; // Break out of the loop if interaction is successful
			            
			        } catch (StaleElementReferenceException e) {
			            // Retry the operation
			            attempt++;
			        }
			        System.out.println("Port " + port + " has been selected");
			        log.info("Ports have been selected");
			    }
			}
			 			 
			
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("Port filter  drop down is closed");
			
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			Thread.sleep(3000);
			System.out.println(getText(genRep.getFilterApplied()));
			extInspReport.GenerateInternalInspectionReport(pageEndIndex, currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();	
			Thread.sleep(2000);

		}
		
	
		@Parameters({"currentYear", "obsStatus","reportYear", })
		@Test
		public void GenerateSireReportWithObsStatusFilter(int currentYear ,String obsStatus,int reportYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			ReportFilterPage filter = new ReportFilterPage(driver);
			
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
			
			System.out.println("\n***************SIRE Inspection Report With Observation Status Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			
			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			
			Thread.sleep(2000);
			jsExecutor.executeScript("arguments[0].click();", filter.getObsStatusArrowIcon());
			log.info("Observation status filter button has been clicked");
			System.out.println("Observation status filter button has been clicked");		
			
			filter.obsStatus(obsStatus).click();;
			System.out.println("Observation status is selected");
			log.info("Observation status is selected");		
			
			
			Thread.sleep(2000);
			
			jsExecutor.executeScript("arguments[0].click();", report.getGenerateBtton());
			//clickElement(report.getGenerateBtton());
			System.out.println("Generate button is clicked");
			log.info("Generate button has been clicked on the report page");
			
			
			
			
			
			switchTab.switchToNewTab();
			Thread.sleep(3000);	
			externalInsp.GeneratedObservationStatusReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();	
			Thread.sleep(2000);

		}
		
		
		}
