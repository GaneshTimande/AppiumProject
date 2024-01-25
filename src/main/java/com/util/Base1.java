package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import com.tutorialsninja.qa.utils.Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.github.ashwith.flutter.FlutterFinder;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	
	public static AndroidDriver driver;
	public Properties prop;
	public Properties dataProp;
	public static FlutterFinder finder;
		
	public Base1() {
		
		prop = new Properties();
		File propFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\tutorialsninja\\qa\\config\\config.properties");
		
		dataProp = new Properties();
		File dataPropFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\tutorialsninja\\qa\\testdata\\testdata.properties");
		
		try {
			FileInputStream dataFis = new FileInputStream(dataPropFile);
			dataProp.load(dataFis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
	}
	
	public AndroidDriver initializeBrowserAndOpenApplicationURL() throws MalformedURLException {
			
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("deviceName","RMX1921");
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("deviceName","RMX3741");
		//capabilities.setCapability("app","C:\\\\Users\\\\Admin\\\\Downloads\\\\facebook123.apk");
		capabilities.setCapability("automationName","Appium");
		//capabilities.setCapability("udid", "402c1cde");
		//capabilities.setCapability("platformVersion", "11");
		
		capabilities.setCapability("appPackage", "dataon.decimal.aucc.uat");
		//capabilities.setCapability("appPackage", "dataon.decimal.demovflow.sand_box");
	
		capabilities.setCapability("appActivity", "com.decimal.dataonflutter.MainActivity");
		//capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		//capabilities.setCapability("appActivity", "com.decimal.dataonflutter.MainActivity");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("appium:platformVersion", "11.0");
		capabilities.setCapability("appium:platformVersion", "13.0");
//		capabilities.setCapability("appium:deviceName", "Realme xt");
//		capabilities.setCapability("appium:udid", "402c1cde");
		capabilities.setCapability("appium:ensureWebviewsHavePages", true);
		    capabilities.setCapability("appium:nativeWebScreenshot", true);
		    capabilities.setCapability("appium:newCommandTimeout", 3600);
		    capabilities.setCapability("appium:connectHardwareKeyboard", true);
		
		
		 driver = new  AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		 FlutterFinder finder = new FlutterFinder(driver);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		return driver;
		
	}
	
	public static void switchContext(String context) {
        driver.getContext();
        Set<String> con = driver.getContextHandles();
        for (String c : con) {
            if (c.contains(context)) {
                driver.context(c);
                break;
            }
        }

	}
	
	
	
}




