package com.sail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryInternalInspectionsPage {
	
	WebDriver ldriver;

	public HistoryInternalInspectionsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	

	
	
	// Internal Audit
	
	
	@FindBy(xpath="//label[normalize-space()='Inspection Details']")
	WebElement inspectionDetailsText;




	@FindBy(xpath="//label[normalize-space()='ENTER INSPECTION RELATED DATA']")
	WebElement enterDataText;
	
	@FindBy(xpath="//span[normalize-space()='Inspection']")
	WebElement inspectionPage;
	

	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement nextBtn;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[1]")
	WebElement sailingLocation;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[2]")
	WebElement remoteLocation;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[3]")
	WebElement inPortLocation;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[12]")
	WebElement oil;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[13]")
	WebElement chemical;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[14]")
	WebElement lpg;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[15]")
	WebElement lng;
	
	@FindBy(xpath="(//div[@class='mat-form-field-infix ng-tns-c67-190'])[1]")
	WebElement viqVersion;
	
	@FindBy(xpath="//*[@placeholder='Select Port']")
	WebElement selectPort;
	
	
	
	public WebElement selectPortFromDropdown(int indexToSelectPort) {
        WebElement portList = ldriver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[" + indexToSelectPort + "]"));
		return portList;
       
    }
	
	
	@FindBy(xpath="//input[@placeholder='Auditor']")
	WebElement auditor;
	
	
	// Function to select date for audited, report issued etc.. 
	   public WebElement selectDateForInspectionStatus(String inspectionStatus) {
	       
        WebElement insStatusDate=ldriver.findElement(By.xpath("//input[@placeholder='" + inspectionStatus + "']"));
		return insStatusDate;
       
    }	
	    
		@FindBy(xpath="//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")
	    WebElement currentDate;
		
		
		@FindBy(xpath="(//div[contains(text(),'Audit Scope')])[1]")
		WebElement auditScope;
		
		// Function to select audit scope like ALL,  ISM , ISPS etc. Should start from index 11 - 15
		
		public WebElement selectAuditScope(int indexToSelectAuditScope) {
	        WebElement auditScope = ldriver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[" + indexToSelectAuditScope + "]"));
			return auditScope;
		}
		
	
		
		@FindBy(xpath="(//span[normalize-space()='Select Inspection Status'])[2]")
		WebElement inspectionStatus;
		
		// Function to select Inspection Status from drop down
		public WebElement selectInspectionStatus(String inspStatus) {		       
		        WebElement inspectionStatus=ldriver.findElement(By.xpath("//span[normalize-space()='" + inspStatus + "']"));
				return inspectionStatus;
		       
		    }	
		
		
		@FindBy(xpath="(//formly-field-mat-select[@class='ng-star-inserted'])[3]")
	    WebElement inspStatusFormly;
	


		@FindBy(xpath="((//mat-select[@placeholder='Select Inspection Status'])[2]//following::span)[2]")
		WebElement inspStatusText;
		
	



		@FindBy(xpath="//span[normalize-space()='Add Crew Details']")
		WebElement addCrewDetailsBtn;
		
		//Add crew Detail pop up elements xpath
		
		@FindBy(xpath="//h2[normalize-space()='Add Crew Details']")
		WebElement addCrewDetailTitle;
		
		@FindBy(xpath="//h4[normalize-space()='Master']")
		WebElement master;
		
		@FindBy(xpath="//h4[normalize-space()='Chief Officer']")
		WebElement chiefOfficer;
		
		@FindBy(xpath="//h4[normalize-space()='2nd Officer']")
		WebElement secondOfficer;
		
		@FindBy(xpath="//h4[normalize-space()='3rd Officer']")
		WebElement thirdOfficer;
		
	    @FindBy(xpath="//h4[normalize-space()='Chief Engineer']")
	    WebElement chiefEngineer;
	    
	    @FindBy(xpath="//h4[normalize-space()='2nd Engineer']")
	    WebElement secondEngineer;
	    
	    @FindBy(xpath="//input[@placeholder='Enter Name']")
	    WebElement enterName;
		
	    
	    // function to select crew details from drop down
	    
	    public WebElement selectCrewName(int indexToSelectCrew) {
	    	WebElement selectCrewFromlist=ldriver.findElement(By.xpath("(//input[@placeholder='Enter Name']//following::li)[" + indexToSelectCrew + "]"));
			return selectCrewFromlist;
	    	
	    }
	    
	    @FindBy(xpath="//button[@class='save-btn']")
	    WebElement crewSaveBtn;
	    
	    @FindBy(xpath="//button[@class='discard-btn']")
	    WebElement crewDiscardBtn;
	    
	    
	    
	    
	    
	    
	    
		
		//  Observation page 
		
		@FindBy(xpath="//span[normalize-space()='Observation']")
		WebElement observationPage;
		
		// function to select scope of deviation and index will start from 13 to 17
		
		 public WebElement scopeOfDeviation(int indexToSelectScopeOfDeviation) {
		    	WebElement selectDeviationScope=ldriver.findElement(By.xpath("(//div[@class='mat-radio-label-content'])[" + indexToSelectScopeOfDeviation + "]"));
				return selectDeviationScope;
		    	
		    }
		 
		 
		 @FindBy(xpath="(//span[normalize-space()='Type Of Deviation'])[1]")
		 WebElement typeOfDeviation;
		 
		 
		 //function to select type of Deviation form drop down list
		 
		 public WebElement selectDeviationFromDropdown(String deviationName) {  // WebElement viqRefList = ldriver.findElement(By.xpath("//div[@id='a77ac7dd6083-" + indexToSelectVIQRef + "']"));
		        WebElement deviation=ldriver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='" + deviationName + "']"));
				return deviation;
		       
		    }	


		 
			@FindBy(xpath="//*[@placeholder='Select VIQ Ref']")
			WebElement viqRef;
			
			public WebElement selectVIQRefFromDropdown(String indexToSelectVIQRef) {
		       // WebElement viqRefList = ldriver.findElement(By.xpath("//div[@id='a77ac7dd6083-" + indexToSelectVIQRef + "']"));
		        WebElement viqRefList=ldriver.findElement(By.xpath("//span[normalize-space()='" + indexToSelectVIQRef + "']"));
				return viqRefList;
		       
		    }	
			
			@FindBy(xpath="//textarea[@placeholder='Finding']")
			WebElement findingTextBox;
			
			
			@FindBy(xpath="(//div[@class='mat-radio-label-content'])[18]")
			WebElement openRadioBtn;
			
			@FindBy(xpath="(//div[@class='mat-radio-label-content'])[19]")
			WebElement closeRadioBtn;
			
			@FindBy(xpath="(//div[@class='mat-radio-label-content'])[20]")
			WebElement dryDockRadioBtn;
		
	
		@FindBy(xpath="(//div[@class='mat-checkbox-inner-container'])[18]")
		WebElement flagFindingCheckBox;
		
		@FindBy(xpath="(//span[@class='mat-button-wrapper'][normalize-space()='SELECT'])[1]")
		WebElement immediateCause;
		
		@FindBy(xpath="(//span[@class='mat-button-wrapper'][normalize-space()='SELECT'])[2]")
		WebElement rootCause;
		
		
		public WebElement selectimmediateCause(int indexToSelectimmediateCause) {
	        WebElement immediateCause = ldriver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[" + indexToSelectimmediateCause + "]"));
			return immediateCause;
		}
		
		public WebElement selectrootCause(int indexToSelectrootCause) {
	        WebElement rootCause = ldriver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[" + indexToSelectrootCause + "]"));
			return rootCause;
		}
		
		@FindBy(xpath="(//span[@class='mat-button-wrapper'][normalize-space()='Save'])[2]")
		WebElement saveCauseBtn;
		
		@FindBy(xpath="//label[@for='inspection-record-files']//span[@class='icon-text'][normalize-space()='UPLOAD']")
		WebElement uploadObsAttachment;
	
		
		@FindBy(xpath="//span[normalize-space()='Save']")
		WebElement saveBtn;
		
		
		
		
		
		//  add actions elements
		
		@FindBy(xpath="//span[normalize-space()='Add Action +']")
		WebElement addActionBtn;
		
		@FindBy(xpath="//h2[normalize-space()='Add Action']")
		WebElement addActionText;
		
		@FindBy(xpath="//mat-card [@class='mat-card mat-focus-indicator']")
		WebElement matIcon;
		
	

		@FindBy(xpath="(//formly-wrapper-mat-form-field)[89]")
		WebElement actionType;
		
		@FindBy(xpath="//span[normalize-space()='Immediate Action Taken']")
		WebElement immediateAction;
		
		@FindBy(xpath="//span[normalize-space()='Corrective Action Planned']")
		WebElement correctiveAction;
		
		@FindBy(xpath="(//span[@class='mat-select-placeholder ng-tns-c150-152 ng-star-inserted'])[1]")
		WebElement proposedBy;
		
		@FindBy(xpath="//textarea[@id='formly_266_textarea_natureOfAction_0']")
		WebElement natureOfActionTextBox;
		
		@FindBy(xpath="//input[@id='formly_176_matdatepicker_dueDate_0']")
		WebElement dueDate;
		
		@FindBy(xpath="(//formly-wrapper-mat-form-field)[97]")
		WebElement actionStatus;
		
		@FindBy(xpath="//span[normalize-space()='Open']")
		WebElement openStatus;
		
		@FindBy(xpath="//span[normalize-space()='Close']")
		WebElement closeStatus;
		
		@FindBy(xpath="//span[normalize-space()='Dry Dock']")
		WebElement dryDockStatus;
		
		@FindBy(xpath="(//span[normalize-space()='Discard'])[4]")
		WebElement discardBtn;
		
		@FindBy(xpath="(//span[normalize-space()='Save'])[2]")
		WebElement actionSaveBtn;
		
		@FindBy(xpath="//mat-icon[normalize-space()='close']")
		WebElement actionPopUpCloseBtn;		
		
		@FindBy(xpath="(//formly-field[2]//formly-group[1]//formly-field[1]//formly-wrapper-mat-form-field[@class='ng-star-inserted'])[12]")
	    WebElement actionhover;
		
		@FindBy(xpath="(//formly-wrapper-mat-form-field[@class='ng-star-inserted'])[59]")
		WebElement viqRefHover;
		
		
		@FindBy(xpath="//span[@class='material-icons cursor-pointer mt-2 me-2']")
		WebElement cacheClear;
		
		
		@FindBy(xpath="(//span[@class='mat-button-wrapper'][normalize-space()='Save'])[3]")
		WebElement saveCauseBtnInInternalInsp;
		
		
		//Review Page
	


		@FindBy(xpath="//span[normalize-space()='Review']")
		WebElement reviewPage;
		
		@FindBy(xpath="//input[@placeholder='Reviewed']")
		WebElement reviewedCalender;
		
		public WebElement selectCalenderForReview(int indexToSelectReviewCalender) {
	        WebElement reviewCal = ldriver.findElement(By.xpath("(//input[@placeholder='Reviewed'])[" + indexToSelectReviewCalender + "]"));
			return reviewCal;
		}
		
		
		public WebElement selectTextForReview(int indexToSelectReviewText) {
	        WebElement reviewText = ldriver.findElement(By.xpath("(//textarea[@class='expandable-textarea ng-untouched ng-pristine ng-valid'])[" + indexToSelectReviewText + "]"));
			return reviewText;
		}
		
		
		
		@FindBy(xpath="//textarea[@class='expandable-textarea ng-untouched ng-pristine ng-valid']")
		WebElement reviewTextBox;
		

		@FindBy(xpath="(//button[@type='submit'])[2]")
		WebElement reviewSaveBtn;
		
		@FindBy(xpath="(//span[contains(text(),'Discard')])[2]")
		WebElement reviewDiscardBtn;
		
		@FindBy(xpath="(//span[normalize-space()='Add New'])[2]")
		WebElement addNewReviewBtn;
		
		
		
		public WebElement getSaveCauseBtnInInternalInsp() {
			return saveCauseBtnInInternalInsp;
		}




		public WebElement getReviewPage() {
			return reviewPage;
		}

		public WebElement getReviewedCalender() {
			return reviewedCalender;
		}

		public WebElement getReviewTextBox() {
			return reviewTextBox;
		}

		public WebElement getReviewSaveBtn() {
			return reviewSaveBtn;
		}

		public WebElement getReviewDiscardBtn() {
			return reviewDiscardBtn;
		}

		public WebElement getAddNewReviewBtn() {
			return addNewReviewBtn;
		}

		
		public WebElement getInspStatusFormly() {
			return inspStatusFormly;
		}

	
		public WebElement getInspStatusText() {
			return inspStatusText;
		}


		
		

		public WebElement getSailingLocation() {
			return sailingLocation;
		}

		public WebElement getAuditor() {
			return auditor;
		}

		public WebElement getAuditScope() {
			return auditScope;
		}

		public WebElement getAddCrewDetailsBtn() {
			return addCrewDetailsBtn;
		}

		public WebElement getAddCrewDetailTitle() {
			return addCrewDetailTitle;
		}

		public WebElement getMaster() {
			return master;
		}

		public WebElement getChiefOfficer() {
			return chiefOfficer;
		}

		public WebElement getSecondOfficer() {
			return secondOfficer;
		}

		public WebElement getThirdOfficer() {
			return thirdOfficer;
		}

		public WebElement getChiefEngineer() {
			return chiefEngineer;
		}

		public WebElement getSecondEngineer() {
			return secondEngineer;
		}

		public WebElement getEnterName() {
			return enterName;
		}

		public WebElement getCrewSaveBtn() {
			return crewSaveBtn;
		}

		public WebElement getCrewDiscardBtn() {
			return crewDiscardBtn;
		}

		public WebElement getTypeOfDeviation() {
			return typeOfDeviation;
		}

		public WebElement getFindingTextBox() {
			return findingTextBox;
		}

		public WebElement getOpenRadioBtn() {
			return openRadioBtn;
		}

		public WebElement getCloseRadioBtn() {
			return closeRadioBtn;
		}

		public WebElement getDryDockRadioBtn() {
			return dryDockRadioBtn;
		}


		public WebElement getCacheClear() {
			return cacheClear;
		}



		public WebElement getHover() {
			return actionhover;
		}



	



		public WebElement getActionhover() {
			return actionhover;
		}



		public WebElement getViqRefHover() {
			return viqRefHover;
		}



		



		public WebElement getInspectionPage() {
			return inspectionPage;
		}



		public WebElement getNextBtn() {
			return nextBtn;
		}



		public WebElement getRemoteLocation() {
			return remoteLocation;
		}



		public WebElement getInPortLocation() {
			return inPortLocation;
		}



		public WebElement getOil() {
			return oil;
		}



		public WebElement getChemical() {
			return chemical;
		}



		public WebElement getLpg() {
			return lpg;
		}



		public WebElement getLng() {
			return lng;
		}



		public WebElement getViqVersion() {
			return viqVersion;
		}



		public WebElement getSelectPort() {
			return selectPort;
		}



		

		public WebElement getCurrentDate() {
			return currentDate;
		}



		public WebElement getInspectionStatus() {
			return inspectionStatus;
		}



		


		public WebElement getObservationPage() {
			return observationPage;
		}



		public WebElement getViqRef() {
			return viqRef;
		}



		public WebElement getFlagFindingCheckBox() {
			return flagFindingCheckBox;
		}



		public WebElement getImmediateCause() {
			return immediateCause;
		}



		public WebElement getRootCause() {
			return rootCause;
		}



		public WebElement getSaveBtn() {
			return saveBtn;
		}



		public WebElement getAddActionBtn() {
			return addActionBtn;
		}



		public WebElement getAddActionText() {
			return addActionText;
		}



		public WebElement getActionType() {
			return actionType;
		}
		
		public WebElement getMatIcon() {
			return matIcon;
		}





		public WebElement getImmediateAction() {
			return immediateAction;
		}



		public WebElement getCorrectiveAction() {
			return correctiveAction;
		}



		public WebElement getProposedBy() {
			return proposedBy;
		}



		public WebElement getNatureOfActionTextBox() {
			return natureOfActionTextBox;
		}



		public WebElement getDueDate() {
			return dueDate;
		}



		public WebElement getActionStatus() {
			return actionStatus;
		}



		public WebElement getOpenStatus() {
			return openStatus;
		}



		public WebElement getCloseStatus() {
			return closeStatus;
		}



		public WebElement getDryDockStatus() {
			return dryDockStatus;
		}



		public WebElement getDiscardBtn() {
			return discardBtn;
		}



		public WebElement getActionSaveBtn() {
			return actionSaveBtn;
		}



		public WebElement getActionPopUpCloseBtn() {
			return actionPopUpCloseBtn;
		}
		
		public WebElement getInspectionDetailsText() {
			return inspectionDetailsText;
		}


		public WebElement getEnterDataText() {
			return enterDataText;
		}


	


		public WebElement getSaveCauseBtn() {
			return saveCauseBtn;
		}


		public WebElement getUploadObsAttachment() {
			return uploadObsAttachment;
		}
		
		
		// action pop-up
		
		@FindBy(xpath="(//formly-group[@class='display-flex ng-star-inserted'])[11]")
		WebElement actioTypeFormly;
		
		

		@FindBy(xpath="(//formly-wrapper-mat-form-field)[97]")
		WebElement actionStatusFormly;
		
		@FindBy(xpath="(//formly-wrapper-mat-form-field)[91]")
		WebElement natureOfAction;
		
		public WebElement getNatureOfAction() {
			return natureOfAction;
		}



		public void setNatureOfActionTextBox(WebElement natureOfActionTextBox) {
			this.natureOfActionTextBox = natureOfActionTextBox;
		}



		public WebElement getActioTypeFormly() {
			return actioTypeFormly;
		}



		public WebElement getActionStatusFormly() {
			return actionStatusFormly;
		}


		
		
		// Pop up elements
		
		@FindBy(xpath="//span[normalize-space()='NEW']")
		WebElement newBtnInPopUp;
		

		@FindBy(xpath="//span[normalize-space()='LINK']")
		WebElement linkBtnInPopUp;
		
		@FindBy(xpath="//div[@class='confirmation-content ng-star-inserted']")
		WebElement popUpText;
		
		@FindBy(xpath="//div[@class='dialog-header ng-star-inserted']")
		WebElement popUp;
		

		public WebElement getPopUp() {
			return popUp;
		}


		public WebElement getNewBtnInPopUp() {
			return newBtnInPopUp;
		}



		public WebElement getLinkBtnInPopUp() {
			return linkBtnInPopUp;
		}



		public WebElement getPopUpText() {
			return popUpText;
		}


		// Supdt. Inspection
		
		@FindBy(xpath="(//div[@class='mat-radio-label-content'])[3]")
		WebElement marine;
		
	
		@FindBy(xpath="(//div[@class='mat-radio-label-content'])[4]")
		WebElement techical;
		
		@FindBy(xpath="//input[@placeholder='Superintendent']")
		WebElement superintendentName;
		
		public WebElement getMarine() {
			return marine;
		}

		public WebElement getTechical() {
			return techical;
		}

		public WebElement getSuperintendentName() {
			return superintendentName;
		}
		
		// prevetting
		
		@FindBy(xpath="(//div[@class='mat-radio-label-content'])[4]")
		WebElement byCompany;
		

		@FindBy(xpath="(//div[@class='mat-radio-label-content'])[5]")
		WebElement byThirdParty;
		
		@FindBy(xpath="//input[@placeholder='Audit Organisation']")
		WebElement auditOrg;
		
		@FindBy(xpath="//input[@placeholder='Auditor']")
		WebElement auditorTextBox;
		
		@FindBy(xpath="(//span[@class='mat-option-text'])[1]")
		WebElement auditorAutoSuggestedText;
		
		
	

		public WebElement getAuditorAutoSuggestedText() {
			return auditorAutoSuggestedText;
		}

		public WebElement getAuditOrg() {
			return auditOrg;
		}

		public WebElement getByCompany() {
			return byCompany;
		}

		public WebElement getByThirdParty() {
			return byThirdParty;
		}

		public WebElement getAuditorTextBox() {
			return auditorTextBox;
		}

//  c Nav audit
		
		@FindBy(xpath="//input[@placeholder='Enter Port Name']")
		WebElement geographicalLocation;
		
		@FindBy(xpath="(//div[@class='mat-radio-label-content'])[6]")
		WebElement byMaster;
		

		@FindBy(xpath="//span[normalize-space()='Internal Chapter']")
		WebElement internalChapter;
		
		

		@FindBy(xpath="(//div[@class='mat-radio-label-content'])[4]")
		WebElement byVessel;
		
		@FindBy(xpath="//span[normalize-space()='Audit Type']")
		WebElement checklistRef;
		
		
		public WebElement selectInternalChapter(String internalChapter) {
	        WebElement intChap = ldriver.findElement(By.xpath("//span[normalize-space()='" + internalChapter + "']"));                                    
			return intChap;
		}
		
		public WebElement getGeographicalLocation() {
			return geographicalLocation;
		}





		public WebElement getByVessel() {
			return byVessel;
		}

		public WebElement getByMaster() {
			return byMaster;
		}

		public WebElement getInternalChapter() {
			return internalChapter;
		}

		public WebElement getChecklistRef() {
			return checklistRef;
		}

		
		@FindBy(xpath="//input[@placeholder='Enter Geographical Location']")
		WebElement geoLoaction;

		public WebElement getGeoLoaction() {
			return geoLoaction;
		}
		
		@FindBy(xpath="placeholder=\"Sub Type Name")
		WebElement subType;
		
		@FindBy(xpath="(//span[normalize-space()='Type Of Deviation'])[3]")
		WebElement devationType3;

		public WebElement getSubType() {
			return subType;
		}

		public WebElement getDevationType3() {
			return devationType3;
		}
		
		@FindBy(xpath="//input[@placeholder='Superintendent']")
		WebElement supdtTextBox;

		
		public WebElement getSupdtTextBox() {
			return supdtTextBox;
		}



		





	
	}
