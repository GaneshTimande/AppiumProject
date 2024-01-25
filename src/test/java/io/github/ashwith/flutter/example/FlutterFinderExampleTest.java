package io.github.ashwith.flutter.example;

import io.github.ashwith.flutter.FlutterFinder;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class FlutterFinderExampleTest {
	RemoteWebDriver driver;

	@BeforeMethod
	public void openApp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "RMX1921");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("app", "");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("appPackage", "dataon.decimal.aucc.uat");
		capabilities.setCapability("appActivity", "com.decimal.dataonflutter.MainActivity");
		capabilities.setCapability("udid", "402c1cde");
		capabilities.setCapability("platformVersion", "11");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		

		//DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability("platformName", "Android");
	//	capabilities.setCapability("deviceName","RMX1921");
		//capabilities.setCapability("app","C:\\\\Users\\\\Admin\\\\Downloads\\\\facebook123.apk");
		//capabilities.setCapability("automationName","Appium");
		//capabilities.setCapability("automationName","Flutter");
		//capabilities.setCapability("udid", "402c1cde");
		//capabilities.setCapability("platformVersion", "11");
		//capabilities.setCapability("appPackage", "com.ausmallfinancebank.amb");
		capabilities.setCapability("appPackage", "dataon.decimal.aucc.uat");
		capabilities.setCapability("appActivity", "com.decimal.dataonflutter.MainActivity");

//		//capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
//		capabilities.setCapability("appActivity", "com.decimal.dataonflutter.MainActivity");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("appium:platformVersion", "11.0");
//		capabilities.setCapability("appium:deviceName", "Realme xt");
//		capabilities.setCapability("appium:udid", "402c1cde");
//		capabilities.setCapability("appium:ensureWebviewsHavePages", true);
//		capabilities.setCapability("appium:nativeWebScreenshot", true);
//		capabilities.setCapability("appium:newCommandTimeout", 3600);
//		capabilities.setCapability("appium:connectHardwareKeyboard", true);
//
//		AndroidDriver driver = new  AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);	      //  FlutterFinder finder = new FlutterFinder(driver);
//
//		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));




	}

	@Test
	public void appiumFlutterTest() {
		FlutterFinder finder = new FlutterFinder(driver);
		WebElement element = finder.byValueKey("Username");

		element.click();
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
