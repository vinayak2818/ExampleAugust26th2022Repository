package com.sgtesting.CssSelector;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyElemnetsbyusingJavaScript {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		DisplayURL();

	}
	private static void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-AutomationChrome\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}
	private static void Navigate()
	{

		try {
			oBrowser.get("file:///E:/HTML/xpath_xpathaxes_samplehtmlfiles/Sample.html");
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	private static void DisplayURL()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String URL=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL:"+URL );
	}

}
