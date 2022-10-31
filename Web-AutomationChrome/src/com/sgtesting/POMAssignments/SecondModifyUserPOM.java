package com.sgtesting.POMAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondModifyUserPOM {
	public static WebDriver oBrowser=null;
	public static POMActipage oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		login();		
		minimize();		
		AddUSer();
		ModifyUSer();
		DeleteUSer();
		Logout();
		CloseBrowser();

	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new POMActipage(oBrowser);
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
	private static void login()
	{
		try
		{
			oPage.insertuser().sendKeys("admin");
			oPage.insertpassword().sendKeys("manager");
			oPage.clickLogin().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void minimize()
	{
		try
		{
			
			oPage.clickminimize().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void AddUSer()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(1000);
			oPage.adduser().click();
			Thread.sleep(1000);
			oPage.addfirstname().sendKeys("vini");
			oPage.addMiddlename().sendKeys("v");
			oPage.addLastname().sendKeys("niki");
			oPage.addUsername().sendKeys("Vinayak2818");
			oPage.addEmail().sendKeys("vini@gmail.com");
			oPage.addPassword().sendKeys("121212");
			oPage.addPasswordcopy().sendKeys("121212");
			oPage.ClickCreateuser().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void ModifyUSer()
	{
		try
		{
			
			oPage.clickonUser().click();
			Thread.sleep(1000);
			oPage.addfirstname().clear();
			Thread.sleep(1000);
			oPage.addfirstname().sendKeys("niki");
			Thread.sleep(1000);
			oPage.addMiddlename().clear();
			Thread.sleep(1000);
			oPage.addMiddlename().sendKeys("n");
			Thread.sleep(1000);
			oPage.addLastname().clear();
			Thread.sleep(1000);
			oPage.addLastname().sendKeys("vini");
			Thread.sleep(1000);
			oPage.addUsername().clear();
			Thread.sleep(1000);
			oPage.addUsername().sendKeys("niki2818");
			Thread.sleep(1000);
			oPage.addEmail().clear();
			Thread.sleep(1000);
			oPage.addEmail().sendKeys("niki@gmail.com");
			Thread.sleep(1000);
			oPage.addPassword().clear();
			Thread.sleep(1000);
			oPage.addPassword().sendKeys("123123");
			Thread.sleep(1000);
			oPage.addPasswordcopy().clear();
			Thread.sleep(1000);
			oPage.addPasswordcopy().sendKeys("123123");
			Thread.sleep(1000);
			oPage.Saveuserchanges().click();
			Thread.sleep(1000);
			
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void DeleteUSer()
	{
		try
		{
			
			oPage.clickModifiedUser().click();
			Thread.sleep(2000);
			oPage.DeleteUser().click();
			Thread.sleep(2000);
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
			
			oPage.logout().click();
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
