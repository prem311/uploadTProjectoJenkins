package com.qa.testProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.qa.resources.ConstantVariables;

public class BaseTest {

	WebDriver driver;

	public BaseTest() {
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setUp() throws InterruptedException, MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeshwari.prem\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(ConstantVariables.URL);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
