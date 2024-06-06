package com.sail.qa.TestCases;

import java.awt.AWTException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.HistoryPage;

public class UpdateExternalInspectionsRecordVerify extends TestBase {
	public static Logger log = LogManager.getLogger(PreparationPageTest.class.getName());
	
	public HistoryPageCommonMenthods histoyPage = new HistoryPageCommonMenthods();
	
	
	
	

	
	// Sire Inspection
	
	@Parameters({"vesselName"})
	@Test
	
	public void printIinspectionDetails(String vessel) throws InterruptedException
	{
		
		
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		
		historyMethod.ApplyFilter(vessel);
		historyMethod.printInspectionDetails();
		
		
		
		
	}
	
	
	@Test
	@Parameters({"attachmentIndexOfObs1","attachmentIndexOfObs2","attachmentIndexOfObs3","attachmentIndexOfObs4"
		,"attachmentIndexOfIns1","attachmentIndexOfIns2","attachmentIndexOfIns3","attachmentIndexOfIns4",
		"attachmentName1","attachmentName2","attachmentName3","attachmentName4"})
	public void verifyInspectionDetails(int attachmentIndexOfObs1, int attachmentIndexOfObs2,int attachmentIndexOfObs3,
			int attachmentIndexOfObs4,int attachmentIndexOfIns1,int attachmentIndexOfIns2,int attachmentIndexOfIns3,
			int attachmentIndexOfIns4,String attachmentName1,String attachmentName2,String attachmentName3,String attachmentName4) throws InterruptedException, AWTException 
	{
		
		HistoryPage history =new HistoryPage(driver);
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		clickElement(history.getVessles());
		System.out.println("Vessels button is clicked");
		log.info("Vessels button is clicked");
		getFluentWait();
		
		
		
       System.out.println("\n **********Attachments Verification*********** \n");
		
				
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		getFluentWait();
		
	
		Assert.assertTrue(history.ifAttachmnetIsPresent(attachmentIndexOfObs1).isDisplayed());
		getFluentWait();	
		Assert.assertTrue(history.ifAttachmnetIsPresent(attachmentIndexOfObs2).isDisplayed());
		getFluentWait();
		
		Assert.assertTrue(history.ifAttachmnetIsPresent(attachmentIndexOfObs3).isDisplayed());
		getFluentWait();
		
		Assert.assertTrue(history.ifAttachmnetIsPresent(attachmentIndexOfObs4).isDisplayed());
		getFluentWait();
		
		Assert.assertEquals(getText(history.observationAttchmentsInInspectionPage(attachmentName1)), attachmentName1);
		System.out.println("All attachments are appearing in Inspection page ");
		System.out.println("The prefix of observation attachment is :  " +getText(history.observationAttchmentsInInspectionPage(attachmentName1)));
		getFluentWait();
		
		Assert.assertEquals(getText(history.observationAttchmentsInInspectionPage(attachmentName2)), attachmentName2);
		
		System.out.println("The prefix of observation attachment is :  " +getText(history.observationAttchmentsInInspectionPage(attachmentName2)));
		
        getFluentWait();
		
		Assert.assertEquals(getText(history.observationAttchmentsInInspectionPage(attachmentName3)), attachmentName3);
		
		System.out.println("The prefix of observation attachment is :  " +getText(history.observationAttchmentsInInspectionPage(attachmentName3)));
		
        getFluentWait();
		
		Assert.assertEquals(getText(history.observationAttchmentsInInspectionPage(attachmentName4)), attachmentName4);
		
		System.out.println("The prefix of observation attachment is :  " +getText(history.observationAttchmentsInInspectionPage(attachmentName4)));
		
		Thread.sleep(1000);
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		getFluentWait();
		
		//System.out.println("Observation : " + getText(history.getActiveObsName()));
		//getFluentWait();
		scrollToElement(driver,history.ifAttachmnetIsPresent(attachmentIndexOfIns1));
		getFluentWait();	
		Assert.assertTrue(history.ifAttachmnetIsPresent(attachmentIndexOfIns1).isDisplayed());
		System.out.println("First observation attachment is correctly appearing in first observation page");
		
		getFluentWait();
		
		
		clickElement(history.getSecondObs());
		System.out.println("Observation : " + getText(history.getActiveObsName()));
		getFluentWait();
		scrollToElement(driver,history.ifAttachmnetIsPresent(attachmentIndexOfIns2));
		getFluentWait();	
		Assert.assertTrue(history.ifAttachmnetIsPresent(attachmentIndexOfIns1).isDisplayed());
		System.out.println("Second observation attachment is correctly appearing in first observation page");
		
        getFluentWait();
		
		
		clickElement(history.getThirdObs());
		System.out.println("Observation : " + getText(history.getActiveObsName()));
		getFluentWait();
		
		scrollToElement(driver,history.ifAttachmnetIsPresent(attachmentIndexOfIns3));
		getFluentWait();	
		Assert.assertTrue(history.ifAttachmnetIsPresent(attachmentIndexOfIns1).isDisplayed());
		System.out.println("Third observation attachment is correctly appearing in first observation page");		
		
        getFluentWait();
		
		clickElement(history.getFourthObs());
		System.out.println("Observation : " + getText(history.getActiveObsName()));
		getFluentWait();
		
		scrollToElement(driver,history.ifAttachmnetIsPresent(attachmentIndexOfIns4));
		getFluentWait();	
		Assert.assertTrue(history.ifAttachmnetIsPresent(attachmentIndexOfIns1).isDisplayed());
		System.out.println("Fourth observation attachment is correctly appearing in first observation page");
		
		Thread.sleep(1000);
		
		
				
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		Thread.sleep(1000);
		
		
	}	
		
}
