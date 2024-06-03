package com.sail.qa.TestCases;

import java.awt.AWTException;
import java.nio.file.Paths;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.HistoryInternalInspectionsPage;
import com.sail.qa.pages.HistoryPage;
import com.sail.qa.pages.ReportPage;
import com.sail.qa.pages.Toaster;

public class HistoryPageCommonMenthods extends TestBase {
	
	public String historyRecordCountAllVessel;
	
	
	
	@Test
	public void VerifyHistoryPage() throws InterruptedException {
		HistoryPage history = new HistoryPage(driver);
		clickElement(history.getHistoryPage());
		System.out.println("History tab is clicked");
		log.info("History tab is clicked");
		Assert.assertTrue(history.getNewRecordButton().isDisplayed());
		System.out.println("New Record button is visible");
		log.info("New Record button is visible");
		Assert.assertTrue(history.getHistoryTab().isDisplayed());
		System.out.println("History tab is visible");
		log.info("History tab is visible");
		Assert.assertTrue(history.getRequestedTab().isDisplayed());
		System.out.println("Requested tab is visible");
		log.info("Requested tab is visible");
		getFluentWait();
		Assert.assertTrue(history.getAllVesselTab().isDisplayed());
		System.out.println("All Vessel tab is visible");
		log.info("All Vessel tab is visible");
		Assert.assertTrue(history.getMyVesselTab().isDisplayed());
		System.out.println("my Vessel tab is visible");
		log.info("my Vessel tab is visible");
		Thread.sleep(1000);

	}

	@Test
	public void linkRecordPopUp() {
		HistoryPage history = new HistoryPage(driver);
		Toaster toast = new Toaster(driver);

		try {
			if (history.getNewBtnInPopUp().isDisplayed()) {
				// Code for handling the pop-up if it appears
				Assert.assertTrue(history.getPopUpText().isDisplayed());
				System.out.println(getText(history.getPopUpText()));

				getFluentWait();
				scrollCheckAndClick(history.getNewBtnInPopUp());
				System.out.println("New button is clicked on Pop Up");
				log.info("New button is clicked on Pop Up");

				getFluentWait();
				String toastMsz = "Inspection Record created successfully";
				Assert.assertTrue(toast.getToaster().isDisplayed());
				Assert.assertEquals(toastMsz, getText(toast.getToaster()));
				System.out.println(getText(toast.getToaster()) + " is displayed");
				System.out.println("Inspection record is created successfully");
				log.info("Inspection record is created successfully");
			} 
			
			else if
				 (history.getNewBtnInPopUp().isDisplayed()) {
					// Code for handling the pop-up if it appears
					Assert.assertTrue(history.getPopUpText().isDisplayed());
					System.out.println(getText(history.getPopUpText()));

					getFluentWait();
					clickElement(history.getNewBtnInPopUp());
					System.out.println("New button is clicked on Pop Up");
					log.info("New button is clicked on Pop Up");

					getFluentWait();
					String toastMsz = "Inspection Record created successfully";
					Assert.assertTrue(toast.getToaster().isDisplayed());
					Assert.assertEquals(toastMsz, getText(toast.getToaster()));
					System.out.println(getText(toast.getToaster()) + " is displayed");
					System.out.println("Inspection record is created successfully");
					log.info("Inspection record is created successfully");
				}
			
			
			else {
				// Code for handling if the pop-up does not appear
				String toastMsz = "Inspection Record created successfully";
				Assert.assertTrue(toast.getToaster().isDisplayed());
				Assert.assertEquals(toastMsz, getText(toast.getToaster()));
				System.out.println(getText(toast.getToaster()) + " is displayed");
				System.out.println("Inspection record is created successfully");
				log.info("Inspection record is created successfully");
			}
		} catch (NoSuchElementException e) {

		}
	}
	
	
	
	public void NewRecordButton(String inspectionName, String vesselName) throws InterruptedException
	{
		
		HistoryPage history = new HistoryPage(driver);
		 getFluentWait();
		
		Actions actions = new Actions(driver);
	    actions.moveToElement(history.getHitoryPageHover()).click().perform();
	    
		
	    getFluentWait();
			    
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", history.InspectionFromDropdown(inspectionName)); 	    
	    
		System.out.println("Inspection Type is selected");
		log.info(inspectionName  + " Inspection Type is selected");
		
		 clickElement(history.getAllVesselTab());
		 Thread.sleep(2000);
		 historyRecordCountAllVessel=getText(history.getTotalInsRecords());		 
		 System.out.println("Total Records of All Vessel : " +historyRecordCountAllVessel);
		
		
		
		clickElement(history.getNewRecordButton());
		System.out.println("+ New Record button is clicked");
		log.info("+ New Record button is clicked");
		
		clickElement(history.getVesselDropdownList());
		System.out.println("Vessel drop down is clicked");
		log.info("Vessel drop down is clicked");
		
		clickElement(history.VesselFromDropdown(vesselName));
		System.out.println("Vessel is selected");
		log.info("Vessel is selected");
		
		getFluentWait();
		
		
		clickElement(history.getAddNewButton());
		System.out.println("Add New button is clicked");
		log.info("Add New button is clicked");
	}
	
	
	public void ApplyFilter(String Vessel)
	{
		HistoryPage history = new HistoryPage(driver);
		
		getFluentWait();
		clickElement(history.SelectVessel(Vessel));
		System.out.println("Vessel is selected");
		log.info("Vessel is selected");	
		
		clickElement(history.getFilterBtn());
		System.out.println("Filter button is clicked");
		log.info("Filter button is clicked");
		
		clickElement(history.getPeriodFilterButton());
		System.out.println("Period button is clicked");
		log.info("Period button is clicked");
		getFluentWait();
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", history.getDateRangeRadioBtn());
        
		//clickElement(history.getDateRangeRadioBtn());
		System.out.println("Date Range radio button is selected");
		log.info("Date Range radio button is selected");
		
		clickElement(history.getDateFromCalenderIcon());
		System.out.println("Date From is selected");
		log.info("Date From is selected");
		
		clickElement(history.getCurrentDate());
		System.out.println("Current Date is selected");
		log.info("Current Date is selected");
		
		
		clickElement(history.getDateToCalenderIcon());
		System.out.println("Date To is selected");
		log.info("Date To is selected");
		
		clickElement(history.getCurrentDate());
		System.out.println("Current Date is selected");
		log.info("Current Date is selected");
		
		clickElement(history.getSubmitButton());
		System.out.println("Select button is clicked");
		log.info("Select button is clicked");
		getFluentWait();
		
		clickElement(history.getVessles());
		System.out.println("Vessels button is clicked");
		log.info("Vessels button is clicked");
		getFluentWait();
			
	}
	
	public void printInspectionDetails() {
	    HistoryPage history = new HistoryPage(driver);	    
	    for (int i = 1; i < 11; i++) {
	        getFluentWait();
	        try {
	            history.inspectionDeatils(i);
	            history.columnHeader(i);
	            System.out.println(getText(history.columnHeader(i)) + ": " +getText(history.inspectionDeatils(i)));
	            
	        } catch (StaleElementReferenceException e) {
	            // Retry the action
	            history.inspectionDeatils(i);
	            history.columnHeader(i);
	            System.out.println(getText(history.columnHeader(i)) + ": " +getText(history.inspectionDeatils(i)));
	        }
	        getFluentWait();
	    }
	
	}
	
	
	
	@Parameters({"inspectionName"})
	@Test
	public void SelectInspection(String inspectionName)
	{
	
		
		HistoryPage history =new HistoryPage(driver);
				
		Actions actions = new Actions(driver);
	    actions.moveToElement(history.getHitoryPageHover()).click().perform();
	    
		
	    getFluentWait();
			    
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", history.InspectionFromDropdown(inspectionName));
	    
	    
	    
		System.out.println("Inspection Type is selected");
		log.info(inspectionName  + " Inspection Type is selected");

}
	
	
	
	public void editAndSelectImmediateRootCause(int indexToSelectimmediateCause, int indexToSelectrootCause)
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		getFluentWait();
		
		
	    clickElement(history.getImmediateCause());
		System.out.println("Immediate cause is clicked");
		clickElement(history.selectimmediateCause(indexToSelectimmediateCause));
		System.out.println("Immediate cause is selected");
		getFluentWait();
		
		try {
			
			if (history.getSaveCauseBtn().isDisplayed())
			{
				clickElement(history.getSaveCauseBtn());
				System.out.println("Immediate Cause Save button is clicked");
				getFluentWait();
				
				clickElement(history.getRootCause());
				System.out.println("Root cause is clicked");
				clickElement(history.selectrootCause(indexToSelectrootCause));
				System.out.println("Root cause is selected");
				getFluentWait();
				
				clickElement(history.getSaveCauseBtn());
				System.out.println("Root Cause Save button is clicked");
				getFluentWait();
				
				
			}
			
			
			else {
				
				clickElement(internalInspHistory.getSaveCauseBtnInInternalInsp());
				System.out.println("Immediate Cause Save button is clicked");
				getFluentWait();
				
				clickElement(history.getRootCause());
				System.out.println("Root cause is clicked");
				clickElement(history.selectrootCause(indexToSelectrootCause));
				System.out.println("Root cause is selected");
				getFluentWait();
				
				clickElement(internalInspHistory.getSaveCauseBtnInInternalInsp());
				System.out.println("Root Cause Save button is clicked");
				getFluentWait();
				
				
			}
		}catch(Exception e) {
			
		}
		}
	
	
	
	
	
	public void uploadAttachmentsInInspectionPage(String UploadImagePath) throws InterruptedException, AWTException 
	{
		
		HistoryPage history =new HistoryPage(driver);
	
		
		
       System.out.println("\n **********Upload Attachments In Inspection & Observation Page********** \n");
		
   
		
        getFluentWait();
	    clickElement(history.getUploadObsAttachment());
	    System.out.println("Upload Excel button is clicked");
		log.info("Upload Excel button is clicked on inspection page");
		
		getFluentWait();		

        // Use Robot class to handle the file upload dialog
		uploadFileAndattAchments(UploadImagePath);
		
		
		getFluentWait();
		
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		
		 
		 clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath);
		getFluentWait();
		
		
	}	
	
	
	public void addAction(String actionName, String proposedBy, String actionStatus)
	{
		HistoryPage history =new HistoryPage(driver);
		clickElement(history.getAddActionBtn());
		getFluentWait();
		
		
		
		clickElement (history.getActionhover());
		
		getFluentWait();
		clickElement(history.selectActionType(actionName));
		System.out.println("Action type : " +actionName + " is selected");
		getFluentWait();
		clickElement(history.getProposedBy());
		getFluentWait();
		clickElement(history.selectProposedBy(proposedBy));
		System.out.println("Proposed by " + proposedBy + " is selected");
		getFluentWait();
		
		
		Actions actions = new Actions(driver);

        // Click on the input field and send text
        actions.click(history.getNatureOfAction()).sendKeys("Nature of action entered using automation tool").build().perform();
		
		
		getFluentWait();
		
		
		
				
		clickElement(history.getDueDateFormly());
		
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Action due date is entered");
		log.info("Action due date is entered");
		
		getFluentWait();
		clickElement(history.getActionStatusFormly());
		getFluentWait();
		
		clickElement(history.selectActionStatus(actionStatus));
		System.out.println("Action Status is selcted");
		
		
		scrollCheckAndClick(history.getActionSaveBtn());
		
		  
		System.out.println("Action save button is clicked");
		System.out.println("Action pop-up is closed");
		getFluentWait();
		
		
	}
	
	
	
	
	
			
		
		
		
		
		
	
	
}
