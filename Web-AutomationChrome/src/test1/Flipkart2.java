package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		Navigate();
		searchmemeory();

	}
	private static void launchBrowser()
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
			
			oBrowser.get("https://www.flipkart.com/");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void searchmemeory()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Thread.sleep(1000);
			WebElement element=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[5]/a/div[2]/div/div"));
			Actions oaction=new Actions(oBrowser);
			oaction.moveToElement(element).build().perform();
			Thread.sleep(2000);
			WebElement element1=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[5]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[1]"));
			Actions oaction1=new Actions(oBrowser);
			oaction1.moveToElement(element1).build().perform();
			Thread.sleep(2000);
			WebElement element2=oBrowser.findElement(By.linkText("All"));
			Actions oaction2=new Actions(oBrowser);
			oaction2.click(element2).build().perform();
			Thread.sleep(2000);
			WebElement element3=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
			Actions oaction3=new Actions(oBrowser);
			oaction3.moveToElement(element3).perform();
			Thread.sleep(3000);
			WebElement element4=oBrowser.findElement(By.linkText("Memory Cards"));
			Actions oaction4=new Actions(oBrowser);
			oaction4.click(element4).build().perform();
		//	oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div/div[2]/a[6]")).click();
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
