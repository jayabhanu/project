package com.selenium.exercise.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
	public static WebDriver driver;
	public static WebDriver startBrowser (String browserName, String url){
		//System.setProperty("webdriver.gecko.driver", "/Users/ymadanagopal/HomeProject/project/geckodriver");

		if(browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")){
			driver = new InternetExplorerDriver(); 
		}
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		return driver;
	}

}
