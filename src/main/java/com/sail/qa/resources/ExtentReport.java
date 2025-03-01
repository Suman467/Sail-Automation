package com.sail.qa.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

    static ExtentReports extent;

    public static ExtentReports extentReportGenertor() {
        // Define the report file path
        String path = System.getProperty("user.dir") + "\\Reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);

        // ✅ Correct way to configure in ExtentReports 5.1.1
        reporter.config().setReportName("Sail Automation Report");
        reporter.config().setDocumentTitle("Sail Automation");
        reporter.config().setTheme(Theme.STANDARD);

        // Create ExtentReports instance
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Test Engineer", "Sail Team");

        return extent;
    }
}
