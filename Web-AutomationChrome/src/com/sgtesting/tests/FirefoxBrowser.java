package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		close();

	}
	private static void Navigate()
	{
		try
		{
			oBrowser.get("https://www.youtube.com/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try
		{
			oBrowser.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","E:\\ExampleAutomation\\Automation\\Web-AutomationChrome\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
