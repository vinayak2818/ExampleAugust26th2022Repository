package com.sgtesting.actitimeAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCreateuserActitimeChrome {
 public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		Login();
		 Minimize();
		 User();
		 Deleteuser();
		 Logout();
		CloseBrowser();

	}
	private static void CloseBrowser()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Minimize()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(3000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void User()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("v");
			oBrowser.findElement(By.name("lastName")).sendKeys("acc");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("password")).sendKeys("12345a");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345a");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
			
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='acc, demo v.']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	

}
