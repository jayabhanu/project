/*
 * This class contains all the test case about login page
 */
package com.selenium.exercise.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginPageAutomation extends LoginPageHelper{

	public static WebDriver driver;
	@Test
	
	
	//Test case 1 :Login Error Message -1
	public static void validateLoginErrorMessage(){
		System.out.println("*****Login Error Message Test case is executing*****");
		// have to pass expected error msg, get from fire path by inspecting it
		String expErrorMsg = "Please enter your password.";

		// launch firefox browser with url specified
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
		//LoginWebElements_Container webelemets = PageFactory.initElements(driver, LoginWebElements_Container.class);
		
		//username text field validation and entering value in text field
		WebElement username = driver.findElement(By.xpath(".//*[@id='username']"));
		assertAndEnterText(username,"jayabhanubec@gmail.com","username");
		
		//login_button validation and perform click action
		WebElement login_button = driver.findElement(By.xpath(".//*[@id='Login']"));
		clickObj(login_button,"logIn_button");
		
		//send expected text which is found form web page found through fire path
		WebElement error_msg = driver.findElement(By.xpath(".//*[@id='error']"));
		validateMsg(error_msg,"Please enter your password.", "error message in login page");
		
		System.out.println("********Login Error Message Test case has completed executing******");
	}
	
	//Test Case 2 :	Login To SalesForce -2

	public static void LoginToSalesForce(){
		//String expectedUrl = "https://na35.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom";
		String expectedTitle = "Force.com Home Page ~ Salesforce - Developer Edition";
		System.out.println("*****Login To SalesForce Test case is executing*****");
		
		// launch firefox browser with url specified
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
		
		//username text field validation and entering value in text field
		WebElement UN = driver.findElement(By.xpath(".//*[@id='username']"));
		assertAndEnterText(UN,"jayabhanubec@gmail.com","username");
		
		//username text field validation and entering value in text field
		WebElement PW = driver.findElement(By.xpath(".//*[@id='password']"));
		assertAndEnterText(PW,"Hanuman05","password");
		
		//login_button validation and perform click action
		WebElement login_button = driver.findElement(By.xpath(".//*[@id='Login']"));
		clickObj(login_button,"logIn_button");
		
		//check that we have landed on correct home page
		//check_PageTitle(driver,expectedtitle);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement obj = driver.findElement(By.xpath("html/head/title"));
		if(obj.isDisplayed()){
		//if(expectedTitle.equals(driver.getTitle())){
		System.out.println("Navigated to expected home page");
		}
	else{
			System.out.println("Didn't navigate to correct home page");
		}
				
		System.out.println("*****Login To SalesForce Test case has completed executing*****");
	}
	
	//Test Case 3: Check RemeberMe - 3

	public static void Check_RememberMe(){
		System.out.println("*****Check Remember Me Test case is executing*****");
		
		// launch firefox browser with url specified
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
		
		//username text field validation and entering value in text field
		WebElement UN = driver.findElement(By.xpath(".//*[@id='username']"));
		assertAndEnterText(UN,"jayabhanubec@gmail.com","username");
		
		//username text field validation and entering value in text field
		WebElement PW = driver.findElement(By.xpath(".//*[@id='password']"));
		assertAndEnterText(PW,"Hanuman05","password");
		
		//check on remeberme check box
		WebElement checkbox = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
		clickObj(checkbox,"checkbox remember me");
		
		
		//login_button validation and perform click action
		WebElement login_button = driver.findElement(By.xpath(".//*[@id='Login']"));
		clickObj(login_button,"logIn_button");
		
		//select logout from drop down
		driver.findElement(By.id("userNav")).click();
		driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[4]")).click();
		
		//validate for username is displayed
		WebElement restoreusername = driver.findElement(By.xpath(".//*[@id='idcard-identity']"));
		validateMsg(restoreusername,"jayabhanubec@gmail.com","username");
		System.out.println("*****Check Remember Me Test case has completed executing*****");
	}
	
	
	//TestCase 4 : Forgot Password- 4 A

	public static void test_Forgot_Password(){
		System.out.println("***** Test Forgot Password Test case is executing*****");
		
		// launch firefox browser with url specified
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
		
		WebElement forgot_Psw_Link = driver.findElement(By.xpath(".//*[@id='forgot_password_link']"));
		textLink(forgot_Psw_Link,"Forgot Your Password?","forgot pwd link");
		forgot_Psw_Link.click();
		
		//validate after click on text link, correct page is landed
		WebElement forgot_your_pwd_page = driver.findElement(By.xpath(".//*[@id='header']"));
		check_object_isDisplayed(forgot_your_pwd_page, "Saleceforce Forgot page");
		
		WebElement pass_email_Id_text = driver.findElement(By.xpath(".//*[@id='un']"));
		assertAndEnterText(pass_email_Id_text, "jayabhanubec@gmail.com", "pass username");
		
		WebElement continu = driver.findElement(By.xpath(".//*[@id='continue']"));
		clickObj(continu,"continue");
		
		WebElement check_your_mail_text = driver.findElement(By.xpath(".//*[@id='header']"));
		check_object_isDisplayed(check_your_mail_text, "check your email page");
		
		System.out.println("***** Test Forgot Password Test case has completed executing*****");
		
		}
	
		//Test Case 5 : Forgot Password- 4 B
	public static void login_With_Wrong_Credi(){
	System.out.println("*****Login with wrong credientials Test case is executing*****");
	
	// launch firefox browser with url specified
	WebDriver driver = BrowserFactory.startBrowser("firefox", "https://login.salesforce.com/");
	
	//username text field validation and entering value in text field
	WebElement UN = driver.findElement(By.xpath(".//*[@id='username']"));
	assertAndEnterText(UN,"xyz@gmail.com","username");
	
	//username text field validation and entering value in text field
	WebElement PW = driver.findElement(By.xpath(".//*[@id='password']"));
	assertAndEnterText(PW,"xyz123","password");
	
	//login_button validation and perform click action
	WebElement login_button = driver.findElement(By.xpath(".//*[@id='Login']"));
	clickObj(login_button,"logIn_button");
	
	WebElement validation_msg = driver.findElement(By.xpath(".//*[@id='error']"));
	validateMsg(validation_msg,"Please check your username and password. If you still can't log in, contact your Salesforce administrator.","validate Text msg");
	
	System.out.println("*****Login with wrong credientials Test case has completed executing*****");
	
	}
	
}
