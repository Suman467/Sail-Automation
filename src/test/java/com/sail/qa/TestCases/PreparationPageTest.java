package com.sail.qa.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.PreparationPage;
import com.sail.qa.pages.Toaster;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class PreparationPageTest extends TestBase{
	public static Logger log = LogManager.getLogger(PreparationPageTest.class.getName());
	
	
	@Test
	public void verifyPrepPage() throws InterruptedException
	{
		
		PreparationPage pp = new PreparationPage(driver);
		Thread.sleep(2000);
		clickElement(pp.getPrepTab());
		log.info("Admin clicked on Preparation tab");
		getFluentWait();
		String prepText =getText(pp.getPreparationText());
		Assert.assertEquals(prepText, "Preparation");
		String plnText =getText(pp.getPlannedText());
		Assert.assertEquals(plnText, "PLANNED VESSELS");
		getFluentWait();
		System.out.println("The text \"PLANNED VESSELS\" is visible on the page");
		log.info("The text \"PLANNED VESSELS\" is visible on the page");
		getFluentWait();
		Assert.assertTrue(pp.getActiveBtn().isDisplayed());
		Assert.assertTrue(pp.getArchiveBtn().isDisplayed());
		log.info("Active and Archive button is displaying on Preparation page");
		System.out.println("Active and Archive button is displaying on Preparation page");
		getFluentWait();
		Assert.assertTrue(pp.getNewPrepBtn().isDisplayed());
		System.out.println("New Prepartion button is visible on page");
		log.info("New Prepartion button is visible on page");
		getFluentWait();
		Assert.assertTrue( pp.getInspectionColumn().isDisplayed()&& pp.getStartDate().isDisplayed()
				&& pp.getDueDateColumn().isDisplayed() && pp.getProgressColumn().isDisplayed() && pp.getDueDateColumn().isDisplayed()
				&& pp.getPortColumn().isDisplayed() && pp.getActionColumn().isDisplayed());
		log.info("Vessel , Inspection , Start Date , Progress , Due Date , Port , Action "
				+ "columns are displaying on preparation planned vessel table");
		System.out.println("\"Vessel\" , \"Inspection\" , \"Start Date\" , \"Progress\" , \"Due Date\" , \"Port\" , \"Action\" "
		        + "columns are displaying on preparation planned vessel table");
		Thread.sleep(2000);
		
	}
	/**
	 * @param indexToSelectVessel
	 * @param viqGrp
	 * @throws InterruptedException
	 * @throws TimeoutException
	 */
	@Parameters({"vesselName","indexToSelectPort", "viqGroup","viqVersion"})
	@Test
	public void addNewPreparation(String vesselName ,int indexToSelectPort, String viqGrp,@Optional String viqVersion) throws InterruptedException, TimeoutException
	{
		PreparationPage pp = new PreparationPage(driver);
		Toaster toast = new Toaster(driver);
		Thread.sleep(3000);
		
		/*
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(driver -> pp.getArchiveBtn().isEnabled());  // Waits until the button is enabled

		
		String totalActivePrepCount= getText(pp.getActivePreparationCount());
		System.out.println("Active preparation count is : "+totalActivePrepCount);
		
		*/
	
		clickElement(pp.getNewPrepBtn());
		log.info("+ New Preparation button is clicked");
		System.out.println("+ New Preparation button is clicked");
		Thread.sleep(3000);
		clickElement(pp.getSelectVesesl());
		log.info("Select Vessel drop down is clicked");
		System.out.println("Select Vessel drop down is clicked");
		getFluentWait();
		clickElement(pp.selectVeseslFromDropdown(vesselName));
		log.info("Vessel is selected from drop down");
		System.out.println("Vessel is selected from drop down");
		getFluentWait();
		
		clickElement(pp.getPortDropDown());
		log.info("Port drop drown is clicked");
		System.out.println("Port drop drown is clicked");
		getFluentWait();
		
		clickElement(pp.selectPortFromDropdown(indexToSelectPort));
		log.info("Port is selected from drop down");
		System.out.println("Port is selected from drop down");
		getFluentWait();
		
		clickElement(pp.getCalenderIcon());
		getFluentWait();
		clickElement(selectInspectionDate(pp.getCurrentDate()));
		log.info("Inspection date is entered");
		System.out.println("Inspection date is entered");
		getFluentWait();
		
		 Actions actions = new Actions(driver);
		 actions.moveToElement(pp.getHover()).click().perform();
		 
		 clickElement(pp.selectViqVersion(viqVersion));
		 log.info("VIQ Vesrion is selected");
		 System.out.println("VIQ Vesrion is selected");       
		 getFluentWait();
		 clickElement(pp.getViqGrp());	
		 
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", pp.selectViqGrp(viqGrp));
        
        		
		log.info("VIQ group  is selected");
		System.out.println("VIQ group is selected");		
		getFluentWait();
				
		
        // Press the Escape key
        actions.sendKeys(Keys.ESCAPE).build().perform();	
        log.info("VIQ group drop down is closed");
		System.out.println("VIQ group drop down is closed");
		getFluentWait();
		
		Assert.assertTrue(pp.getCreatedByField().isDisplayed());
		log.info("CreatedBy filed is displayed in preparation creation form ");
		System.out.println("CreatedBy filed is displayed in preparation creation form ");
		getFluentWait();
		Assert.assertTrue(pp.getNameAndDesignation().isDisplayed());
		log.info("Name/Designation filed is displayed in preparation creation form ");
		System.out.println("Name/Designation filed is displayed in preparation creation form ");
		getFluentWait();
		Assert.assertTrue(pp.getAssessmentType().isDisplayed());
		log.info("Assessment Type filed is displayed in preparation creation form ");
		System.out.println("Assessment Type field is displayed in preparation creation form ");
		getFluentWait();
			
		scrollCheckAndClick(pp.getSaveBtn());
		
		System.out.println("SAVE button is clicked");
		Thread.sleep(1000);
		
		String toastMsz="Preparation Created Successfully";
		
		Assert.assertTrue(toast.getToaster().isDisplayed());
		Assert.assertEquals(toastMsz, getText(toast.getToaster()));
		System.out.println(getText(toast.getToaster()) +"is dispakyed");
		System.out.println("New Preapation is created successfully");
		log.info("New Preapation is created successfully");
		Thread.sleep(1000);
		
		
		/*
		waitUntilElementPresent(pp.getArchiveBtn());
		
		
		String totalActivePrepCountNew= getText(pp.getActivePreparationCount());
		if(!totalActivePrepCountNew.equals (totalActivePrepCount))
		{
			System.out.println("Count is increased by 1");
			System.out.println("Total prepataion cout after adding a new preparation : " +totalActivePrepCountNew);
		}
		else
		{
			System.out.println("Count is not increased");
			System.out.println("Total active prepataion count after adding a new preparation : " +totalActivePrepCountNew);
		}
		
		*/
		getFluentWait();
		
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@Test	
	public void findPreparation() throws InterruptedException
	{
		PreparationPage pp = new PreparationPage(driver);
		String currentDate= getText(pp.getGetDateText()) ;
		
		/*
		
	
		if(currentDate.equals(PreparationPage.getStartDateOfPreparation())) {
			
			clickElement(pp.getGetDateText());
			System.out.println("preparation checklist open");
			getFluentWait();
		}
		
		else {
			
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].click();", (pp.getStartDate()));
		//clickElement(pp.getStartDate());
		System.out.println("Preparation checklist not found");
		
		}
		
		*/
		
		   // Loop until the current date matches the start date of preparation
	    while (!currentDate.equals(PreparationPage.getStartDateOfPreparation())) {
	        clickElement(pp.getStartDate());
	       
	        System.out.println("Preparation checklist not found");
	        
	        // Update the current date after clicking
	        currentDate = getText(pp.getGetDateText());
	        Thread.sleep(2000);
	        
	        // Optional: Add a wait time if necessary to avoid a tight loop
	        // Thread.sleep(1000); // Wait for 1 second before retrying
	    }

	    // Once the condition is met
	    getFluentWait();
	    clickElement(pp.getGetDateText());
	    System.out.println("Preparation checklist open");
	    Thread.sleep(1000);
	    Assert.assertTrue(pp.getChecklistTitle().isDisplayed());
	    System.out.println("Checklist title is : " +getText(pp.getChecklistTitle()));
	    getFluentWait();
	
		
	}
	
	
	@Parameters({"vesselName","inspectionName","indexToSelectPort", "risqGrp"})
	@Test
	public void addRISQPreparation(String vesselName ,String inspectionName,int indexToSelectPort, String risqGrp,@Optional String viqVersion) throws InterruptedException, TimeoutException
	{
		PreparationPage pp = new PreparationPage(driver);
		Toaster toast = new Toaster(driver);
		Thread.sleep(3000);
		
		
		String totalActivePrepCount= getText(pp.getActivePreparationCount());
		System.out.println("Active preparation count is : "+totalActivePrepCount);
	
		clickElement(pp.getNewPrepBtn());
		log.info("+ New Preparation button is clicked");
		System.out.println("+ New Preparation button is clicked");
		Thread.sleep(3000);
		clickElement(pp.getSelectVesesl());
		log.info("Select Vessel drop down is clicked");
		System.out.println("Select Vessel drop down is clicked");
		getFluentWait();
		clickElement(pp.selectVeseslFromDropdown(vesselName));
		log.info("Vessel is selected from drop down");
		System.out.println("Vessel is selected from drop down");
		getFluentWait();
		
		
		clickElement(pp.getSelectInspection());
		log.info("Inspection drop down is clicked");
		System.out.println("Inspection drop down is clicked");
		getFluentWait();
		clickElement(pp.selectInspectionFromDropdown(inspectionName));
		log.info("Inspection Type is selected from drop down");
		System.out.println("Inspection Type is selected from drop down");
		getFluentWait();		
		
		
		clickElement(pp.getPortDropDown());
		log.info("Port drop drown is clicked");
		System.out.println("Port drop drown is clicked");
		getFluentWait();
		
		clickElement(pp.selectPortFromDropdown(indexToSelectPort));
		log.info("Port is selected from drop down");
		System.out.println("Port is selected from drop down");
		getFluentWait();
		
		clickElement(pp.getCalenderIcon());
		getFluentWait();
		clickElement(selectInspectionDate(pp.getCurrentDate()));
		log.info("Inspection date is entered");
		System.out.println("Inspection date is entered");
		getFluentWait();
		
		
		 clickElement(pp.getRisqGroup());	
		 
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", pp.selectRisqGrp(risqGrp));
        
        		
		log.info("VIQ group  is selected");
		System.out.println("VIQ group is selected");		
		getFluentWait();
				
		
        // Press the Escape key
       // actions.sendKeys(Keys.ESCAPE).build().perform();	
        log.info("VIQ group drop down is closed");
		System.out.println("VIQ group drop down is closed");
		getFluentWait();
		
		Assert.assertTrue(pp.getCreatedByField().isDisplayed());
		log.info("CreatedBy filed is displayed in preparation creation form ");
		System.out.println("CreatedBy filed is displayed in preparation creation form ");
		getFluentWait();
		Assert.assertTrue(pp.getNameAndDesignation().isDisplayed());
		log.info("Name/Designation filed is displayed in preparation creation form ");
		System.out.println("Name/Designation filed is displayed in preparation creation form ");
		getFluentWait();
		Assert.assertTrue(pp.getAssessmentType().isDisplayed());
		log.info("Assessment Type filed is displayed in preparation creation form ");
		System.out.println("Assessment Type field is displayed in preparation creation form ");
		getFluentWait();
			
		scrollCheckAndClick(pp.getSaveBtn());
		
		System.out.println("SAVE button is clicked");
		Thread.sleep(1000);
		
		String toastMsz="Preparation Created Successfully";
		
		Assert.assertTrue(toast.getToaster().isDisplayed());
		Assert.assertEquals(toastMsz, getText(toast.getToaster()));
		System.out.println(getText(toast.getToaster()) +"is dispakyed");
		System.out.println("New Preapation is created successfully");
		log.info("New Preapation is created successfully");
		Thread.sleep(1000);
		
		
		/*
		
		String totalActivePrepCountNew= getText(pp.getActivePreparationCount());
		if(!totalActivePrepCountNew.equals (totalActivePrepCount))
		{
			System.out.println("Count is increased by 1");
			System.out.println("Total prepataion cout after adding a new preparation : " +totalActivePrepCountNew);
		}
		else
		{
			System.out.println("Count is not increased");
			System.out.println("Total active prepataion count after adding a new preparation : " +totalActivePrepCountNew);
		}
		*/
		getFluentWait();
		
	}
	
	
	
	
	
}
