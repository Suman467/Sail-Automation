package com.sail.qa.TestCases;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class SwitchTab extends LoginPageTest {
	
	@Test
	public void switchToOldTab() throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		System.out.println("Switched to old tab");
		driver.navigate().refresh();
		Thread.sleep(4000);
	}

	@Test
	public void switchToNewTab() throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println("Switched to new tab");
		Thread.sleep(5000);
	}
		
		
	

}
