package com.sgtesting.WebAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeventhModifyProject {
	public static WebDriver oBrowser=null;
	@Test(priority = 1)
	public static void launchBrowser()
	{
		try
		{			
			System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\TestNG_WEB_Automation_Assignments\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	public static void navigate()
	{
		WebElement oEle=null;
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
			oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 3,dataProvider = "login")
	public static void login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			WebElement oLink=oBrowser.findElement(By.xpath("//a[contains(text(),'Administrator')]"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	public static void minimizeFlyOutwindow()
	{
		String expected;
		try
		{
			expected="Getting Started Shortcuts";
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String actual=oEle.getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5,dataProvider = "Customer")
	public static void Createcustomer(String name)
	{
		
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(name);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[1]"));
			Assert.assertTrue(oLink.isDisplayed());
			
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6,dataProvider = "CreateProject")
	public static void CreateProject(String pro)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(pro);
			Thread.sleep(1000);			
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(3000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']"));
			Assert.assertFalse(oLink.isDisplayed());
			
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 7,dataProvider = "ModifyProject")
	public static void ModifyProject(String mod)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).clear();
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")).sendKeys(mod);
			Thread.sleep(1000);			
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']"));
			Assert.assertFalse(oLink.isDisplayed());
			
			
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
	public static void DeleteProject()
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
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']"));
			Assert.assertFalse(oLink.isDisplayed());
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 9)
	public static void Deletecustomer()
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
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div"));
			Assert.assertFalse(oLink.isDisplayed());
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 10)
	public static void logout()
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
	@Test(priority = 11)
	public static void CloseBrowser()
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
	@DataProvider(name="login")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@DataProvider(name="Customer")
	public Object[] getCustomerData()
	{
		return new Object[] {"DELL"};
	}
	@DataProvider(name="CreateProject")
	public Object[] getProjectData()
	{
		return new Object[] {"DELL Automation"};
	}
	@DataProvider(name="ModifyProject")
	public Object[] getModifyProjectData()
	{
		return new Object[] {"HP Automation"};
	}
}
