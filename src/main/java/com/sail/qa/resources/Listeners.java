package com.sail.qa.resources;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sail.qa.base.TestBase;

public class Listeners extends TestBase implements ITestListener
{
	ExtentReports extent=ExtentReport.extentReportGenertor();
	ExtentTest test;

	public void onTestStart(ITestResult result) 
	{
		test=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, "Successful");
	}

	public void onTestFailure(ITestResult result) 
	{
		test.fail(result.getThrowable());
		String testCaseName=result.getMethod().getMethodName();
		try 
		{
			getScreenShot(testCaseName);
		} 
		catch (IOException e) 
		{
			System.out.println("Exception is :"+e.getMessage());
			System.out.println("Exception is :"+e.getCause());
		}
	}
	
	public void onFinish(ITestContext context) 
	{
		extent.flush();
	}

	public void onStart(ITestContext arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		
	}

}
