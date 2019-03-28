package com.meta.javaBasic;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment6 {
	
	public WebDriver driver;
	String url = "http://automationpractice.com/index.php";
	
	
 @Test
 public void equaltest() 
 {
	int i=3, j=5;
	boolean a = i==j;
	System.out.println(a);
	Assert.assertEquals(a, false);
	System.out.println("3 and 5 are not equal");
 }
 
 @Test
 public void greater_test()
 {
	 int i=3, j=5;
	 boolean a = i>j;
	 System.out.println(a);
	 Assert.assertEquals(a, false);
	 System.out.println("3 is not greater then 5");  
 }
 
 @Test(priority = 1)
 
 public void palindrome_test()
 {
	  String org, rev="";  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter any name/string");
	  org = sc.nextLine();
	  
	  int l = org.length();
	  
	  for(int i=l-1; i>=0; i--)
	  {
		  rev = rev + org.charAt(i);
	  }
	  
	 boolean result = org.equals(rev);
	 
	 System.out.println(result);
	 
	 Assert.assertEquals(result, true);
	 System.out.println("Given string is palindrome");
	  
	 sc.close();
 }
 
 @Test
 public void contactus()
 {
	 	//String chromeExe = "C:\\Users\\Lokesh\\eclipse-workspace\\seleniumGoal\\Drivers\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", chromeExe);
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement contactLink = driver.findElement(By.cssSelector("#contact-link a"));
		wait.until(ExpectedConditions.visibilityOf(contactLink));
		contactLink.click();
		WebElement el = driver.findElement(By.cssSelector("#message"));
		boolean r = el.isDisplayed();
		System.out.println(r);
		Assert.assertEquals(r, true);
		System.out.println("You have landed on contact us page successfully");

 }
 
 @Test
 public void logo()
 {
	 	//String chromeExe = "C:\\Users\\Lokesh\\eclipse-workspace\\seleniumGoal\\Drivers\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", chromeExe);
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		
		WebElement logo = driver.findElement(By.id("header_logo"));
		Assert.assertEquals(logo.isDisplayed(), true);
		
		
		driver.findElement(By.id("header_logo")).click();
		String curl = driver.getCurrentUrl();
		
		boolean result = url.equals(curl);
		System.out.println(result);
		
		Assert.assertEquals(result, true);
		System.out.println("You are on homepage of the application");
		

 }

 @Test
 public void searchitem()
 {
	 	//String chromeExe = "C:\\Users\\Lokesh\\eclipse-workspace\\seleniumGoal\\Drivers\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", chromeExe);
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://automationpractice.com/index.php");
		WebElement text_box = driver.findElement(By.id("search_query_top"));
		text_box.sendKeys("ABCDEF");
		driver.findElement(By.name("submit_search")).click();
		
		String atext = driver.findElement(By.cssSelector(".alert.alert-warning")).getText();

		System.out.println(atext);
		
		String expected_r = "No results were found for your search \"ABCDEF\"" ;
		Assert.assertEquals(atext, expected_r);
		System.out.println("No search result is shown for given input");
 }
 
 @AfterClass
 public void closebrowser()
 {
	  driver.close();
 }
 
 @BeforeClass
 public void lauchbrowser()
 {
	String chromeExe = "C:\\Users\\Lokesh\\eclipse-workspace\\seleniumGoal\\Drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromeExe);
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
 }

}
