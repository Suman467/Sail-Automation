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
import com.sail.qa.pages.InspectionComparisionReportPage;
import com.sail.qa.pages.InspectionSummaryReportPage;
import com.sail.qa.pages.ReportFilterPage;
import com.sail.qa.pages.ReportPage;

public class InspectionComparisonReport extends TestBase {

	public JavascriptExecutor js;

	public void InspectionComaprision(int reportYear) throws InterruptedException, AWTException {
			
			InspectionSummaryReportPage inspRep = new InspectionSummaryReportPage(driver);
			InspectionComparisionReportPage inspComparision = new InspectionComparisionReportPage(driver);
			
			
			Assert.assertEquals(getText(inspComparision.getInspComparison()), "INSPECTION COMPARISON - "+reportYear);
			System.out.println("Report Name : - " +getText(inspComparision.getInspComparison()));
			System.out.println(getText(inspComparision.getReportFilter()));
			getFluentWait();
			
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", inspComparision.getInspComparisonGrph());
			System.out.println("Inspection comparision graph is visible on report");
			getFluentWait();
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", inspComparision.getInternalVsExternal());
			System.out.println("Internal Vs External Graph is visible on report");
			getFluentWait();
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", inspComparision.getVesselComparision());
			System.out.println("Vesesel Comaprision Graph is visible on report");
			getFluentWait();
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", inspComparision.getChapterFindingComparisionYear());
			System.out.println("Chapter Finding Comaprision Year Graph is visible on report");
			getFluentWait();
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", inspComparision.getFindingComparisionYear());
			System.out.println("Finding Comparision Year Graph is visible on report");
			getFluentWait();
					
		   System.out.println("Inspection Comparision Report has been generated successfully");
			
			
			
		
		}
			
}
