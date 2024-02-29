package com.sail.qa.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.PreparationPage;
import com.sail.qa.pages.Toaster;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

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
	@Parameters({"indexToSelectVessel","indexToSelectPort", "viqGroup","viqVersion"})
	@Test
	public void addNewPreparation(int indexToSelectVessel ,int indexToSelectPort, String viqGrp,@Optional String viqVersion) throws InterruptedException, TimeoutException
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
		clickElement(pp.selectVeseslFromDropdown(indexToSelectVessel));
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
		
		String totalActivePrepCountNew= getText(pp.getActivePreparationCount());
		if(!totalActivePrepCountNew.equals (totalActivePrepCount))
		{
			System.out.println("Count is increased by 1");
			System.out.println("Total prepataion cout after adding a new preparation : " +totalActivePrepCountNew);
		}
		else
		{
			System.out.println("Count is not increased");
			System.out.println("Total prepataion cout after adding a new preparation : " +totalActivePrepCountNew);
		}
		
	}
	
}
