package com.meta.javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment4 {

	@Test
	public void main() {
		String chromeExe = "C:\\Users\\Lokesh\\eclipse-workspace\\seleniumGoal\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExe);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();

		// java.util.List<WebElement> textboxes =
		// driver.findElements(By.xpath("//input[@type='text']"));
		// System.out.println(textboxes.size());

		System.out.println(driver.findElements(By.xpath("//input[@type='text']")).size());

		System.out.println(driver.findElement(By.xpath("//*[@id='colorVar']")).getCssValue("background-color"));

		System.out.println(driver.findElements(By.cssSelector(".wpb_wrapper button")).size());

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i <= links.size()-1; i++) {
			if (links.get(i).getText().equals("Setup First Project")) {
				System.out.println("index of 'Setup First Project' is "  + i);
				System.out.println(links.get(i).getText());
			}
		}

		List<WebElement> buttons = driver.findElements(By.cssSelector("#page button"));
		System.out.println(buttons.get(5).getText());
		System.out.println(buttons.get(8).getText());

	}

}
