package com.tutorialsninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement emailAddressField;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	private WebElement contiButton;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	

	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public String validateLoginPageTitle1(){
		return driver.getTitle();
	}

	
	public AccountPage login(String emailText,String passwordText) throws InterruptedException {
		
		emailAddressField.sendKeys(emailText);
		Thread.sleep(2000);
		contiButton.click();
		Thread.sleep(1000);
		passwordField.sendKeys(passwordText);
		Thread.sleep(2000);
		loginButton.click();
		return new AccountPage(driver);
		
	}
	
	

}
