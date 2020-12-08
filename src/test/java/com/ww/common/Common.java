package com.ww.common;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;


public class Common {
	 
	WebDriver driver;	
	
	private static String getURL = "https://qatest.pestroutes.com";
	public static String getGetURL() {
			return getURL;
		}
	
	private static String username = "interview_test";
	public static String getusername() {
			return username;
		}
	
	private static String password = "Test_testing123";
	public static String getpassword() {
			return password;
		}

	
	public static WebDriver getbrowser(String browserName, WebDriver driver) {
		
		if (browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver","./Drivers/operadriver");
			driver = new OperaDriver();	
		}
		else if (browserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.firefox.driver","./Drivers/geckodriver");
			driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    return driver;
	    
	}
	
	
	
	public static void SS (WebDriver driver, String FileName) throws Throwable {
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File f1= ss.getScreenshotAs(OutputType.FILE); // to take screenshot 
		FileUtils.copyFile(f1,new File("./Screenshot/"+FileName+".jpg"));//to save the file 
		if (ss.getScreenshotAs(OutputType.FILE) != null) {
			System.out.println("ScreenShot Taken");
			
		}
		else {
			System.out.println("ScreenShot Couldn't Take");
		}
	
   }
	
}
