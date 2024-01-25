package com.qa.testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.ContactPage;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.util.Base1;
import com.util.JiraPolicy;

import io.appium.java_client.android.AndroidDriver;

public class ContactPageTest extends Base1 {

	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	DashboardPage dashboardPage;
	
	
	
	   
	public ContactPageTest(){
			super();
			
	}
	
	public AndroidDriver driver;
	@BeforeMethod
	public void setUp() throws InterruptedException, MalformedURLException {
		
		driver = 	initializeBrowserAndOpenApplicationURL();
		contactPage = new ContactPage();
		 dashboardPage = new DashboardPage();
			loginPage = new LoginPage();
			homePage = loginPage.login();
	}
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)
	public void verifyContactsPageLabel() throws InterruptedException{
		contactPage.SendOtpVerification();
		
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
}
