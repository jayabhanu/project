package com.selenium.exercise.project;


import org.junit.Test;

import junit.framework.TestCase;

public class SaleforceTestSuite extends TestCase {

	
	//LoginErrorMessage();
	//LoginToSalesForce();
	//Check_RememberMe();
	//test_Forgot_Password();
	//login_With_Wrong_Credi();
	//HomePage_AutomationScripts.select_User_Menu();
	@Test
	void selectMyProfileDropdown() throws InterruptedException{
		HomePageAutomation.selectMyProfileDropdown();
	}
	@Test
	void testMysettingsDropdown(){
		HomePageAutomation.selectMysettingsDropdown();
	}
	
}
