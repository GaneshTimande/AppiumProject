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
import org.openqa.selenium.support.FindBy;
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
import io.appium.java_client.android.nativekey.AndroidKey;
import io.github.ashwith.flutter.FlutterElement;
import io.github.ashwith.flutter.FlutterFinder;

public class DashboardPage extends Base1{

//
//	@FindBy(xpath="//android.widget.EditText[@index='0']")//
//	private WebElement Mobile;//
//	
//	@FindBy(xpath="//android.widget.EditText[@index='0']")//
//	private WebElement Email;//
//	
//	@FindBy(xpath="//android.widget.Button[@content-desc=\"Send OTP for Email Verification\"]")//1
//	private WebElement Sendotp;//
//	
//	
//	@FindBy(xpath="//android.view.View[@content-desc=\"Proceed\"]")//1
//	private WebElement Proccedbutton;//
	
	
	
	

	// Initializing the Page Objects:
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}


//	
//	 public boolean emailFieldDisplayed() {
//	    	boolean e = Email.isDisplayed();
//	    	
//			return e;
//	        // Verify the existence of Mobile Number field
//	       
//	    }
//	
//	 public boolean mobileFieldDisplayed() {
//	    	boolean m = Mobile.isDisplayed();
//	    	
//			return m;
//	        // Verify the existence of Mobile Number field
//	       
//	    }
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	public ContactPage VerifyHomePage11() throws InterruptedException{

		driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//android.view.View[@content-desc=\"CC Onboarding\"]/android.widget.Button")).click();
		Thread.sleep(10000);





		WebElement Mobile = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
		Mobile.click();
		Mobile.sendKeys("9960172176");//9527761018 9999990998 9999990994 9999990996 7820803597
		Thread.sleep(10000);
		System.out.println("Mobile no entered");
		Thread.sleep(4000);





		WebElement Email = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
		Email.click();
		Email.sendKeys("timandeganesh27@gmail.com");

		System.out.println("Email Entered successfully");





		WebElement Sendotp = driver.findElement(By.xpath("	\r\n"
				+ "//android.widget.Button[@content-desc=\"Send OTP for Email Verification\"]"));
		Sendotp .click();
		Thread.sleep(9000);

		System.out.println("Send otp Entered successfully");


		Thread.sleep(1000);
		driver.findElement(By.xpath("	\r\n"
				+ "//android.view.View[@content-desc=\"Proceed\"]")).click();
		System.out.println("Procced button Clicked");
		Thread.sleep(1000);
		//		-----------------------------------

		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Salaried\"]/android.widget.RadioButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Proceed\"]")).click();
		Thread.sleep(2000);
		//----------------------------------------
		Actions action2 = new Actions(driver); 



		//		switchContext("FLUTTER");
		//		FlutterFinder finder = new FlutterFinder(driver);
		//		FlutterElement button_login = finder.bySemanticsLabel("Aadhaar Number");
		//		//FlutterElement button_login = finder.bySemanticsLabel("My DashBoard");D
		//	//	FlutterElement button_login=finder.byValueKey(1);
		//		button_login.click();
		//		System.out.println("button_login");
		//	finder.pageBack();
		//		
		//		
		//		System.out.println("d");



		//	//-----------
		//		WebElement Pan =	driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
		//
		//		Pan.click();
		//		action2.sendKeys(Pan, "APFPT3234H").build().perform();//981743  DZOPR2639E APFPT3234H AEGPT2136L EZWPS1656D CKUPM3305E HLBPS5855L
		//		//Pan.sendKeys("APFPT3234H");
		//		System.out.println("Pan Entered");
		//		Thread.sleep(9000);
		//		//------------------------










		WebElement AAdhar=	driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));

		AAdhar.click();
		action2.sendKeys(AAdhar, "5180 3557 6456").build().perform();//981743

		System.out.println("Aadhar Entered");
		Thread.sleep(5000);

		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"YES\"]"));
		WebElement el = driver.findElement(AppiumBy.accessibilityId("YES"));
		el.click();
		System.out.println("YES");


		WebElement Pan =driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));

		Pan.click();
		action2.sendKeys(Pan, "APFPT3234H").build().perform();//981743  DZOPR2639E APFPT3234H AEGPT2136L EZWPS1656D CKUPM3305E HLBPS5855L
		//Pan.sendKeys("APFPT3234H");
		System.out.println("Pan Entered");
		Thread.sleep(9000);







		driver.findElement(By.xpath("//android.widget.CheckBox[@index='1']")).click();
		Thread.sleep(1000);
		System.out.println("checkbox");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ok\"]")).click();
		Thread.sleep(1000);
		System.out.println("ok click");

		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Proceed for Dedupe\"]")).click();
		Thread.sleep(1000);
		System.out.println("Dedupe");

		//driver.switchTo().alert().accept();

		Thread.sleep(4000);

		WebElement ok = driver.findElement(AppiumBy.accessibilityId("OK"));
		//	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ok\"]")).click();
		ok.click();
		System.out.println("ok click");
		Thread.sleep(4000);
		WebElement lead	=driver.findElement(By.xpath("//android.view.View[@index='0']"));
		//	WebElement lead = driver.findElement(AppiumBy.accessibilityId("GANESH MAROTI TIMANDE CRN: 28585388 INDIVIDUAL - FULL KYC"));
		//WebElement lead =driver.findElement(By.xpath("//android.view.View[@content-desc=\"GANESH MAROTI TIMANDE CRN: 28585388 INDIVIDUAL - FULL KYC\"]"));
		lead.click();

		System.out.println("lead click");

		Thread.sleep(3000);



		WebElement ok1=driver.findElement(By.xpath("//android.widget.Button[@index='1']"));
		//WebElement ok1 = driver.findElement(AppiumBy.accessibilityId("OK"));
		//WebElement ok1 =	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ok\"]"));
		ok1.click();
		System.out.println("ok1 click");


		Thread.sleep(2000);

		WebElement ok2 = driver.findElement(AppiumBy.accessibilityId("OK"));
		//WebElement ok2 =	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ok\"]"));
		ok2.click();

		System.out.println("ok2 click");
		Thread.sleep(7000);
		//			WebElement ok3 = driver.findElement(AppiumBy.accessibilityId("OK"));
		//			//WebElement ok3 = 	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ok\"]"));
		//				ok3.click();
		//				System.out.println("ok3 click");


		
		
		driver.findElement(AppiumBy.accessibilityId("--SELECT--")).click();
		System.out.println("select click");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Payslip Sourcing - PS")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Proceed")).click();
		Thread.sleep(2000);




		Actions action1 = new Actions(driver); 
		WebElement father =driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
		father.click();
		action1.sendKeys(father, "MAROTI TIMANDE ").build().perform();//981743

		System.out.println("FATHER NAME "); 
		Thread.sleep(3000);

	
		WebElement mother =driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
		mother.click();
		action1.sendKeys(mother, "SULOCHANA").build().perform();//981743OK
		System.out.println("MOTHER NAME");
		
		Thread.sleep(3000);
		WebElement Spouse=driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
	//	WebElement Spouse=driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));//0 AHE 
		Spouse.click();
		action1.sendKeys(Spouse, "ANJALI TIMANDE").build().perform();
		
		System.out.println("SPOUSE NAME ");
		System.out.println("Done123");
		
//		Thread.sleep(9000);
//
////		//WebElement date =driver.findElement(By.xpath("//android.widget.EditText[@index='5']"));
////		
////		date.click();
////		action1.sendKeys(date, "27 OCT 87").build().perform();//981743OK
//		
//	//	System.out.println("DATE OF BIRTH ");
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//android.view.View[@content-desc=\"No\"]/android.widget.RadioButton")).click();
//		Thread.sleep(2000);
//		System.out.println("radio button");
//
//		Thread.sleep(9000);
////		WebElement INCOME =driver.findElement(By.xpath("//android.widget.EditText[@index='5']"));//1
////		//INCOME.clear();
////		INCOME.click();
////		action1.sendKeys(INCOME, "700000").build().perform();//981743OK
////		
//
//		Thread.sleep(4000);
//		driver.findElement(AppiumBy.accessibilityId("Proceed")).click();
//		System.out.println("PROCCED");
//		
//		
//		
//		
//		WebElement radiobutton =driver.findElement(By.xpath("//android.widget.RadioButton[@index='0']"));//3/4
//		 radiobutton.click();
//		 Thread.sleep(4000);
//		 WebElement office =driver.findElement(By.xpath("//android.widget.RadioButton[@index='0']"));
//		office.click();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		////	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ok\"]")).click();
		////		System.out.println("done");
		////		Thread.sleep(6000);
		////		driver.findElement(By.xpath("//android.widget.RadioButton[@index='0']")).click();
		//	 driver.findElement(AppiumBy.accessibilityId("No")).click();
		//	 System.out.println("xanccccccccccc");
		////		// driver.findElement(By.xpath("//android.view.View[@content-desc=\"No\"]")).click();
		////		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"No\"]")).click();
		//		Thread.sleep(5000);
		//		driver.findElement(AppiumBy.accessibilityId("Proceed")).click();
		//		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"Proceed\"]")).click();
		//		Thread.sleep(3000);
		//       System.out.println("abcd");
		//       driver.findElement(AppiumBy.accessibilityId("--SELECT--")).click();
		//       System.out.println("slect click");
		//       driver.findElement(AppiumBy.accessibilityId("Payslip Sourcing - PS")).click();
		//       System.out.println("abcccccccchhh");
		//       Thread.sleep(5000);
		//       driver.findElement(AppiumBy.accessibilityId("Proceed")).click();
		//       System.out.println("last:");
		//
		////driver.findElement(By.xpath("//android.view.View[@content-desc=\"Yes\"]/android.widget.RadioButton")).click();
		////		//driver.findElement(By.xpath("//android.widget.RadioButton[@index='0']")).click();
		////		Thread.sleep(1000);
		//////
		////		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Proceed\"]")).click();
		//////		Thread.sleep(3000);
		//////		
		////System.out.println(" procced");
		//////
		////
		////		Select drpCountry = new Select(driver.findElement(By.xpath("/android.view.View[@content-desc=\"--SELECT--\"]")));
		////		//drpCountry.selectByVisibleText("Payslip Sourcing - PS");
		////		drpCountry.deselectByIndex(1);
		////		Thread.sleep(3000);
		////		System.out.println("AB");
		////		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Proceed\"]")).click();
		////		Thread.sleep(3000);
		////		
		////		
		//	//------------------------------------------------------------------
		//		
		//		
		////		//Click on dropdown to open list.
		////		  driver.findElement(By.xpath("/android.view.View[@content-desc=\"--SELECT--\"]")).click();
		////		  Thread.sleep(3000);
		////		  //Select item "Mars" from drop down list.
		//		 // driver.findElement(By.xpath("//android.view.View[@content-desc=\"Payslip Sourcing - PS\"]")).click();
		////		
		////	     List<WebElement> options = driver.findElements(By.xpath("/android.view.View[@content-desc=\"--SELECT--\"]"));
		////	       
		////	        System.out.println("Total number of options available in dropdown:"+options.size());
		////	       
		////	       
		////	        for(WebElement e:options)
		////	        {
		////	            String val=e.getText();
		////	           
		////	            if(val.equalsIgnoreCase("Payslip Sourcing - PS"))
		////	            {
		////	                e.click();
		////	               
		////	        		
		////	                break;
		////	            }
		////	        }
		////	       
		////	        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Proceed\"]")).click();
		////    		Thread.sleep(3000);  
		return new ContactPage();
	} 

}








