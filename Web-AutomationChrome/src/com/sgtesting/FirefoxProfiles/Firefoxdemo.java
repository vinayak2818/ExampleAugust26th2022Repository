package com.sgtesting.FirefoxProfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Firefoxdemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		//LaunchBrowser();
		launchBrowser1();
	}
	
	private static void launchBrowser1()
	{
		try
		{
		/*	ProfilesIni profilesini=new ProfilesIni();
			FirefoxProfile ffprofile=profilesini.getProfile("sgtesting");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
		*/
			FirefoxProfile ffprofile=new FirefoxProfile();
			ffprofile.setPreference("browser.startup.homepage", "http://sgtestinginstitute.com/");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
			System.setProperty("webdriver.gecko.driver", ".\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver(options);
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

}
