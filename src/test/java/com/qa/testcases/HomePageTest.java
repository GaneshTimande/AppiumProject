package com.qa.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.tutorialsninja.qa.listeners.MyListeners;
import com.util.Base1;
import com.util.JiraPolicy;

import io.appium.java_client.android.AndroidDriver;
@Listeners(MyListeners.class)
public class HomePageTest extends Base1{
	LoginPage loginPage;
	HomePage homePage;
//	TestUtil testUtil;
	//ContactsPage contactsPage;
	DashboardPage dashboardPage;
	public HomePageTest() {
		super();
	}

	public AndroidDriver driver;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException, InterruptedException {
		driver = 	initializeBrowserAndOpenApplicationURL();
//		testUtil = new TestUtil();
		 dashboardPage = new DashboardPage();
		loginPage = new LoginPage();
		homePage = loginPage.login();
	}
	
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)
	
	public void HomePageTitleTest() throws InterruptedException{
//		//extentTest = extent.startTest("loginPageTitleTest");
//		String title =  homePage.VerifyHomePage();
		Assert.assertEquals(false, true);
	}
	
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=2, enabled=true)
	public void verifyHomeDashboard() throws InterruptedException{
		//dashboardPage =homePage.Dashboard();
		dashboardPage =homePage.Dashboard();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}