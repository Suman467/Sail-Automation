package com.sail.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneratedReport {
	
	
	WebDriver ldriver;

	public GeneratedReport(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath="//div[@class='top-heading spt-2 spb-1']")
	WebElement reportText;
	
	@FindBy(xpath="(//*[name()='path'][@class='a'])[45]")
	WebElement scrollReport;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Yearly')]")
	WebElement yearly;
	
	@FindBy(xpath= "(//*[name()='tspan' and contains (text(),'Quarterly')])[1]")
	WebElement quartly;
	
	@FindBy(xpath= "//*[name()='tspan' and contains (text(),'Monthly')]")
	WebElement monthly;
	


	@FindBy(xpath= "(//*[name()='tspan' and contains (text(),'Fleet Group')])[1]")
	WebElement fleetGrp;
	
	@FindBy(xpath= "//*[name()='tspan' and contains (text(),'Additional Group')]")
	WebElement additionalGrp;
	
	@FindBy(xpath="(//*[name()='tspan' and contains (text(),'Owner')])[1]")
	WebElement owner;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Vessels')]")
	WebElement vessels;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Oil Major')]")
	WebElement oilMajor;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Insp Vs Obs')]")
	WebElement inspVsObs;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Inspection By Ship Type')]")
	WebElement inspByShip;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),' Chapter')]")
	WebElement Chapter;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Top 20 Repeated Observations')]")
	WebElement top20RepetaedObs;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Initial Risk')]")
	WebElement initialRisk;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Final Risk')]")
	WebElement finalRisk;
	
	@FindBy(xpath="(//*[name()='tspan' and contains (text(),'Company Benchmark')])[1]")
	WebElement companyBenchmarkYearly;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Chapter Benchmark')]")
	WebElement ChapBenchmark;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Fleet Group Benchmark')]")
	WebElement fleetGrpBenchmark;
	
	
	@FindBy(xpath="//div[contains(text(),' - Summary')]")
	WebElement inspectionSummary;
	
	
	@FindBy(xpath="//div[contains(text(),'INSPECTION - List of Inspections')]")
	WebElement listOfInspection;
	
	@FindBy(xpath="//div[contains(text(),'PLAN TABLE')]")
	WebElement planTable;
	

	@FindBy(xpath="//div[contains(text(),'Performance - Top 20 Repeated Observation')]")
	WebElement inspPerformanceTop20RepeatedObs;
	
	@FindBy(xpath="//div[contains(text(),'Performance - High Risk Observations')]")
	WebElement inspPerformanceHighRiskObs;
	
	@FindBy(xpath="//div[contains(text(),'INSPECTION Performance - Flagged Observations')]")
	WebElement flaggedObs;
	
	

	@FindBy(xpath="(//div[contains(text(),'INSPECTION Performance - All Observations')])[2]")
	WebElement inspPerformanceAllObss;
	
	@FindBy(xpath="//body//app-root//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[35]//div[3]")
	WebElement pageEnd;
	
	
	@FindBy(xpath="//div[@class='sub-heading ng-star-inserted']")
	WebElement filterApplied;
	
	
	
	public WebElement getFilterApplied() {
		return filterApplied;
	}



	public WebElement getFlaggedObs() {
		return flaggedObs;
	}

	

	public WebElement getPageEnd() {
		return pageEnd;
	}

	public WebElement getYearly() {
		return yearly;
	}

	public WebElement getQuartly() {
		return quartly;
	}
	public WebElement getScrollReport() {
		return scrollReport;
	}
	

	public WebElement getReportText() {
		return reportText;
	}


	public WebElement getMonthly() {
		return monthly;
	}

	public WebElement getFleetGrp() {
		return fleetGrp;
	}
	
	public WebElement getAdditionalGrp() {
		return additionalGrp;
	}

	public WebElement getOwner() {
		return owner;
	}

	public WebElement getVessels() {
		return vessels;
	}

	public WebElement getOilMajor() {
		return oilMajor;
	}

	public WebElement getInspVsObs() {
		return inspVsObs;
	}

	public WebElement getInspByShip() {
		return inspByShip;
	}

	public WebElement getChapter() {
		return Chapter;
	}

	public WebElement getTop20RepetaedObs() {
		return top20RepetaedObs;
	}

	public WebElement getInitialRisk() {
		return initialRisk;
	}

	public WebElement getFinalRisk() {
		return finalRisk;
	}

	public WebElement getCompanyBenchmarkYearly() {
		return companyBenchmarkYearly;
	}

	public WebElement getChapBenchmark() {
		return ChapBenchmark;
	}

	public WebElement getFleetGrpBenchmark() {
		return fleetGrpBenchmark;
	}

	public WebElement getInspectionSummary() {
		return inspectionSummary;
	}

	public WebElement getListOfInspection() {
		return listOfInspection;
	}
	
	

	public WebElement getPlanTable() {
		return planTable;
	}

	public WebElement getInspPerformanceTop20RepeatedObs() {
		return inspPerformanceTop20RepeatedObs;
	}

	public WebElement getInspPerformanceHighRiskObs() {
		return inspPerformanceHighRiskObs;
	}

	public WebElement getInspPerformanceAllObss() {
		return inspPerformanceAllObss;
	}

// CDI Reports
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'CDI S.R.D Graph')]")
	WebElement srdGraph;
	
	
	@FindBy(xpath="//body//app-root//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[19]")
	WebElement cdiPageEnd;

	public WebElement getCdiPageEnd() {
		return cdiPageEnd;
	}

	public WebElement getSrdGraph() {
		return srdGraph;
	}
	
	//PSC report
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'PSC MOU')]")
	WebElement mou;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Deficiency Category')]")
	WebElement pscDeficiencyCat;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'PSC Action Code')]")
	WebElement pscAction;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Deficiency Code')]")
	WebElement deficiencyCode;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Immediate Causes')]")
	WebElement immediateCause;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Root Causes')]")
	WebElement rootCause;
	
	@FindBy(xpath="//div[normalize-space()='PSC INSPECTION Performance - Flagged Observations']")
	WebElement pscPageEnd;
	

	public WebElement getMou() {
		return mou;
	}

	public WebElement getPscDeficiencyCat() {
		return pscDeficiencyCat;
	}

	public WebElement getPscAction() {
		return pscAction;
	}

	public WebElement getDeficiencyCode() {
		return deficiencyCode;
	}

	public WebElement getImmediateCause() {
		return immediateCause;
	}

	public WebElement getRootCause() {
		return rootCause;
	}

	public WebElement getPscPageEnd() {
		return pscPageEnd;
	}


	// Navigation Audit Report
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'SIRE VIQ Sections')]")
	WebElement sireVIQSection;

	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Deficiency Group')]")
	WebElement deficiencyGrp;
	
	
	@FindBy(xpath="(//div[contains(text(),'PLAN TABLE')])[2]")
	WebElement planTableByMaster;
	
	@FindBy(xpath="(//div[contains(text(),'PLAN TABLE')])[3]")
	WebElement planTableByCompany;
	
	@FindBy(xpath="(//div[contains(text(),'PLAN TABLE')])[4]")
	WebElement planTableBy3rdParty;
	
	@FindBy(xpath="//div[normalize-space()='NAVIGATION AUDIT (Static) By Master']")
	WebElement StaticByMaster;
	
	@FindBy(xpath="//div[normalize-space()='NAVIGATION AUDIT (Static) By Company']")
	WebElement StaticByCompany;
	
	@FindBy(xpath="//div[normalize-space()='NAVIGATION AUDIT (Static) By 3rd Party']")
	WebElement StaticBy3rdParty;
	
	@FindBy(xpath="//div[contains (text(),'Top 20 Repeated Observation')]")
	WebElement navigationAuditTop20RepeatedObs;
	
	@FindBy(xpath="//div[normalize-space()='NAVIGATION AUDIT - Finding By Master']")
	WebElement navigationAuditFindingByMaster;
	
	@FindBy(xpath="//div[normalize-space()='NAVIGATION AUDIT - Finding By Company']")
	WebElement navigationAuditFindingByCompany;
	
	@FindBy(xpath="//div[normalize-space()='NAVIGATION AUDIT - Finding By 3rd Party']")
	WebElement navigationAuditFindingBy3rdParty;

	public WebElement getSireVIQSection() {
		return sireVIQSection;
	}

	public WebElement getDeficiencyGrp() {
		return deficiencyGrp;
	}

	public WebElement getPlanTableByMaster() {
		return planTableByMaster;
	}

	public WebElement getPlanTableByCompany() {
		return planTableByCompany;
	}

	public WebElement getPlanTableBy3rdParty() {
		return planTableBy3rdParty;
	}

	public WebElement getStaticByMaster() {
		return StaticByMaster;
	}

	public WebElement getStaticByCompany() {
		return StaticByCompany;
	}

	public WebElement getStaticBy3rdParty() {
		return StaticBy3rdParty;
	}

	public WebElement getNavigationAuditTop20RepeatedObs() {
		return navigationAuditTop20RepeatedObs;
	}

	public WebElement getNavigationAuditFindingByMaster() {
		return navigationAuditFindingByMaster;
	}

	public WebElement getNavigationAuditFindingByCompany() {
		return navigationAuditFindingByCompany;
	}

	public WebElement getNavigationAuditFindingBy3rdParty() {
		return navigationAuditFindingBy3rdParty;
	}

	
	

	@FindBy(xpath="(//div[contains(text(),'PLAN TABLE')])[2]")
	WebElement planTableMarine;
	
	@FindBy(xpath="(//div[contains(text(),'PLAN TABLE')])[3]")
	WebElement planTableTechnical;
	
	@FindBy(xpath="//div[normalize-space()='SUPERINTENDENT INSPECTION Performance - All Observations']")
	WebElement suptInspAllObs;
	
	
	public WebElement getSuptInspAllObs() {
		return suptInspAllObs;
	}

	public WebElement getPlanTableMarine() {
		return planTableMarine;
	}

	public WebElement getPlanTableTechnical() {
		return planTableTechnical;
	}

	
	
	// Supdt. Inspection

	public WebElement pageEndSupdtReoprt(int index) { 
		  WebElement suptInsPageEnd =
	  ldriver.findElement(By.xpath("(//div[@col-id='observation'])[" +
	  index + "]")); 
		  return suptInsPageEnd; 
		  
		  }
	
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'chapter Benchmark')]")
	WebElement cdiChapBenchmark;

	public WebElement getCdiChapBenchmark() {
		return cdiChapBenchmark;
	}
	
	// External Audit
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Deficiency Group ')]")
	WebElement deficiencyBenchmark;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Deficiency Group')]")
	WebElement deficiencyGroup;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Immediate Causes')]")
	WebElement immediateCauses;
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Root Causes')]")
	WebElement rootCauses;
	
	@FindBy(xpath="//div[normalize-space()='EXTERNAL AUDIT Findings']")
	WebElement externalAuditFindings;
	
	@FindBy(xpath="//div[contains(text(),'AUDIT - Summary')]")
	WebElement auditSummary;
	
	@FindBy(xpath="//div[contains(text(),'AUDIT - List of Audit')]")
	WebElement listOfAudits;
	
	@FindBy(xpath="//div[contains(text(),'AUDIT Findings')]")
	WebElement auditFindings;


	public WebElement getDeficiencyGroup() {
		return deficiencyGroup;
	}



	public WebElement getDeficiencyBenchmark() {
		return deficiencyBenchmark;
	}
	
	public WebElement getImmediateCauses() {
		return immediateCauses;
	}



	public WebElement getRootCauses() {
		return rootCauses;
	}



	public WebElement getExternalAuditFindings() {
		return externalAuditFindings;
	}
	

	public WebElement getAuditSummary() {
		return auditSummary;
	}



	public WebElement getListOfAudits() {
		return listOfAudits;
	}



	public WebElement getAuditFindings() {
		return auditFindings;
	}


	//Flag State
	
	@FindBy(xpath="//*[name()='tspan' and contains(text(),'FLAG STATE')]")
	WebElement flagStateGraph;
	
	@FindBy(xpath="//div[contains(text(),'INSPECTION Performance - All Observations')]")
	WebElement allObservations;

	public WebElement getAllObservations() {
		return allObservations;
	}



	public WebElement getFlagStateGraph() {
		return flagStateGraph;
	}


	// RISQ
	
	@FindBy(xpath="//*[name()='tspan' and contains (text(),'Chapters')]")
	WebElement chapers;


	public WebElement getChapers() {
		return chapers;
	}
	
	
	// SIRE-TRIAL
	@FindBy(xpath= "//div[contains(text(),'SIRE-Trial - Summary ')]")
	WebElement sireTrialSummary;

	public WebElement getSireTrialSummary() {
		return sireTrialSummary;
	}
}