package com.qa.testcases;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.pages.ContactPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.tutorialsninja.qa.listeners.MyListeners;
import com.util.Base1;
import com.util.JiraPolicy;

import io.appium.java_client.android.AndroidDriver;
@Listeners(MyListeners.class)
public class DashBoardPageTest extends Base1{

	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	DashboardPage dashboardPage;



	public DashBoardPageTest(){
		super();

	}

	public AndroidDriver driver;
	@BeforeClass
	//@BeforeMethod
	public void setUp() throws InterruptedException, MalformedURLException {

		driver = 	initializeBrowserAndOpenApplicationURL();
		contactPage = new ContactPage();
		dashboardPage = new DashboardPage();
		loginPage = new LoginPage();
		
		homePage = loginPage.login();
		
	}
	
	
	
	
//
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority=1, enabled=true)
//	public void mobileFieldDisplayedTest() throws InterruptedException, AWTException{
//		
//		
//	
//		 Assert.assertTrue(dashboardPage.mobileFieldDisplayed(), "Mobile Field is not displayed on the Login screen");
//    
//	}
//	
//	
//
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority=2, enabled=true)
//	public void emailFieldDisplayedTest() throws InterruptedException, AWTException{
//		
//		
//	
//		 Assert.assertTrue(dashboardPage.emailFieldDisplayed(), "Email Field is not displayed on the Login screen");
//    
//	}
	
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority=1, enabled=true)
//	
//	public void HomePageTitleTest() throws InterruptedException{
////		//extentTest = extent.startTest("loginPageTitleTest");
////		String title =  homePage.VerifyHomePage();
//		Assert.assertEquals(false, true);
//	}
//	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=0, enabled=true)
	public void verifyContactsPageLabel() throws InterruptedException{
		contactPage= dashboardPage.VerifyHomePage11();
	
	}


//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//	}
//
	@AfterClass
	public void tearDown(){
		driver.quit();
	}



}
