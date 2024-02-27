package com.sail.qa.TestCases;

import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;

public class CloseTab extends TestBase {
	
	@Test
	public void closeTab() throws InterruptedException {
		Thread.sleep(2000);
		driver.getWindowHandle();
		driver.close();
	}
		
	

}
