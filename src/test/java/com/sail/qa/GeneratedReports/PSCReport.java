package com.sail.qa.GeneratedReports;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.GeneratedReport;
import com.sail.qa.pages.ReportPage;
import com.sail.qa.pages.Toaster;

public class PSCReport extends TestBase {
	
	public JavascriptExecutor js ;
		
	
		@Test
		public void GeneratePSCReport() throws InterruptedException, AWTException {
			
			
			GeneratedReport genRep = new GeneratedReport(driver);
			
			Assert.assertEquals(getText(genRep.getReportText()), "PSC INSPECTION - 2023");
			System.out.println("Report Name : - " +getText(genRep.getReportText()));
			getFluentWait();
			
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getYearly());
			System.out.println("Yearly graph is visible on report");
			getFluentWait();
						
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getQuartly());
			System.out.println("Quartly graph is visible on report");
			getFluentWait();
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getFleetGrp());
			System.out.println("Fleet group analysis graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getAdditionalGrp());
			System.out.println("Additional group  graph is visible on report");
			
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getOwner());
			System.out.println("Owner  graph is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getVessels());
			System.out.println("Vessels graph is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspVsObs());
			System.out.println("InsVsObs graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getMou());
			System.out.println("PSC MOU graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspByShip());
			System.out.println("Inspections By Ship Type group  graph is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPscDeficiencyCat());
			System.out.println("Deficiency Category  graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPscAction());
			System.out.println("PSC action code group  graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getDeficiencyCode());
			System.out.println("Deficiency Code graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getImmediateCause());
			System.out.println("Immediate Causes graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getRootCause());
			System.out.println("Root Causes graph is visible on report");			
			
			
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getCompanyBenchmarkYearly());
			System.out.println("Company Benchmark graph is visible on report");
			
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspectionSummary());
			System.out.println("Inspection Summary is visible on report");
			

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getListOfInspection());
			System.out.println("Inspections list is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTable());
			System.out.println("Plan Table is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspPerformanceTop20RepeatedObs());
			System.out.println("CDI INSPECTION Performance - Top 20 Repeated Observation list is visible on report");
			getFluentWait();

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPscPageEnd());				
		   System.out.println("PSC Report for 2023 has been generated successfully");
		   			

		}

}
