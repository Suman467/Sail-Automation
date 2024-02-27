package com.sail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportFilterPage {

	WebDriver ldriver;

	public ReportFilterPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(xpath="(//mat-select[@formcontrolname='vessels']//following::div[2])[1]")
	WebElement arrowIconInVessel;
	
	@FindBy(xpath="(//mat-select[@formcontrolname='groups']//following::div[2])[1]")
	WebElement arrowIconInGroup;
	
	@FindBy(xpath="(//mat-select[@formcontrolname='fleetId']//following::div[2])[1]")
	WebElement arrowIconInFleet;
	
	@FindBy(xpath="(//mat-select[@formcontrolname='owners']//following::div[2])[1]")
	WebElement arrowIconInOwner;
	
	@FindBy(xpath="(//mat-select[@formcontrolname='oilmajors']//following::div[2])[1]")
	WebElement arrowIconInOilMajor;
	
	@FindBy(xpath="(//mat-select[@formcontrolname='viq']//following::div[2])[1]")
	WebElement arrowIconInVIQChap;
	
	
	@FindBy(xpath="(//mat-select[@formcontrolname='locations']//following::div[2])[1]")
	WebElement arrowIconInLocation;
	
	@FindBy(xpath="(//mat-select[@formcontrolname='port']//following::div[2])[1]")
	WebElement arrowIconInPort;
	
	@FindBy(xpath="//label[@for='mat-checkbox-42-input']")
	WebElement mouCheckBox;
	
	@FindBy(xpath="//mat-select[@formcontrolname='pscaction']")
	WebElement pscActionCheckBox;
	
	@FindBy(xpath="(//label[@for='mat-checkbox-10-input']//following::div)[1]")
	WebElement marineTechnicalCheckBox;
	
	@FindBy(xpath="//label[@for='mat-checkbox-12-input']")
	WebElement inspectedBy;
	
	
	@FindBy(xpath="//body//app-root//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[12]//div[3]")
	WebElement pageEnd;
	
	
	@FindBy(xpath="//span[normalize-space()='Clear']")
	WebElement clearBtn;
	
	@FindBy(xpath="(//mat-select[@formcontrolname='year']//following::div[2])[1]")
	WebElement year;
	
	
	@FindBy(xpath="//mat-checkbox[@id='mat-checkbox-4']")
	WebElement viqChaptCheckBox;
	
	
	
	
	
	
	

	
	
	public WebElement getViqChaptCheckBox() {
		return viqChaptCheckBox;
	}


	public WebElement getClearBtn() {
		return clearBtn;
	}


	public WebElement getYear() {
		return year;
	}

	
	public WebElement getPageEnd() {
		return pageEnd;
	}




	public WebElement getArrowIconInVessel() {
		return arrowIconInVessel;
	}


	public WebElement getArrowIconInGroup() {
		return arrowIconInGroup;
	}


	public WebElement getArrowIconInFleet() {
		return arrowIconInFleet;
	}


	public WebElement getArrowIconInOwner() {
		return arrowIconInOwner;
	}


	public WebElement getArrowIconInOilMajor() {
		return arrowIconInOilMajor;
	}


	public WebElement getArrowIconInVIQChap() {
		return arrowIconInVIQChap;
	}


	public WebElement getArrowIconInLocation() {
		return arrowIconInLocation;
	}


	public WebElement getArrowIconInPort() {
		return arrowIconInPort;
	}


	public WebElement getMouCheckBox() {
		return mouCheckBox;
	}


	public WebElement getPscActionCheckBox() {
		return pscActionCheckBox;
	}


	public WebElement getMarineTechnicalCheckBox() {
		return marineTechnicalCheckBox;
	}


	public WebElement getInspectedBy() {
		return inspectedBy;
	}

	
	
	  public WebElement selectFilters(int index) { 
		  WebElement filters =
	  ldriver.findElement(By.xpath("(//span[@class='mat-option-text'])[" +
	  index + "]")); 
		  return filters; 
		  
		  }
	  
	  
	  public WebElement selectYear(String year) { 
		  WebElement selectYear =
	  ldriver.findElement(By.xpath("//span[normalize-space()=" +
			  year + "]")); 
		  return selectYear; 
		  
		  }
	  
	  
	  public WebElement selectLocation(String location) { 
		  WebElement selectLocation =
	  ldriver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()= '" + location + "']")); 
		  return selectLocation; 
		  
		  }
	  
	  @FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c67-126']")
	  WebElement obsStatusArrow;

	public WebElement getObsStatusArrow() {
		return obsStatusArrow;
	}
	
	public WebElement obsStatus(String obsStatus) {
	    WebElement obs_Status = ldriver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='" + obsStatus + "']"));
	    return obs_Status;
	}
	  
	 
	  
}