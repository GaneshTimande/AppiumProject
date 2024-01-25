package com.qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.Email;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import com.tutorialsninja.qa.listeners.MyListeners;
import com.util.Base1;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.github.ashwith.flutter.FlutterElement;
import io.github.ashwith.flutter.FlutterFinder;

public class DashboardPage2 extends Base1{


	// Initializing the Page Objects:
	public DashboardPage2() {
		PageFactory.initElements(driver, this);
	}


	public void VerifyHomePage111() throws InterruptedException{
		Thread.sleep(6000);
		
		

		
	System.out.println(" let get start");

//
//Thread.sleep(9000);
//WebElement credit = driver.findElement(By.xpath("//android.view.View[@index='0']"));
//credit.click();
//Thread.sleep(2000);
//System.out.println("credit click");


//
//switchContext("FLUTTER");
//FlutterFinder finder = new FlutterFinder(driver);
//
//FlutterElement button_login = finder.byValueKey("Login");
////	FlutterElement element = finder.byValueKey("Username");
//button_login.click();

//FlutterElement element = finder.byText("Username");
// FlutterElement element =  finder.byValueKey("Username");
//  FlutterElement element =  finder.bySemanticsLabel("Username");
//  FlutterElement element =  finder.byText("Username");

//FlutterElement element =  finder.byValueKey("Username");
//FlutterElement element =  finder.byValueKey("Username");




//   FlutterFinder finder = new FlutterFinder(driver);
//   // WebElement element = finder.bySemanticsLabel("Username");
//    WebElement element = finder.bySemanticsLabel("Username");
//    element.click();
//WebElement Dashboard = driver.findElement(By.xpath("//android.view.View[@index='1']")); //right xpath
////Dashboard.click(); // working but not showing action
//String DashboardTitle= Dashboard.getText();
//System.out.println(DashboardTitle);

//WebElement Dashboard = driver.findElement(By.xpath("//android.view.View[@content-desc=\"My Dashboard Tab 2 of 2\"]"));
//WebElement Dashboard = driver.findElement(By.xpath("//*[contains(@text,'My Dashboard ')]"));
//WebElement Dashboard = driver.findElement(AppiumBy.accessibilityId("My Dashboard Tab 2 of 2"));


//JavascriptExecutor js = (JavascriptExecutor)driver; 
//js.executeScript("arguments[0].scrollIntoView()", Dashboard);
//Dashboard.click();// not wokring

//TouchAction t =new TouchAction(driver);
//t.tap(TapOptions.tapOptions().withElement(ElementOption.element(Dashboard))).perform();//working
//
//
//
//Actions action = new Actions(driver);
//action.moveToElement(Dashboard);
//action.click();
//action.perform();// working 
//



Thread.sleep(10000);
System.out.println("Dashboard Click");


//Actions action = new Actions(driver);
//action.moveToElement(Dashboard);
//action.click();
//action.perform();

//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//android.view.View[@index='1']")));




Thread.sleep(10000);
WebElement PendingLeads = driver.findElement(By.xpath("//android.view.View[@index='0']"));
PendingLeads .click();
Thread.sleep(10000);
System.out.println("PendingLeads Click");
switchContext("FLUTTER"); 
FlutterElement element = finder.byText("Search");
element.sendKeys("abcd");
//driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).sendKeys("abcd");

Actions action1 = new Actions(driver);
//WebElement username =driver.findElement(By.xpath("//android.view.View[@index='0']"));
//	username.click();
//	//username.sendKeys("anjali");
//	action1.sendKeys(username, "Anjali Ganesh Timande").build().perform();//981743
//	System.out.println("search");
//	Thread.sleep(10000);
//	
//	 
  	
//driver.findElement(By.xpath("//android.view.View[@index='0']"));


String str = "anjali";
WebElement e=driver.findElement(new AppiumBy.ByAndroidViewTag("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + str +"\").instance(0))"));
e.click(); 

	
	
  	
  	
	
	
	WebElement leads=driver.findElement(By.xpath("	\r\n"
			+ "//android.view.View[@content-desc=\"ANJALI GANESH TIMANDE Salaried A98172320230517190057917 9527761018 CA17052328008\"]"));////android.view.View[@index='0']
	
	leads.click();
	
  	 
	
	
	System.out.println("leads click");
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//android.view.View[@content-desc=\"My Dashboard Tab 2 of 2\"]")));
//	//((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
//	element.click();
////
////JavascriptExecutor js = (JavascriptExecutor)driver;	
//// 	
////js.executeScript("arguments[0].click();", element);
////
////System.out.println(" let get start1222");
//
////driver.findElement(AppiumBy.accessibilityId("Pending Leads You have 81 pending leads till date")).click();
//driver.findElement(By.xpath( "//android.view.View[@content-desc=\"My Dashboard Tab 2 of 2\"]"));
//System.out.println("82 leads click");
	} 

}








