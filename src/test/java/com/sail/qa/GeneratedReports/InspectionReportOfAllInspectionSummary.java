package com.sail.qa.GeneratedReports;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.InspectionSummaryReportPage;

public class InspectionReportOfAllInspectionSummary extends TestBase {

	public JavascriptExecutor js;

	public void InspectionSummary(int currentYear) throws InterruptedException, AWTException {
			
			InspectionSummaryReportPage inspRep = new InspectionSummaryReportPage(driver);
			
			
			if(getText(inspRep.getReportTitle()).equals("SIRE INSPECTION - "+currentYear))
				
			{
			Assert.assertEquals(getText(inspRep.getReportTitle()), "SIRE INSPECTION - "+currentYear);
			System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
			getFluentWait();
			
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getInspSummary());
			System.out.println("SIR Inspection summary table is visible on report");
			getFluentWait();
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getListOfInsp());
			System.out.println("SIRE List of inspections table is visible on report");
			getFluentWait();			
					
		   System.out.println("SIRE Inspection Report  has been generated successfully");
			}
			
			
			else if(getText(inspRep.getReportTitle()).equals("CDI INSPECTION - "+currentYear)) {	
		
        
			Assert.assertEquals(getText(inspRep.getReportTitle()), "CDI INSPECTION - "+currentYear);
			System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
			getFluentWait();		
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getInspSummary());
			System.out.println("CDI Inspection summary table is visible on report");
			getFluentWait();
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getListOfInsp());
			System.out.println("CDI List of inspections table is visible on report");
			getFluentWait();			
					
		   System.out.println("CDI Inspection Report  has been generated successfully");
		   
			}
			
			else if(getText(inspRep.getReportTitle()).equals("PSC INSPECTION - "+currentYear)) {

					Assert.assertEquals(getText(inspRep.getReportTitle()), "PSC INSPECTION - "+currentYear);
					System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
					getFluentWait();
					
					
					
					js = (JavascriptExecutor) driver;			 
					js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getInspSummary());
					System.out.println("PSC Inspection summary table is visible on report");
					getFluentWait();
					
					
					js = (JavascriptExecutor) driver;			 
					js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getListOfInsp());
					System.out.println("PSC List of inspections table is visible on report");
					getFluentWait();			
							
				   System.out.println("PSC Inspection Report  has been generated successfully");
		   	

		}
			
			
			
	
			else if(getText(inspRep.getReportTitle()).equals("SUPERINTENDENT INSPECTION - "+currentYear)) {

				Assert.assertEquals(getText(inspRep.getReportTitle()), "SUPERINTENDENT INSPECTION - "+currentYear);
				System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
				getFluentWait();
				
				
				
				js = (JavascriptExecutor) driver;			 
				js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getInspSummary());
				System.out.println("Superintendent Inspection summary table is visible on report");
				getFluentWait();
				
				
				js = (JavascriptExecutor) driver;			 
				js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getListOfInsp());
				System.out.println(" Superintendent Inspection List of inspections table is visible on report");
				getFluentWait();			
						
			   System.out.println("Superintendent Inspection Report  has been generated successfully");
	   	

	}
			
			else if(getText(inspRep.getReportTitleAudit()).equals("NAVIGATION AUDIT - "+currentYear)) {

				Assert.assertEquals(getText(inspRep.getReportTitle()), "NAVIGATION AUDIT - "+currentYear);
				System.out.println("Report Name : - " +getText(inspRep.getReportTitleAudit()));
				getFluentWait();
				
				
				
				js = (JavascriptExecutor) driver;			 
				js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getAuditSummary());
				System.out.println("Navigation Audit summary table is visible on report");
				getFluentWait();
				
				
				js = (JavascriptExecutor) driver;			 
				js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getAuditStatic());
				System.out.println(" Navigation Audit  Static table is visible on report");
				getFluentWait();			
						
			   System.out.println("Navigation Audit Inspection Report  has been generated successfully");
	   	

	}
}
			
			
			
			
			
			
			@Test
			public void AllObservation(int currentYear) throws InterruptedException, AWTException {
				
				InspectionSummaryReportPage inspRep = new InspectionSummaryReportPage(driver);
				
				
				Assert.assertTrue(inspRep.getPopUp().isDisplayed());
				System.out.println("Pop-up is apperaing");
				getFluentWait();
				Assert.assertEquals(getText(inspRep.getSelectObsText()), 
						"To generate \"Selected Obs Export\" please make row selections first followed by column selections on each inspection type \"All Observation\" tables.");
				System.out.println("The pop-up stats -  NOTE: "+getText(inspRep.getSelectObsText()));
				clickElement(inspRep.getxBtn());
				System.out.println("Pop-up closed");
				
				if(getText(inspRep.getReportTitle()).equals("SIRE INSPECTION - "+currentYear))
					
				{
				Assert.assertEquals(getText(inspRep.getReportTitle()), "SIRE INSPECTION - "+currentYear);
				System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
				getFluentWait();
				
				
				
				js = (JavascriptExecutor) driver;			 
				js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getAllObservation());
				System.out.println("SIRE Inspection Performance - All Observation table is visible on report");
				getFluentWait();
				System.out.println("SIRE Inspection All Observation Report has been generated successfully");
				
				}
				
				
				
				
				
				else if(getText(inspRep.getReportTitle()).equals("PSC INSPECTION - "+currentYear)) {	
			
	        
				Assert.assertEquals(getText(inspRep.getReportTitle()), "PSC INSPECTION - "+currentYear);
				System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
				getFluentWait();		
				
				js = (JavascriptExecutor) driver;			 
				js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getAllObservation());
				System.out.println("PSC Inspection Performance - All Observation table is visible on report");
				getFluentWait();	
						
			   System.out.println("PSC Inspection All Observation Report  has been generated successfully");
			   
				}				
				
		
				else if(getText(inspRep.getReportTitle()).equals("SUPERINTENDENT INSPECTION - "+currentYear)) {

					Assert.assertEquals(getText(inspRep.getReportTitle()), "SUPERINTENDENT INSPECTION - "+currentYear);
					System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
					getFluentWait();
					
					
					
					js = (JavascriptExecutor) driver;			 
					js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getAllObservation());
					System.out.println("Superintendent Inspection Performance - All Observation  table is visible on report");
					getFluentWait();
					System.out.println("SUPERINTENDENT Inspection All Observation Report  has been generated successfully");
					
					
					
		
		
	}
		
		}
			
}
