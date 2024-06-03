package com.sail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HistoryPage {
	
	WebDriver ldriver;

	public HistoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	

	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[7]")
	WebElement historyPage ;

	@FindBy(xpath="(//span[@class='mat-button-wrapper']//following::mat-icon[contains(text(),'add')])[2]")
	WebElement newRecordButton;
	
	@FindBy(xpath="//button[@class='table-filter-btn md-raised mat-stroked-button btn-field-bt-mg ng-star-inserted']//span[@class='mat-button-wrapper']")
	WebElement filterBtn;
	
	@FindBy(xpath="//label[normalize-space()='HISTORY']")
	WebElement historyTab;
	
	@FindBy(xpath="//label[normalize-space()='REQUESTED']")
	WebElement requestedTab;
	
	@FindBy(xpath="//label[normalize-space()='ALL VESSEL']")
	WebElement allVesselTab;
	
	@FindBy(xpath="//label[normalize-space()='MY VESSEL']")
	WebElement myVesselTab;
	
	@FindBy(xpath="//span[@ref='lbRecordCount']")
	WebElement totalInsRecords;
	
	@FindBy(xpath="//div[contains(text(),'Manual Data Entry')]")
	WebElement manulaDataEntryLabel;
	
	@FindBy(xpath="//div[contains(text(),'SIRE/ CDI XML Upload')]")
	WebElement uploadXmlLabel;
	
	@FindBy(xpath="//*[@formcontrolname='vesselId']")
	WebElement vesselDropdownList;
	
	@FindBy(xpath="//span[normalize-space()='ADD NEW']")
	WebElement addNewButton;
	
	@FindBy(xpath="//span[normalize-space()='UPLOAD']")
	WebElement uploadButton;
	
	@FindBy(xpath="//div[contains(text(),'*Vessel is required')]")
	WebElement error;
	
	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c150-13']")
	WebElement inspectionList;
	
	public WebElement InspectionFromDropdown(String inspectionName) {
        WebElement inspectionList = ldriver.findElement(By.xpath("//span[normalize-space()='" + inspectionName + "']"));                                    
		return inspectionList;
	}
	      
	
	/*
	public WebElement selectVesselFromDropdown(int indexToSelectVessel) {
        WebElement vesselList = ldriver.findElement(By.xpath("(//span[@class='mat-option-text'])[" + indexToSelectVessel + "]"));
		return vesselList;
       
    }
    
    */	
	
	public WebElement VesselFromDropdown(String vesselName) {
        WebElement vesselList = ldriver.findElement(By.xpath("//span[normalize-space()='" + vesselName + "']"));                                    
		return vesselList;
	}
	
	@FindBy(xpath="//app-toolbar[@class='ng-star-inserted']//span[@class='mat-button-wrapper']")
	WebElement inspectionsBtn;
	
	@FindBy(xpath="(//*[@class='mat-card-title title-level1'])[2]")
	WebElement inspectionNameInDataEntryForm;
	
	@FindBy(xpath="//span[@class='sub-title title-level2 ng-star-inserted']")
	WebElement vesselNameInDataEntryForm;
	
	// Inspection page
	
	
	@FindBy(xpath="//label[normalize-space()='Inspection Details']")
	WebElement inspectionDetailsText;
	
	





	@FindBy(xpath="//label[normalize-space()='ENTER INSPECTION RELATED DATA']")
	WebElement enterDataText;
	
	@FindBy(xpath="//span[normalize-space()='Inspection']")
	WebElement inspectionPage;
	

	@FindBy(xpath="//span[normalize-space()='Next']")
	WebElement nextBtn;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[1]")
	WebElement remoteLocation;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[2]")
	WebElement inPortLocation;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[3]")
	WebElement discharging;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[4]")
	WebElement loading;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[5]")
	WebElement idle;
	
	@FindBy(xpath="(//div[@class='mat-radio-label-content'])[6]")
	WebElement bunkering;
	
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
	
	@FindBy(xpath="//*[@placeholder='Oil Major']")
	WebElement oilMajor;
	
	public WebElement selectOilMajorFromDropdown(int indexToSelectPort) {
        WebElement oilMajorList = ldriver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[" + indexToSelectPort + "]"));
		return oilMajorList;
       
    }	
	
	    @FindBy(xpath="(//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg'])[3]")
	    WebElement inspectionDateCalenderIcon ;
	    

		@FindBy(xpath="//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")
	    WebElement currentDate;
		
		@FindBy(xpath="//*[@placeholder='Select Inspector']")
		WebElement inspector;
		
		@FindBy(xpath="(//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg'])[5]")
		WebElement reportReceivedCalenderDate;
		
		@FindBy(xpath="(//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg'])[11]")
		WebElement responseSubmittedCalenderDate;
		
		@FindBy(xpath="(//span[contains(text(),'Select Inspection Status')])[1]")
		WebElement inspectionStatus;
		
		@FindBy(xpath="//span[normalize-space()='Requested']")
		WebElement requestedStatus;
		
		@FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Confirmed']")
		WebElement confirmedStatus;
		
		@FindBy(xpath="//span[normalize-space()='Inspected']")
		WebElement inspectedStatus;
		
		@FindBy(xpath="//span[normalize-space()='Processed']")
		WebElement processedStatus;
		
		@FindBy(xpath="//span[normalize-space()='Uploaded']")
		WebElement uploadedStatus;
		
		@FindBy(xpath="//span[normalize-space()='Closed']")
		WebElement closedStatus;
		
		@FindBy(xpath="//label[@for='inspection-record-files']//span[@class='icon-text'][normalize-space()='UPLOAD']")
		WebElement uploadAttachmentBtn;
		
		@FindBy(xpath="//input[@placeholder='Inspecting Company']")
		WebElement inspectingCompany;
		
		@FindBy(xpath="//input[@placeholder='SIRE-TRIAL Report No.']")
		WebElement sireReportNoTextBox;
		
		
		//  Observation page 
		
		@FindBy(xpath="//span[normalize-space()='Observation']")
		WebElement observationPage;
		
		@FindBy(xpath="//*[@placeholder='Select VIQ Ref']")
		WebElement viqRef;
		
		public WebElement selectVIQRefFromDropdown(String indexToSelectVIQRef) {
	      
	        WebElement viqRefList=ldriver.findElement(By.xpath("//span[normalize-space()='" + indexToSelectVIQRef + "']"));
			return viqRefList;
	       
	    }	
		
		
		
		@FindBy(xpath="//textarea[@placeholder='Observation']")
		WebElement observationTextBox;
		
		@FindBy(xpath="//textarea[@placeholder='Operator Comments']")
		WebElement operatorCommentTextBox;
		
		@FindBy(xpath="(//div[@class='mat-checkbox-inner-container'])[17]")
		WebElement recommendedCheckBox;
		
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
		
		
		@FindBy(xpath="(//span[normalize-space()='UPLOAD'])[2]")
		WebElement uploadAttachmentInObservation;
	
	


		@FindBy(xpath="//span[normalize-space()='Save']")
		WebElement saveBtn;
		
		
		
		
		
		//  add actions elements
		
		@FindBy(xpath="//span[normalize-space()='Add Action +']")
		WebElement addActionBtn;
		
		@FindBy(xpath="//h2[normalize-space()='Add Action']")
		WebElement addActionText;
		
		@FindBy(xpath="//mat-card [@class='mat-card mat-focus-indicator']")
		WebElement matIcon;
		
	

	//	@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c67-230']")
		@FindBy(xpath="(//div[@class='mat-select-trigger ng-tns-c150-713'])[1]")
		WebElement actionType;
		
		public WebElement selectActionType(String actionName) {		      
	        WebElement actionList=ldriver.findElement(By.xpath("//span[normalize-space()='" + actionName + "']"));
			return actionList;
	       
	    }	
		
		
	
		
		@FindBy(xpath="(//formly-field-mat-select[@class='ng-star-inserted'])[37]")
		WebElement proposedBy;
		
		
		public WebElement selectProposedBy(String proposedName) {		      
	        WebElement proposed=ldriver.findElement(By.xpath("//span[normalize-space()='" + proposedName + "']"));
			return proposed;
	       
	    }	
		
		
		
		
		@FindBy(xpath="//textarea[@id='formly_1004_textarea_natureOfAction_0']")
		WebElement natureOfActionTextBox;
		
		@FindBy(xpath="(//button[@aria-label='Open calendar'])[15]")
		WebElement dueDate;
		
		@FindBy(xpath="//span[@class='mat-select-placeholder ng-tns-c150-570 ng-star-inserted']")
		WebElement actionStatus;
		
		public WebElement selectActionStatus(String actionStatus) {		      
	        WebElement action=ldriver.findElement(By.xpath("//span[normalize-space()='" + actionStatus + "']"));
			return action;
	       
	    }	
		
		
		@FindBy(xpath="(//span[normalize-space()='Discard'])[4]")
		WebElement discardBtn;
		
		@FindBy(xpath="(//span[normalize-space()='Save'])[2]")
		WebElement actionSaveBtn;
		
		@FindBy(xpath="//mat-icon[normalize-space()='close']")
		WebElement actionPopUpCloseBtn;		
		
		@FindBy(xpath="(//formly-field-mat-select[@class='ng-star-inserted'])[36]")
	    WebElement actionhover;
		
		@FindBy(xpath="(//formly-wrapper-mat-form-field[@class='ng-star-inserted'])[59]")
		WebElement viqRefHover;
		
		
		@FindBy(xpath="//span[@class='material-icons cursor-pointer mt-2 me-2']")
		WebElement cacheClear;
		
		
		
		
		
		public WebElement getUploadAttachmentInObservation() {
			return uploadAttachmentInObservation;
		}


		public WebElement getCacheClear() {
			return cacheClear;
		}



		public WebElement getHover() {
			return actionhover;
		}



		public WebElement getHistoryPage() {
			return historyPage;
		}



		public WebElement getNewRecordButton() {
			return newRecordButton;
		}



		public WebElement getActionhover() {
			return actionhover;
		}



		public WebElement getViqRefHover() {
			return viqRefHover;
		}



		public WebElement getFilterBtn() {
			return filterBtn;
		}



		public WebElement getHistoryTab() {
			return historyTab;
		}



		public WebElement getRequestedTab() {
			return requestedTab;
		}



		public WebElement getAllVesselTab() {
			return allVesselTab;
		}



		public WebElement getMyVesselTab() {
			return myVesselTab;
		}



		public WebElement getTotalInsRecords() {
			return totalInsRecords;
		}



		public WebElement getManulaDataEntryLabel() {
			return manulaDataEntryLabel;
		}



		public WebElement getUploadXmlLabel() {
			return uploadXmlLabel;
		}



		public WebElement getVesselDropdownList() {
			return vesselDropdownList;
		}



		public WebElement getAddNewButton() {
			return addNewButton;
		}



		public WebElement getUploadButton() {
			return uploadButton;
		}



		public WebElement getError() {
			return error;
		}



		public WebElement getInspectionList() {
			return inspectionList;
		}



		public WebElement getInspectionsBtn() {
			return inspectionsBtn;
		}



		public WebElement getInspectionNameInDataEntryForm() {
			return inspectionNameInDataEntryForm;
		}



		public WebElement getVesselNameInDataEntryForm() {
			return vesselNameInDataEntryForm;
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



		public WebElement getDischarging() {
			return discharging;
		}



		public WebElement getLoading() {
			return loading;
		}



		public WebElement getIdle() {
			return idle;
		}



		public WebElement getBunkering() {
			return bunkering;
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



		public WebElement getOilMajor() {
			return oilMajor;
		}



		public WebElement getInspectionDateCalenderIcon() {
			return inspectionDateCalenderIcon;
		}



		public WebElement getCurrentDate() {
			return currentDate;
		}



		public WebElement getInspector() {
			return inspector;
		}



		public WebElement getReportReceivedCalenderDate() {
			return reportReceivedCalenderDate;
		}



		public WebElement getResponseSubmittedCalenderDate() {
			return responseSubmittedCalenderDate;
		}



		public WebElement getInspectionStatus() {
			return inspectionStatus;
		}



		public WebElement getRequestedStatus() {
			return requestedStatus;
		}



		public WebElement getConfirmedStatus() {
			return confirmedStatus;
		}



		public WebElement getInspectedStatus() {
			return inspectedStatus;
		}



		public WebElement getProcessedStatus() {
			return processedStatus;
		}



		public WebElement getUploadedStatus() {
			return uploadedStatus;
		}



		public WebElement getClosedStatus() {
			return closedStatus;
		}

		


		public WebElement getUploadAttachmentBtn() {
			return uploadAttachmentBtn;
		}



		public WebElement getObservationPage() {
			return observationPage;
		}



		public WebElement getViqRef() {
			return viqRef;
		}



		public WebElement getObservationTextBox() {
			return observationTextBox;
		}



		public WebElement getOperatorCommentTextBox() {
			return operatorCommentTextBox;
		}



		public WebElement getRecommendedCheckBox() {
			return recommendedCheckBox;
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


		public WebElement getInspectingCompany() {
			return inspectingCompany;
		}


		public WebElement getSireReportNoTextBox() {
			return sireReportNoTextBox;
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
		
		

		@FindBy(xpath="(//formly-field-mat-select[@class='ng-star-inserted'])[39]")
		WebElement actionStatusFormly;
		
		@FindBy(xpath="(//formly-field-mat-textarea[@class='ng-star-inserted'])[10]")
		WebElement natureOfAction;
		
		@FindBy(xpath="(//formly-wrapper-mat-form-field[@class='ng-star-inserted'])[93]")
		WebElement dueDateFormly;
		
		
		
		public WebElement getDueDateFormly() {
			return dueDateFormly;
		}


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
		
		// CDI

		@FindBy(xpath="(//div[@class='ng-star-inserted'])[3]")
		WebElement hitoryPageHover;
		

		@FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c150-1709']")
		WebElement inspectionDropDown;
		
		@FindBy(xpath="(//span[contains(text(),'Inspection Status')])[2]")
		WebElement cdiInspectionStatus;




		@FindBy(xpath="(//*[@placeholder='Audit Type'])[3]")
		WebElement cdiRefType;
		
		

		public WebElement getHitoryPageHover() {
			return hitoryPageHover;
		}



		public WebElement getInspectionDropDown() {
			return inspectionDropDown;
		}



		public WebElement getCdiRefType() {
			return cdiRefType;
		}


		public WebElement getCdiInspectionStatus() {
			return cdiInspectionStatus;
		}
		
		// Terminal
		@FindBy(xpath="//input[@placeholder='Select Terminal']")
		WebElement terminal;
		
		@FindBy(xpath="//formly-field[@class='flex-1 select-wrap ng-star-inserted']//formly-field[12]//formly-wrapper-mat-form-field[1]")
		WebElement inspectionStatusFormly;
		
		@FindBy(xpath="//textarea[@placeholder='Finding']")
		WebElement findingTextBox;
		
		
		public WebElement getFindingTextBox() {
			return findingTextBox;
		}


		public WebElement getInspectionStatusFormly() {
			return inspectionStatusFormly;
		}


		public void setInspectionStatusFormly(WebElement inspectionStatusFormly) {
			this.inspectionStatusFormly = inspectionStatusFormly;
		}


		public WebElement getTerminal() {
			return terminal;
		}

		
		// PSC
		
		public WebElement selectMouFromDropdown(int indexToSelectMou) {
	        WebElement mouList = ldriver.findElement(By.xpath("(//span[@class='mat-option-text'])[" + indexToSelectMou + "]"));
			return mouList;
	       
	    }	
		
		public WebElement selectPSCCode(String pscAction) {
		    WebElement actionPsc = ldriver.findElement(By.xpath("//span[normalize-space()='" + pscAction + "']"));
		    return actionPsc;
		}
		
		
		public WebElement selectDefCode(String defCode) {
		    WebElement deficiencyCode = ldriver.findElement(By.xpath("//span[normalize-space()='" + defCode + "']"));
		    return deficiencyCode;
		}

		
			
		public WebElement selectCode(int indexToSelectCode) {
	        WebElement pscAction = ldriver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[" + indexToSelectCode + "]"));
			return pscAction;
		}
		
		
		    @FindBy(xpath="//span[contains(text(),'Select MOU')]")
		    WebElement mou;


			@FindBy(xpath="//*[@placeholder='Select PSC Action Code']")
	        WebElement pscAction;
			
			@FindBy(xpath="//*[@placeholder='Select Deficiency Code']")
			WebElement deficiencyCode;
			
			@FindBy(xpath="//textarea[@placeholder='Deficiency']")
			WebElement deficiencyTextBox;
			
		     public WebElement getPscAction() {
					return pscAction;
				}


				public WebElement getDeficiencyCode() {
					return deficiencyCode;
				}


				public WebElement getDeficiencyTextBox() {
					return deficiencyTextBox;
				}
								

				public WebElement getMou() {
					return mou;
				}



	       //External Audit
				
				@FindBy(xpath="//mat-radio-group[@placeholder='Audit Type']")
				WebElement AuditType;
				
			
				@FindBy(xpath="(//span[contains(text(),'Type Of Deviation')])[1]")
				WebElement typeOfDeviation;
				
								
				@FindBy(xpath="//span[normalize-space()='Audited']")
				WebElement auditedStatus;
				
				@FindBy(xpath="(//span[contains(text(),'Audit Type')])[2]")
				WebElement viqRefInSecondOnsPage;
				
				


				public WebElement getViqRefInSecondOnsPage() {
					return viqRefInSecondOnsPage;
				}


				public WebElement getAuditedStatus() {
					return auditedStatus;
				}


				public WebElement getAuditType() {
					return AuditType;
				}


				public WebElement getTypeOfDeviation() {
					return typeOfDeviation;
				}



				
				public WebElement selectAuditType(int indexToSelectAuditType) {
				    WebElement auditType = ldriver.findElement(By.xpath("//mat-radio-button[@id='formly_925_radio_auditTypeId_1_" + indexToSelectAuditType + "']"));
				    return auditType;
				}

				
				public WebElement selectAuditScope(int indexToSelectAuditScope) {
			        WebElement auditScope = ldriver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[" + indexToSelectAuditScope + "]"));
					return auditScope;
				}
				
				public WebElement selectScopeOfDeviation(int indexToSelectScopeOfDeviation) {
			        WebElement deviation = ldriver.findElement(By.xpath("(//div[@class='mat-radio-label-content'])[" + indexToSelectScopeOfDeviation + "]"));
					return deviation;
				}
				
				public WebElement DeviationFromDropdown(String deviationName) {
			        WebElement deviationList = ldriver.findElement(By.xpath("//span[normalize-space()='" + deviationName + "']"));                                    
					return deviationList;
				}
				
				
				// Flag State
				
				
				@FindBy(xpath="//input[@placeholder='Select Flag State']")
				WebElement flagStateName;
				

				@FindBy(xpath="//input[@placeholder='Inspector']")
				WebElement inspectorName;
				
				@FindBy(xpath="//input[@placeholder='CAP Submitted']")
				WebElement capSubmitted;
				
				

				@FindBy(xpath="(//mat-select[@placeholder='Select Inspection Status'])[2]")
				WebElement flagInsStatus;
				
				@FindBy(xpath="(//mat-select[@placeholder='Type Of Deviation'])[2]")
				WebElement typeOfDeviationFlagState;
				
				
				public WebElement SelectDeviationFromDropdown(String deviationName) {
			        WebElement deviationNameFlagState = ldriver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='" + deviationName + "']"));                                    
					return deviationNameFlagState;
				}
				
				@FindBy(xpath="//ng-select[@placeholder='Select VIQ Ref']")
				WebElement viqRefOfFlagState;
				
				@FindBy(xpath="//textarea[@placeholder='Requirement']")
				WebElement requirementTextBox;
				

				public WebElement getFlagStateName() {
					return flagStateName;
				}


				public WebElement getInspectorName() {
					return inspectorName;
				}


				public WebElement getCapSubmitted() {
					return capSubmitted;
				}
				
				public WebElement getFlagInsStatus() {
					return flagInsStatus;
				}




				public WebElement getTypeOfDeviationFlagState() {
					return typeOfDeviationFlagState;
				}


				public WebElement getViqRefOfFlagState() {
					return viqRefOfFlagState;
				}


				public WebElement getRequirementTextBox() {
					return requirementTextBox;
				}

				
				//SIRE TRIAL
				
				@FindBy(xpath="//input[@placeholder='SIRE-TRIAL Report No.']")
				WebElement reportNoTextBox;
				
				
				
				public WebElement selecValuesFromDropDown(int indexToSelectvalue) {
			        WebElement inspectortName = ldriver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[" + indexToSelectvalue + "]"))  ;  
			        
					return inspectortName;
				}
				
				
				@FindBy(xpath="(//ng-select[@placeholder='Select Ques Category'])[2]")
				WebElement quesCat;
				
				public WebElement selectQuesCategory(String QuestionCategory) {
			        WebElement quesCatName = ldriver.findElement(By.xpath("//span[normalize-space()='" + QuestionCategory + "']"));                                    
					return quesCatName;
				}
				
				
				
						
				public WebElement soc(String quesCatS) {
				    WebElement soc = ldriver.findElement(By.xpath("//ng-select[@placeholder='Select Soc " + quesCatS + "']"));
				    return soc;
				}
				
				public WebElement selectSoc(int sOCNAME2) {
			        WebElement socName = ldriver.findElement(By.xpath("//span[normalize-space()='" + sOCNAME2 + "']"));                                    
					return socName;
				}
				
				public WebElement nocForHumanCat(String quesCat) {
				    WebElement NocHm = ldriver.findElement(By.xpath("//mat-select[@placeholder='Select Noc " + quesCat + "']"));
				    return NocHm;
				}
				
				public WebElement nocForOtherCat(String quesCat) {
				    WebElement Noc = ldriver.findElement(By.xpath("//ng-select[@placeholder='Select Noc " + quesCat + "']"));
				    return Noc;
				}
				
				
				public WebElement noc(String quesCat) {
				    WebElement NocHm = ldriver.findElement(By.xpath("//span[contains(text(),'Select Noc " + quesCat + "')]"));
				    return NocHm;
				}
				
								
				public WebElement selectNocSocFromDropDown(int indexToSelectNoc) {
			        WebElement NocValue = ldriver.findElement(By.xpath("(//span[@class='mat-option-text'])[" + indexToSelectNoc + "]"));
					return NocValue;
				}
				
				@FindBy(xpath="//textarea[@placeholder='Negative Comments']")
				WebElement negativeComment;
				
				
				

				public WebElement getReportNoTextBox() {
					return reportNoTextBox;
				}


				public WebElement getQuesCat() {
					return quesCat;
				}


				public WebElement getNegativeComment() {
					return negativeComment;
				}
				
				
				@FindBy(xpath="(//span[contains(text(),'Select Ques Category')])[2]")
				WebElement quesCatInSecondPageOofObs;
				
				public WebElement getQuesCatInSecondPageOofObs() {
					return quesCatInSecondPageOofObs;
				}


				public WebElement socSecondPageOfObs(String quesCatS) {
				    WebElement soc2 = ldriver.findElement(By.xpath("//span[contains(text(),'Select Soc " + quesCatS + "')]"));
				    return soc2;
				}
				
				
				
				// Green Award Rewcord
				
				@FindBy(xpath="//input[@placeholder='Audit Organisation']")
				WebElement auditOrgTextBox;
			

				@FindBy(xpath="//input[@placeholder='Auditor']")
				WebElement autiorTextBox;
				
				@FindBy(xpath="(//span[contains(text(),'Select Inspection Status')])[2]")
				WebElement inspectionStatusGA;
				
				
				
				
				public WebElement typeOfDeviation(int indexOfTypeOfDeviation) {
			        WebElement deviation = ldriver.findElement(By.xpath("(//span[contains(text(),'Type Of Deviation')])[" + indexOfTypeOfDeviation + "]"));
					return deviation;
				}
				
				
				public WebElement getAuditOrgTextBox() {
					return auditOrgTextBox;
				}


				public WebElement getAutiorTextBox() {
					return autiorTextBox;
				}


				public WebElement getInspectionStatusGA() {
					return inspectionStatusGA;
				}

				
				public WebElement selectInspectionStatus(String  insStatus) {
			        WebElement status = ldriver.findElement(By.xpath("//span[normalize-space()='" + insStatus + "']"));                                    
					return status;
				}

		
				
				//Screening
				@FindBy(xpath="//mat-radio-button[@id='formly_178_radio_subInspectionType_0_0']")
				WebElement sireAssesment;
				
				@FindBy(xpath="//mat-radio-button[@id='formly_178_radio_subInspectionType_0_1']")
				WebElement structuralAssesment;
				
				@FindBy(xpath="//ng-select[@placeholder='Select Positive Screening']")
				WebElement positiveScreening;				
				
				
				public WebElement selectInspectionSatus(String insStatus) {				       
				        WebElement InspectionSatus=ldriver.findElement(By.xpath("//span[normalize-space()='" + insStatus + "']"));
						return InspectionSatus;
				       
				    }	

				public WebElement selectPositveScreenig(String  positiveScreening) {
			        WebElement psStatus = ldriver.findElement(By.xpath("//span[normalize-space()='" + positiveScreening + "']"));                                    
					return psStatus;
				}
				
				
				@FindBy(xpath="//input[@placeholder='Select Date Completed']")
				WebElement dateCompeted;
				
				@FindBy(xpath="//textarea[@placeholder='Comments']")
				WebElement commentBoxOfPositiveScreening;
				
				
				public WebElement getPositiveScreening() {
					return positiveScreening;
				}


				public WebElement getDateCompeted() {
					return dateCompeted;
				}


				public WebElement getCommentBoxOfPositiveScreening() {
					return commentBoxOfPositiveScreening;
				}
				

				public WebElement getSireAssesment() {
					return sireAssesment;
				}


				public WebElement getStructuralAssesment() {
					return structuralAssesment;
				}
				
				//D&A
				
				@FindBy(xpath="//div[contains(text(),'D & A Scope')]")
				WebElement DandAText;
				
				@FindBy(xpath="(//span[@class='mat-checkbox-label'])[6]")
				WebElement mstrScope;
				

				@FindBy(xpath="(//span[@class='mat-checkbox-label'])[7]")
				WebElement supdtScope;
				
				@FindBy(xpath="(//span[@class='mat-checkbox-label'])[8]")
				WebElement officeScope;
				
				@FindBy(xpath="(//span[@class='mat-checkbox-label'])[9]")
				WebElement contrScope;
				
				@FindBy(xpath="(//span[@class='mat-checkbox-label'])[10]")
				WebElement otherScope;
				
				public WebElement getDandAText() {
					return DandAText;
				}


				public WebElement getMstrScope() {
					return mstrScope;
				}


				public WebElement getSupdtScope() {
					return supdtScope;
				}


				public WebElement getOfficeScope() {
					return officeScope;
				}


				public WebElement getContrScope() {
					return contrScope;
				}


				public WebElement getOtherScope() {
					return otherScope;
				}




			
				
				// Filters 
				
				@FindBy(xpath="//mat-icon[normalize-space()='filter_list']")
				WebElement filterButton;
			
				@FindBy(xpath="//mat-icon[normalize-space()='query_builder']")
				WebElement periodFilterButton;
				
				@FindBy(xpath="(//div[@class='mat-radio-outer-circle'])[5]")
				WebElement dateRangeRadioBtn;
				
				@FindBy(xpath="(//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg'])[1]")
			    WebElement dateFromCalenderIcon;
				
				@FindBy(xpath="(//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg'])[2]")
				WebElement dateToCalenderIcon;
							
				@FindBy(xpath="//button[@type='submit']")
				WebElement submitButton;
				
				@FindBy(xpath="//span[normalize-space()='Apply']")
				WebElement applyFilterBtn;
				
				@FindBy(xpath="//span[normalize-space()='Clear']")
				WebElement clearFilterBtn;
				
				@FindBy(xpath="//span[contains(text(),'Vessels')]")
				WebElement vessles;
				
				
				
				public WebElement selectYear(String year) {
				    WebElement Year = ldriver.findElement(By.xpath("//button[normalize-space()=" + year + "']"));
				    return Year;
				}
				
				public WebElement SelectVessel(String vessel) {
					WebElement Vessel = ldriver.findElement(By.xpath("//p[normalize-space()= '"+vessel+ "']" ));
					return Vessel;
					
				}
				
				
				
				public WebElement getFilterButton() {
					return filterButton;
				}


				public WebElement getVessles() {
					return vessles;
				}


				public WebElement getPeriodFilterButton() {
					return periodFilterButton;
				}


				public WebElement getDateRangeRadioBtn() {
					return dateRangeRadioBtn;
				}


				public WebElement getDateFromCalenderIcon() {
					return dateFromCalenderIcon;
				}


				public WebElement getDateToCalenderIcon() {
					return dateToCalenderIcon;
				}


				public WebElement getSubmitButton() {
					return submitButton;
				}


				public WebElement getApplyFilterBtn() {
					return applyFilterBtn;
				}


				public WebElement getClearFilterBtn() {
					return clearFilterBtn;
				}

// History Table
				
				public WebElement inspectionDeatils(int indexToSelectColValue) {
			        WebElement inspection = ldriver.findElement(By.xpath("//div[@aria-colindex='" + indexToSelectColValue + "']"));
					return inspection;
				}
				
				public WebElement columnHeader(int indexToSelectColumn) {
			        WebElement columnName = ldriver.findElement(By.xpath("(//span[@role='columnheader'])[" + indexToSelectColumn + "]"));
					return columnName;
				}
				
				
				
				// Update Existing Records
				
				@FindBy(xpath="//mat-icon[contains(text(),'create')]")
				WebElement editIcon;
				
				@FindBy(xpath="//i[@class='fas fa-file-upload']")
				WebElement uploadExcelIcon;
				
				@FindBy(xpath="//span[normalize-space()='Add New']")
				WebElement addNewObsBtn;
				
				
				@FindBy(xpath="//mat-icon[normalize-space()='delete']")
				WebElement deleteObsBtn;
				
				@FindBy(xpath="(//span[contains(text(),'Audit Type')])[2]")
				WebElement newObsVIQRef;
				
				public WebElement getNewObsVIQRef() {
					return newObsVIQRef;
				}


				public WebElement getEditIcon() {
					return editIcon;
				}


				public WebElement getUploadExcelIcon() {
					return uploadExcelIcon;
				}


				public WebElement getAddNewObsBtn() {
					return addNewObsBtn;
				}


				public WebElement getDeleteObsBtn() {
					return deleteObsBtn;
				}

				
				
				@FindBy(xpath="(//mat-icon[normalize-space()='attach_file'])[1]")
				WebElement attachmentIcon;
				

				@FindBy(xpath="(//span[@class='button__badge2 ng-star-inserted'])[1]")
				WebElement attachmentCount;
				
				
				
				public WebElement ifAttachmnetIsPresent(int indexToCheckAttachment) {
			        WebElement attachments = ldriver.findElement(By.xpath("(//div[@class='image-box ng-star-inserted'])[" + indexToCheckAttachment + "]"));
					return attachments;
				}
				
				
				public WebElement observationAttchmentsInInspectionPage(String attachmentName) {
			        WebElement inspection = ldriver.findElement(By.xpath("//span[normalize-space()='" + attachmentName + "']"));
					return inspection;
				}
				
				//span[normalize-space()='Obs-1-']
				
				


				public WebElement getAttachmentIcon() {
					return attachmentIcon;
				}


				public WebElement getAttachmentCount() {
					return attachmentCount;
				}



				// Upload invalid excel
				
				@FindBy(xpath="(//div[@aria-label='Invalid Excel Format'])[1]")
				WebElement invalidExcelFormat;
				
				@FindBy(xpath="(//div[@id='toast-container'])[1]")
				WebElement toaster;

				

				public WebElement getToaster() {
					return toaster;
				}


				public WebElement getInvalidExcelFormat() {
					return invalidExcelFormat;
				}

				
			


	
	}
