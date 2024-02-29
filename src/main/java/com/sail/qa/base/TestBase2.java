package com.sail.qa.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.OperatingSystem;


public class TestBase2 {
		
	public static WebDriver driver;
	public static Logger log = LogManager.getLogger(TestBase2.class.getName());

	public static boolean smartScroll = true;
	public static JavascriptExecutor jse = (JavascriptExecutor) TestBase2.driver;
	
	
	@Parameters({ "browser", "execution" })
	public void setup(String os,@Optional boolean isHeadlessExecution, ChromeOptions options) {
		log.info("*****************************************");
	    log.info("------------AUTOMATION STARTED-----------");
	    log.info("*****************************************");
	    String chromeDriverPath;
	    String chromeBinaryPath = "/c/Program Files/Google/Chrome/Application/chrome.exe";


	    if (os.contains("nix") || os.contains("nux") || os.contains("aix"))
	        chromeDriverPath = "/test_automation_framework/src/main/java/com/sail/qa/resources/chromedriver.exe";
	    else if (os.contains("mac"))
	        chromeDriverPath = "path/to/mac/chromedriver";
	    else if (os.contains("win"))
	        chromeDriverPath = "/test_automation_framework/src/main/java/com/sail/qa/resources/chromedriver.exe";
	    else {
	        log.error("Unsupported operating system: " + os);
	        throw new UnsupportedOperationException("Unsupported operating system: " + os);
	    }

	    // Set the system property
	    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	    
	    //String chromeBinaryPath = "/c/Program Files/Google/Chrome/Application/chrome.exe";
	    System.setProperty("webdriver.chrome.driver", chromeBinaryPath);

	    if (isHeadlessExecution)
	        options.addArguments("headless");

	    driver = new ChromeDriver(options);
	}
	        
	 
	 
	
	

	public void getScreenShot(String testCaseName) throws IOException {
		if (driver != null) {
	        log.debug("Screenshot of failed test case is taken");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
		String destPath = System.getProperty("user.dir") + "\\ScreenShot\\" + testCaseName + "_" + timestamp + ".png";
		File dest = new File(destPath);
		FileUtils.copyFile(source, dest);
	}
		else {
	        log.error("Driver instance is null. Cannot capture screenshot.");
	    }
	}

	public static void scrollCheckAndClick(WebElement e) {
		try {
			e.click();
			return;
		} catch (Exception ex) {
			JavascriptExecutor js = (JavascriptExecutor) TestBase2.driver;
			js.executeScript("arguments[0].scrollIntoView();", e);
		}
		//e.click();
		
		try {
            e.click(); // Attempt to click again after scrolling into view
        } catch (Exception exAfterScroll) {
            // Handle the exception or log a message if the second click also fails
            exAfterScroll.printStackTrace(); // or log.error("Failed to click element after scrolling into view", exAfterScroll);
        }
	}

	public static void scrollCheckAndWrite(WebElement e, String text) {
		try {
			e.sendKeys(text);
			return;
		} catch (Exception ex) {
			JavascriptExecutor js = (JavascriptExecutor) TestBase2.driver;
			js.executeScript("arguments[0].scrollIntoView();", e);
		}
		e.sendKeys(text);
	}
	
	
	public static void scrollToElement(WebDriver driver, WebElement e) {
	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
}
	
	
	

	public static FluentWait<WebDriver> getFluentWait() {
		return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(780)).pollingEvery(Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class);
	}

	public FluentWait<WebDriver> getShortFluentWait() {
		return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
	}

	public void clickElement(WebElement element) {
		getFluentWait().until(ExpectedConditions.or(ExpectedConditions.visibilityOf(element),
				ExpectedConditions.elementToBeClickable(element)));
		element.click();
	}
	
	
	 public void clickElementAfterSelection(WebElement element) {
	        getFluentWait().until(ExpectedConditions.or(
	                ExpectedConditions.visibilityOf(element),
	                ExpectedConditions.elementToBeClickable(element)
	        ));
	        element.click();
	    }

	public void clearElement(WebElement element) {
		getFluentWait().until(ExpectedConditions.or(ExpectedConditions.visibilityOf(element),
				ExpectedConditions.elementToBeClickable(element)));
		element.clear();
	}

	public void waitUntilElementPresent(WebElement element) {
		Wait<WebDriver> fluentWait = getFluentWait();
		fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	}


	public void waitUntilSendKeys(Object obj, CharSequence... values) {
		Wait<WebDriver> fluentWait = getFluentWait();
		fluentWait.until(ExpectedConditions.visibilityOf((WebElement) obj)).sendKeys((CharSequence[]) values);
	}

	public static void sendKeys(WebElement element, CharSequence... values) {
		Wait<WebDriver> fluentWait = getFluentWait();
		fluentWait.until(ExpectedConditions.visibilityOf(element)).sendKeys(values);
	}

	public String getText(WebElement element) {
		Wait<WebDriver> fluentWait = getFluentWait();
		fluentWait.until(ExpectedConditions.visibilityOf(element));
		return element.getText().trim();
	}
	
	public void waitUntilElementIsNotPresent(WebElement element) {
	    Wait<WebDriver> fluentWait = getFluentWait();
	    fluentWait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	
	public WebElement selectInspectionDate(WebElement element) {
	Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String formattedDate = dateFormat.format(currentDate);
	return element;

	}
	
		
}
