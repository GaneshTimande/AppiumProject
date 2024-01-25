package com.qa.testcases;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.tutorialsninja.qa.listeners.MyListeners;
import com.util.Base1;
import com.util.JiraPolicy;

import io.appium.java_client.android.AndroidDriver;
@Listeners(MyListeners.class)
public class LoginPageTest extends Base1 {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	public AndroidDriver driver;
	@BeforeClass
	//@BeforeMethod
	public void setUp() throws MalformedURLException{
		driver = initializeBrowserAndOpenApplicationURL();
		loginPage = new LoginPage();
		
		
	}

	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)
	public void usernameFieldDisplayedTest() throws InterruptedException, AWTException{
		
		
	
		 Assert.assertTrue(loginPage.usernameFieldDisplayed(), "Mobile Number field is not displayed on the Login screen");
    
	}
	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)
	public void usernameFieldClickableTest() throws InterruptedException, AWTException{
		
		
	
		 Assert.assertTrue(loginPage.usernameFieldClickable(), "Mobile Number field is not Clickable on the Login screen");
    
	}
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=2, enabled=true)
	public void passwordFieldDisplayedTest() throws InterruptedException, AWTException{
		
		
	
		 Assert.assertTrue(loginPage.passwordFieldDisplayed(), "password Number field is not displayed on the Login screen");
    
	}
	@JiraPolicy(logTicketReady=true)
	@Test(priority=3, enabled=true)
	public void loginFieldDisplayedTest() throws InterruptedException, AWTException{
		
		
	
		 Assert.assertTrue(loginPage.loginFieldDisplayed(), "Login button is not displayed on the Login screen");
    
	}
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=4, enabled=true)
	public void loginTest() throws InterruptedException, AWTException{
		
		homePage = loginPage.login();
	
	
	}

	@AfterClass
	//@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
