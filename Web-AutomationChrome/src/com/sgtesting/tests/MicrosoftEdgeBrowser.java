package com.sgtesting.tests;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdgeBrowser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		Navigate();
		closeBrowser();
	}
	private static void closeBrowser()
	{
		try
		{
			oBrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try
		{
			oBrowser.get("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en");			
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.edge.driver","E:\\ExampleAutomation\\Automation\\Web-AutomationChrome\\Library\\drivers\\msedgedriver.exe");
			oBrowser=new EdgeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
