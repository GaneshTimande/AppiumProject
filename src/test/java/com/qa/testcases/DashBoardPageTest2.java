package com.qa.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.pages.ContactPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.DashboardPage2;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.tutorialsninja.qa.listeners.MyListeners;
import com.util.Base1;
import com.util.JiraPolicy;

import io.appium.java_client.android.AndroidDriver;
@Listeners(MyListeners.class)
public class DashBoardPageTest2 extends Base1{

	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	DashboardPage2 dashboardPage2;
	

	   
	public DashBoardPageTest2(){
			super();
			
	}
	
	public AndroidDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException, MalformedURLException {
		
		driver = 	initializeBrowserAndOpenApplicationURL();
		contactPage = new ContactPage();
		 dashboardPage2 = new DashboardPage2();
			loginPage = new LoginPage();
			homePage = loginPage.login();
	}
	
	@JiraPolicy(logTicketReady= false)
	@Test(priority=1, enabled=true)
	public void verifyContactsPageLabel() throws InterruptedException{
		dashboardPage2.VerifyHomePage111();
		
	}
	 
 
//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//	}
	
	
	
	
}
