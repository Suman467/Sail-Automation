package com.sail.qa.resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listeners implements ITestListener {
    private static ExtentReports extent = ExtentReport.extentReportGenertor();  // ✅ Corrected method name
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (test.get() != null) {  // ✅ Check before calling fail()
            test.get().fail(result.getThrowable());
        } else {
            System.out.println("ExtentTest instance is NULL for test: " + result.getMethod().getMethodName());
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null) {  // ✅ Check for null before flushing
            extent.flush();
        }
    }
}