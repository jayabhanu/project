package com.selenium.exercise.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyCheckPointsInGoogle {

	public static void main(String[] args) {
	
	//	SeleniumHelper.initGlobalSeleniumProperties();
		WebDriver driver = new FirefoxDriver();

//			driver.get("https://accounts.google.com/Login#identifier");
//			driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("jayabhanubec@gmail.com");
//			driver.findElement(By.xpath(".//*[@id='next']")).click();
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Hanuman05sai");
//			driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("jayabhanubec@gmail.com");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Hanuman05");
		driver.findElement(By.xpath(".//*[@id='Login']")).click();

	}

}
	