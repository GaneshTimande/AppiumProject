package com.tutorialsninja.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tutorialsninja.qa.pages.LoginPage;
import com.tutorialsninja.qa.utils.Utilities;
import com.util.Base;
import com.util.JiraPolicy;




public class LoginTest extends Base{
	
	LoginPage loginPage;
	com.tutorialsninja.qa.pages.AccountPage AccountPage;
	public LoginTest() {
		super();
	}
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
		loginPage = new LoginPage(driver);
	//	loginPage = homePage.naviageToLoginPage();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority=1, enabled=true)
	
	public void HomePageTitleTest(){
		//extentTest = extent.startTest("loginPageTitleTest");
		String title = loginPage.validateLoginPageTitle1();
		Assert.assertEquals(title, "Vahana Accounts");
	}

	

	@JiraPolicy(logTicketReady=true)
	
	@Test(priority=2,dataProvider="validCredentialsSupplier", enabled=true)
	public void verifyLoginWithValidCredentials(String email,String password) throws InterruptedException {
	
		 AccountPage = loginPage.login(email, password);
		//Assert.assertTrue(accountPage.getDisplayStatusOfEditYourAccountInformationOption(),"Edit Your Account Information option is not displayed");
	
	}

	@DataProvider(name="validCredentialsSupplier")
	public Object[][] supplyTestData() {
		
		Object[][] data = Utilities.getTestDataFromExcel("Login");
		return data;
	}
	
	

}
