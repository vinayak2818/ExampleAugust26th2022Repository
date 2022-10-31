package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedemo {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		LaunchBrowser1();
		Navi();
		Loginpage();
		Login();
		Logout();
		Closechrome();

	}
	private static void LaunchBrowser1()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-AutomationChrome\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Navi()
	{
		try
		{
			driver.get("http://www.sgtestinginstitute.com/");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Loginpage()
	{
		try
		{
			driver.findElement(By.linkText("Login / Register")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			driver.findElement(By.id("email")).sendKeys("vinayaklakkundi@yahoo.com");
			driver.findElement(By.name("password")).sendKeys("8123630940");
			driver.findElement(By.name("btn-login")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			driver.findElement(By.linkText("Vi")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Closechrome()
	{
		try
		{
			driver.close();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
