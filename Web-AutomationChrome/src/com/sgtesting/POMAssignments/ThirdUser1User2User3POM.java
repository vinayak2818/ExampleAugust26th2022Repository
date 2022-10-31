package com.sgtesting.POMAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdUser1User2User3POM {
	public static WebDriver oBrowser=null;
	public static POMActipage oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		login();		
		minimize();		
		AddUser1();
		AddUser2();
		AddUser3();
		Logout();
		User1login();
		user1Logout();
		User2login();
		user2Logout();
		User3login();
		user3Logout();
		SecondUser1loginModify();
		Seconduser1Logout();
		SecondUser2loginModify();
		Seconduser2Logout();
		SecondUser3loginModify();
		Seconduser3Logout();
		thirdUser1newloginlogout();
		thirdUser2newloginlogout();
		thirdUser3newloginlogout();
		Adminlogin();
		AdminModifyuser1user2user3password();
		AdminLogout();
		FourthUser1newloginlogout();
		FourthUser2newloginlogout();
		FourthUser3newloginlogout();
		SecondAdminlogin();
		AdminDeleteUSer1user2user3();
		SecondAdminLogout();
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
	private static void AddUser1()
	{
		try
		{
			oPage.clickuser().click();
			Thread.sleep(1000);
			oPage.adduser().click();
			Thread.sleep(1000);
			oPage.addfirstname().sendKeys("demo1");
			oPage.addMiddlename().sendKeys("v");
			oPage.addLastname().sendKeys("user1");
			oPage.addUsername().sendKeys("Userdemo1");
			oPage.addEmail().sendKeys("Userdemo1@gmail.com");
			oPage.addPassword().sendKeys("121212");
			oPage.addPasswordcopy().sendKeys("121212");
			oPage.ClickCreateuser().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void AddUser2()
	{
		try
		{
			oPage.adduser().click();
			Thread.sleep(1000);	
			oPage.addfirstname().sendKeys("demo2");			
			oPage.addMiddlename().sendKeys("s");			
			oPage.addLastname().sendKeys("user2");			
			oPage.addUsername().sendKeys("Userdemo2");			
			oPage.addEmail().sendKeys("Userdemo2@gmail.com");			
			oPage.addPassword().sendKeys("123123");			
			oPage.addPasswordcopy().sendKeys("123123");
			Thread.sleep(1000);
			oPage.ClickCreateuser().click();
			Thread.sleep(2000);
			
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void AddUser3()
	{
		try
		{
			oPage.adduser().click();
			Thread.sleep(1000);	
			oPage.addfirstname().sendKeys("demo3");			
			oPage.addMiddlename().sendKeys("n");			
			oPage.addLastname().sendKeys("user3");			
			oPage.addUsername().sendKeys("Userdemo3");			
			oPage.addEmail().sendKeys("Userdemo3@gmail.com");			
			oPage.addPassword().sendKeys("321321");			
			oPage.addPasswordcopy().sendKeys("321321");
			Thread.sleep(1000);
			oPage.ClickCreateuser().click();
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
	private static void User1login()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo1");
			oPage.insertpassword().sendKeys("121212");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.StartExplore().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void user1Logout()
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
	private static void User2login()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo2");
			oPage.insertpassword().sendKeys("123123");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.StartExplore().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void user2Logout()
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
	private static void User3login()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo3");
			oPage.insertpassword().sendKeys("321321");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.StartExplore().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void user3Logout()
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
	private static void SecondUser1loginModify()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo1");
			oPage.insertpassword().sendKeys("121212");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.clickuser().click();
			Thread.sleep(2000);	
			oPage.clickUser1().click();
			Thread.sleep(2000);
			oPage.addPassword().sendKeys("11111");
			oPage.addPasswordcopy().sendKeys("11111");
			Thread.sleep(2000);
			oPage.Saveuserchanges().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void thirdUser1newloginlogout()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo1");
			oPage.insertpassword().sendKeys("11111");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.logout().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Seconduser1Logout()
	{
		try
		{			
			oPage.logout().click();
			Thread.sleep(3000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void SecondUser2loginModify()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo2");
			oPage.insertpassword().sendKeys("123123");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.clickuser().click();
			Thread.sleep(1000);	
			oPage.clickUser2().click();
			Thread.sleep(1000);
			oPage.addPassword().sendKeys("222222");
			oPage.addPasswordcopy().sendKeys("222222");
			Thread.sleep(1000);
			oPage.Saveuserchanges().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	private static void thirdUser2newloginlogout()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo2");
			oPage.insertpassword().sendKeys("222222");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.logout().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Seconduser2Logout()
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
	private static void SecondUser3loginModify()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo3");
			oPage.insertpassword().sendKeys("321321");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.clickuser().click();
			Thread.sleep(1000);	
			oPage.clickUser3().click();
			Thread.sleep(1000);
			oPage.addPassword().sendKeys("333333");
			oPage.addPasswordcopy().sendKeys("333333");
			Thread.sleep(1000);
			oPage.Saveuserchanges().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void thirdUser3newloginlogout()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo3");
			oPage.insertpassword().sendKeys("333333");
			oPage.clickLogin().click();
			Thread.sleep(3000);
			oPage.logout().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Seconduser3Logout()
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
	private static void Adminlogin()
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
	private static void AdminModifyuser1user2user3password()
	{
		try
		{			
			oPage.clickuser().click();
			Thread.sleep(1000);
			oPage.clickUser1().click();
			Thread.sleep(2000);
			oPage.addPassword().sendKeys("123123");
			oPage.addPasswordcopy().sendKeys("123123");
			Thread.sleep(2000);
			oPage.Saveuserchanges().click();
			Thread.sleep(1000);
			oPage.clickUser2().click();
			Thread.sleep(1000);
			oPage.addPassword().sendKeys("321321");
			oPage.addPasswordcopy().sendKeys("321321");
			Thread.sleep(1000);
			oPage.Saveuserchanges().click();
			Thread.sleep(1000);
			oPage.clickUser3().click();
			Thread.sleep(1000);
			oPage.addPassword().sendKeys("654321");
			oPage.addPasswordcopy().sendKeys("654321");
			Thread.sleep(1000);
			oPage.Saveuserchanges().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void AdminLogout()
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
	private static void FourthUser1newloginlogout()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo1");
			oPage.insertpassword().sendKeys("123123");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.logout().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void FourthUser2newloginlogout()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo2");
			oPage.insertpassword().sendKeys("321321");
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.logout().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void FourthUser3newloginlogout()
	{
		try
		{
			oPage.insertuser().sendKeys("Userdemo3");
			oPage.insertpassword().sendKeys("654321");
			oPage.clickLogin().click();
			Thread.sleep(3000);
			oPage.logout().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void SecondAdminlogin()
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
	private static void AdminDeleteUSer1user2user3()
	{
		try
		{
			
			oPage.clickuser().click();
			Thread.sleep(2000);
			oPage.clickUser1().click();
			Thread.sleep(1000);
			oPage.DeleteUser().click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			oPage.clickUser2().click();
			Thread.sleep(1000);
			oPage.DeleteUser().click();
			oAlert.accept();
			Thread.sleep(1000);
			oPage.clickUser3().click();
			Thread.sleep(1000);
			oPage.DeleteUser().click();
			Thread.sleep(1000);
			oAlert.accept();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void SecondAdminLogout()
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
