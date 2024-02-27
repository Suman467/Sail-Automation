package com.sail.qa.GeneratedReports;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.GeneratedReport;
import com.sail.qa.pages.ReportPage;

public class InternalInspectionReports extends TestBase {
	
	public JavascriptExecutor js ;
		
		
		
	
		@Test
		public void GenerateInternalInspectionReport(int pageEndIndex , int currentYear) throws InterruptedException, AWTException {
			
			GeneratedReport genRep = new GeneratedReport(driver);
			//driver.navigate().refresh();
			getFluentWait();
			
			if(getText(genRep.getReportText()).equals("SUPERINTENDENT INSPECTION - "+currentYear))  {
			
			Assert.assertEquals(getText(genRep.getReportText()), "SUPERINTENDENT INSPECTION - "+currentYear);
			System.out.println("Report Name : - " +getText(genRep.getReportText()));
			log.info(getText(genRep.getReportText() )+  "is generated successfully");
			getFluentWait();			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getYearly());
			System.out.println("Yearly graph is visible on report");
			log.info("Yearly graph is visible on report");
			getFluentWait();			
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getQuartly());
			System.out.println("Quartly graph is visible on report");
			log.info("Quartly graph is visible on report");
			getFluentWait();
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getFleetGrp());
			System.out.println("Fleet group analysis graph is visible on report");
			log.info("Fleet group analysis graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getAdditionalGrp());
			System.out.println("Additional group  graph is visible on report");	
			log.info("Additional group  graph is visible on report");	
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getOwner());
			System.out.println("Owner  graph is visible on report");
			log.info("Owner  graph is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getVessels());
			System.out.println("Vessels graph is visible on report");
			log.info("Vessels graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspVsObs());
			System.out.println("InsVsObs graph is visible on report");
			log.info("InsVsObs graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspByShip());
			System.out.println("Inspections By Ship Type group  graph is visible on report");
			log.info("Inspections By Ship Type group  graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getChapter());
			System.out.println("VIQ Chapter -VIQ7 graph is visible on report");
			log.info("VIQ Chapter -VIQ7 graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspectionSummary());
			System.out.println("Inspection Summary is visible on report");
			log.info("Inspection Summary is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getListOfInspection());
			System.out.println("Inspections list is visible on report");
			log.info("Inspections list is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTable());
			System.out.println("Plan Table is visible on report");
			log.info("Plan Table is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTableMarine());
			System.out.println("PLAN TABLE SUPERINTENDENT-Marine is visible on report");
			log.info("PLAN TABLE SUPERINTENDENT-Marine is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTableTechnical());
			System.out.println("PLAN TABLE SUPERINTENDENT-Technical is visible on report");	
			log.info("PLAN TABLE SUPERINTENDENT-Technical is visible on report");	
				
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getNavigationAuditTop20RepeatedObs());
			System.out.println("Top 20 Repeated Observation data is visible on report");
			log.info("Top 20 Repeated Observation data is visible on report");		

			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getSuptInspAllObs());
			System.out.println("Inspections performance - All Observation list is visible on report");
			log.info("Inspections performance - All Observation list is visible on report");
			

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.pageEndSupdtReoprt(pageEndIndex));
			System.out.println("SUPERINTENDENT INSPECTION Report for 2023 has been generated successfully");
			log.info("SUPERINTENDENT INSPECTION Report for 2023 has been generated successfully");
			
			
			
			}
			
			
			
			else if(getText(genRep.getReportText()).equals("NAVIGATION AUDIT - "+currentYear)) {			
				
				
				
				Assert.assertEquals(getText(genRep.getReportText()), "NAVIGATION AUDIT - "+currentYear);
				System.out.println("Report Name : - " +getText(genRep.getReportText()));
				log.info(getText(genRep.getReportText() )+  "is generated successfully");
				getFluentWait();
				js = (JavascriptExecutor) driver;			 
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getYearly());
				System.out.println("Yearly graph is visible on report");
				log.info("Yearly graph is visible on report");
				getFluentWait();			
				
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getQuartly());
				System.out.println("Quartly graph is visible on report");
				log.info("Quartly graph is visible on report");
				getFluentWait();
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getFleetGrp());
				System.out.println("Fleet group analysis graph is visible on report");
				log.info("Fleet group analysis graph is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getAdditionalGrp());
				System.out.println("Additional group  graph is visible on report");	
				log.info("Additional group  graph is visible on report");	
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getOwner());
				System.out.println("Owner  graph is visible on report");
				log.info("Owner  graph is visible on report");
				
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getVessels());
				System.out.println("Vessels graph is visible on report");
				log.info("Vessels graph is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspVsObs());
				System.out.println("InsVsObs graph is visible on report");
				log.info("InsVsObs graph is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspByShip());
				System.out.println("Inspections By Ship Type group  graph is visible on report");
				log.info("Inspections By Ship Type group  graph is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getDeficiencyGrp());
				System.out.println("Deficiency Group graph is visible on report");
				log.info("Deficiency Group graph is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getSireVIQSection());
				System.out.println("SIRE VIQ Sections graph is visible on report");
				log.info("SIRE VIQ Sections graph is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getImmediateCause());
				System.out.println("Immediate Causes graph is visible on report");
				log.info("Immediate Causes graph is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getRootCause());
				System.out.println("Root Causes graph is visible on report");
				log.info("Root Causes graph is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTable());
				System.out.println("Plan Table data is visible on report");
				log.info("Plan Table data is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTableByMaster());
				System.out.println("Plan Table By Master data is visible on report");
				log.info("Plan Table By Master data is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTableByCompany());
				System.out.println("Plan Table By Company data  is visible on report");
				log.info("Plan Table By Company data  is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTableBy3rdParty());
				System.out.println("Plan Table By 3rd Party data is visible on report");
				log.info("Plan Table By 3rd Party data is visible on report");

				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getStaticByMaster());
				System.out.println("Static By Master data is visible on report");
				log.info("Static By Master data is visible on report");
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getNavigationAuditTop20RepeatedObs());
				System.out.println("Top 20 Repeated Observation data is visible on report");
				log.info("Top 20 Repeated Observation data is visible on report");
				
				
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", genRep.getNavigationAuditFindingByMaster());
				System.out.println("NAVIGATION AUDIT - Finding By Master data is visible");	
				log.info("NAVIGATION AUDIT - Finding By Master data is visible");
				System.out.println("NAVIGATION AUDIT Report for 2023 has been generated successfully");	
				log.info("NAVIGATION AUDIT Report for 2023 has been generated successfully");		

		
			}	
			
			else {
				System.out.println("Issue in Generated report");
			}

		}
		
		
				
	}
