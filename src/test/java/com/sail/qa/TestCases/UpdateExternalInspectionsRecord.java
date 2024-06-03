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

public class UpdateExternalInspectionsRecord extends TestBase {
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
	
	@Parameters({"UploadImagePath","viqRef1","indexToSelectimmediateCause","indexToSelectrootCause","actionName","proposedBy","actionStatus"})
	@Test
	
	public void EditInspectionRecord(String UploadImagePath,String viqRef1, int indexToSelectimmediateCause, int indexToSelectrootCause,
			String actionName, String proposedBy, String actionStatus ) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		
		System.out.println("\n **********Inspection Record Updation********** \n");
		
		getFluentWait();
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		  
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
	
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", history.getNewObsVIQRef());
		
		//clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");
		
		
		Thread.sleep(1000);	
		
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef1));
		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		
		
		
		try {
			if (history.getObservationTextBox().isDisplayed()) {
				// Code for handling the pop-up if it appears
				sendKeys(history.getObservationTextBox(),"Observation is entered using automation tool");
				sendKeys(history.getOperatorCommentTextBox(),"Record is created using automation tool");
				
				
			} else if(history.getFindingTextBox().isDisplayed()) {
				// Code for handling if the pop-up does not appear
				sendKeys(history.getFindingTextBox(),"This observation is entered using automation tool");
				sendKeys(history.getOperatorCommentTextBox(),"This record is created using automation tool");
				
			}
			else
			{
				sendKeys(history.getDeficiencyTextBox(),"This observation is entered using automation tool");
				sendKeys(history.getOperatorCommentTextBox(),"This record is created using automation tool");
				getFluentWait();
			}
		} catch (NoSuchElementException e) {

		}
		
		
		
	
		
		getFluentWait();
		
		
		historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
				
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
                
		
	
		System.out.println("Inspection record is updated successfully");
		log.info("Inspection record is updated successfully");
		Thread.sleep(1000);
		
		System.out.println("\n ********** Inspection Details After Record Updation********** \n");
		
		historyMethod.printInspectionDetails();
		getFluentWait();
				
		
	}
	
	
	
	
	
	
	
	@Test
	@Parameters({"attachmentIndexOfObs1","attachmentIndexOfObs2","attachmentIndexOfIns1","attachmentName"})
	public void checkAttachmentInsideRecord(int attachmentIndexOfObs1, int attachmentIndexOfObs2,int attachmentIndexOfIns1, String attachmentName) throws InterruptedException, AWTException 
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
		Assert.assertEquals(getText(history.observationAttchmentsInInspectionPage(attachmentName)), attachmentName);
		System.out.println("All attachments are appearing in Inspection page ");
		System.out.println("The prefix of observation attachment is :  " +getText(history.observationAttchmentsInInspectionPage(attachmentName)));
		
		Thread.sleep(1000);
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		getFluentWait();
		
		scrollToElement(driver,history.ifAttachmnetIsPresent(attachmentIndexOfIns1));
		getFluentWait();	
		Assert.assertTrue(history.ifAttachmnetIsPresent(attachmentIndexOfIns1).isDisplayed());
		System.out.println("First observation attachment is correctly appearing in first observation page");
		
		Thread.sleep(1000);
		
		
				
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		Thread.sleep(1000);
		
		
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
	
	
	@Parameters({"UploadImagePath","selectPscCode","selectDefCode","indexToSelectimmediateCause", "indexToSelectrootCause","actionName","proposedBy","actionStatus"})
	@Test
	
	public void EditPscRecord(String UploadImagePath,String selectPscCode, String selectDefCode,int indexToSelectimmediateCause, int indexToSelectrootCause
			,String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		
		System.out.println("\n **********Inspection Record Updation********** \n");
		
		getFluentWait();
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();


		
		clickElement(history.getPscAction());
		System.out.println("PSC action code drop down is clicked");
		log.info("PSC action drop down is clicked");
		getFluentWait();
		

	
		clickElement(history.selectPSCCode(selectPscCode));			
		System.out.println("PSC action is selected ");
		log.info("PSC action is selected");
		getFluentWait();
		
		
		// jsExecutor.executeScript("arguments[0].click();", history.getDeficiencyCode());
		
		clickElement(history.getDeficiencyCode());
		System.out.println("Deficiency code drop down is clicked");
		log.info("Deficiency code drop down is clicked");
		
		clickElement( history.selectDefCode(selectDefCode));
		System.out.println("Scrolled");
		getFluentWait();
			
		System.out.println("Deficiency is selected ");
		log.info("Deficiency is selected");
		getFluentWait();
		sendKeys(history.getDeficiencyTextBox(),"This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(),"This record is created using automation tool");
		
		getFluentWait();
		

		historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
			
				
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
                
		
	
		System.out.println("Inspection record is updated successfully");
		log.info("Inspection record is updated successfully");
		getFluentWait();
		
		System.out.println("\n ********** Inspection Details After Record Updation********** \n");
		
		historyMethod.printInspectionDetails();
		getFluentWait();
				
		
	}
	
	@Parameters({"UploadImagePath","deviationScope", "deviationName","viqRef1","viqRef2","viqRef3","indexToSelectimmediateCause",
		"indexToSelectrootCause","actionName","proposedBy","actionStatus"})
	@Test
	public void EditExternalAuditRecord(String UploadImagePath,int deviationScope, String deviationName, String viqRef1, String viqRef2, String viqRef3,
			int indexToSelectimmediateCause, int indexToSelectrootCause,String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		System.out.println("\n **********Inspection Record Updation********** \n");
		
		getFluentWait();
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		
		
		Assert.assertTrue(history.selectScopeOfDeviation(deviationScope).isDisplayed());
		System.out.println("Scope of Devaition is visible");
		log.info("Scope of Devaition is visible");
		
		clickElement(history.selectScopeOfDeviation(deviationScope));
		System.out.println("Scope of Devaition is selected");
		log.info("Scope of Devaition is selected");
		
		getFluentWait();
		Assert.assertTrue(history.getTypeOfDeviation().isDisplayed());
		System.out.println("Type of Deviation is visible");
		log.info("Type of Deviation is visible");
	
		getFluentWait();
		
		clickElement(history.getTypeOfDeviation());
		System.out.println("Type of Deviation is clicked");
		log.info("Type of Deviation is clicked");
		getFluentWait();
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", history.DeviationFromDropdown(deviationName));
		//clickElement(history.DeviationFromDropdown(deviationName));
		System.out.println("Type of Deviation is selected");
		log.info("Type of Deviation is selected");
		
		getFluentWait();
		
		
		
		clickElement(history.getViqRefInSecondOnsPage());
		//Actions actions = new Actions(driver);
		//actions.moveToElement(history.getViqRefInSecondOnsPage()).click().perform();
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");
		

	
		
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		System.out.println("Scrolled");
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		System.out.println("Scrolled");
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));
		
	
		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		
		sendKeys(history.getFindingTextBox(),"This observation is entered using automation tool");
		getFluentWait();
		historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
		
		Thread.sleep(1000);

		
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		
		Thread.sleep(1000);
		
		
	}
	
	
	@Parameters({"UploadImagePath","deviationName","viqRef1","viqRef2","viqRef3","indexToSelectimmediateCause","indexToSelectrootCause",
		"actionName","proposedBy","actionStatus"})
	@Test
	public void EditFlagStateRecord(String UploadImagePath,String deviationName, String viqRef1, String viqRef2, String viqRef3,
			int indexToSelectimmediateCause, int indexToSelectrootCause,String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		System.out.println("\n **********Inspection Record Updation********** \n");
		
		getFluentWait();
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		
		getFluentWait();
		Assert.assertTrue(history.getTypeOfDeviationFlagState().isDisplayed());
		getFluentWait();
		clickElement(history.getTypeOfDeviationFlagState());
		System.out.println("Type of Deviation drop down is clicked");
		log.info("Type of Deviation drop down is clicked");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 jsExecutor.executeScript("arguments[0].click();", history.SelectDeviationFromDropdown(deviationName));
		
		Thread.sleep(1000);
		
		clickElement(history.getViqRefInSecondOnsPage());
		System.out.println("viq ref drop down is clicked");
		log.info("viq ref drop down is clicked");
		
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));
		System.out.println("Viq Ref selected");
		
				
		getFluentWait();
		sendKeys(history.getFindingTextBox(),"The findings entered using automation tool");
		System.out.println("Finding is entered");
		getFluentWait();
			
		
		 historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
			getFluentWait();
			
			historyMethod.addAction(actionName, proposedBy, actionStatus);
			getFluentWait();
			
			
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		
		Thread.sleep(1000);
		
		
	}
	
	
	
	@Parameters({"UploadImagePath","risqRef1","risqRef2","risqRef3","indexToSelectimmediateCause","indexToSelectrootCause","actionName","proposedBy","actionStatus"})
	@Test
	public void EditRisqRecord(String UploadImagePath, String risqRef1, String risqRef2, String risqRef3,int indexToSelectimmediateCause, int indexToSelectrootCause,
			String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		System.out.println("\n **********Inspection Record Updation********** \n");
		
		getFluentWait();
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		clickElement(history.getViqRefInSecondOnsPage());
		System.out.println("RISQ ref drop down is clicked");
		log.info("RISQ ref drop down is clicked");
		

	
		
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(risqRef3));
		System.out.println("Risq ref is selected");
		log.info("RISQ ref is selected");
		
		sendKeys(history.getObservationTextBox(),"This observation is entered using automation tool");
		
		getFluentWait();
		
		historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
		
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		
		Thread.sleep(1000);
		
		
	}
	@Parameters({"UploadImagePath","viqRef1","viqRef2","viqRef3","QuestionCatogery","quesCatS","indexToSelectSOCvalue","quesCatN","indexToSelectNOC",
		"indexToSelectimmediateCause","indexToSelectrootCause","actionName","proposedBy","actionStatus"})
	@Test
	public void EditSireTrialRecord(String UploadImagePath, String viqRef1, String viqRef2, String viqRef3, String QuestionCatogery, String quesCatS ,
			int indexToSelectSOCvalue, String quesCatN,int indexToSelectNOC,int indexToSelectimmediateCause,
			int indexToSelectrootCause,String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		System.out.println("\n **********Inspection Record Updation********** \n");
		
		getFluentWait();
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		clickElement(history.getViqRefInSecondOnsPage());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");
		


		
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));
		
	
		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		
		getFluentWait();
		
		clickElement(history.getQuesCatInSecondPageOofObs());
		System.out.println("Question Category drop down is clicked ");
		log.info("Question Category drop down is clicked");
		
		getFluentWait();
		
		
		Actions action = new Actions(driver);
		action.moveToElement(history.selectQuesCategory(QuestionCatogery)).click().perform();		
		System.out.println("Question Category is selected");
		log.info("Question Category is selected");
		
		getFluentWait();
		clickElement(history.socSecondPageOfObs(quesCatS));
		System.out.println("SOC drop down is clicked ");
		log.info("SOC drop down is clicked");
		
		getFluentWait();
		clickElement(history.selectNocSocFromDropDown(indexToSelectSOCvalue));		
		System.out.println("SOC  is selected");
		log.info(" SOC is selected");
		getFluentWait();
		
		clickElement(history.noc(quesCatN));
		getFluentWait();
		clickElement(history.selectNocSocFromDropDown(indexToSelectNOC));
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();	
        log.info("NOC drop down is closed");
		System.out.println("NOC drop down is closed");
		getFluentWait();
		
		
		getFluentWait();
		
		sendKeys(history.getNegativeComment()," comment is entered using automation tool");
		
						
		getFluentWait();
		
		historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
		
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		
		Thread.sleep(1000);
		
		
	}
	
	
	@Parameters({"indexToClickDeviation","deviationName","viqRef1","viqRef2","viqRef3","indexToSelectrootCause","indexToSelectrootCause",
		"UploadImagePath", "actionName","proposedBy","actionStatus"})
	@Test
	public void EditGreenAwardRecord( int indexToClickDeviation, String deviationName,String viqRef1, String viqRef2, String viqRef3,
			int indexToSelectimmediateCause, int indexToSelectrootCause,String UploadImagePath, String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		System.out.println("\n **********Inspection Record Updation********** \n");
		
		getFluentWait();
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		clickElement(history.typeOfDeviation(indexToClickDeviation));
		clickElement(history.SelectDeviationFromDropdown(deviationName));
		System.out.println("Deviation is selcted");
				
		clickElement(history.getNewObsVIQRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));
		
	
		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		
		getFluentWait();
		
		sendKeys(history.getFindingTextBox(),"Finding entered using automation tool");
		System.out.println("Finding entered");
		
						
		getFluentWait();
		
		 historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		 getFluentWait();
		 
		 historyMethod.addAction(actionName, proposedBy, actionStatus);
		 getFluentWait();
		
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		
		Thread.sleep(1000);
		
		
	}
	
	
	
	@Parameters({"vessel","viqRef1","viqRef2","viqRef3","indexToSelectimmediateCause","indexToSelectrootCause","UploadImagePath", "actionName","proposedBy","actionStatus"})
	@Test
	public void EditScreeninRecord(String vessel, String viqRef1, String viqRef2, String viqRef3,int indexToSelectimmediateCause, int indexToSelectrootCause,
			String UploadImagePath, String actionName, String proposedBy, String actionStatus) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		System.out.println("\n **********Inspection Record Updation********** \n");
		
		getFluentWait();
		historyMethod.ApplyFilter(vessel);
		
		clickElement(history.getEditIcon());
		System.out.println("Edit icon is clicked");
		getFluentWait();
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		clickElement(history.getNewObsVIQRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");
		


		
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));
		
	
		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		
		getFluentWait();
		
		sendKeys(history.getObservationTextBox(),"This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(),"This record is created using automation tool");
		getFluentWait();
		
		 historyMethod.editAndSelectImmediateRootCause(indexToSelectimmediateCause, indexToSelectrootCause);
		getFluentWait();
		
		
		historyMethod.addAction(actionName, proposedBy, actionStatus);
		getFluentWait();
		
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		
		Thread.sleep(1000);
	}
	
	
	
	

}
