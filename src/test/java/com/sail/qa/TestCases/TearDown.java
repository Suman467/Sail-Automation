package com.sail.qa.TestCases;

import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;

public class TearDown extends TestBase {

	@Test
    public void tearDown() {
           // if (driver != null) {
            driver.quit();
            log.info("Test cases are executed Successfully");
            System.out.println("Browser is closed");
        }
    }



