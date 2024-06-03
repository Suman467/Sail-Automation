package com.sail.qa.TestCases;

import java.awt.AWTException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.HistoryInternalInspectionsPage;
import com.sail.qa.pages.HistoryPage;

public class UpdateInternalInspectionsRecord extends TestBase {
	public static Logger log = LogManager.getLogger(PreparationPageTest.class.getName());
	
	public HistoryPageCommonMenthods histoyPage = new HistoryPageCommonMenthods();
	
	
	public void updateObservationPage(String UploadImagePath,@Optional String inspectionName, @Optional String deviationName,String viqRef1, String viqRef2, String viqRef3,int indexToSelectimmediateCause,
			int indexToSelectrootCause, int indexToSelectReviewCalender,int indexToSelectReviewText,
			String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		getFluentWait();
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		
		getFluentWait();
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		if(inspectionName.equals("Others"))
		{
			clickElement(internalInspHistory.getDevationType3());
			clickElement(internalInspHistory.selectDeviationFromDropdown(deviationName));
			System.out.println("Daviation name is selected");		
			
			getFluentWait();
			
		}
		else {
		
			System.out.println("");
		}
		
				
		clickElement(history.getViqRefInSecondOnsPage());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");		

		getFluentWait();
		
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));
		
	
		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		
		sendKeys(history.getFindingTextBox(),"This finding is entered using automation tool");		
				
		getFluentWait();
		historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
		
		
		clickElement(internalInspHistory.getReviewPage());
		System.out.println("User is on Review page");
		Thread.sleep(1000);
		
		clickElement(internalInspHistory.getAddNewReviewBtn());
		System.out.println("Add New Review button is clicked");
		
		clickElement(internalInspHistory.selectCalenderForReview(indexToSelectReviewCalender));
		getFluentWait();
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("New Review date is selected");
		
		sendKeys(internalInspHistory.selectTextForReview(indexToSelectReviewText),"Review is entered using automation tools");
		System.out.println("Review text is entered");
				
				
		clickElement(internalInspHistory.getReviewSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
       getFluentWait();
		
		Thread.sleep(1000);

	}
	
	
	
	

	
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
	@Parameters({"filePath"})
	public void uploadExcelForObservation(String filePath) throws AWTException, InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		 //Thread.sleep(1000);
		
		//clickElement(history.getCacheClear())		;
       
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		clickElement(history.getVessles());
		System.out.println("Vessels button is clicked");
		log.info("Vessels button is clicked");
		getFluentWait();
		
		
		
       System.out.println("\n **********Upload Excel For Observation********** \n");
		
				
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		getFluentWait();
		
	
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		getFluentWait();
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add new observation button is clicked");
		log.info("Add new observation button is clicked");
		
		getFluentWait();
		
		
	    clickElement(history.getUploadExcelIcon());
	    System.out.println("Upload Excel button is clicked");
		log.info("Upload Excel button is clicked");
		
		getFluentWait();		

        // Use Robot class to handle the file upload dialog
		uploadFileAndattAchments(filePath);
		
		
		getFluentWait();
				
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
        
		
		System.out.println("Inspection record is updated successfully");
		log.info("Inspection record is updated successfully");
		getFluentWait();
		
		System.out.println("\n ********** Inspection Details After Uploading Excel ********** \n");
		
		historyMethod.printInspectionDetails();
		getFluentWait();
				
	}
	
	
	
	@Parameters({"UploadImagePath","indexToSelectDeviationScope", "deviationName","viqRef1","viqRef2","viqRef3","indexToSelectimmediateCause","indexToSelectrootCause"
		,"indexToSelectReviewCalender","indexToSelectReviewText","actionName","proposedBy","actionStatus"})
	@Test
	public void EditInternalAuditRecord(String UploadImagePath,int deviationScope, String deviationName, String viqRef1, String viqRef2, String viqRef3,
			int indexToSelectimmediateCause, int indexToSelectrootCause, int indexToSelectReviewCalender,int indexToSelectReviewText,
			String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		
		
		System.out.println("\n **********Inspection Record Updation************* \n");
		
		getFluentWait();
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		getFluentWait();
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		clickElement(internalInspHistory.scopeOfDeviation(deviationScope));
		System.out.println(getText(internalInspHistory.scopeOfDeviation(deviationScope)) + " Deviation Scope  is selected ");
		getFluentWait();
		
		clickElement(internalInspHistory.getTypeOfDeviation());
		getFluentWait();
		 
		clickElement(internalInspHistory.selectDeviationFromDropdown(deviationName));
		System.out.println("Daviation name is selected");		
		
		getFluentWait();
				
		clickElement(history.getViqRefInSecondOnsPage());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");		

		getFluentWait();
		
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));
		
	
		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		
		sendKeys(history.getFindingTextBox(),"This finding is entered using automation tool");		
				
		getFluentWait();
		historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
		
		
		clickElement(internalInspHistory.getReviewPage());
		System.out.println("User is on Review page");
		Thread.sleep(1000);
		
		clickElement(internalInspHistory.getAddNewReviewBtn());
		System.out.println("Add New Review button is clicked");
		
		clickElement(internalInspHistory.selectCalenderForReview(indexToSelectReviewCalender));
		getFluentWait();
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("New Review date is selected");
		
		sendKeys(internalInspHistory.selectTextForReview(indexToSelectReviewText),"Review is entered using automation tools");
		System.out.println("Review text is entered");
				
				
		clickElement(internalInspHistory.getReviewSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
       getFluentWait();
		
		Thread.sleep(1000);

			
	}
	
	
	
	@Parameters({"UploadImagePath","inspectionName","deviationName","viqRef1","viqRef2","viqRef3","indexToSelectimmediateCause","indexToSelectrootCause"
		,"indexToSelectReviewCalender","indexToSelectReviewText","actionName","proposedBy","actionStatus"})
	@Test
	public void EditsupdtInspectionRecord(String UploadImagePath,@Optional String inspectionName, @Optional String deviationName,String viqRef1, String viqRef2, String viqRef3,int indexToSelectimmediateCause,
			int indexToSelectrootCause, int indexToSelectReviewCalender,int indexToSelectReviewText,
			String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		System.out.println("\n **********Inspection Record Updation************* \n");
		
		getFluentWait();
		updateObservationPage(UploadImagePath,inspectionName,deviationName,viqRef1,viqRef2, viqRef3,indexToSelectimmediateCause,
				indexToSelectrootCause,indexToSelectReviewCalender,indexToSelectReviewText,actionName,proposedBy,actionStatus);
		
		
			
	}
	
	@Parameters({"inspectionName","deviationName","viqRef1","viqRef2","viqRef3","indexToSelectimmediateCause","indexToSelectrootCause"
		,"indexToSelectReviewCalender","indexToSelectReviewText","UploadImagePath", "actionName","proposedBy","actionStatus"})
	@Test
	public void EditPrevettingInspectionRecord(@Optional String inspectionName, @Optional String deviationName,String viqRef1, String viqRef2, String viqRef3,int indexToSelectimmediateCause,
			int indexToSelectrootCause, int indexToSelectReviewCalender,int indexToSelectReviewText,
			String UploadImagePath, String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		System.out.println("\n **********Inspection Record Updation************* \n");
		
		getFluentWait();
		updateObservationPage(UploadImagePath,inspectionName,deviationName,viqRef1,viqRef2, viqRef3,indexToSelectimmediateCause,
				indexToSelectrootCause,indexToSelectReviewCalender,indexToSelectReviewText,actionName,proposedBy,actionStatus);
		
		
			
	}
	
	
	
	@Parameters({"inspectionName","deviationName","internalChapter","viqRef1","viqRef2","viqRef3","indexToSelectimmediateCause","indexToSelectrootCause"
		,"indexToSelectReviewCalender","indexToSelectReviewText","UploadImagePath", "actionName","proposedBy","actionStatus"})
	@Test
	public void updateInspectionRecord(String inspectionName,String deviationName, String internalChapter,String viqRef1, String viqRef2, String viqRef3,
			int indexToSelectimmediateCause, int indexToSelectrootCause, int indexToSelectReviewCalender,int indexToSelectReviewText,
			String UploadImagePath, String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		
		
		System.out.println("\n **********Inspection Record Updation************* \n");
		
				
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		getFluentWait();
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		getFluentWait();
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		Assert.assertTrue(internalInspHistory.getTypeOfDeviation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getInternalChapter().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getChecklistRef().isDisplayed());
		System.out.println("Type of Deviation and Internal chapter and Checklist reference are visisble in observation page");
		getFluentWait();
		
		
		clickElement(internalInspHistory.getTypeOfDeviation());
		getFluentWait();
		 
		clickElement(internalInspHistory.selectDeviationFromDropdown(deviationName));
		System.out.println("Daviation name is selected");		
		
		getFluentWait();
		if(inspectionName.equals("Cargo Audit") ||inspectionName.equals("VDR Review")||inspectionName.equals("Static Nav Audit")
				||inspectionName.equals("Dynamic Nav&nbps;Audit")) {
		clickElement(internalInspHistory.getInternalChapter());
		getFluentWait();
		clickElement(internalInspHistory.selectInternalChapter(internalChapter));
		System.out.println("Internal chapter is selected is selected");	
		
		getFluentWait();	
		}
		else {
			System.out.println("Internal chapter list is blank");
		}
		
		
		getFluentWait();
				
		clickElement(history.getViqRefInSecondOnsPage());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");		

		getFluentWait();
		
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));
		
	
		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		
		sendKeys(history.getFindingTextBox(),"This finding is entered using automation tool");		
				
		getFluentWait();
		historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
		
		
		clickElement(internalInspHistory.getReviewPage());
		System.out.println("User is on Review page");
		Thread.sleep(1000);
		
		clickElement(internalInspHistory.getAddNewReviewBtn());
		System.out.println("Add New Review button is clicked");
		
		clickElement(internalInspHistory.selectCalenderForReview(indexToSelectReviewCalender));
		getFluentWait();
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("New Review date is selected");
		
		sendKeys(internalInspHistory.selectTextForReview(indexToSelectReviewText),"Review is entered using automation tools");
		System.out.println("Review text is entered");
				
				
		clickElement(internalInspHistory.getReviewSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
       getFluentWait();
		
		Thread.sleep(1000);
	}
	
	@Parameters({"inspectionName","deviationName","viqRef1","viqRef2","viqRef3","indexToSelectimmediateCause","indexToSelectrootCause"
		,"indexToSelectReviewCalender","indexToSelectReviewText","UploadImagePath", "actionName","proposedBy","actionStatus"})
	@Test
	public void EditOthersInspectionRecord(@Optional String inspectionName, @Optional String deviationName,String viqRef1, String viqRef2, String viqRef3,int indexToSelectimmediateCause,
			int indexToSelectrootCause, int indexToSelectReviewCalender,int indexToSelectReviewText,
			String UploadImagePath, String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		System.out.println("\n **********Inspection Record Updation************* \n");
		
		getFluentWait();
		updateObservationPage(UploadImagePath,inspectionName,deviationName,viqRef1,viqRef2, viqRef3,indexToSelectimmediateCause,
				indexToSelectrootCause,indexToSelectReviewCalender,indexToSelectReviewText,actionName,proposedBy,actionStatus);
		
		
			
	}
	
	
	
	@Parameters({"indexToSelectimmediateCause","indexToSelectrootCause"
		,"indexToSelectReviewCalender","indexToSelectReviewText","UploadImagePath", "actionName","proposedBy","actionStatus"})
	@Test
	public void EditSeniorManagementVisitRecord(int indexToSelectimmediateCause, int indexToSelectrootCause, int indexToSelectReviewCalender,int indexToSelectReviewText,
			String UploadImagePath, String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		
		
		System.out.println("\n **********Inspection Record Updation************* \n");
		
		getFluentWait();
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		getFluentWait();
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		getFluentWait();
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		
		
		sendKeys(history.getFindingTextBox(),"This finding is entered using automation tool");		
				
		getFluentWait();
		historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
		
		clickElement(internalInspHistory.getReviewPage());
		System.out.println("User is on Review page");
		Thread.sleep(1000);
		
		clickElement(internalInspHistory.getAddNewReviewBtn());
		System.out.println("Add New Review button is clicked");
		
		clickElement(internalInspHistory.selectCalenderForReview(indexToSelectReviewCalender));
		getFluentWait();
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("New Review date is selected");
		
		sendKeys(internalInspHistory.selectTextForReview(indexToSelectReviewText),"Review is entered using automation tools");
		System.out.println("Review text is entered");
				
				
		clickElement(internalInspHistory.getReviewSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
       getFluentWait();
		
		Thread.sleep(1000);

			
	}
}
