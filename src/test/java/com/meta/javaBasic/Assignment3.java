package com.meta.javaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Assignment3 {

	public void main() {
		String chromeExe = "C:\\Users\\Lokesh\\eclipse-workspace\\seleniumGoal\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExe);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
		By locator = By.linkText("HOME");
		driver.findElement(locator).click();
		// driver.findElement(By.xpath("//a[@href='http://www.seleniumframework.com/']")).click();
		driver.navigate().back();

		WebElement element = driver.findElement(By.linkText("This is a link"));
		String title = element.getAttribute("title");
		System.out.println(title);

		driver.findElement(By.xpath("//div[@class='textwidget']//input[@name='email']"))
				.sendKeys("lokesh.kumar992@gmail.com");
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		System.out.println("User have clicked on Subscribe button");

		driver.findElement(By.name("name")).sendKeys("Lokesh Gupta");
		driver.findElement(By.id("presscore-contact-form-widget-3")).findElement(By.name("email"))
				.sendKeys("lokesh.kumar992@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9782527795");
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Metacube");
		driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("QA Engineer");

		driver.findElement(By.partialLinkText("Sub")).click();

	}

}
