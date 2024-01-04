package com.StepDefinitions;

import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.bella.utilities.Configurations;
import com.bella.utilities.FileUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestBase {

	public static RemoteWebDriver driver;

	Configurations config = new Configurations();

	public static RemoteWebDriver getDriver() {
		return driver;
	}

	@Before
	public void openBrowser() throws IOException {
		if (config.getBrowserName().equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (config.getBrowserName().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (config.getBrowserName().equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("Invalid browser name: " + config.getBrowserName());
		}

		driver.get(config.getAppUrl());
	//driver.get(config.getCheckOutUrl());
		driver.manage().window().maximize();

	}

	@After
	public void closeBrowser() {
		// driver.quit();
	}
}

/*
 * public static RemoteWebDriver driver;
 * 
 * public void setUp(String browserName) throws FileNotFoundException { FileUtil
 * file=new FileUtil(); Configurations config = new Configurations(); if
 * (browserName == null) { driver = new ChromeDriver(); } if
 * (browserName.equalsIgnoreCase("chrome")) { driver = new ChromeDriver(); }
 * else if (browserName.equalsIgnoreCase("firefox")) { driver = new
 * FirefoxDriver();
 * 
 * } else { System.out.println("Invalid browser name"); }
 * driver.get(config.getAppUrl());//By dynamic approach
 * //driver.get(file.getProperty("/src/main/resources/config.properties",
 * "app.url")); //System.out.println(config.getCredential());//username password
 * reading // driver.get(file.getProperty("app.url"));//hard coding with key
 * pass from getproperty method //
 * driver.get("https://demos.bellatrix.solutions/");//direct through url }
 * 
 * public void closeBrowser() { driver.quit(); }
 */
