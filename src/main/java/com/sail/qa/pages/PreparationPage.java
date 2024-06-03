package com.sail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PreparationPage {
	
	WebDriver ldriver;

	public PreparationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[4]")
	WebElement prepTab;

	@FindBy(xpath="//mat-card-title[normalize-space()='Preparation']")
	WebElement preparationText;
	
	@FindBy(xpath="//mat-card-subtitle[normalize-space()='PLANNED VESSELS']")
	WebElement plannedText;
	
	@FindBy(xpath="//app-toolbar[@title='Preparation']//span[@class='mat-button-wrapper']")
	WebElement newPrepBtn;
	
	@FindBy(xpath="div[title='Vessel'] span[role='columnheader']")
	WebElement vesselColumn;	

	@FindBy(xpath="//span[normalize-space()='INSPECTION']")
	WebElement inspectionColumn;
	
	@FindBy(xpath="//span[normalize-space()='START DATE']")
	WebElement startDate;
	
	@FindBy(xpath="//span[normalize-space()='PROGRESS']")
	WebElement progressColumn;
	
	@FindBy(xpath="//span[normalize-space()='DUE DATE']")
	WebElement dueDateColumn;
	
	@FindBy(xpath="//span[normalize-space()='PORT']")
	WebElement portColumn;
	
	@FindBy(xpath="//span[normalize-space()='ACTION']")
	WebElement actionColumn;
	

	@FindBy(xpath="//span[contains(text(),'Select Vessel')]")
	WebElement selectVesesl;
	
	@FindBy(xpath="//mat-option[@role='option']")
	WebElement vesselList;
	
	
	
  //  @FindBy(xpath="//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg']")
   // WebElement inspcDate ;
    
    @FindBy(xpath="//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg']")
    WebElement calenderIcon ;
    

	@FindBy(xpath="//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")
    WebElement currentDate;
    
    //@FindBy(xpath="//span[@class='mat-select-placeholder ng-tns-c150-154 ng-star-inserted']")
	@FindBy(xpath="//formly-field[2]//formly-group[1]//formly-field[1]//formly-wrapper-mat-form-field[@class='ng-star-inserted']")
    WebElement hover;
    
	@FindBy(xpath="//div[@class='mat-select-arrow ng-tns-c150-324']")
	WebElement viqVersion;
   
	@FindBy(xpath="//span[normalize-space()='VIQ 7']")
	WebElement viq7;
    
    @FindBy(xpath="//span[contains(text(),'VIQ Group')]")
    WebElement viqGrp;
    
    @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Oil']")
    WebElement viqOil;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement saveBtn;
    
    @FindBy(xpath="//mat-icon[normalize-space()='close']")
    WebElement closeBtn;
    
    @FindBy(xpath="(//div[@role='row'])[20]")
    WebElement prepTableFstRow;
    
    
    @FindBy(xpath="//div[@class='ng-select-container']")
    WebElement portDropDown;
    
    @FindBy(xpath="//label[normalize-space()='ACTIVE']")
    WebElement activeBtn;
    
   
	@FindBy(xpath="//label[normalize-space()='ARCHIVE']")
    WebElement archiveBtn;
    
    
   
    
	 public WebElement getHover() {
			return hover;
		}

    
    public WebElement getViqOil() {
		return viqOil;
	}



	public WebElement getPrepTableFstRow() {
		return prepTableFstRow;
	}



	public WebElement getPortDropDown() {
		return portDropDown;
	}



	public WebElement selectPortFromDropdown(int indexToSelectPort) {
        WebElement portList = ldriver.findElement(By.xpath("(//span[@class='ng-option-label ng-star-inserted'])[" + indexToSelectPort + "]"));
		return portList;
       
    }
	
	
    
   

	public WebElement selectRowOfPrepTable(int index) {
		WebElement prepTableRow = ldriver.findElement(By.xpath("(//div[@role='row'])[" + index + "]"));
		return prepTableRow;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement selectVeseslFromDropdown(int indexToSelectVessel) {
        WebElement vesselList = ldriver.findElement(By.xpath("(//mat-option[@role='option'])[" + indexToSelectVessel + "]"));
		return vesselList;
       
    }
	
	 public WebElement selectViqVersion(String indexOfViqVersion) {
		 WebElement viqVersion = ldriver.findElement(By.xpath("(//span[@class='mat-option-text'])[" + indexOfViqVersion + "]"));
			return viqVersion;
	        
	    }
    
    public WebElement selectViqGrp(String viqGroup) {
        WebElement viqGroupElement = ldriver.findElement(By.xpath("//span[normalize-space() = '" + viqGroup + "']"));
		return viqGroupElement;
        
    }
    
    
    

	public WebElement getSelectVesesl() {
		return selectVesesl;
	}

	public WebElement getVesselList() {
		return vesselList;
	}

	 public WebElement getCalenderIcon() {
			return calenderIcon;
		}

		public WebElement getCurrentDate() {
			return currentDate;
		}

	public WebElement getViqVersion() {
		return viqVersion;
	}

	public WebElement getViq7() {
		return viq7;
	}

	public WebElement getViqGrp() {
		return viqGrp;
	}
	
	public WebElement getviqOil() {
		return viqOil;
	}



	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	public WebElement getPrepTab() {
		return prepTab;
	}

	public WebElement getPreparationText() {
		return preparationText;
	}

	public WebElement getPlannedText() {
		return plannedText;
	}

	public WebElement getNewPrepBtn() {
		return newPrepBtn;
	}
	
	public WebElement getVesselColumn() {
		return vesselColumn;
	}

	public WebElement getInspectionColumn() {
		return inspectionColumn;
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getProgressColumn() {
		return progressColumn;
	}

	public WebElement getDueDateColumn() {
		return dueDateColumn;
	}

	public WebElement getPortColumn() {
		return portColumn;
	}

	public WebElement getActionColumn() {
		return actionColumn;
	}
	
	 public WebElement getActiveBtn() {
			return activeBtn;
		}



		public WebElement getArchiveBtn() {
			return archiveBtn;
		}
		
		
		
		@FindBy(xpath= "//input[@placeholder='Created By']")
		WebElement createdByField ;
		
		@FindBy(xpath="//*[@placeholder='Name/Designation']")
		WebElement nameAndDesignation;
		
		@FindBy(xpath="//*[@placeholder='Select Assessment Type']")
		WebElement assessmentType;
		
		@FindBy(xpath="//span[@ref='lbRecordCount']")
		WebElement activePreparationCount;
		
		public WebElement getActivePreparationCount() {
			return activePreparationCount;
		}



		public WebElement getCreatedByField() {
			return createdByField;
		}



		public WebElement getNameAndDesignation() {
			return nameAndDesignation;
		}



		public WebElement getAssessmentType() {
			return assessmentType;
		}

				

	
	
}
