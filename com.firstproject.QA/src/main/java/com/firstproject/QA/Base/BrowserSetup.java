package com.firstproject.QA.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
	
	public static WebDriver driver;
		
		public static void Setup(String browser) {
			
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pravin\\Desktop\\jar files\\chromedriver_win32 (109)\\chromedriver.exe");
				driver=new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\pravin\\Desktop\\jar files\\firefox exe\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			driver.get("https://www.facebook.com/reg");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

}
