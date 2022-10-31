package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSgtesting {
	public static WebDriver Browser=null;
	public static void main(String[] args) {
		LaunchFire();
		navigate();
		Login();
		LoginSG();
		logout();
		close();

	}
	private static void LaunchFire()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","E:\\ExampleAutomation\\Automation\\Web-AutomationChrome\\Library\\drivers\\geckodriver.exe");
			Browser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			
			Browser.get("http://www.sgtestinginstitute.com");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			
			Browser.findElement(By.linkText("Login / Register")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginSG()
	{
		try
		{
			
			Browser.findElement(By.id("email")).sendKeys("vinayaklakkundi@yahoo.com");
			Browser.findElement(By.name("password")).sendKeys("8123630940");
			Browser.findElement(By.name("btn-login")).click();
			
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			
			Browser.findElement(By.linkText("Vi")).click();
			Thread.sleep(1000);
			Browser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try
		{
			
			Browser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
