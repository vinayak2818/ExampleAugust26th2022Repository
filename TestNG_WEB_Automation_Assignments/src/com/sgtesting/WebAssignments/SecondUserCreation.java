package com.sgtesting.WebAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondUserCreation {
	public static WebDriver oBrowser=null;
	@Test(priority = 9)
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
	@Test(priority = 2)
	public static void Navigate()
	{
		WebElement oEle=null;
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
			oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(oEle.isDisplayed());

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority = 1)
	public static void LaunchBrowser()
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
	@Test(priority = 3,dataProvider = "login")
	public static void Login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
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
	@Test(priority = 5,dataProvider = "user")
	public static void User(String First,String m,String last,String Em,String usnm,String pwd,String pwdc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(First);
			oBrowser.findElement(By.name("middleName")).sendKeys(m);
			oBrowser.findElement(By.name("lastName")).sendKeys(last);
			oBrowser.findElement(By.name("email")).sendKeys(Em);
			oBrowser.findElement(By.name("username")).sendKeys(usnm);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdc);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 6,dataProvider = "Modify")
	public static void Modify(String First,String m,String last,String pwd,String pwdc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys(First);
			oBrowser.findElement(By.name("middleName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("middleName")).sendKeys(m);
			oBrowser.findElement(By.name("lastName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys(last);
			Thread.sleep(2000);			
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdc);
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 7)
	public static void Deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='niki, vinayak n.']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
	public static void Logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
			

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
	@DataProvider(name="Modify")
	public Object[][] getModifyData()
	{
		return new Object[][] {{"vinayak","n","niki","vini","vini"}};
	}
	@DataProvider(name="user")
	public Object[][] getuserdata()
	{
		return new Object[][] {{"demo","v","vin","demo@gmail.com","Demouser1","12345a","12345a"}};
	}
}
