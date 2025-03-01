package com.sail.qa.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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


public class TestBase {
		
	public static WebDriver driver;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	public static boolean smartScroll = true;
	public static JavascriptExecutor jse = (JavascriptExecutor) TestBase.driver;
	
	@SuppressWarnings("deprecation")
	
	@Parameters({ "browser", "execution" })
	public void setup(String browser, @Optional() String execution) {
	    log.info("*****************************************");
	    log.info("------------AUTOMATION STARTED-----------");
	    log.info("*****************************************");
	    
	   

	    boolean isHeadlessExecution = "headless".equals(execution);
	    ChromeOptions options = new ChromeOptions(); // Use a single instance of ChromeOptions

	    try {
	        String OS = System.getProperty("os.name").toLowerCase();
	        System.out.println("The OS is : " + OS);
	        log.info("The OS is: " + OS);

	        if (browser.equalsIgnoreCase("chrome")) {
	            setupChromeDriver(OS, isHeadlessExecution, options);
	            log.info("Chrome driver is Initialized");
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            log.info("Firefox driver is Initialized");
	        } else if (browser.equalsIgnoreCase("edge")) {
	            setupEdgeDriver(OS, options);
	            log.info("Edge driver is Initialized");
	        } else {
	            log.error("Invalid browser specified: " + browser);
	            throw new IllegalArgumentException("Invalid browser specified: " + browser);
	        }

	        // Common setup for all browsers
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        options.addArguments("--disable-cache");
	        options.addArguments("--no-sandbox");
	        options.setExperimentalOption("useAutomationExtension", false);
	        options.addArguments("--disable-blink-features=AutomationControlled");
	        
	        
	       
	    } catch (Exception e) {
	        log.error("Error during setup", e);
	        throw e;
	    }
	}

	/*
	private void setupChromeDriver(String os, boolean isHeadlessExecution, ChromeOptions options) {
	    if (os.contains("nix") || os.contains("nux") || os.contains("aix"))
	        WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
	    
	    else if (os.contains("mac"))
	        WebDriverManager.chromedriver().operatingSystem(OperatingSystem.MAC).setup();
	    else if (os.contains("win"))
	        WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
	        
	   
	    else {
	        log.error("Unsupported operating system: " + os);
	        throw new UnsupportedOperationException("Unsupported operating system: " + os);
	    }
	   // String chromeBinaryPath = "/c/Program Files/Google/Chrome/Application/chrome.exe";
	    //System.setProperty("webdriver.chrome.driver", chromeBinaryPath);
	    

	    if (isHeadlessExecution)
	        options.addArguments("headless");

	    driver = new ChromeDriver(options);
	}

	private void setupEdgeDriver(String os, ChromeOptions options) {
	    if (os.contains("nix") || os.contains("nux") || os.contains("aix"))
	        WebDriverManager.edgedriver().operatingSystem(OperatingSystem.LINUX).setup();
	    else if (os.contains("mac"))
	        WebDriverManager.edgedriver().operatingSystem(OperatingSystem.MAC).setup();
	    else if (os.contains("win")) {
	        WebDriverManager.edgedriver().operatingSystem(OperatingSystem.WIN).setup();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("document.body.style.zoom='70%'");
	    } else {
	        log.error("Unsupported operating system: " + os);
	        throw new UnsupportedOperationException("Unsupported operating system: " + os);
	    }
	    
	    

	    EdgeOptions edgeOptions = new EdgeOptions();
	    driver = new EdgeDriver(edgeOptions);
	    log.info("Edge driver is Initialized");
	    
	    
	    
	    
	   
	}
	        
	*/
	
	private void setupChromeDriver(String os, boolean isHeadlessExecution, ChromeOptions options) {
        WebDriverManager.chromedriver().setup();

        // Use a unique user-data-dir to prevent conflicts
        String userDataDir = System.getProperty("java.io.tmpdir") + "/chrome-user-data-" + System.currentTimeMillis();
        options.addArguments("--user-data-dir=" + userDataDir);
        options.addArguments("--disable-extensions");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-blink-features=AutomationControlled");

        if (isHeadlessExecution) {
            options.addArguments("--headless");
        }

        driver = new ChromeDriver(options);
    }

    private void setupEdgeDriver(String os, ChromeOptions options) {
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        driver = new EdgeDriver(edgeOptions);
        log.info("Edge driver is initialized");
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
			JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
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
			JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
			js.executeScript("arguments[0].scrollIntoView();", e);
		}
		e.sendKeys(text);
	}
	
	
	public static void scrollToElement(WebDriver driver, WebElement e) {
	
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
}
	
	
	

	public static FluentWait<WebDriver> getFluentWait() {
		return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(180)).pollingEvery(Duration.ofSeconds(30))
				.ignoring(NoSuchElementException.class);
	}

	public FluentWait<WebDriver> getShortFluentWait() {
		return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(1)).pollingEvery(Duration.ofMillis(1))
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
	    Wait<WebDriver> fluentWait = getShortFluentWait();
	    fluentWait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	
	public WebElement selectInspectionDate(WebElement element) {
	Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String formattedDate = dateFormat.format(currentDate);
	return element;

	}
	
	
	 public static String generateRandomNumberWithPrefix() {
		  
	        Random random = new Random();
	        int randomNumber = random.nextInt(10000); // Generates a random number between 0 and 9999
	        return "Automation" + randomNumber;
	    }
	 
	 
	 public static void uploadFileAndattAchments(String path) throws AWTException
	 {
		 Robot robot = new Robot();

	        // Copy the file path to the clipboard
	        StringSelection filePath = new StringSelection(path);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath,null);

	        // Paste the file path
	        robot.delay(1000); // Add delay to ensure the dialog is open
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        // Press Enter to close the dialog
	        getFluentWait();
			

	        robot.keyPress(KeyEvent.VK_ENTER);
	      
	        robot.keyRelease(KeyEvent.VK_ENTER);
	 }
	
	
		
}
