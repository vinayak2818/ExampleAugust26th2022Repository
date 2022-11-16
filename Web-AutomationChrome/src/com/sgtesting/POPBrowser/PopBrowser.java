package com.sgtesting.POPBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopBrowser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		Launch();
		navigate();
		handlePopUps();
		getPopupCount();
	

	}
	private static void Launch()
	{
		try {
		System.setProperty("webdriver.chrome.driver","E:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-AutomationChrome\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:81/login.do");
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static int getPopupCount()
	{
		int count=0;
		try
		{
			count=oBrowser.getWindowHandles().size()-1;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
	private static void handlePopUps()
	{
		try
		{
			System.out.println("Before Click on Link, Numbers of Popups :"+getPopupCount());
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(4000);
			System.out.println("After Click on Link, Numbers of Popups :"+getPopupCount());
			if(getPopupCount()>0)
			{
				popupBrowsers();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void popupBrowsers()
	{
		try
		{
			String parentBrowser;
			parentBrowser=oBrowser.getWindowHandle();
		//	System.out.println("Parent Browser :"+parentBrowser);
			Object popups[]=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				//System.out.println("Child Browser :"+childBrowser);
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
				//Again Switch back to Parent Browser
				oBrowser.switchTo().defaultContent();
				oBrowser.switchTo().window(parentBrowser);
				//oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
				//Thread.sleep(4000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
