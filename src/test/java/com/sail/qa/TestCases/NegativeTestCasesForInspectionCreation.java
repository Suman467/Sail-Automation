package com.sail.qa.TestCases;

import java.awt.AWTException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.HistoryInternalInspectionsPage;
import com.sail.qa.pages.HistoryPage;
import com.sail.qa.pages.Toaster;

public class NegativeTestCasesForInspectionCreation extends TestBase {
	public static Logger log = LogManager.getLogger(PreparationPageTest.class.getName());
	public HistoryPageCommonMenthods histoyPage = new HistoryPageCommonMenthods();
	public JavascriptExecutor js ;
	
	
	
	public void uploadInvalidFormatExcelForObservation(String filePath) throws AWTException, InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		
		
		
		
       System.out.println("\n **********Upload Excel For Observation********** \n");
		
		getFluentWait();		
	    clickElement(history.getUploadExcelIcon());
	    System.out.println("Upload Excel button is clicked");
		log.info("Upload Excel button is clicked");
		
		getFluentWait();		

        // Use Robot class to handle the file upload dialog
		uploadFileAndattAchments(filePath);
		
	
		Assert.assertTrue(history.getInvalidExcelFormat().isDisplayed());
		System.out.println(getText(history.getInvalidExcelFormat()));
		
		Thread.sleep(1000);
		clickElement(history.getToaster());
		
		Thread.sleep(1000);
				
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
        
	
	
}
	
	
	
	
	@Parameters({"vesselName","portIndex", "oilMajorIndex","filePath"})
	@Test
	
	public void AddNewSireRecordWithInvalidExcel(String vesselName, int portIndex , int oilMajorIndex ,String filePath) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		
		System.out.println("\n **********SIRE Inspection Record creation********** \n");
		
		 clickElement(history.getAllVesselTab());
		 Thread.sleep(1000);
		 String historyRecordCountAllVessel=getText(history.getTotalInsRecords());		 
		 System.out.println("Total Records of All Vessel : " +historyRecordCountAllVessel);
	    	    
	    	
		getFluentWait();
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
		
		getFluentWait();
		Assert.assertTrue(history.getInPortLocation().isDisplayed());
		Assert.assertTrue(history.getRemoteLocation().isDisplayed());
		
		Thread.sleep(2000);
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		
		clickElement(history.getOilMajor());
		System.out.println("Oil manjor down is clicked");
		clickElement(history.selectOilMajorFromDropdown(oilMajorIndex));
		System.out.println("Oil Major is selected");
		log.info("Oil Major is selected");
		
		
		getFluentWait();
		clickElement(history.getInspectionDateCalenderIcon());
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Inspected date is entered");
		log.info("Inspected date is entered");
		
		getFluentWait();
		
		clickElement(history.getInspectionStatus());
		clickElement(history.getInspectedStatus());
		System.out.println("Inspected status is selected");
		log.info("Inspected status is selected");
		
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		getFluentWait();
		
		
		uploadInvalidFormatExcelForObservation(filePath);
				
		
		
         histoyPage.linkRecordPopUp();
		
		Thread.sleep(2000);
		
		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew=getText(history.getTotalInsRecords());
		if(!historyRecordCountNew.equals (historyRecordCountAllVessel))
		{
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " +historyRecordCountNew);
		}
		else
		{
			System.out.println("Count is not increased");
			System.out.println("Total Records of All Vessel after adding a new record : " +historyRecordCountAllVessel);
		}
		
		getFluentWait();
	}
	
	
	
	
	
	
	
	
	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","indexToSelectAuditScope","inspectionStatusCalender1","filePath"})
	@Test
	
	public void AddNewInternalAuditRecordWithWithInvalidExcel(String inspectionName,String vesselName, int portIndex , String inspectionStatusCalender , 
			int auditScope,String inspectionStatusCalender1, String filePath) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		System.out.println("\n **********Internal Audit Inspection Record creation********** \n");
		
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());	
	    
    	
		 histoyPage.NewRecordButton(inspectionName,vesselName);
		
		Thread.sleep(2000);
		Assert.assertTrue(internalInspHistory.getSailingLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getRemoteLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getInPortLocation().isDisplayed());
		
		System.out.println("Sailing , Remote, In-Port locations are appering in Inspection Page");
		
		getFluentWait();
		
		Assert.assertTrue(internalInspHistory.getObservationPage().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getReviewPage().isDisplayed());
		getFluentWait();
		System.out.println("Observation and Review pages are apperaing ");
		
		getFluentWait();
		
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		
	    sendKeys(internalInspHistory.getAuditor(),"Automation Auditor");
	    getFluentWait();
	    
	    clickElement(internalInspHistory.selectDateForInspectionStatus(inspectionStatusCalender));
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println(inspectionStatusCalender + " date is entered");
		log.info(inspectionStatusCalender + " date is entered");
		
		getFluentWait();
		
		Assert.assertTrue(internalInspHistory.getAuditScope().isDisplayed());
		System.out.println("Audit Scope is appearing in Inspection page");
		
		clickElement(internalInspHistory.selectAuditScope(auditScope));
		System.out.println("Audit scope is selected");
		
		clickElement(internalInspHistory.selectDateForInspectionStatus(inspectionStatusCalender1));
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println(inspectionStatusCalender + " date is entered");
		log.info(inspectionStatusCalender + " date is entered");
		 
		getFluentWait();
		
		Actions actions = new Actions(driver);
       
        actions.moveToElement(internalInspHistory.getInspStatusFormly()).perform();
		 
		 getFluentWait();
		 
		Assert.assertEquals(inspectionStatusCalender1, getText(internalInspHistory.getInspStatusText()));
		System.out.println("Inspection status is :  " +getText(internalInspHistory.getInspStatusText()));
		
		getFluentWait();
		
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		getFluentWait();
		
		uploadInvalidFormatExcelForObservation(filePath);
		
       histoyPage.linkRecordPopUp();
		
		Thread.sleep(2000);
		
		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew=getText(history.getTotalInsRecords());
		if(!historyRecordCountNew.equals (historyRecordCountAllVessel))
		{
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " +historyRecordCountNew);
		}
		else
		{
			System.out.println("Count is not increased");
			System.out.println("Total Records of All Vessel after adding a new record : " +historyRecordCountAllVessel);
		}
		
		getFluentWait();
	}
	
	
	
	
	
	
	@Test
	
	public void AddNewInspectionWithoutSelectingVessel() throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		
		System.out.println("\n **********SIRE Inspection Record creation********** \n");
		
		 clickElement(history.getAllVesselTab());
		 Thread.sleep(1000);
		 String historyRecordCountAllVessel=getText(history.getTotalInsRecords());		 
		 System.out.println("Total Records of All Vessel : " +historyRecordCountAllVessel);
	    	    
	    	
		getFluentWait();
		clickElement(history.getNewRecordButton());
		System.out.println("+ New Record button is clicked");
		log.info("+ New Record button is clicked");
		
		
		
		clickElement(history.getAddNewButton());
		System.out.println("Add New button is clicked");
		log.info("Add New button is clicked");
		
		Assert.assertTrue(history.getError().isDisplayed());
		System.out.println("The error says: " + getText(history.getError()));
		getFluentWait();
		
		
	}
	
	
	@Parameters({"vesselName"})
	@Test
	
	public void AddNewWithBlankDetails(String vesselName) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		Toaster toast = new Toaster(driver);
		System.out.println("\n **********SIRE Inspection Record creation********** \n");
		
		 clickElement(history.getAllVesselTab());
		 Thread.sleep(1000);
		 String historyRecordCountAllVessel=getText(history.getTotalInsRecords());		 
		 System.out.println("Total Records of All Vessel : " +historyRecordCountAllVessel);
	    	    
	    	
		getFluentWait();
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
		
		getFluentWait();
		Assert.assertTrue(history.getInPortLocation().isDisplayed());
		Assert.assertTrue(history.getRemoteLocation().isDisplayed());
		
		
		
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		getFluentWait();
				
		
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
       getFluentWait();
       
      
		//Assert.assertFalse(toast.getToaster().isDisplayed());         
        System.out.println("Inspection Record Not Created");
       
        getFluentWait();
        clickElement(history.getBackBtn());
        System.out.println("Back button is pressed");
        
        getFluentWait();
        Assert.assertTrue(history.getPortValidation().isDisplayed());
        System.out.println("Validation " + getText(history.getPortValidation()) +" is appearing");
        getFluentWait();
        
        Assert.assertTrue(history.getOilMajorValidation().isDisplayed());
        System.out.println("Validation : " + getText(history.getOilMajorValidation()) +" is appearing");
        getFluentWait();
        
        Assert.assertTrue(history.getInspectDateValidation().isDisplayed());
        System.out.println("Validation : " + getText(history.getInspectDateValidation()) +" is appearing");
        getFluentWait();
        
        Assert.assertTrue(history.getInspStatusValidation().isDisplayed());
        System.out.println("Validation : " + getText(history.getInspStatusValidation()) +"is appearing");
        
		
       
		
        getFluentWait();
        
        clickElement(history.getInspectionsBtn());
        System.out.println("Inspections button is clicked");
       
        getFluentWait();
		
		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew=getText(history.getTotalInsRecords());
		if(!historyRecordCountNew.equals (historyRecordCountAllVessel))
		{
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " +historyRecordCountNew);
		}
		else
		{
			System.out.println("Count is not increased");
			System.out.println("Total Records of All Vessel after adding a new record : " +historyRecordCountAllVessel);
		}
		
		getFluentWait();
	}
}
	
	