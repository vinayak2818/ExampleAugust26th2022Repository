package com.sgtesting.actitimeAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdUser1User2User3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		Login();
		Minimize();
		User1();
		User2();
		User3();
		Logout();
		LoginUser1();
		Logoutuser1();
		LoginUser2();
		Logoutuser2();
		LoginUser3();
		Logoutuser3();
		SecontimeLoginUser1();
		Modifyuser1();
		SecondtimeLogoutuser1();
		SecondtimeLoginUser2();
		Modifyuser2();
		SecondtimeLogoutuser2();
		SecondtimeLoginUser3();
		Modifyuser3();
		SecondtimeLogoutuser3();
		ModifiedLoginUser1();
		LogoutModifieduser1();
		ModifiedLoginUser2();
		LogoutModifieduser2();
		ModifiedLoginUser3();
		LogoutModifieduser3();
		SecondtimeadminLogin();
		AdminModifyuser1();
		SecondtimeAdminlogout();
		ThirdtimeLoginUser1();
		Thirdtimeuser1logout();
		ThirdtimeLoginUser2();
		Thirdtimeuser2logout();
		ThirdtimeLoginUser3();
		Thirdtimeuser3logout();
		thirdtimeadminLogin();
		DeleteUesers();
		ThirdtimeAdminlogout();
		CloseBrowser();

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
	private static void User1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("v");
			oBrowser.findElement(By.name("lastName")).sendKeys("vin");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("password")).sendKeys("12345a");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345a");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void User2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("s");
			oBrowser.findElement(By.name("lastName")).sendKeys("sam");
			oBrowser.findElement(By.name("email")).sendKeys("sam@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("password")).sendKeys("123321");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123321");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void User3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("s");
			oBrowser.findElement(By.name("lastName")).sendKeys("niki");
			oBrowser.findElement(By.name("email")).sendKeys("niki@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("password")).sendKeys("121212");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("121212");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void LoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345a");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Logoutuser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void LoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("123321");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Logoutuser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void LoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("121212");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Logoutuser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecontimeLoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345a");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='vin, demo v.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("vini");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vini");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeLogoutuser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeLoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("123321");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='sam, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("sam");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sam");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeLogoutuser2()
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
	private static void SecondtimeLoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("121212");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='niki, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("niki");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("niki");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeLogoutuser3()
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
	private static void ModifiedLoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("vini");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void LogoutModifieduser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void ModifiedLoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("sam");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void LogoutModifieduser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void ModifiedLoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("niki");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void LogoutModifieduser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeadminLogin()
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
	private static void AdminModifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='vin, demo v.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("vinayak");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vinayak");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='sam, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("sami");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sami");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='niki, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("nikki");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("nikki");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeAdminlogout()
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
	private static void ThirdtimeLoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("vinayak");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Thirdtimeuser1logout()
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
	private static void ThirdtimeLoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("sami");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Thirdtimeuser2logout()
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
	private static void ThirdtimeLoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("nikki");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Thirdtimeuser3logout()
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
	private static void thirdtimeadminLogin()
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
	private static void DeleteUesers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='vin, demo v.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='sam, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			oAlert.accept();
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='niki, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			oAlert.accept();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void ThirdtimeAdminlogout()
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
