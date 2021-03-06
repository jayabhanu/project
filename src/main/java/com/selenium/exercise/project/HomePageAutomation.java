package com.selenium.exercise.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageAutomation extends HomePageHelper{

	public static WebDriver driver;
	@Test
	public static void selectUserMenu(){
		System.out.println("*****Select User Menu For <username> Test case is executing*****");
		
				// launch firefox browser with url specified
				WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
								
				//username text field validation and entering value in text field
				WebElement UN = driver.findElement(By.xpath(".//*[@id='username']"));
				LoginPageHelper.assertAndEnterText(UN,"jayabhanubec@gmail.com","username");
				
				//username text field validation and entering value in text field
				WebElement PW = driver.findElement(By.xpath(".//*[@id='password']"));
				LoginPageHelper.assertAndEnterText(PW,"Hanuman05","password");
				
				//login_button validation and perform click action
				WebElement login_button = driver.findElement(By.xpath(".//*[@id='Login']"));
				LoginPageHelper.clickObj(login_button,"logIn_button");
				
				//used to display all options in dropdown list
				driver.findElement(By.id("userNav")).click();
				validateUserProfileDropdownAllOptions(driver,"User profile dropdown validation");

			}
			
			public static void selectMyProfileDropdown() throws InterruptedException{
				
				// launch firefox browser with url specified
				WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
				
				//username text field validation and entering value in text field
				WebElement UN = driver.findElement(By.xpath(".//*[@id='username']"));
				LoginPageHelper.assertAndEnterText(UN,"jayabhanubec@gmail.com","username");
				
				//username text field validation and entering value in text field
				WebElement PW = driver.findElement(By.xpath(".//*[@id='password']"));
				LoginPageHelper.assertAndEnterText(PW,"Hanuman05","password");
				
				//login_button validation and perform click action
				WebElement login_button = driver.findElement(By.xpath(".//*[@id='Login']"));
				LoginPageHelper.clickObj(login_button,"logIn_button");
				
				//finding userprofile name and storing webElement
				//String userProfileName = driver.findElement(By.id("userNav")).getText().trim();//using for just display in fail statement
				
				//click on userprofile name and click on "Myprofile" with validation
				//FIXME: remove this later
				Thread.sleep(10000);
				driver.findElement(By.id("userNav")).click();
				validateUserProfileDropdownAllOptions(driver,"User profile dropdown validation");
				driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[1]")).click();
				
				//verify user profile web page is displayed
				Thread.sleep(10000);
						//requred variables for this test case
				String user_profile_page_expected_Title = "User: jaya gajula ~ Salesforce - Developer Edition";

				validateWebPageByTitle(driver,user_profile_page_expected_Title,"Myprofile");
				
				//click on editprofile button
				WebElement editImage = driver.findElement(By.xpath(".//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img"));
				editImage.click();
				Thread.sleep(10000);

//				driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
//				String parentWindowHandle = driver.getWindowHandle();
//				Set<String> windowHandles = driver.getWindowHandles();
//				String childPopupWindow = "";
//				//driver.switchTo().window("aboutTab");
//				for(String windowHandle:windowHandles){
//					childPopupWindow = windowHandle;
//				}
//				
//				Assert.assertNotEquals(parentWindowHandle, childPopupWindow);
//				
//				driver.switchTo().window(childPopupWindow);
				
				
				
				//WebElement about = driver.findElement(By.xpath(".//*[@id='aboutTab']/a"));
				//WebElement about = driver.findElement(By.xpath(".//*[@id='aboutTab']/a"));
				//driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='aboutTab']/a")));
				driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
				//driver.switchTo().activeElement();
				System.out.println("Popup Title:"+driver.getTitle());
				WebElement about = driver.findElement(By.id("aboutTab"));
				about.click();
				
				//driver.findElement(By.xpath(".//*[@id='contactInfoTitle']"));
				//WebElement about = driver.findElement(By.xpath(".//*[@id='aboutTab']/a"));
				
				
				
			}
			public static void selectMysettingsDropdown() {
			//requred variables for this test case
			String user_setting_page_expected_Title = "Hello, jaya gajula! ~ Salesforce - Developer Edition";	
			String login_History_page_expected_Title = "Login History ~ Salesforce - Developer Edition";
			
			// launch firefox browser with url specified
			WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
			
			//username text field validation and entering value in text field
			WebElement UN = driver.findElement(By.xpath(".//*[@id='username']"));
			LoginPageHelper.assertAndEnterText(UN,"jayabhanubec@gmail.com","username");
			
			//username text field validation and entering value in text field
			WebElement PW = driver.findElement(By.xpath(".//*[@id='password']"));
			LoginPageHelper.assertAndEnterText(PW,"Hanuman05","password");
			
			//login_button validation and perform click action
			WebElement login_button = driver.findElement(By.xpath(".//*[@id='Login']"));
			LoginPageHelper.clickObj(login_button,"logIn_button");
			
			//finding userprofile name and storing webElement
			//String userProfileName = driver.findElement(By.id("userNav")).getText().trim();//using for just display in fail statement
			
			//click on userprofile name and click on "Mysettings" with validation
			driver.findElement(By.id("userNav")).click();
			validateUserProfileDropdownAllOptions(driver,"User profile dropdown validation");
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='userNav-menuItems']/a[2]")));
			//or try: WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someid")));
			element.click();
			//FIXME:driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[2]")).click();
			
			//verify user profile web page is displayed
			validateWebPageByTitle(driver,user_setting_page_expected_Title,"MySettings");
			
			driver.findElement(By.xpath(".//*[@id='PersonalInfo_font']")).click();
			driver.findElement(By.xpath(".//*[@id='LoginHistory_font']")).click();
			//verify Login History web page is displayed
			validateWebPageByTitle(driver,login_History_page_expected_Title,"Login Settings web page");
			// did not handle pop up
			
			driver.findElement(By.xpath(".//*[@id='RelatedUserLoginHistoryList_body']/div/a")).click();
			driver.findElement(By.xpath(".//*[@id='DisplayAndLayout_font']")).click();
			driver.findElement(By.xpath(".//*[@id='CustomizeTabs_font']")).click();
			driver.findElement(By.xpath(".//*[@id='p4']")).click();
			driver.findElement(By.xpath(".//*[@id='p4']/option[9]")).click();
			//Assign webelement for combo box
			WebElement availableTabs = driver.findElement(By.id("duel_select_0"));//id is of <select id="duel_select_1" multiple="multiple"
			selectSingleValueFromListBox(availableTabs,"Reports","selecting Reports from available list");
			driver.findElement(By.xpath(".//*[@id='duel_select_0_right']/img")).click();
			
			//Assign weblement for combo box
			WebElement selectedTabs = driver.findElement(By.id("duel_select_1"));
			//assign select class variable 
			displayAllOptionsInList(availableTabs,"displaying from Selected list");			
			//driver.findElement(By.xpath(".//*[@id='duel_select_0_right']/img")).click();
			 
			}
			
}
