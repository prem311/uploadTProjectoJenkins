package com.qa.testProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.resources.ConstantVariables;
import com.qa.testProject.BaseTest;

public class IframeAssignment extends BaseTest {
	
	@Test
	public void testIframes()
	{
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to(ConstantVariables.navigateUrl);
		String title1 = driver.getTitle();
		System.out.println(title1);
		String titleOfFrame1 = driver.switchTo().frame(0).getTitle();
		System.out.println(titleOfFrame1 + "********************");
		
		WebElement iframe1Text = driver.findElement(By.xpath("//div[@class='wpb_wrapper']/h2/span[contains(text(), 'Specflow')]"));
		String actualText = iframe1Text.getText();
		System.out.println(actualText + "**********************");
		String expectedText = "Specflow C-Sharp";
		Assert.assertEquals(actualText, expectedText);
		
		driver.switchTo().parentFrame();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size() + "&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		String titleOfFrame2 = driver.switchTo().frame(1).getTitle();
		System.out.println(titleOfFrame2);
		
		WebElement iframe2Text = driver.findElement(By.xpath("//aside[@class='widget']/h3[contains(text(), 'Interactions')]"));
		String actualText2 = iframe2Text.getText();
		System.out.println(actualText2 + "**********************");
		String expectedText2 = "Interactions";
		Assert.assertEquals(actualText2, expectedText2);
	}
	
	

}
