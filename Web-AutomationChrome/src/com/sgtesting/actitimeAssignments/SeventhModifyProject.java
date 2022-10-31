package com.sgtesting.actitimeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeventhModifyProject {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		Navigate();
		Login();
		Minimize();
		Createcustomer();
		CreateProject();
		ModifyProject();
		DeleteProject();
		Deletecustomer();
		logout();
		CloseBrowser();

	}
	private static void launch()
	{
		try 
		{
			
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-AutomationChrome\\Library\\drivers\\chromedriver.exe");
			
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			
		}
	}
	private static void Navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
			oBrowser.manage().window().maximize();

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
			Thread.sleep(1000);

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
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Createcustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("DELL");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(1000);
			
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("DELL Automation");
			Thread.sleep(1000);			
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(3000);
			
			
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void ModifyProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).clear();
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).sendKeys("HP Automation");
			Thread.sleep(1000);			
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			
			
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void DeleteProject()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(1000);
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
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

}
