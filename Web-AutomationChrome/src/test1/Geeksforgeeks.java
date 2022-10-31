package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geeksforgeeks {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		Launch();
		Navigate();
		Nooflinks();
		//Nameoflinks();
		NameStartswith();

	}
	private static void Launch()
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

			oBrowser.get("https://practice.geeksforgeeks.org/courses/complete-interview-preparation?source=google&medium=cpc&device=c&keyword=geeksforgeeks&matchtype=b&campaignid=2031157862&adgroup=111549607903&gclid=EAIaIQobChMI1aKN5NWB-wIV8INLBR2yIQdvEAAYASAAEgJcKfD_BwE");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Nooflinks()
	{
		try 
		{
			List<WebElement>olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int linkscount=olinks.size();
			System.out.println(linkscount);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Nameoflinks()
	{
		try 
		{
			List<WebElement>olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int linkscount=olinks.size();
			for(int i=0;i<olinks.size();i++)
			{
				WebElement links=olinks.get(i);
				String linksname=links.getText();
				System.out.println(linksname);

			}	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void NameStartswith()
	{
		try 
		{
			List<WebElement>olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int linkscount=olinks.size();
			for(int i=0;i<olinks.size();i++)
			{
				WebElement links=olinks.get(i);
				String linksname=links.getText();
				if(linksname.startsWith("java"))
				{
					links.click();
					break;
				}

			}	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
