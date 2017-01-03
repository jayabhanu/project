package com.selenium.exercise.project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
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
	
	/* 
	 * Name of the Method: selectSingleValueFromListBox ()
	 * Brief description : select one option from the list box by selectByVisibleText() method
	 * Arguments: ComboBox --> which hold the instance of list box object, visible --> select thisc option in the list, objName --> name of the object
	 * Created by: Automation team
	 * Creation date : Dec 30 2016
	 * last modified: Dec 30 2016
	 * */
	public static void selectSingleValueFromListBox(WebElement comboBox, String visible,String objName){
		//assign select class variable 
		Select selection = new Select(comboBox);
		selection.selectByVisibleText(visible);
		//selection.getOptions();
		System.out.println(objName + " is executing");
	}
	
	/* 
	 * Name of the Method: displayAllOptionsInList ()
	 * Brief description : display all the options present in the list
	 * Arguments: ComboBox --> which hold the instance of list box object, objName --> name of the object
	 * Created by: Automation team
	 * Creation date : Dec 30 2016
	 * last modified: Dec 30 2016
	 * */
	public static void displayAllOptionsInList(WebElement comboBox,String objName){
		//assign select class variable 
		Select selection = new Select(comboBox);
		List <WebElement> selectedList = selection.getOptions();
		for(WebElement slectedListOptions : selectedList){
			//String selectedListValues = slectedListOptions.getText();
			System.out.println(slectedListOptions.getText() + objName);
		}
		
	}
	
}
