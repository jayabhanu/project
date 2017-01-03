package com.selenium.exercise.project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageHelper {

	/* 
	 * Name of the Method: dropdown_AllOptions (validate dropdown and all it option is displayed are not)
	 * Brief description : check that all options aare displayed in dropdown
	 * Arguments: driver --> WebDriver driver, idElement --> to find element when to click dropdown, objName --> name of the object
	 * Created by: Automation team
	 * Creation date : Dec 30 2016
	 * last modified: Dec 30 2016
	 * */
	public static void validateUserProfileDropdownAllOptions(WebDriver driver,String objName){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='userNav-menuItems']/a[4]")));

		List <WebElement> allSuggestions = driver.findElements(By.id("userNav")); 
		for (WebElement suggestion : allSuggestions)
        	{
        	
        	if(suggestion.isDisplayed()){
        	System.out.println(objName + "Pass : is displayed on web page");	
        	}
        	else {
        		System.out.println(objName + "Fail : did not display");
        	}
        	String var = suggestion.getText();
		       System.out.println(var);
        }
	}
	
	/* 
	 * Name of the Method: dropdown_AllOptions (validate dropdown and all it option is displayed are not)
	 * Brief description : check that all options aare displayed in dropdown
	 * Arguments: driver --> WebDriver driver, idElement --> to find element when to click dropdown, objName --> name of the object
	 * Created by: Automation team
	 * Creation date : Dec 30 2016
	 * last modified: Dec 30 2016
	 * */
	public static void validateWebPageByTitle(WebDriver driver, String expectedTitle,String objName){
  	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String curTitle = driver.getTitle();
		Assert.assertEquals( curTitle,expectedTitle,"User profile page is not displayed" + objName);
		System.out.println(curTitle + " is dispalyed for " + objName);
	}
	
	/* 
	 * Name of the Method: dropdown_AllOptions (validate dropdown and all it option is displayed are not)
	 * Brief description : check that all options aare displayed in dropdown
	 * Arguments: driver --> WebDriver driver, idElement --> to find element when to click dropdown, objName --> name of the object
	 * Created by: Automation team
	 * Creation date : Dec 30 2016
	 * last modified: Dec 30 2016
	 * */
	public static void validateElementsInWebPage(WebDriver driver, String expectedTitle,String objName){
		String curTitle = driver.getTitle();
		Assert.assertEquals( curTitle,expectedTitle,"User profile page is not displayed" + objName);
		System.out.println(curTitle + " is dispalyed for " + objName);
	}
	
}
