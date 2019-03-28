
package com.meta.javaBasic;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxBrowser {

	@Test
	public void main() {
		String geckoExePath = "C:\\Users\\Lokesh\\eclipse-workspace\\javaBasic\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.firefox.marionette",
				geckoExePath);
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://metacube.com/");
	}
}