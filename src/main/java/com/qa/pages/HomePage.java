package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import com.util.Base1;



public class HomePage  extends Base1{
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String VerifyHomePage() throws InterruptedException{
		
		return driver.getTitle();
		
	}

		

	
public  DashboardPage Dashboard() throws InterruptedException{
		driver.findElement(By.xpath("	\r\n"
				+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"CC Onboarding\"]/android.widget.Button")).click();
		//Thread.sleep(1000);
		return new DashboardPage ();
	}

}
