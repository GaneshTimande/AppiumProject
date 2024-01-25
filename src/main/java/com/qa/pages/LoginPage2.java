package com.qa.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.HomePage;
import com.util.Base1;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.github.ashwith.flutter.FlutterElement;
import io.github.ashwith.flutter.FlutterFinder;

public class LoginPage2 extends Base1{

		public LoginPage2(){
			PageFactory.initElements(driver, this);
		}
		
		
		
		public HomePage login() throws InterruptedException{
			Thread.sleep(10000);
			System.out.println("abcd");
			 
		       
			///element.sendKeys("12344");
			//System.out.println("zalelelelelelel");
			
			
			Actions action1 = new Actions(driver); 
			 WebElement username =driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
			 username.click();
		     action1.sendKeys(username, "981723").build().perform();//981743
		     	
		     	
		   
		      	
		      	WebElement password =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
		      	password.click();
		      	action1.sendKeys(password, "Bank@345").build().perform();//981743
		      	System.err.println(driver.isKeyboardShown()); 
		      	
		      	
		      	driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.ENTER));
		     	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")).click();
		     	 Thread.sleep(2000);
		     	//driver.findElement(By.xpath("	\r\n"+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
			
			
//			
//			 Actions action1 = new Actions(driver); 
//			 
//		     	WebElement username =driver.findElement(By.xpath("//*[contains(@text,'Username')]"));
//	
//	     	//WebElement username =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
//		     	username.click();
//     	     	action1.sendKeys(username, "981723").build().perform();//981743
////		     	
//		     	
//		    // 	 Actions action2 = new Actions(driver); 
//		      	
//		      	WebElement password =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
//		      	password.click();
//		      	action1.sendKeys(password, "Bank@345").build().perform();//981743
//		      	System.err.println(driver.isKeyboardShown()); 
//		      	
//		      	
//		      	driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.ENTER));
//		     	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")).click();
//		     	 Thread.sleep(2000);
//		     	//driver.findElement(By.xpath("	\r\n"+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
//			    	
			return new HomePage();
		}


		
	    }