package com.meta.javaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowser {

	@Test
	public void main() {	
		String chromeExePath = "C:\\Users\\Lokesh\\eclipse-workspace\\javaBasic\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", 
				chromeExePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://metacube.com/");
		
		driver.findElement(By.id("social2")).click();
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().to("http://metacube.com/");
		
		// Refresh browser
		driver.navigate().refresh();

		// Close browser
		driver.close();
		
	}
}
