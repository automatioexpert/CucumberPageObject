package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	public static SeleniumDriver seleniumDriver;
	public static WebDriver driver;
	public static WebDriverWait wait;
	//public static final Duration TIME_OUT=20;
	public final static int PAGE_LOAD_TIME_OUT=50;
	
	private SeleniumDriver() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//wait = new WebDriverWait(driver, TIME_OUT);
		

	}
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static  void  setUpDriver() {
		if(seleniumDriver==null) {
			seleniumDriver= new SeleniumDriver();
			
		}
	}
	
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
}

