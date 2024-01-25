package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.util.Base1;

public class ContactPage extends Base1{

	
	// Initializing the Page Objects:
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	
public void SendOtpVerification() throws InterruptedException{
	WebElement Mobile = driver.findElement(By.xpath("//android.view.View[@content-desc=\"￼ ￼ Mobile Number (+91)* ￼ ￼ Email ID*\"]/android.widget.EditText[1]"));
	Mobile.sendKeys("9960172176");
	WebElement Email =	driver.findElement(By.xpath("//android.view.View[@content-desc=\"￼ ￼ Mobile Number (+91)* ￼ ￼ Email ID*\"]/android.widget.EditText[2]"));
	Email.sendKeys("timandeganesh27@gmail.com");
	driver.findElement(By.xpath("//android.view.View[@content-desc=\"￼ ￼ Mobile Number (+91)* ￼ ￼ Email ID*\"]")).click();
		
	}

	
}
		
	
	
	
		
	
	
	
	

