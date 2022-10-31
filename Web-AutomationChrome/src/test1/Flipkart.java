package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		closeaction();
		nooflinks();
		//nameoflinks();

	}
	private static void LaunchBrowser()
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
	private static void Navigate()
	{
		try
		{

			oBrowser.get("https://www.flipkart.com/?affid=doleout&affExtParam1=AAVO-3-FJA");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void closeaction()
	{
		try
		{

			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[5]/a/div[2]/div[1]/div"));
			Actions oMouse=new Actions(oBrowser);
			oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			WebElement element1=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[1]"));
			Actions oaction1=new Actions(oBrowser);
			oaction1.moveToElement(element1).build().perform();
			Thread.sleep(2000);
			
			WebElement oEle1=oBrowser.findElement(By.linkText("All"));
			Actions oMouse1=new Actions(oBrowser);			
			Thread.sleep(1000);
			oMouse1.click(oEle1).build().perform();
			Thread.sleep(2000);
			
			
			WebElement oEle3=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
			Actions oMouse3=new Actions(oBrowser);			
			oMouse3.moveToElement(oEle3).perform();
			Thread.sleep(3000);
			WebElement oEle4=oBrowser.findElement(By.linkText("Memory Cards"));			
			Actions oMouse4=new Actions(oBrowser);
			oMouse4.click(oEle4).build().perform();
			Thread.sleep(2000);
			
			
			
			
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void nameoflinks()
	{
		try
		{

			List<WebElement>olinks=oBrowser.findElements(By.xpath("//a"));
			int linkscount=olinks.size();
			for(int i=0;i<olinks.size();i++)
			{
				WebElement likns=olinks.get(i);
				System.out.println(likns);
			}
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}


}
