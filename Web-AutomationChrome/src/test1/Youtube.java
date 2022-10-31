package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		//nooflinks();
		
		//Printlinks();
		//login();
	
		//logout();
		signup();

	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-AutomationChrome\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("https://www.w3schools.com");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void nooflinks()
	{
		try
		{
			List<WebElement>olinks=oBrowser.findElements(By.xpath("//a"));
			int linkscount=olinks.size();
			System.out.println(linkscount);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Printlinks()
	{
		try
		{
			List<WebElement>olinks=oBrowser.findElements(By.xpath("//a"));
			int linkscount=olinks.size();
			for(int i=0;i<olinks.size();i++)
			{
				WebElement link=olinks.get(i);
				String linkname=link.getText();
				System.out.println(linkname);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void signup()
	{
		try
		{
			oBrowser.findElement(By.id("search2")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("search2")).sendKeys("java");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("learntocode_searchbtn")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id='w3loginbtn']")).click();
			Thread.sleep(1000);
			//oBrowser.findElement(By.xpath("//span[text()=' Sign up']")).click();
			//Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("vinayaklakkundi@yahoo.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("current-password")).sendKeys("V!n8123630940");
			Thread.sleep(1000);
			//oBrowser.findElement(By.xpath("//*[@id='root']/div/div/div[4]/div[1]/div/div[5]/div[1]/button")).click();
			//oBrowser.findElement(By.name("first_name")).sendKeys("Vinayak");
			//Thread.sleep(1000);
			//oBrowser.findElement(By.name("last_name")).sendKeys("Lakkundi");
			//Thread.sleep(1000);
			//oBrowser.findElement(By.xpath("//*[@id='root']/div/div/div[4]/div[1]/div/div[3]/div/button")).click();
			//Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='root']/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).click();
			Thread.sleep(8000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id='navigation']/div/button")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
