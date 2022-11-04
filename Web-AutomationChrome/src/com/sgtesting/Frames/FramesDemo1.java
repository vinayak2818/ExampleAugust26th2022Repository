package com.sgtesting.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		openage();

	}
	private static void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-AutomationChrome\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}
	private static void Navigate()
	{

		try {
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	private static void openage()
	{
		try {
			oBrowser.switchTo().frame(0);
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(1000);
			oBrowser.switchTo().frame("packageFrame");
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("WebDriver")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(1000);
			WebElement oframe=oBrowser.findElement(By.className("rightIframe"));
			oBrowser.switchTo().frame(oframe);
			Thread.sleep(1000);
			String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
