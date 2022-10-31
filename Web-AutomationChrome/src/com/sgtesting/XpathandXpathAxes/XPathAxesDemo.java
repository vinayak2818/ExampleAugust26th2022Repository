package com.sgtesting.XpathandXpathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryBasedOnPersonSachinTendulkar();
	//	enterSalaryfor2ndPersonBasedOnRahulDravid();
	//	makeStatusAsActiveForIndianFreedomFighter();
	//	makeStatusAsActiveForPersonWhoIsPreviousToRahul();
	//	BasedonChildElementIdentifyParent();
		//BasedonChildElementIdentifyParentsecondtype();
		BasedonParentElementIdentifyParent();
		BasedonParentElementIdentifyParentsecondtype();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("file:///E:/ExampleAutomation/Automation/Web-AutomationChrome/src/com/sgtesting/XpathandXpathAxes/WebTableHTML.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Case 1: following-sibling
	 * Description: Based On Person Sachin Tendulkar,Enter the Salary
	 */
	private static void enterSalaryBasedOnPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}

	/**
	 * Case 2: following
	 * Description: Based On Person Rahul Dravid,Enter the Salary for 2nd Person
	 */
	private static void enterSalaryfor2ndPersonBasedOnRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("25000");
	}
	
	/**
	 * Case 3: preceding-sibling
	 * Description: Make the status as Active for Indian Freedom Fighter
	 */
	private static void makeStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding::td[1]/input")).click();
	}
	
	/**
	 * Case 4: preceding
	 * Description: Make the status as Active for Person Who is Previous to Rahul Dravid
	 */
	private static void makeStatusAsActiveForPersonWhoIsPreviousToRahul()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	private static void BasedonChildElementIdentifyParent()
	{
		WebElement oEle= oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
		String attributevalue=oEle.getAttribute("id");
		System.out.println(attributevalue);
	}
	private static void BasedonChildElementIdentifyParentsecondtype()
	{
		WebElement oEle= oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::table"));
		String attributevalue=oEle.getAttribute("id");
		System.out.println(attributevalue);
	}
	private static void BasedonParentElementIdentifyParent()
	{
		 oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[5]/td[6]/input")).sendKeys("25000");
		
		
	}
	private static void BasedonParentElementIdentifyParentsecondtype()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[5]/td[6]/input")).sendKeys("25000");
		
	}
}
