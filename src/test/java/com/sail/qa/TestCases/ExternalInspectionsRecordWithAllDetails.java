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
import com.sail.qa.pages.ReportPage;
import com.sail.qa.pages.Toaster;

public class ExternalInspectionsRecordWithAllDetails extends TestBase {
	public static Logger log = LogManager.getLogger(PreparationPageTest.class.getName());
	public JavascriptExecutor js;
	public HistoryPageCommonMenthods histoyPage = new HistoryPageCommonMenthods();

	// Sire Inspection with all Details

	@Parameters({ "inspectionName", "vesselName", "portIndex", "oilMajorIndex", "UploadImagePath", "UploadImagePath2",
			"UploadImagePath3", "UploadImagePath4", "viqRef1", "viqRef2", "viqRef3", "viqRef4", "viqRef5", "viqRef6" })
	@Test

	public void AddNewInspectionRecord(String inspectionName, String vesselName, int portIndex, int oilMajorIndex,
			String UploadImagePath, String UploadImagePath2, String UploadImagePath3, String UploadImagePath4,
			String viqRef1, String viqRef2, String viqRef3, String viqRef4, String viqRef5, String viqRef6)
			throws InterruptedException, AWTException {
		HistoryPage history = new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod = new HistoryPageCommonMenthods();
		System.out.println("\n **********" + inspectionName + " SIRE Inspection Record creation********** \n");

		clickElement(history.getAllVesselTab());
		Thread.sleep(1000);
		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());
		// System.out.println("Total Records of All Vessel : "
		// +historyRecordCountAllVessel);

		histoyPage.NewRecordButton(inspectionName, vesselName);

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

		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);

		getFluentWait();

		// First Observation

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		sendKeys(history.getObservationTextBox(), "This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");

		getFluentWait();

		// Second Observation

		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked");

		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef4));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		getFluentWait();

		clickElement(history.getUploadAttachmentInObservation());
		System.out.println("Upload Excel button is clicked");
		log.info("Upload Excel button is clicked on observation page");

		getFluentWait();
		uploadFileAndattAchments(UploadImagePath2);
		getFluentWait();

		// Third Observation

		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked");

		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef5));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		getFluentWait();

		clickElement(history.getUploadAttachmentInObservation());
		System.out.println("Upload Excel button is clicked");
		log.info("Upload Excel button is clicked on observation page");

		getFluentWait();
		uploadFileAndattAchments(UploadImagePath3);
		getFluentWait();

		// Fourth Observation

		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked");

		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef5));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef6));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");
		getFluentWait();

		clickElement(history.getUploadAttachmentInObservation());
		System.out.println("Upload Excel button is clicked");
		log.info("Upload Excel button is clicked on observation page");

		getFluentWait();
		uploadFileAndattAchments(UploadImagePath4);
		getFluentWait();

		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		getFluentWait();

		histoyPage.linkRecordPopUp();

		Thread.sleep(2000);

		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();

	}

	// CDI Inspection

	@Parameters({"vesselName","portIndex", "inspectionName","UploadImagePath","UploadImagePath2","UploadImagePath3",
		"UploadImagePath4","cdiRef","cdiRef2","cdiRef3","cdiRef4"})
	@Test
	
	public void AddNewCDIRecord(String vesselName, int portIndex , String inspectionName ,  
			String UploadImagePath,String UploadImagePath2,String UploadImagePath3, String UploadImagePath4,
			String cdiRef,String cdiRef2,String cdiRef3,String cdiRef4) throws InterruptedException, AWTException
	{
		HistoryPage history =new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		clickElement(history.getCacheClear())		;
        getFluentWait();
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		System.out.println("\n **********CDI Inspection Record creation**********\n");
		
		String  historyRecordCountAllVessel=getText(history.getTotalInsRecords());	
			    	    
		histoyPage.NewRecordButton(inspectionName,vesselName);
		
		getFluentWait();
		Assert.assertTrue(history.getInPortLocation().isDisplayed());
		Assert.assertTrue(history.getRemoteLocation().isDisplayed());
		
		getFluentWait();
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		
		
		
		
		getFluentWait();
		clickElement(history.getInspectionDateCalenderIcon());
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Inspected date is entered");
		log.info("Inspected date is entered");
		
		getFluentWait();
		
		clickElement(history.getCdiInspectionStatus());
		clickElement(history.getInspectedStatus());
		System.out.println("Inspected status is selected");
		log.info("Inspected status is selected");
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
				
		getFluentWait();
		
		
		// First Observation
		clickElement(history.getCdiRefType());
		System.out.println("CDI ref drop down is clicked");
		log.info("CDI ref drop down is clicked");
		
		
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(cdiRef));	
		
		
		System.out.println("CDI ref is selected ");
		log.info("CDI ref is selected");
		
		sendKeys(history.getObservationTextBox(),"This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(),"This record is created using automation tool");
		
		getFluentWait();
		
		
		
		// Second Observation
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		getFluentWait();
		
		
		clickElement(history.getCdiRefType());
				System.out.println("CDI ref drop down is clicked");
				log.info("CDI ref drop down is clicked");
				
				
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(cdiRef));
				getFluentWait();
				scrollCheckAndClick(history.selectVIQRefFromDropdown(cdiRef2));	
				
				
				System.out.println("CDI ref is selected ");
				log.info("CDI ref is selected");
				
				sendKeys(history.getObservationTextBox(),"This observation is entered using automation tool");
				sendKeys(history.getOperatorCommentTextBox(),"This record is created using automation tool");
				getFluentWait();
				
				
				clickElement(history.getUploadAttachmentInObservation());
				 System.out.println("Upload Excel button is clicked");
				 log.info("Upload Excel button is clicked on observation page");
					
				getFluentWait();	
				uploadFileAndattAchments(UploadImagePath2);
				getFluentWait();
				
				
				
				// Third Observation
				
				
				clickElement(history.getAddNewObsBtn());
				System.out.println("Add New Obs button is clicked");
				log.info("Add New Obs button is clicked"); 
				getFluentWait();
				
				
				clickElement(history.getCdiRefType());
						System.out.println("CDI ref drop down is clicked");
						log.info("CDI ref drop down is clicked");
						
						
						getFluentWait();
						scrollToElement(driver, history.selectVIQRefFromDropdown(cdiRef));
						getFluentWait();
						scrollToElement(driver, history.selectVIQRefFromDropdown(cdiRef2));
						getFluentWait();
						scrollCheckAndClick(history.selectVIQRefFromDropdown(cdiRef3));	
						
						
						System.out.println("CDI ref is selected ");
						log.info("CDI ref is selected");
						
						sendKeys(history.getObservationTextBox(),"This observation is entered using automation tool");
						sendKeys(history.getOperatorCommentTextBox(),"This record is created using automation tool");

						getFluentWait();
						clickElement(history.getUploadAttachmentInObservation());
						 System.out.println("Upload Excel button is clicked");
						 log.info("Upload Excel button is clicked on observation page");
							
						getFluentWait();	
						uploadFileAndattAchments(UploadImagePath3);
						getFluentWait();
						
						
						
						// Fourth Observation
						
						
						clickElement(history.getAddNewObsBtn());
						System.out.println("Add New Obs button is clicked");
						log.info("Add New Obs button is clicked"); 
						getFluentWait();
						
						
						clickElement(history.getCdiRefType());
								System.out.println("CDI ref drop down is clicked");
								log.info("CDI ref drop down is clicked");
								
								
								getFluentWait();
								scrollToElement(driver, history.selectVIQRefFromDropdown(cdiRef));
								getFluentWait();
								scrollToElement(driver, history.selectVIQRefFromDropdown(cdiRef2));
								getFluentWait();
								scrollToElement(driver, history.selectVIQRefFromDropdown(cdiRef3));
								getFluentWait();
								scrollCheckAndClick(history.selectVIQRefFromDropdown(cdiRef4));		
								
								
								System.out.println("CDI ref is selected ");
								log.info("CDI ref is selected");
								
								sendKeys(history.getObservationTextBox(),"This observation is entered using automation tool");
								sendKeys(history.getOperatorCommentTextBox(),"This record is created using automation tool");
								
								
								
								clickElement(history.getUploadAttachmentInObservation());
								 System.out.println("Upload Excel button is clicked");
								 log.info("Upload Excel button is clicked on observation page");
									
								getFluentWait();	
								uploadFileAndattAchments(UploadImagePath4);
								getFluentWait();
								
						
		
	
				
		clickElement(history.getSaveBtn());
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

	
	// Terminal Inspection

	@Parameters({ "inspectionName", "vesselName", "portIndex", "oilMajorIndex", "UploadImagePath","UploadImagePath2","UploadImagePath3",
		"UploadImagePath4","viqRef1","viqRef2","viqRef3","viqRef4","viqRef5","viqRef6" })
	@Test

	public void AddTerminalRecord(String inspectionName, String vesselName, int portIndex, int oilMajorIndex,
			String UploadImagePath,String UploadImagePath2,	String UploadImagePath3, String UploadImagePath4,
			String viqRef1, String viqRef2, String viqRef3,String viqRef4,String viqRef5,String viqRef6) throws InterruptedException, AWTException {

		HistoryPage history = new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		
		System.out.println("\n **********Terminal Inspection Record creation**********\n");

		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());

		histoyPage.NewRecordButton(inspectionName, vesselName);

		getFluentWait();

		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
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

		sendKeys(history.getTerminal(), "Automation Terminal");
		Actions actions = new Actions(driver);
		actions.moveToElement(history.getInspectionStatusFormly()).click().perform();

		// clickElement(history.getInspectionStatus());
		clickElement(history.getInspectedStatus());
		System.out.println("Inspected status is selected");
		log.info("Inspected status is selected");
		
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);

		
		getFluentWait();
		
		// First Observation

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		sendKeys(history.getFindingTextBox(), "This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");

		getFluentWait();
		
		
		
		// second Observation
		
		
		
		        clickElement(history.getAddNewObsBtn());
		        System.out.println("Add New Obs button is clicked");
		        log.info("Add New Obs button is clicked"); 
		
		        getFluentWait();

				clickElement(history.getViqRef());
				System.out.println("VIQ ref drop down is clicked");
				log.info("VIQ ref drop down is clicked");

				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
				getFluentWait();
				scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef4));

				System.out.println("VIQ ref is selected ");
				log.info("VIQ ref is selected");

				sendKeys(history.getFindingTextBox(), "This observation is entered using automation tool");
				sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");

				getFluentWait();
				
				clickElement(history.getUploadAttachmentInObservation());
				 System.out.println("Upload Excel button is clicked");
				 log.info("Upload Excel button is clicked on observation page");
					
				getFluentWait();	
				uploadFileAndattAchments(UploadImagePath2);
				getFluentWait();
				
				
				
				// Third Observation
				
				
				
		        clickElement(history.getAddNewObsBtn());
		        System.out.println("Add New Obs button is clicked");
		        log.info("Add New Obs button is clicked"); 
		
		        getFluentWait();

				clickElement(history.getViqRef());
				System.out.println("VIQ ref drop down is clicked");
				log.info("VIQ ref drop down is clicked");

				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
				getFluentWait();
				scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef5));

				System.out.println("VIQ ref is selected ");
				log.info("VIQ ref is selected");

				sendKeys(history.getFindingTextBox(), "This observation is entered using automation tool");
				sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");

				getFluentWait();
				
				clickElement(history.getUploadAttachmentInObservation());
				 System.out.println("Upload Excel button is clicked");
				 log.info("Upload Excel button is clicked on observation page");
					
				getFluentWait();	
				uploadFileAndattAchments(UploadImagePath3);
				getFluentWait();
				
				
				
				// Fourth Observation
				
				
				
		        clickElement(history.getAddNewObsBtn());
		        System.out.println("Add New Obs button is clicked");
		        log.info("Add New Obs button is clicked"); 
		
		        getFluentWait();

				clickElement(history.getViqRef());
				System.out.println("VIQ ref drop down is clicked");
				log.info("VIQ ref drop down is clicked");

				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef5));
				getFluentWait();
				scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef6));

				System.out.println("VIQ ref is selected ");
				log.info("VIQ ref is selected");

				sendKeys(history.getFindingTextBox(), "This observation is entered using automation tool");
				sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");

				getFluentWait();
				
				clickElement(history.getUploadAttachmentInObservation());
				 System.out.println("Upload Excel button is clicked");
				 log.info("Upload Excel button is clicked on observation page");
					
				getFluentWait();	
				uploadFileAndattAchments(UploadImagePath4);
				getFluentWait();
		
		
		

		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");

		getFluentWait();
		histoyPage.linkRecordPopUp();

		getFluentWait();

		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();
	}

	// PSC Inspection

	@Parameters({ "inspectionName", "vesselName", "portIndex", "mouIndex", "indexToSelectPscCode1",
			"indexToSelectDefCode1","indexToSelectPscCode2","indexToSelectDefCode2","indexToSelectPscCode3","indexToSelectDefCode3","indexToSelectPscCode4",
			"indexToSelectDefCode4","UploadImagePath","UploadImagePath2","UploadImagePath3",
			"UploadImagePath4" })
	@Test

	public void AddPSCRecord(String inspectionName, String vesselName, int portIndex, int mouIndex,
			int indexToSelectPscCode1, int indexToSelectDefCode1,int indexToSelectPscCode2, int indexToSelectDefCode2,int indexToSelectPscCode3, int indexToSelectDefCode3,int indexToSelectPscCode4, int indexToSelectDefCode4,
			String UploadImagePath,String UploadImagePath2,
			String UploadImagePath3, String UploadImagePath4) throws InterruptedException, AWTException {

		HistoryPage history = new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		
		System.out.println("\n **********PSC Inspection Record creation********** \n");

		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());

		getFluentWait();
		histoyPage.NewRecordButton(inspectionName, vesselName);

		getFluentWait();
		Assert.assertTrue(history.getInPortLocation().isDisplayed());
		Assert.assertTrue(history.getRemoteLocation().isDisplayed());

		getFluentWait();
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");

		clickElement(history.getMou());
		System.out.println("MOU drop down is clicked");
		clickElement(history.selectMouFromDropdown(mouIndex));
		System.out.println("MOU is selected");
		log.info("MOU is selected");

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
		
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);

		

		getFluentWait();

		clickElement(history.getPscAction());
		System.out.println("PSC action code drop down is clicked");
		log.info("PSC action drop down is clicked");

		clickElement(history.selectCode(indexToSelectPscCode1));
		System.out.println("Scrolled");
		getFluentWait();

		System.out.println("PSC action is selected ");
		log.info("PSC action is selected");

		clickElement(history.getDeficiencyCode());
		System.out.println("Deficiency code drop down is clicked");
		log.info("Deficiency code drop down is clicked");

		clickElement(history.selectCode(indexToSelectDefCode1));
		System.out.println("Scrolled");
		getFluentWait();

		System.out.println("Deficiency is selected ");
		log.info("Deficiency is selected");
		getFluentWait();
		sendKeys(history.getDeficiencyTextBox(), "This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");

		getFluentWait();
		
		
		
		
		
		// Second Observation
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		clickElement(history.getPscAction());
		System.out.println("PSC action code drop down is clicked");
		log.info("PSC action drop down is clicked");

		clickElement(history.selectCode(indexToSelectPscCode2));
		System.out.println("Scrolled");
		getFluentWait();

		System.out.println("PSC action is selected ");
		log.info("PSC action is selected");

		clickElement(history.getDeficiencyCode());
		System.out.println("Deficiency code drop down is clicked");
		log.info("Deficiency code drop down is clicked");

		clickElement(history.selectCode(indexToSelectDefCode2));
		System.out.println("Scrolled");
		getFluentWait();

		System.out.println("Deficiency is selected ");
		log.info("Deficiency is selected");
		getFluentWait();
		sendKeys(history.getDeficiencyTextBox(), "This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");

		getFluentWait();
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath2);
		getFluentWait();
		
		
		// Third  Observation
				clickElement(history.getAddNewObsBtn());
				System.out.println("Add New Obs button is clicked");
				log.info("Add New Obs button is clicked"); 
				
				getFluentWait();
				
				clickElement(history.getPscAction());
				System.out.println("PSC action code drop down is clicked");
				log.info("PSC action drop down is clicked");

				clickElement(history.selectCode(indexToSelectPscCode3));
				System.out.println("Scrolled");
				getFluentWait();

				System.out.println("PSC action is selected ");
				log.info("PSC action is selected");

				clickElement(history.getDeficiencyCode());
				System.out.println("Deficiency code drop down is clicked");
				log.info("Deficiency code drop down is clicked");

				clickElement(history.selectCode(indexToSelectDefCode3));
				System.out.println("Scrolled");
				getFluentWait();

				System.out.println("Deficiency is selected ");
				log.info("Deficiency is selected");
				getFluentWait();
				sendKeys(history.getDeficiencyTextBox(), "This observation is entered using automation tool");
				sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");

				getFluentWait();
				
				clickElement(history.getUploadAttachmentInObservation());
				 System.out.println("Upload Excel button is clicked");
				 log.info("Upload Excel button is clicked on observation page");
					
				getFluentWait();	
				uploadFileAndattAchments(UploadImagePath3);
				getFluentWait();
				
				
				
				// Fourth Observation
				clickElement(history.getAddNewObsBtn());
				System.out.println("Add New Obs button is clicked");
				log.info("Add New Obs button is clicked"); 
				
				getFluentWait();
				
				clickElement(history.getPscAction());
				System.out.println("PSC action code drop down is clicked");
				log.info("PSC action drop down is clicked");

				clickElement(history.selectCode(indexToSelectPscCode4));
				System.out.println("Scrolled");
				getFluentWait();

				System.out.println("PSC action is selected ");
				log.info("PSC action is selected");

				clickElement(history.getDeficiencyCode());
				System.out.println("Deficiency code drop down is clicked");
				log.info("Deficiency code drop down is clicked");

				clickElement(history.selectCode(indexToSelectDefCode4));
				System.out.println("Scrolled");
				getFluentWait();

				System.out.println("Deficiency is selected ");
				log.info("Deficiency is selected");
				getFluentWait();
				sendKeys(history.getDeficiencyTextBox(), "This observation is entered using automation tool");
				sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");

				getFluentWait();
				
				clickElement(history.getUploadAttachmentInObservation());
				 System.out.println("Upload Excel button is clicked");
				 log.info("Upload Excel button is clicked on observation page");
					
				getFluentWait();	
				uploadFileAndattAchments(UploadImagePath4);
				getFluentWait();
		

		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");

		histoyPage.linkRecordPopUp();

		getFluentWait();
		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();
	}

	// External Inspection

	@Parameters({ "inspectionName", "vesselName", "portIndex", "auditType", "auditScope", "deviationScope",
			"deviationName", "deviationScope2","deviationName2","deviationScope3","deviationName3","deviationScope4","deviationName4",
			"UploadImagePath","UploadImagePath2","UploadImagePath3","UploadImagePath4","viqRef1","viqRef2","viqRef3","viqRef4","viqRef5","viqRef6" })
	@Test

	public void AddExternalAuditRecord(String inspectionName, String vesselName, int portIndex, int AuditType,
			int auditScope, int deviationScope, String deviationName, int deviationScope2, String deviationName2,int deviationScope3, String deviationName3,int deviationScope4, String deviationName4,
			String viqRef1, String viqRef2, String viqRef3,String viqRef4,String viqRef5,String viqRef6, 
			String UploadImagePath,String UploadImagePath2,	String UploadImagePath3, String UploadImagePath4)
			throws InterruptedException, AWTException {

		HistoryPage history = new HistoryPage(driver);
		System.out.println("\n **********External Inspection Record creation**********\n");

		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		

		histoyPage.NewRecordButton(inspectionName, vesselName);

		getFluentWait();

		Assert.assertTrue(history.getInPortLocation().isDisplayed());
		Assert.assertTrue(history.getRemoteLocation().isDisplayed());

		Assert.assertTrue(history.getAuditType().isDisplayed());

		getFluentWait();

		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");

		getFluentWait();
		clickElement(history.getInspectionDateCalenderIcon());
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Inspected date is entered");
		log.info("Inspected date is entered");

		getFluentWait();

		Actions actions = new Actions(driver);
		actions.moveToElement(history.getInspectionStatusFormly()).click().perform();

		clickElement(history.getAuditedStatus());
		System.out.println("Audited status is selected");
		log.info("Audited status is selected");

		clickElement(history.selectAuditScope(auditScope));
		System.out.println("Audit Scope is selected");
		log.info("Audit Scope is selected");

		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);
		
        // First Observation
		
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

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", history.DeviationFromDropdown(deviationName));

		System.out.println("Type of Deviation is selected");
		log.info("Type of Deviation is selected");

		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		sendKeys(history.getFindingTextBox(), "This observation is entered using automation tool");

		getFluentWait();
		
		
		
		
		// Second Observation
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		Assert.assertTrue(history.selectScopeOfDeviation(deviationScope2).isDisplayed());
		System.out.println("Scope of Devaition is visible");
		log.info("Scope of Devaition is visible");

		clickElement(history.selectScopeOfDeviation(deviationScope2));
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

		
		jsExecutor.executeScript("arguments[0].click();", history.DeviationFromDropdown(deviationName2));

		System.out.println("Type of Deviation is selected");
		log.info("Type of Deviation is selected");

		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef4));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		sendKeys(history.getFindingTextBox(), "This observation is entered using automation tool");

		getFluentWait();
		
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath2);
		getFluentWait();
		
		// Third Observation
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		Assert.assertTrue(history.selectScopeOfDeviation(deviationScope3).isDisplayed());
		System.out.println("Scope of Devaition is visible");
		log.info("Scope of Devaition is visible");

		clickElement(history.selectScopeOfDeviation(deviationScope3));
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

		
		jsExecutor.executeScript("arguments[0].click();", history.DeviationFromDropdown(deviationName3));

		System.out.println("Type of Deviation is selected");
		log.info("Type of Deviation is selected");

		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef5));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		sendKeys(history.getFindingTextBox(), "This observation is entered using automation tool");

		getFluentWait();
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath3);
		getFluentWait();
		
		
		// Fourth Observation
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		Assert.assertTrue(history.selectScopeOfDeviation(deviationScope4).isDisplayed());
		System.out.println("Scope of Devaition is visible");
		log.info("Scope of Devaition is visible");

		clickElement(history.selectScopeOfDeviation(deviationScope4));
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

		
		jsExecutor.executeScript("arguments[0].click();", history.DeviationFromDropdown(deviationName4));

		System.out.println("Type of Deviation is selected");
		log.info("Type of Deviation is selected");

		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef5));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef6));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		sendKeys(history.getFindingTextBox(), "This observation is entered using automation tool");

		getFluentWait();
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath4);
		getFluentWait();
		
		

		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");

		getFluentWait();
		histoyPage.linkRecordPopUp();

		getFluentWait();

		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();
	}

	// Flag State

	@Parameters({ "inspectionName", "vesselName", "portIndex", "deviationName", "deviationName2","deviationName3","deviationName4",
		"viqRef1","viqRef2","viqRef3","viqRef4","viqRef5","viqRef6",
		"UploadImagePath","UploadImagePath2","UploadImagePath3","UploadImagePath4"})
	@Test

	public void AddFlagStateRecord(String inspectionName, String vesselName, int portIndex,
			String deviationName,String deviationName2, String deviationName3,String deviationName4,
			String viqRef1, String viqRef2, String viqRef3,String viqRef4,String viqRef5,String viqRef6,
			String UploadImagePath,String UploadImagePath2,String UploadImagePath3, String UploadImagePath4)throws InterruptedException, AWTException {

		HistoryPage history = new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		
		System.out.println("\n **********Flag State Inspection Record creation********** \n");

		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());

		histoyPage.NewRecordButton(inspectionName, vesselName);

		getFluentWait();
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");

		getFluentWait();

		Assert.assertTrue(history.getFlagStateName().isDisplayed());
		sendKeys(history.getFlagStateName(), "Automation Flag State");

		getFluentWait();

		clickElement(history.getInspectionDateCalenderIcon());
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Inspected date is entered");
		log.info("Inspected date is entered");

		getFluentWait();

		clickElement(history.getFlagInsStatus());
		clickElement(history.getInspectedStatus());
		System.out.println("Inspected status is selected");
		log.info("Inspected status is selected");

		getFluentWait();

		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);

		
		// First Observation
		getFluentWait();
		Assert.assertTrue(history.getTypeOfDeviationFlagState().isDisplayed());
		getFluentWait();
		clickElement(history.getTypeOfDeviationFlagState());
		System.out.println("Type of Deviation drop down is clicked");
		log.info("Type of Deviation drop down is clicked");

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", history.SelectDeviationFromDropdown(deviationName));

		Thread.sleep(1000);

		clickElement(history.getViqRef());
		System.out.println("viq ref drop down is clicked");
		log.info("viq ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef3));

		getFluentWait();
		sendKeys(history.getFindingTextBox(), "The findings entered using automation tool");
		System.out.println("Finding is entered");
		getFluentWait();
		
		
		// Second Observation
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		Assert.assertTrue(history.getTypeOfDeviationFlagState().isDisplayed());
		getFluentWait();
		clickElement(history.getTypeOfDeviationFlagState());
		System.out.println("Type of Deviation drop down is clicked");
		log.info("Type of Deviation drop down is clicked");

		
		jsExecutor.executeScript("arguments[0].click();", history.SelectDeviationFromDropdown(deviationName2));

		Thread.sleep(1000);

		clickElement(history.getViqRef());
		System.out.println("viq ref drop down is clicked");
		log.info("viq ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef4));

		getFluentWait();
		sendKeys(history.getFindingTextBox(), "The findings entered using automation tool");
		System.out.println("Finding is entered");
		getFluentWait();
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath2);
		getFluentWait();
		
		
		
		// Third Observation
				clickElement(history.getAddNewObsBtn());
				System.out.println("Add New Obs button is clicked");
				log.info("Add New Obs button is clicked"); 
				
				getFluentWait();
				Assert.assertTrue(history.getTypeOfDeviationFlagState().isDisplayed());
				getFluentWait();
				clickElement(history.getTypeOfDeviationFlagState());
				System.out.println("Type of Deviation drop down is clicked");
				log.info("Type of Deviation drop down is clicked");

				
				jsExecutor.executeScript("arguments[0].click();", history.SelectDeviationFromDropdown(deviationName3));

				Thread.sleep(1000);

				clickElement(history.getViqRef());
				System.out.println("viq ref drop down is clicked");
				log.info("viq ref drop down is clicked");

				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
				getFluentWait();
				scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef5));

				getFluentWait();
				sendKeys(history.getFindingTextBox(), "The findings entered using automation tool");
				System.out.println("Finding is entered");
				getFluentWait();
				
				clickElement(history.getUploadAttachmentInObservation());
				 System.out.println("Upload Excel button is clicked");
				 log.info("Upload Excel button is clicked on observation page");
					
				getFluentWait();	
				uploadFileAndattAchments(UploadImagePath3);
				getFluentWait();
				
				
				
				// Fourth Observation
				
				clickElement(history.getAddNewObsBtn());
				System.out.println("Add New Obs button is clicked");
				log.info("Add New Obs button is clicked"); 
				
				getFluentWait();
				Assert.assertTrue(history.getTypeOfDeviationFlagState().isDisplayed());
				getFluentWait();
				clickElement(history.getTypeOfDeviationFlagState());
				System.out.println("Type of Deviation drop down is clicked");
				log.info("Type of Deviation drop down is clicked");

				
				jsExecutor.executeScript("arguments[0].click();", history.SelectDeviationFromDropdown(deviationName4));

				Thread.sleep(1000);

				clickElement(history.getViqRef());
				System.out.println("viq ref drop down is clicked");
				log.info("viq ref drop down is clicked");

				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
				getFluentWait();
				scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef5));
				getFluentWait();
				scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef6));

				getFluentWait();
				sendKeys(history.getFindingTextBox(), "The findings entered using automation tool");
				System.out.println("Finding is entered");
				getFluentWait();
				
				clickElement(history.getUploadAttachmentInObservation());
				 System.out.println("Upload Excel button is clicked");
				 log.info("Upload Excel button is clicked on observation page");
					
				getFluentWait();	
				uploadFileAndattAchments(UploadImagePath4);
				getFluentWait();
		

		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");

		histoyPage.linkRecordPopUp();

		getFluentWait();
		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();
	}

	@Parameters({ "inspectionName", "vesselName", "portIndex", "UploadImagePath","UploadImagePath2","UploadImagePath3",
		"UploadImagePath4","risqRef1", "risqRef2", "risqRef3","risqRef4","risqRef5","risqRef6" })
	@Test

	public void AddRisqRecord(String inspectionName, String vesselName, int portIndex, String UploadImagePath,String UploadImagePath2,
			String UploadImagePath3, String UploadImagePath4,
			String risqRef1,String risqRef2, String risqRef3,String risqRef4,String risqRef5,String risqRef6) throws InterruptedException, AWTException {

		HistoryPage history = new HistoryPage(driver);
		System.out.println("\n **********RISQ Inspection Record creation********** \n");

		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();

		histoyPage.NewRecordButton(inspectionName, vesselName);

		getFluentWait();
		Assert.assertTrue(history.getInPortLocation().isDisplayed());
		Assert.assertTrue(history.getRemoteLocation().isDisplayed());

		getFluentWait();
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");

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

		getFluentWait();
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);

		
		// First Observation
		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("RISQ ref drop down is clicked");
		log.info("RISQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef2));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(risqRef3));
		System.out.println("Risq ref is selected");
		log.info("RISQ ref is selected");

		sendKeys(history.getObservationTextBox(), "This observation is entered using automation tool");
		
		
		// Second Observation
		
		
		getFluentWait();
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("RISQ ref drop down is clicked");
		log.info("RISQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef3));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(risqRef4));
		System.out.println("Risq ref is selected");
		log.info("RISQ ref is selected");

		sendKeys(history.getObservationTextBox(), "This observation is entered using automation tool");

		getFluentWait();
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath2);
		getFluentWait();
		
		
		// Third Observation
		
        getFluentWait();
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("RISQ ref drop down is clicked");
		log.info("RISQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef4));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(risqRef5));
		System.out.println("Risq ref is selected");
		log.info("RISQ ref is selected");

		sendKeys(history.getObservationTextBox(), "This observation is entered using automation tool");

		getFluentWait();
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath3);
		getFluentWait();
		
		
		// Fourth Observation
		
         getFluentWait();
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();

		clickElement(history.getViqRef());
		System.out.println("RISQ ref drop down is clicked");
		log.info("RISQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef4));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(risqRef5));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(risqRef6));
		System.out.println("Risq ref is selected");
		log.info("RISQ ref is selected");

		sendKeys(history.getObservationTextBox(), "This observation is entered using automation tool");

		getFluentWait();
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath4);
		getFluentWait();

		

		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");

		getFluentWait();

		histoyPage.linkRecordPopUp();

		Thread.sleep(2000);
		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();
	}

	@Parameters({ "inspectionName", "vesselName", "portIndex", "oilMajorIndex", "indexToSelectInspector", "viqRef1",
			"viqRef2", "viqRef3", "QuestionCatogery", "quesCatS", "indexToSelectSOCvalue", "quesCatN","indexToSelectNOC",
			 "QuestionCatogery2", "quesCatS2", "indexToSelectSOCvalue2", "quesCatN2","indexToSelectNOC2",
				 "QuestionCatogery3", "quesCatS3", "indexToSelectSOCvalue3", "quesCatN3","indexToSelectNOC3",
					 "QuestionCatogery4", "quesCatS4", "indexToSelectSOCvalue4", "quesCatN4","indexToSelectNOC4"})
	@Test

	public void AddNewSireTrialRecord(String inspectionName, String vesselName, int portIndex,
			int oilMajorIndex, String UploadImagePath,String UploadImagePath2,
			String UploadImagePath3, String UploadImagePath4,
			int indexToSelectInspector, String viqRef1, String viqRef2, String viqRef3,String viqRef4,String viqRef5,String viqRef6,
			String QuestionCatogery, String quesCatS, int indexToSelectSOCvalue, String quesCatN, int indexToSelectNOC,
			String QuestionCatogery2, String quesCatS2, int indexToSelectSOCvalue2, String quesCatN2, int indexToSelectNOC2,
			String QuestionCatogery3, String quesCatS3, int indexToSelectSOCvalue3, String quesCatN3, int indexToSelectNOC3,
			String QuestionCatogery4, String quesCatS4, int indexToSelectSOCvalue4, String quesCatN4, int indexToSelectNOC4)
			throws InterruptedException, AWTException {
		
		HistoryPage history = new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		
		System.out.println("\n **********SIRE TRIAL Inspection Record creation********** \n");

		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());

		histoyPage.NewRecordButton(inspectionName, vesselName);

		getFluentWait();
		Assert.assertTrue(history.getInspectionDetailsText().isDisplayed());
		Assert.assertTrue(history.getEnterDataText().isDisplayed());
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

		sendKeys(history.getReportNoTextBox(), generateRandomNumberWithPrefix());
		System.out.println("Report Number is entered");

		clickElement(history.getInspector());
		System.out.println("Inspector drop down is clicked");
		history.selecValuesFromDropDown(indexToSelectInspector);
		System.out.println("Inspector is selected from drop ");

		clickElement(history.getInspectionStatus());
		clickElement(history.getProcessedStatus());
		System.out.println("Processed status is selected");
		log.info("Processed status is selected");

		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);

		getFluentWait();
		
		// First Observation

		clickElement(history.getViqRef());
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

		clickElement(history.getQuesCat());
		System.out.println("Question Category drop down is clicked ");
		log.info("Question Category drop down is clicked");

		getFluentWait();

		Actions action = new Actions(driver);
		action.moveToElement(history.selectQuesCategory(QuestionCatogery)).click().perform();
		System.out.println("Question Category is selected");
		log.info("Question Category is selected");

		getFluentWait();
		clickElement(history.soc(quesCatS));
		System.out.println("SOC drop down is clicked ");
		log.info("SOC drop down is clicked");

		getFluentWait();
		clickElement(history.selecValuesFromDropDown(indexToSelectSOCvalue));
		System.out.println("SOC is selected ");
		log.info("SOC is selected");
		getFluentWait();

		clickElement(history.noc(quesCatN));
		System.out.println("NOC drop down is clicked ");
		getFluentWait();
		clickElement(history.selectNocSocFromDropDown(indexToSelectNOC));
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE).build().perform();
		log.info("NOC drop down is closed");
		System.out.println("NOC drop down is closed");
		getFluentWait();
		System.out.println("NOC is selected");
		log.info(" NOC is selected");
		getFluentWait();

		sendKeys(history.getNegativeComment(), " comment is entered using automation tool");

		getFluentWait();
		
		
		//  Second Observation
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked");
		getFluentWait();
	
		
		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef4));
		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		getFluentWait();

		clickElement(history.getQuesCat());
		System.out.println("Question Category drop down is clicked ");
		log.info("Question Category drop down is clicked");

		getFluentWait();

		
		action.moveToElement(history.selectQuesCategory(QuestionCatogery2)).click().perform();
		System.out.println("Question Category is selected");
		log.info("Question Category is selected");

		getFluentWait();
		clickElement(history.soc(quesCatS2));
		System.out.println("SOC drop down is clicked ");
		log.info("SOC drop down is clicked");

		getFluentWait();
		clickElement(history.selecValuesFromDropDown(indexToSelectSOCvalue2));
		System.out.println("SOC is selected ");
		log.info("SOC is selected");
		getFluentWait();

		clickElement(history.noc(quesCatN2));
		System.out.println("NOC drop down is clicked ");
		getFluentWait();
		clickElement(history.selectNocSocFromDropDown(indexToSelectNOC2));
		
		actions.sendKeys(Keys.ESCAPE).build().perform();
		log.info("NOC drop down is closed");
		System.out.println("NOC drop down is closed");
		getFluentWait();
		System.out.println("NOC is selected");
		log.info(" NOC is selected");
		getFluentWait();

		sendKeys(history.getNegativeComment(), " comment is entered using automation tool");

		getFluentWait();
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath2);
		getFluentWait();
		
		
		
		//  Third Observation 
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked");
		getFluentWait();
	
		
		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef5));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		getFluentWait();

		clickElement(history.getQuesCat());
		System.out.println("Question Category drop down is clicked ");
		log.info("Question Category drop down is clicked");

		getFluentWait();

		
		action.moveToElement(history.selectQuesCategory(QuestionCatogery3)).click().perform();
		System.out.println("Question Category is selected");
		log.info("Question Category is selected");

		getFluentWait();
		clickElement(history.soc(quesCatS3));
		System.out.println("SOC drop down is clicked ");
		log.info("SOC drop down is clicked");

		getFluentWait();
		clickElement(history.selecValuesFromDropDown(indexToSelectSOCvalue3));
		System.out.println("SOC is selected ");
		log.info("SOC is selected");
		getFluentWait();

		clickElement(history.noc(quesCatN3));
		System.out.println("NOC drop down is clicked ");
		getFluentWait();
		clickElement(history.selectNocSocFromDropDown(indexToSelectNOC3));
		
		actions.sendKeys(Keys.ESCAPE).build().perform();
		log.info("NOC drop down is closed");
		System.out.println("NOC drop down is closed");
		getFluentWait();
		System.out.println("NOC is selected");
		log.info(" NOC is selected");
		getFluentWait();

		sendKeys(history.getNegativeComment(), " comment is entered using automation tool");

		getFluentWait();
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath3);
		getFluentWait();
		
		//  Fourth Observation
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked");
		getFluentWait();
	
		
		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef5));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef6));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		getFluentWait();

		clickElement(history.getQuesCat());
		System.out.println("Question Category drop down is clicked ");
		log.info("Question Category drop down is clicked");

		getFluentWait();

		
		action.moveToElement(history.selectQuesCategory(QuestionCatogery4)).click().perform();
		System.out.println("Question Category is selected");
		log.info("Question Category is selected");

		getFluentWait();
		clickElement(history.soc(quesCatS4));
		System.out.println("SOC drop down is clicked ");
		log.info("SOC drop down is clicked");

		getFluentWait();
		clickElement(history.selecValuesFromDropDown(indexToSelectSOCvalue4));
		System.out.println("SOC is selected ");
		log.info("SOC is selected");
		getFluentWait();

		clickElement(history.noc(quesCatN4));
		System.out.println("NOC drop down is clicked ");
		getFluentWait();
		clickElement(history.selectNocSocFromDropDown(indexToSelectNOC4));
		
		actions.sendKeys(Keys.ESCAPE).build().perform();
		log.info("NOC drop down is closed");
		System.out.println("NOC drop down is closed");
		getFluentWait();
		System.out.println("NOC is selected");
		log.info(" NOC is selected");
		getFluentWait();

		sendKeys(history.getNegativeComment(), " comment is entered using automation tool");

		getFluentWait();
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath4);
		getFluentWait();
		
		

		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		getFluentWait();

		histoyPage.linkRecordPopUp();

		Thread.sleep(2000);

		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();
	}

	@Parameters({ "inspectionName", "vesselName", "portIndex", "inspStatus", "indexToClickDeviation", "deviationName","deviationName2","deviationName3","deviationName4"
			,"viqRef1","viqRef2","viqRef3","viqRef4","viqRef5","viqRef6","UploadImagePath","UploadImagePath2","UploadImagePath3",
			"UploadImagePath4" })
	@Test

	public void AddNewGreenAwardRecord(String inspectionName, String vesselName, int portIndex,
			String inspStatus, int indexToClickDeviation, String deviationName,String deviationName2,String deviationName3,String deviationName4,
String viqRef1, String viqRef2,String viqRef3,String viqRef4,String viqRef5,String viqRef6,
String UploadImagePath,String UploadImagePath2,String UploadImagePath3, String UploadImagePath4) throws InterruptedException, AWTException {
		
		HistoryPage history = new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		
		System.out.println("\n **********Green Award Inspection Record creation********** \n");

		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());

		histoyPage.NewRecordButton(inspectionName, vesselName);

		getFluentWait();
		Assert.assertTrue(history.getInspectionDetailsText().isDisplayed());
		Assert.assertTrue(history.getEnterDataText().isDisplayed());
		Assert.assertTrue(history.getInPortLocation().isDisplayed());
		Assert.assertTrue(history.getRemoteLocation().isDisplayed());

		Thread.sleep(2000);
		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");

		getFluentWait();

		sendKeys(history.getAuditOrgTextBox(), "Automation Audit Organisation");
		System.out.println("Audit Organisation is entered");

		getFluentWait();
		clickElement(history.getInspectionDateCalenderIcon());
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Inspected date is entered");
		log.info("Inspected date is entered");

		getFluentWait();

		sendKeys(history.getAutiorTextBox(), "Automation Auditor");
		System.out.println("Auditor name is entered");

		clickElement(history.getInspectionStatusGA());
		clickElement(history.selectInspectionStatus(inspStatus));
		System.out.println("Processed status is selected");
		log.info("Processed status is selected");

		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);

		getFluentWait();
		
		// First Observation

		clickElement(history.typeOfDeviation(indexToClickDeviation));
		clickElement(history.SelectDeviationFromDropdown(deviationName));
		System.out.println("Deviation is selcted");

		clickElement(history.getViqRef());
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

		sendKeys(history.getFindingTextBox(), "Finding entered using automation tool");
		System.out.println("Finding entered");

		getFluentWait();
		
		
		
		// Second Observation
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		getFluentWait();
		
		clickElement(history.typeOfDeviation(indexToClickDeviation));
		clickElement(history.SelectDeviationFromDropdown(deviationName2));
		System.out.println("Deviation is selcted");

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef4));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		getFluentWait();

		sendKeys(history.getFindingTextBox(), "Finding entered using automation tool");
		System.out.println("Finding entered");

		getFluentWait();
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath2);
		getFluentWait();
		
		//  Third Observation
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		getFluentWait();
		
		clickElement(history.typeOfDeviation(indexToClickDeviation));
		clickElement(history.SelectDeviationFromDropdown(deviationName3));
		System.out.println("Deviation is selcted");

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef5));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		getFluentWait();

		sendKeys(history.getFindingTextBox(), "Finding entered using automation tool");
		System.out.println("Finding entered");

		getFluentWait();
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath3);
		getFluentWait();
		
		// Fourth Observation
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		getFluentWait();
		
		clickElement(history.typeOfDeviation(indexToClickDeviation));
		clickElement(history.SelectDeviationFromDropdown(deviationName4));
		System.out.println("Deviation is selcted");

		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef5));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef6));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		getFluentWait();

		sendKeys(history.getFindingTextBox(), "Finding entered using automation tool");
		System.out.println("Finding entered");

		getFluentWait();
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath4);
		getFluentWait();
		
		
		

		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		getFluentWait();

		histoyPage.linkRecordPopUp();

		Thread.sleep(2000);

		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();
	}

	@Parameters({ "inspectionName", "vesselName", "inspStatus", "oilMajorIndex", "screeningStatus", "UploadImagePath","UploadImagePath2","UploadImagePath3",
		"UploadImagePath4","viqRef1","viqRef2","viqRef3","viqRef4","viqRef5","viqRef6" })
	@Test

	public void AddNewScreengRecord(String inspectionName, String vesselName, String inspStatus,
			int oilMajorIndex, String screeningStatus, String UploadImagePath,String UploadImagePath2,
			String UploadImagePath3, String UploadImagePath4,
			String viqRef1, String viqRef2, String viqRef3,String viqRef4,String viqRef5,String viqRef6)
			throws InterruptedException, AWTException {
		
		HistoryPage history = new HistoryPage(driver);
		HistoryPageCommonMenthods historyMethod= new HistoryPageCommonMenthods();
		
		System.out.println("\n **********SCREENING Inspection Record creation********** \n");

		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());

		histoyPage.NewRecordButton(inspectionName, vesselName);

		getFluentWait();
		Assert.assertTrue(history.getInspectionDetailsText().isDisplayed());
		Assert.assertTrue(history.getEnterDataText().isDisplayed());
		// Assert.assertTrue(history.getSireAssesment().isDisplayed());
		// Assert.assertTrue(history.getStructuralAssesment().isDisplayed());

		getFluentWait();
		clickElement(history.getInspectionStatus());
		clickElement(history.selectInspectionSatus(inspStatus));
		System.out.println("Insection status is selectd");

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

		clickElement(history.getPositiveScreening());
		getFluentWait();
		clickElement(history.selectPositveScreenig(screeningStatus));
		System.out.println("Screening status is selected");

		getFluentWait();
		historyMethod.uploadAttachmentsInInspectionPage(UploadImagePath);

		getFluentWait();
		
		// First Observation

		clickElement(history.getViqRef());
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

		sendKeys(history.getObservationTextBox(), "This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");
		getFluentWait();
		
		
		// Second Observation
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef4));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		getFluentWait();

		sendKeys(history.getObservationTextBox(), "This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");
		getFluentWait();
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath2);
		getFluentWait();
		
		
		//  Third Observation
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef5));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		getFluentWait();

		sendKeys(history.getObservationTextBox(), "This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");
		getFluentWait();
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath3);
		getFluentWait();

		
		//  Fourth Observation
		
		
		clickElement(history.getAddNewObsBtn());
		System.out.println("Add New Obs button is clicked");
		log.info("Add New Obs button is clicked"); 
		
		getFluentWait();
		
		clickElement(history.getViqRef());
		System.out.println("VIQ ref drop down is clicked");
		log.info("VIQ ref drop down is clicked");

		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef1));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef2));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef3));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef4));
		getFluentWait();
		scrollToElement(driver, history.selectVIQRefFromDropdown(viqRef5));
		getFluentWait();
		scrollCheckAndClick(history.selectVIQRefFromDropdown(viqRef6));

		System.out.println("VIQ ref is selected ");
		log.info("VIQ ref is selected");

		getFluentWait();

		sendKeys(history.getObservationTextBox(), "This observation is entered using automation tool");
		sendKeys(history.getOperatorCommentTextBox(), "This record is created using automation tool");
		getFluentWait();
		
		clickElement(history.getUploadAttachmentInObservation());
		 System.out.println("Upload Excel button is clicked");
		 log.info("Upload Excel button is clicked on observation page");
			
		getFluentWait();	
		uploadFileAndattAchments(UploadImagePath4);
		getFluentWait();
		
		
		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		getFluentWait();

		histoyPage.linkRecordPopUp();

		Thread.sleep(2000);

		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();
	}

	@Parameters({ "inspectionName", "vesselName", "inspStatus", "portIndex","UploadImagePath" })
	@Test

	public void AddNewDandARecordWithObservation(String inspectionName, String vesselName, String inspStatus,
			int portIndex,String UploadImagePath) throws InterruptedException, AWTException {
		HistoryPage history = new HistoryPage(driver);
		System.out.println("\n **********D & A Inspection Record creation********** \n");

		String historyRecordCountAllVessel = getText(history.getTotalInsRecords());

		histoyPage.NewRecordButton(inspectionName, vesselName);

		getFluentWait();
		Assert.assertTrue(history.getInspectionDetailsText().isDisplayed());
		Assert.assertTrue(history.getEnterDataText().isDisplayed());
		Assert.assertTrue(history.getDandAText().isDisplayed());
		getFluentWait();
		System.out.println("D & A Scope is visible");

		getFluentWait();

		clickElement(history.getSelectPort());
		System.out.println("Port drop down is clicked");
		getFluentWait();
		clickElement(history.selectPortFromDropdown(portIndex));
		System.out.println("Port is selected");
		log.info("Port is selected");
		getFluentWait();

		clickElement(history.getMstrScope());
		System.out.println("Master scope is selected");
		getFluentWait();

		clickElement(history.getInspectionDateCalenderIcon());
		clickElement(selectInspectionDate(history.getCurrentDate()));
		System.out.println("Inspected date is entered");
		log.info("Inspected date is entered");

		clickElement(history.getInspectionStatusGA());
		clickElement(history.selectInspectionSatus(inspStatus));
		System.out.println("Insection status is selectd");
		getFluentWait();

		sendKeys(history.getCommentBoxOfPositiveScreening(), "Comment entered uisng automaton too");
		
		getFluentWait();
		   clickElement(history.getUploadObsAttachment());
		    System.out.println("Upload Excel button is clicked");
			log.info("Upload Excel button is clicked on inspection page");
			
			getFluentWait();		

	        // Use Robot class to handle the file upload dialog
			uploadFileAndattAchments(UploadImagePath);

		clickElement(history.getSaveBtn());
		System.out.println("Save button is clicked");
		log.info("Save button is clicked");
		getFluentWait();

		histoyPage.linkRecordPopUp();

		Thread.sleep(2000);

		clickElement(history.getAllVesselTab());
		Thread.sleep(2000);
		String historyRecordCountNew = getText(history.getTotalInsRecords());
		if (!historyRecordCountNew.equals(historyRecordCountAllVessel)) {
			System.out.println("Count is increased by 1");
			System.out.println("Total Records of All Vessel after adding a new record : " + historyRecordCountNew);
		} else {
			System.out.println("Count is not increased");
			System.out
					.println("Total Records of All Vessel after adding a new record : " + historyRecordCountAllVessel);
		}

		getFluentWait();
	}

}
