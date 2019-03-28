package com.meta.javaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

@Test
public class IeBrowser {
	public void main()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Lokesh\\eclipse-workspace\\javaBasic\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.metacube.com/");
	}
}
