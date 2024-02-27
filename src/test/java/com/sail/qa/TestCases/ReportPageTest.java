package com.sail.qa.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.ReportPage;

public class ReportPageTest extends TestBase {
	
	public JavascriptExecutor js ;
	//public static Logger log = LogManager.getLogger(ReportPageTest.class.getName());
	
	@Test
	public void VerifyReportTab() throws InterruptedException
	{
		ReportPage report= new ReportPage(driver);
		//driver.navigate().refresh();
		getFluentWait();
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", report.getReportTab());
		//clickElement(report.getReportTab());
		
		log.info("Report tab is clicked");
		System.out.println("Report tab is clicked");
		Assert.assertEquals("TIME PERIOD", getText(report.getTimePeriod()));
		System.out.println(getText(report.getTimePeriod())  + " text is visible on the report page");
		Assert.assertEquals("CONSOLIDATED REPORTS", getText(report.getConsolidateReport()));
		System.out.println(getText(report.getConsolidateReport())  + " text is visible on the report page");
		getFluentWait();		
		Assert.assertTrue(report.getGenerateBtn().isDisplayed());
		log.info("Generate button is visible on the report page");
		System.out.println("Generate button is visible on the report page");
		getFluentWait();
	}
		
		
	

}
