package com.meta.javaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment5 {
	@Test
	public void main() {
		String chromeExe = "C:\\Users\\Lokesh\\eclipse-workspace\\seleniumGoal\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExe);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Element0"))));
		element.click();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
	}

}
