package com.mm.exercise.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public String browserName;
	
	public void invokeApp(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.exercise1.com/values");
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}else {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://www.exercise1.com/values");
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		
		
	}

}
