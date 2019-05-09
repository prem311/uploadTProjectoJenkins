package com.qa.testProject;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.resources.ConstantVariables;

public class FirstSeleniumTest extends BaseTest {

	// @Test
	public void clickResources() {
		WebElement resources = driver.findElement(By.linkText("Careers"));
		String actualText = resources.getText();

		Assert.assertEquals(actualText, ConstantVariables.expectedText);
	}

	@Test
	public void findElements() throws InterruptedException {

		clickResources();
		getHeaderText();

	}

	// @Test
	public void getHeaderText() {

		List<WebElement> elements = driver.findElements(By.xpath("//li/span[@class='dropdown-space']"));

		System.out.println(elements.size());

	}
}
