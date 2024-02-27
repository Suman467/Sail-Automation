package com.sail.qa.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	static ExtentReports extent;
	public static ExtentReports extentReportGenertor()
	{
		//ExtentReports- class which is responsible to drive all the reporting execution
		//ExtentSparkReporter- helper class to create configuration
		String path=System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Sail Automation Report");
		reporter.config().setDocumentTitle("Sail Automation");			
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Test Engineer", "Sail Team");			
		return extent;
			
		}
	}



