package com.sail.qa.GeneratedReports;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.GeneratedReport;
import com.sail.qa.pages.InspectionSummaryReportPage;
import com.sail.qa.pages.ReportFilterPage;
import com.sail.qa.pages.ReportPage;

public class InspectionReportOfAllInspectionSummary extends TestBase {

	public JavascriptExecutor js;

	public void InspectionSummary() throws InterruptedException, AWTException {
			
			InspectionSummaryReportPage inspRep = new InspectionSummaryReportPage(driver);
			
			
			if(getText(inspRep.getReportTitle()).equals("SIRE INSPECTION - 2023"))
				
			{
			Assert.assertEquals(getText(inspRep.getReportTitle()), "SIRE INSPECTION - 2023");
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
					
		   System.out.println("SIRE Inspection Report for 2023 has been generated successfully");
			}
			
			
			else if(getText(inspRep.getReportTitle()).equals("CDI INSPECTION - 2023")) {	
		
        
			Assert.assertEquals(getText(inspRep.getReportTitle()), "CDI INSPECTION - 2023");
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
					
		   System.out.println("CDI Inspection Report for 2023 has been generated successfully");
		   
			}
			
			else if(getText(inspRep.getReportTitle()).equals("PSC INSPECTION - 2023")) {

					Assert.assertEquals(getText(inspRep.getReportTitle()), "PSC INSPECTION - 2023");
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
							
				   System.out.println("PSC Inspection Report for 2023 has been generated successfully");
		   	

		}
			
			
			
	
			else if(getText(inspRep.getReportTitle()).equals("SUPERINTENDENT INSPECTION - 2023")) {

				Assert.assertEquals(getText(inspRep.getReportTitle()), "SUPERINTENDENT INSPECTION - 2023");
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
						
			   System.out.println("Superintendent Inspection Report for 2023 has been generated successfully");
	   	

	}
			
			else if(getText(inspRep.getReportTitleAudit()).equals("NAVIGATION AUDIT - 2023")) {

				Assert.assertEquals(getText(inspRep.getReportTitle()), "NAVIGATION AUDIT - 2023");
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
						
			   System.out.println("Navigation Audit Inspection Report for 2023 has been generated successfully");
	   	

	}
}
			
			
			
			
			
			
			@Test
			public void AllObservation() throws InterruptedException, AWTException {
				
				InspectionSummaryReportPage inspRep = new InspectionSummaryReportPage(driver);
				
				
				if(getText(inspRep.getReportTitle()).equals("SIRE INSPECTION - 2023"))
					
				{
				Assert.assertEquals(getText(inspRep.getReportTitle()), "SIRE INSPECTION - 2023");
				System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
				getFluentWait();
				
				
				
				js = (JavascriptExecutor) driver;			 
				js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getAllObservation());
				System.out.println("SIRE Inspection Performance - All Observation table is visible on report");
				getFluentWait();
				System.out.println("SIRE Inspection All Observation Report for 2023 has been generated successfully");
				
				}
				
				
				
				
				
				else if(getText(inspRep.getReportTitle()).equals("PSC INSPECTION - 2023")) {	
			
	        
				Assert.assertEquals(getText(inspRep.getReportTitle()), "PSC INSPECTION - 2023");
				System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
				getFluentWait();		
				
				js = (JavascriptExecutor) driver;			 
				js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getAllObservation());
				System.out.println("PSC Inspection Performance - All Observation table is visible on report");
				getFluentWait();	
						
			   System.out.println("PSC Inspection All Observation Report for 2023 has been generated successfully");
			   
				}				
				
		
				else if(getText(inspRep.getReportTitle()).equals("SUPERINTENDENT INSPECTION - 2023")) {

					Assert.assertEquals(getText(inspRep.getReportTitle()), "SUPERINTENDENT INSPECTION - 2023");
					System.out.println("Report Name : - " +getText(inspRep.getReportTitle()));
					getFluentWait();
					
					
					
					js = (JavascriptExecutor) driver;			 
					js.executeScript("arguments[0].scrollIntoView(true);", inspRep.getAllObservation());
					System.out.println("Superintendent Inspection Performance - All Observation  table is visible on report");
					getFluentWait();
					System.out.println("SUPERINTENDENT Inspection All Observation Report for 2023 has been generated successfully");
					
					
					
		
		
	}
		
		}
			
}
