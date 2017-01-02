package com.selenium.exercise.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginPageHelper {

	

	/* 
	 * Name of the Method: assertAndEnterText (validate text box is displayed() and enter value in it)
	 * Brief description : Enter text into text box field
	 * Arguments: obj --> Webelement Object, textval --> Text to be entered, objName --> name of hte object
	 * Created by: Automation team
	 * Creation date : Dec 14 2016
	 * last modified: Dec 14 2016
	 * */
	public static void assertAndEnterText(WebElement obj, String textVal, String objName){
		Assert.assertTrue(obj.isDisplayed(),"Fail: Object not displayed. "+ objName);
		obj.sendKeys(textVal);
		System.out.println("Pass: " + textVal + " is entered in " + objName);
		
		/*
		if(obj.isDisplayed()){
		obj.sendKeys(textVal);
			System.out.println("Pass: " + textVal + " is entered in " + objName);
			
		}else{
			System.out.println("Fail: "+ objName + " field is not displayed, please check your application.");
		}
		*/

	}
	
	/* 
	 * Name of the Method: clickObj(validate button and click action on it)
	 * Brief description : click object
	 * Arguments: obj --> Webelement Object,  objName --> name of the object
	 * Created by: Automation team
	 * Creation date : Dec 14 2016
	 * last modified: Dec 14 2016
	 * 
	 * */	
	public static void clickObj(WebElement obj, String objName){
		Assert.assertTrue(obj.isDisplayed(),"Fail: " + objName+ " is not displayed, please check your application");
		obj.click();
		System.out.println("Pass: "+ objName + " is clicked.");
		/*
		if(obj.isDisplayed()){
			obj.click();
			System.out.println("Pass: "+ objName + " is clicked.");
		}else{
			System.out.println("Fail: " + objName+ " is not displayed, please check your application");
		}*/
	}
	
	/* 
	 * Name of the Method: validateMsg(validating correct web page landed by searching for the text that present in that page)
	 * Brief description : validate message displayed on the web page
	 * Arguments: obj --> Webelement Object,  expectedText --> expected text to be displayed, objName --> name of hte object
	 * Created by: Automation team
	 * Creation date : Dec 14 2016
	 * last modified: Dec 14 2016
	 * 
	 * */	

	public static void validateMsg(WebElement obj, String expectedText, String objName){
		if(obj.isDisplayed()){
			String actualText = obj.getText().trim();
			if(expectedText.equals(actualText)){
				System.out.println("Pass: Actual message is matching with expected message " + actualText);
			}else{
				System.out.println("Fail: Actual message '" + actualText + "' is not matching with expected message '"+ expectedText+"'  ,Please check your application");
			}
		}else{
			System.out.println("Fail: " + objName+ " is not displayed, please check your application");
		}
	}
	
	
	/* 
	 * Name of the Method: check_object_isDisplayed (just check that element is diplayed in that page)
	 * Brief description : check object is displayed
	 * Arguments: obj --> Webelement obj
	 * Created by: Automation team
	 * Creation date : Dec 28 2016
	 * last modified: Dec 28 2016
	 * 
	 * */	
	
	public static void check_object_isDisplayed(WebElement obj, String objName){
		if(obj.isDisplayed()){
			System.out.println(objName + " is displayed");
		}
		else {
			System.out.println(objName + "is not displayed");
		}
	}
	
	/* 
	 * Name of the Method: check_object_isDisplayed
	 * Brief description : check object is displayed
	 * Arguments: obj --> Webelement obj
	 * Created by: Automation team
	 * Creation date : Dec 28 2016
	 * last modified: Dec 28 2016
	 * 
	 * */	
	
	public static void check_text_displayed_InPage(WebElement elem){
		if(elem.isDisplayed()){
			System.out.println("Salesforce forgot page is displayed");
		}
		else {
			System.out.println("Salesforce forgot page is not displayed");
		}
	}
	
	/* 
	 * Name of the Method: Text Link
	 * Brief description : validate Text link is displayed
	 * Arguments: obj --> Webelement Object,  expectedText --> expected text to be displayed, objName --> name of hte object
	 * Created by: Automation team
	 * Creation date : Dec 14 2016
	 * last modified: Dec 14 2016
	 * 
	 * */	
	
	public static void textLink(WebElement obj, String expectedText, String objName){
		if(obj.isDisplayed()){
			String actualText = obj.getText().trim();
			if(expectedText.equals(actualText)){
				System.out.println("Pass: Actual message is matching with expected message " + actualText);
			}else{
				System.out.println("Fail: Actual message '" + actualText + "' is not matching with expected message '"+ expectedText+"'  ,Please check your application");
			}
		}else{
			System.out.println("Fail: " + objName+ " is not displayed, please check your application");
		}
	}
}

	

