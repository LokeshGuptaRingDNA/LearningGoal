package com.meta.javaBasic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.*;

public class Assign7 {
	WebDriver driver;
	float r1, r2, r3;

	public static void main(String[] args) 
	
	{
		Assign7 obj = new Assign7();
		
		obj.valetparking();	
		obj.economyparking();
		obj.subtract();

	}
	
	public void formfill()
	{
		driver.findElement(By.id("EntryTime")).clear();
		driver.findElement(By.id("EntryTime")).sendKeys("2:00");
		
		List<WebElement> l1 = driver.findElements(By.name("EntryTimeAMPM"));
		l1.get(1).click();
		
		driver.findElement(By.cssSelector("input[value = 'PM']")).click();
		
				
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String d = formatter.format(date);
		System.out.println(d);
		
		
		driver.findElement(By.id("EntryDate")).clear();
		driver.findElement(By.id("EntryDate")).sendKeys(d);
		
		
		driver.findElement(By.id("ExitTime")).clear();
		driver.findElement(By.id("ExitTime")).sendKeys("3:00");
		List<WebElement> l2 = driver.findElements(By.name("ExitTimeAMPM"));
		l2.get(1).click();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 1);
		date = cal.getTime();
		String d1 = formatter.format(date);
		System.out.println(d1);
		driver.findElement(By.id("ExitDate")).clear();
		driver.findElement(By.id("ExitDate")).sendKeys(d1);
		driver.findElement(By.name("Submit")).click();
		
//		String te = driver.findElement(By.cssSelector("span[class='SubHead']")).getText();
		
		
		
	}
	
	public void vforv()
	{
		String te2 = driver.findElement(By.cssSelector("span[class='SubHead']")).getText();
		System.out.println(te2);
		
		String[] te1split = te2.split(" ");
		int i = (te1split.length)-1;
		
		System.out.println(te1split[i]);
		
		String j = te1split[i];
//		r1 = Integer.parseInt(j);
		r1 = Float.parseFloat(j);

		
		
		tc();
		driver.close();
		
	
	}
	
	public void vfore()
	{
		String te1 = driver.findElement(By.cssSelector("span[class='SubHead']")).getText();
		System.out.println(te1);
		
		String[] te1split = te1.split(" ");
		int i = (te1split.length)-1;
		
		System.out.println(te1split[i]);
		
		String j = te1split[i];
		r2 = Float.parseFloat(j);
		
				
		tc();
		driver.close();
		
	
	}
	
	public void subtract()
	{
		
		if(r1>r2)
		{
			r3 = r1/2;
			boolean gt = r3>r2;
			Assert.assertEquals(gt, true);
			
				System.out.println("Economy parking is at least 50% lesser than that of Valet parking");
			
		
		float fr = r1-r2;
		System.out.println(fr+ " is the final difference between both parkings");
		}
	}
	
	public void tc()
	{
		try 
		{
		Thread.sleep(3000);
		} 	
		catch (InterruptedException e) 
		{
		
			e.printStackTrace();
		}
	}
	
	public void valetparking()
	{
		driver = new ChromeDriver();
		driver.get("http://adam.goucher.ca/parkcalc/");
		driver.manage().window().maximize();
		Select s = new Select(driver.findElement(By.name("Lot")));
		s.selectByVisibleText("Valet Parking");
		formfill();
		vforv();
//		s.selectByVisibleText("Economy Parking");
//		formfill();
		
	}
	
	public void economyparking()
	{
		driver = new ChromeDriver();
		driver.get("http://adam.goucher.ca/parkcalc/");
		driver.manage().window().maximize();
		Select s = new Select(driver.findElement(By.name("Lot")));
		s.selectByVisibleText("Economy Parking");
		formfill();
		vfore();
		
	}
	

}
