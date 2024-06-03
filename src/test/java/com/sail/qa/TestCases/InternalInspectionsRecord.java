package com.sail.qa.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.HistoryInternalInspectionsPage;
import com.sail.qa.pages.HistoryPage;

public class InternalInspectionsRecord extends TestBase {
	public static Logger log = LogManager.getLogger(PreparationPageTest.class.getName());
	public JavascriptExecutor js ;
	public HistoryPageCommonMenthods histoyPage = new HistoryPageCommonMenthods();
	
	
	public void observationPageMethod(@Optional String inspectionName, @Optional String deviationName, String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
	{
		
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		
		
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");		
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
		
				
		clickElement(history.getViqRef());
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
		
		sendKeys(internalInspHistory.getFindingTextBox(),"This finding is entered using automation tool");		
				
		getFluentWait();
		
		
		clickElement(internalInspHistory.getReviewPage());
		System.out.println("User is on Review page");
		Thread.sleep(1000);
		
		clickElement(internalInspHistory.getReviewedCalender());
		getFluentWait();
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Review date is selected");
		
		sendKeys(internalInspHistory.getReviewTextBox(),"Review is entered using automation tools");
		System.out.println("Review text is entered");
				
				
		clickElement(internalInspHistory.getReviewSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
       getFluentWait();
		
       histoyPage.linkRecordPopUp();
		
		Thread.sleep(2000);
		
		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		
	}
	
	
	
	public void commonMethods(@Optional String inspectionName,String inspectionStatusCalender,String inspStatus,String deviationName,String internalChapter,String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		
		
		getFluentWait();
		sendKeys(internalInspHistory.getAuditOrg(),"Automation Audit Organization");
		System.out.println("Audit Organisation is entered");
	    getFluentWait();
	    
			
	    
	    
	    clickElement(internalInspHistory.selectDateForInspectionStatus(inspectionStatusCalender));
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println(inspectionStatusCalender + " date is entered");
		log.info(inspectionStatusCalender + " date is entered");
		
		sendKeys(internalInspHistory.getAuditorTextBox(),"Automation Auditor");
		clickElement(internalInspHistory.getAuditorAutoSuggestedText());
		System.out.println("Auditor name is entered");
	    getFluentWait();
		
		getFluentWait();
		
		clickElement(internalInspHistory.getInspectionStatus());
		clickElement(internalInspHistory.selectInspectionStatus(inspStatus));
		System.out.println("Inspection status is selected");
		 
		 	
		getFluentWait();		
		
		
		clickElement(history.getNextBtn());
		System.out.println("Next button is clicked");
		log.info("Next button is clicked");
		
		
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
		
		clickElement(history.getViqRef());
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
		
		sendKeys(internalInspHistory.getFindingTextBox(),"This finding is entered using automation tool");		
				
		getFluentWait();
		
		
		clickElement(internalInspHistory.getReviewPage());
		System.out.println("User is on Review page");
		Thread.sleep(1000);
		
		clickElement(internalInspHistory.getReviewedCalender());
		getFluentWait();
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Review date is selected");
		
		sendKeys(internalInspHistory.getReviewTextBox(),"Review is entered using automation tools");
		System.out.println("Review text is entered");
				
				
		clickElement(internalInspHistory.getReviewSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
       getFluentWait();
		
       histoyPage.linkRecordPopUp();
		
		
	}
	

	
	// Internal Audit
	
	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","indexToSelectAuditScope","inspectionStatusCalender1","indexToSelectDeviationScope",
		"deviationName","viqRef1","viqRef2","viqRef3"})
	@Test
	
	public void AddNewInternalAuditRecordWithObservation(String inspectionName,String vesselName, int portIndex , String inspectionStatusCalender , int auditScope,String inspectionStatusCalender1,int deviationScope,
			String deviationName,String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
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
		
		clickElement(internalInspHistory.scopeOfDeviation(deviationScope));
		System.out.println(getText(internalInspHistory.scopeOfDeviation(deviationScope)) + " Deviation Scope  is selected ");
		getFluentWait();
		
		clickElement(internalInspHistory.getTypeOfDeviation());
		getFluentWait();
		 
		clickElement(internalInspHistory.selectDeviationFromDropdown(deviationName));
		System.out.println("Daviation name is selected");		
		
		getFluentWait();
				
		clickElement(history.getViqRef());
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
		
		sendKeys(internalInspHistory.getFindingTextBox(),"This finding is entered using automation tool");		
				
		getFluentWait();
		
		
		clickElement(internalInspHistory.getReviewPage());
		System.out.println("User is on Review page");
		Thread.sleep(1000);
		
		clickElement(internalInspHistory.getReviewedCalender());
		getFluentWait();
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Review date is selected");
		
		sendKeys(internalInspHistory.getReviewTextBox(),"Review is entered using automation tools");
		System.out.println("Review text is entered");
				
				
		clickElement(internalInspHistory.getReviewSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
       getFluentWait();
		
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
	
	// Supdt. Inspection
	
	
	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","inspStatus","deviationName","viqRef1","viqRef2","viqRef3"})
	@Test
	
	public void AddNewSupdtInspectionRecordWithObservation(String inspectionName,String vesselName, int portIndex , String inspectionStatusCalender , String inspStatus,@Optional String deviationName,
			String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());	
		
		System.out.println("\n **********Supdt Inspection Record creation********** \n");
		
		histoyPage.NewRecordButton(inspectionName,vesselName);
		
		Thread.sleep(2000);
		
		Assert.assertTrue(internalInspHistory.getRemoteLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getInPortLocation().isDisplayed());
		
		System.out.println("Remote, In-Port locations are appering in Inspection Page");
		
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getMarine().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getTechical().isDisplayed());
		
		System.out.println("Marine & Technical Sub Inspection Type are appering in Inspection Page");
		
		getFluentWait();
		
		Assert.assertTrue(internalInspHistory.getObservationPage().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getReviewPage().isDisplayed());
		getFluentWait();
		System.out.println("Observation and Review pages are appearing ");
		
		getFluentWait();
		
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		
	    sendKeys(internalInspHistory.getSuperintendentName(),"Automation Superintendent Auditor");
	    getFluentWait();
	    
	    clickElement(internalInspHistory.selectDateForInspectionStatus(inspectionStatusCalender));
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println(inspectionStatusCalender + " date is entered");
		log.info(inspectionStatusCalender + " date is entered");
		
		getFluentWait();
		
		clickElement(internalInspHistory.getInspectionStatus());
		clickElement(internalInspHistory.selectInspectionStatus(inspStatus));
		System.out.println("Inspection status is selected");
		 
		 	
		getFluentWait();
		
		observationPageMethod(inspectionName,deviationName ,viqRef1,viqRef2,viqRef3);
		
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
		
	
	
	//  prevetting
	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","inspStatus","deviationName","viqRef1","viqRef2","viqRef3"})
	@Test
	
	public void AddNewPrevettingRecordWithObservation(String inspectionName,String vesselName, int portIndex , String inspectionStatusCalender , String inspStatus,
			@Optional String deviationName,String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());	
		
		System.out.println("\n **********Prevetting Inspection Record creation********** \n");
		
		histoyPage.NewRecordButton(inspectionName,vesselName);
		
		Thread.sleep(2000);
		Assert.assertTrue(internalInspHistory.getSailingLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getRemoteLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getInPortLocation().isDisplayed());
		
		System.out.println("Sailing , Remote, In-Port locations are appering in Inspection Page");
		
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getByCompany().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getByThirdParty().isDisplayed());
		
		System.out.println("By Company and By 3rd Party Audited Type are appering in Inspection Page");
		
		getFluentWait();
		
		Assert.assertTrue(internalInspHistory.getObservationPage().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getReviewPage().isDisplayed());
		getFluentWait();
		System.out.println("Observation and Review pages are appearing ");
		
		getFluentWait();
		
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		
		 getFluentWait();
		sendKeys(internalInspHistory.getAuditOrg(),"Automation Audit Organization");
		System.out.println("Audit Organisation is entered");
	    getFluentWait();
	    
	    
	    clickElement(internalInspHistory.selectDateForInspectionStatus(inspectionStatusCalender));
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println(inspectionStatusCalender + " date is entered");
		log.info(inspectionStatusCalender + " date is entered");
		
		sendKeys(internalInspHistory.getAuditorTextBox(),"Automation Auditor");
		clickElement(internalInspHistory.getAuditorAutoSuggestedText());
		System.out.println("Auditor name is entered");
	    getFluentWait();
		
		getFluentWait();
		
		clickElement(internalInspHistory.getInspectionStatus());
		clickElement(internalInspHistory.selectInspectionStatus(inspStatus));
		System.out.println("Inspection status is selected");
		 
		 	
		getFluentWait();		
		
		
		observationPageMethod(inspectionName,deviationName,viqRef1,viqRef2,viqRef3);
		
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

	
	
	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","inspStatus","deviationName",
		"internalChapter","viqRef1","viqRef2","viqRef3"})
	
	@Test
	
	public void AddNewNavAuditRecordWithObservation(String inspectionName,String vesselName, @Optional int portIndex , String inspectionStatusCalender , String inspStatus,
			String deviationName,String internalChapter,String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());
		
		System.out.println("\n **********Navigation audit Inspection Record creation********** \n");
		
		
		histoyPage.NewRecordButton(inspectionName,vesselName);
		
		Thread.sleep(2000);
		
		getFluentWait();
		Assert.assertTrue(history.getInspectionDetailsText().isDisplayed());
		Assert.assertTrue(history.getEnterDataText().isDisplayed());
		getFluentWait();
		
		
				
		Assert.assertTrue(internalInspHistory.getSailingLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getRemoteLocation().isDisplayed());
		getFluentWait();
		
		
		System.out.println("Sailing , Remote locations are appering in Inspection Page");
		
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getByCompany().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getByThirdParty().isDisplayed());
		getFluentWait();
		
		try {
			if(inspectionName.equals("Static Nav Audit"))
			{
				Assert.assertTrue(internalInspHistory.getByMaster().isDisplayed());
				System.out.println("By Company , By 3rd Party, By Matser Audited Type are appering in Inspection Page");
			}
			
			else {
				Assert.assertTrue(internalInspHistory.getByVessel().isDisplayed());
				System.out.println("By Company , By 3rd Party, By Vessel Audited Type are appering in Inspection Page");
				
			}
		}catch(Exception e)
		{
			
		}
			
		
		
		
		getFluentWait();
		
		Assert.assertTrue(internalInspHistory.getObservationPage().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getReviewPage().isDisplayed());
		getFluentWait();
		System.out.println("Observation and Review pages are appearing ");
		
		getFluentWait();
		try {
			if(inspectionName.equals("Static Nav Audit"))
			{
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
			}
			
			else {
				
				sendKeys(internalInspHistory.getGeographicalLocation(),"Automation Geographical Location");
				System.out.println("Geographical location is entered");
				
			}}catch(Exception e) {
				
			}
		
			
	
		
	
		commonMethods(inspectionName,inspectionStatusCalender,inspStatus,deviationName,internalChapter, viqRef1,  viqRef2, viqRef3);	
		
		
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
	
	
	
	

	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","inspStatus","deviationName",
		"internalChapter","viqRef1","viqRef2","viqRef3"})
	
	@Test
	
	public void AddNewVDRReviewRecordWithObservation(String inspectionName,String vesselName, @Optional int portIndex , String inspectionStatusCalender , String inspStatus,
			String deviationName,String internalChapter,String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());
		
		System.out.println("\n **********"+inspectionName +"Inspection Record creation********** \n");
		
		
		histoyPage.NewRecordButton(inspectionName,vesselName);
		
		Thread.sleep(2000);
		
		getFluentWait();
		Assert.assertTrue(history.getInspectionDetailsText().isDisplayed());
		Assert.assertTrue(history.getEnterDataText().isDisplayed());
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getObservationPage().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getReviewPage().isDisplayed());
		
		System.out.println("Observation and Review pages are appearing ");
		getFluentWait();
		
				
						
			Assert.assertTrue(internalInspHistory.getByCompany().isDisplayed());
			getFluentWait();
			Assert.assertTrue(internalInspHistory.getByThirdParty().isDisplayed());
			System.out.println("By Company , By 3rd Party Audited Type are appering in Inspection Page");
			
		
			getFluentWait();				
			sendKeys(internalInspHistory.getGeoLoaction(),"Automation Geographical Location");
			System.out.println("Geographical location is entered");
			getFluentWait();
			
				
		  commonMethods(inspectionName,inspectionStatusCalender,inspStatus,deviationName,internalChapter, viqRef1,  viqRef2, viqRef3);	

		
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
	
	
	
	
	
	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","inspStatus","deviationName",
		"internalChapter","viqRef1","viqRef2","viqRef3"})
	
	@Test
	
	public void AddNewCMBAuditRecordWithObservation(String inspectionName,String vesselName, @Optional int portIndex , String inspectionStatusCalender , String inspStatus,
			String deviationName,String internalChapter,String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());
		
		System.out.println("\n **********"+inspectionName +"Inspection Record creation********** \n");
		
		
		histoyPage.NewRecordButton(inspectionName,vesselName);
		
		Thread.sleep(2000);
		
		getFluentWait();
		Assert.assertTrue(history.getInspectionDetailsText().isDisplayed());
		Assert.assertTrue(history.getEnterDataText().isDisplayed());
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getObservationPage().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getReviewPage().isDisplayed());
		
		System.out.println("Observation and Review pages are appearing ");
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getRemoteLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getInPortLocation().isDisplayed());		
		
		System.out.println("Remote & In-Port locations are appering in Inspection Page");
		
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getByCompany().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getByThirdParty().isDisplayed());
		getFluentWait();
		
		Assert.assertTrue(internalInspHistory.getByVessel().isDisplayed());
		getFluentWait();
		
		
	    System.out.println("By Company , By 3rd Party, By Vessel Audited Type are appering in Inspection Page");
	    getFluentWait();	
	    

		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		getFluentWait();
		
				
		commonMethods(inspectionName,inspectionStatusCalender,inspStatus,deviationName,internalChapter, viqRef1,  viqRef2, viqRef3);	

		
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
	
	
	
	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","inspStatus","deviationName",
		"internalChapter","viqRef1","viqRef2","viqRef3"})
	
	@Test
	
	public void AddNewEEAuditRecordWithObservation(String inspectionName,String vesselName, @Optional int portIndex , String inspectionStatusCalender , String inspStatus,
			String deviationName,String internalChapter,String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());
		
		System.out.println("\n **********"+inspectionName +"Inspection Record creation********** \n");
		
		
		histoyPage.NewRecordButton(inspectionName,vesselName);
		
		Thread.sleep(2000);
		
		getFluentWait();
		Assert.assertTrue(history.getInspectionDetailsText().isDisplayed());
		Assert.assertTrue(history.getEnterDataText().isDisplayed());
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getObservationPage().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getReviewPage().isDisplayed());
		
		System.out.println("Observation and Review pages are appearing ");
		getFluentWait();
		
		// For VDR Review
		
		
		
		
		Assert.assertTrue(internalInspHistory.getSailingLocation().isDisplayed());
		getFluentWait();
		
		Assert.assertTrue(internalInspHistory.getRemoteLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getInPortLocation().isDisplayed());		
		
		System.out.println("Sailing, Remote & In-Port locations are appering in Inspection Page");
		
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getByCompany().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getByThirdParty().isDisplayed());
		getFluentWait();
		
		Assert.assertTrue(internalInspHistory.getByVessel().isDisplayed());
		getFluentWait();
		
		
	    System.out.println("By Company , By 3rd Party, By Vessel Audited Type are appering in Inspection Page");
	    getFluentWait();	
	    

		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		
		
				
		commonMethods(inspectionName,inspectionStatusCalender,inspStatus,deviationName,internalChapter, viqRef1,  viqRef2, viqRef3);	

		
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
	
	
	
	// Other Inspection
	
	
	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","inspStatus"})
	@Test
	
	public void AddNewOthersRecorddWithObservation(String inspectionName,String vesselName, int portIndex , String inspectionStatusCalender , String inspStatus,
			String deviationName,String viqRef1, String viqRef2, String viqRef3) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());	
		
		System.out.println("\n **********Other Inspection Record creation********** \n");
		
		histoyPage.NewRecordButton(inspectionName,vesselName);
		
		Thread.sleep(2000);
		Assert.assertTrue(internalInspHistory.getSailingLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getRemoteLocation().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getInPortLocation().isDisplayed());
		
		System.out.println("Sailing , Remote, In-Port locations are appering in Inspection Page");
		
		getFluentWait();
		
		
		Assert.assertTrue(internalInspHistory.getByCompany().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getByThirdParty().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getByVessel().isDisplayed());
			
		
	    System.out.println("By Company , By 3rd Party, By Vessel Audited Type are appering in Inspection Page");
	    getFluentWait();	
		
		
		
		Assert.assertTrue(internalInspHistory.getObservationPage().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getReviewPage().isDisplayed());
		getFluentWait();
		System.out.println("Observation and Review pages are appearing ");
		
		getFluentWait();
		
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		
		 getFluentWait();
		 
		// Assert.assertTrue(internalInspHistory.getSubType().isDisplayed());
		 //System.out.println("Sub Type is apperaing in Inspection Page");
			//getFluentWait();
		 
		// sendKeys(internalInspHistory.getSubType(),"Automation sub type");
		// getFluentWait();
		 
		sendKeys(internalInspHistory.getAuditOrg(),"Automation Audit Organization");
		System.out.println("Audit Organisation is entered");
	    getFluentWait();
	    
	    
	    clickElement(internalInspHistory.selectDateForInspectionStatus(inspectionStatusCalender));
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println(inspectionStatusCalender + " date is entered");
		log.info(inspectionStatusCalender + " date is entered");
		
		sendKeys(internalInspHistory.getAuditorTextBox(),"Automation Auditor");
		clickElement(internalInspHistory.getAuditorAutoSuggestedText());
		System.out.println("Auditor name is entered");
	    getFluentWait();
		
		getFluentWait();
		
		clickElement(internalInspHistory.getInspectionStatus());
		clickElement(internalInspHistory.selectInspectionStatus(inspStatus));
		System.out.println("Inspection status is selected");
		 
		 getFluentWait();	
		
		observationPageMethod(inspectionName,deviationName ,viqRef1,viqRef2,viqRef3);
		
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
	
	
	@Parameters({"inspectionName","vesselName","portIndex", "inspectionStatusCalender","inspStatus"})
	@Test
	
	public void AddNewSeniorManagementVisitRecorddWithObservation(String inspectionName,String vesselName, int portIndex , String inspectionStatusCalender , String inspStatus) throws InterruptedException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryInternalInspectionsPage internalInspHistory=new HistoryInternalInspectionsPage(driver);
		
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());	
		
		System.out.println("\n **********Other Inspection Record creation********** \n");
		
		histoyPage.NewRecordButton(inspectionName,vesselName);
		
		getFluentWait();		
		
		Assert.assertTrue(internalInspHistory.getObservationPage().isDisplayed());
		getFluentWait();
		Assert.assertTrue(internalInspHistory.getReviewPage().isDisplayed());
		getFluentWait();
		System.out.println("Observation and Review pages are appearing ");
		
		getFluentWait();
		
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		
		 getFluentWait();
		 
		
		 
		sendKeys(internalInspHistory.getSupdtTextBox(),"Automation Superintendent");
		System.out.println("Superintendent is entered");
	    getFluentWait();
	    
	    
	    clickElement(internalInspHistory.selectDateForInspectionStatus(inspectionStatusCalender));
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println(inspectionStatusCalender + " date is entered");
		log.info(inspectionStatusCalender + " date is entered");
		
		getFluentWait();
		
		clickElement(internalInspHistory.getInspectionStatus());
		clickElement(internalInspHistory.selectInspectionStatus(inspStatus));
		System.out.println("Inspection status is selected");
		 
		 getFluentWait();	
		
		 clickElement(history.getNextBtn());
			System.out.println("Next button is clicked");
			log.info("Next button is clicked");		
			getFluentWait();
			
			
			
			sendKeys(internalInspHistory.getFindingTextBox(),"This finding is entered using automation tool");		
					
			getFluentWait();
			
			
			clickElement(internalInspHistory.getReviewPage());
			System.out.println("User is on Review page");
			Thread.sleep(1000);
			
			clickElement(internalInspHistory.getReviewedCalender());
			getFluentWait();
			clickElement(selectInspectionDate(history.getCurrentDate()));
			System.out.println("Review date is selected");
			
			sendKeys(internalInspHistory.getReviewTextBox(),"Review is entered using automation tools");
			System.out.println("Review text is entered");
					
					
			clickElement(internalInspHistory.getReviewSaveBtn());
			System.out.println("Save button is clicked");
			log.info("Save button is clicked");
	       getFluentWait();
			
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
	
	
	
	}
