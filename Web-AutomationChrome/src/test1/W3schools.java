package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schools {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		 NameStartswith();

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
				if(linksname.startsWith("Learn"))
				{
					
					System.out.println(linksname);
					
				}
				
			}	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
