package com.qa.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.pages.HomePage;
import com.util.Base1;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.github.ashwith.flutter.FlutterElement;
import io.github.ashwith.flutter.FlutterFinder;

public class LoginPage extends Base1{

	@FindBy(xpath="//android.widget.EditText[@index='01']")//1
	private WebElement username;//
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")//
	private WebElement password;//
	@FindBy(xpath="//1android.widget.Button[@content-desc=\"LOGIN\"]")//1
	private WebElement login;//
	
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	  
	    public boolean usernameFieldDisplayed() {
	    	boolean s = username.isDisplayed();
	    	
			return s;
	        // Verify the existence of Mobile Number field
	       
	    }
	    public boolean usernameFieldClickable() {
	    	boolean c = username.isEnabled();
	    	
			return c;
	        // Verify the existence of Mobile Number field
	       
	    }
	    
	    
	    
	    
	    public boolean passwordFieldDisplayed() {
	    	boolean pass = password.isDisplayed();

			return pass;
	        // Verify the existence of Mobile Number field
	       
	    }
	    public boolean loginFieldDisplayed() {
	    	boolean log = login.isDisplayed();

			return log;
	        // Verify the existence of Mobile Number field
	       
	    }
	    
	    

	
	

	public HomePage login() throws InterruptedException{

		Actions action1 = new Actions(driver); 
		WebElement username =driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));


		username.click();

		action1.sendKeys(username, "981723").build().perform();//981743 //909513//981723 




		WebElement password =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
		password.click();
		action1.sendKeys(password, "Bank@678").build().perform();//981743 Bank@345//Bank@678
		//System.err.println(driver.isKeyboardShown()); 


		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("	\r\n"+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();


		Thread.sleep(9000);

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