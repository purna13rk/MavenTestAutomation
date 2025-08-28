package com.mars.Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
//hello
	public WebDriver driver;
	public static final String USERNAME = "kollipurnareddy1";
	public static final String AUTOMATE_KEY = "CUgggzdp2ZBrnXsVvzCh";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@BeforeSuite
	public void startBrowser() throws MalformedURLException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		//ChromeOptions dc = new ChromeOptions();
//		dc.setCapability("platform", Platform.MAC);
//		dc.setCapability("browserName", "Chrome");

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("os", "OS X");
		caps.setCapability("os_version", "Catalina");
		caps.setCapability("browser", "Safari");
		caps.setCapability("browser_version", "13.1");
		caps.setCapability("name", "kollipurnareddy1's First Test");
		driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://the-internet.herokuapp.com/");
	}

	@AfterSuite
	public void killBrowser() {
		driver.quit();
	}

}
