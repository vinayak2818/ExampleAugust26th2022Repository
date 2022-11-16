package com.sgtesting.CssSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptExecutorDemo {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		//displayURl();
		//displayTitle();
		//displayLinksCount();
		//enterTextContent1();
		//enterTextcontent2();
		//clickOnButtonField1();
		//clickOnButtonField2();
		//clickOnCheckBoxField1();
		//clickOnCheckBoxField2();
		//clickOnRadioButtonField1();
		//clickOnRadioButtonField2();
		//clikOnLink();
		//selectItemFromDropDown();
		selectItems();
	}
	private static void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-AutomationChrome\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}
	private static void Navigate()
	{

		try {
			oBrowser.get("E:\\HTML\\xpath_xpathaxes_samplehtmlfiles\\Sample.html");
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	//Get the URL of the Web Page
	private static void displayURl()
	{
		JavascriptExecutor js =(JavascriptExecutor) oBrowser;
		String url=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL:"+url);
	}
	//Get the Title of the Web Page
	private static void displayTitle()
	{
		JavascriptExecutor js =(JavascriptExecutor) oBrowser;
		String title=(String) js.executeScript("var kk=document.title;return kk;");
		System.out.println("Title:"+title);
	}
	//Get the Number of links in the Web Page
	private static void displayLinksCount()
	{
		JavascriptExecutor js =(JavascriptExecutor) oBrowser;
		long linkscount=(long) js.executeScript("var kk=document.getElementsByTagName('a');return kk.length;");
		System.out.println("# of links:"+linkscount);		
	}
	//Enter Data in the Text Field
	private static void enterTextContent1()
	{
		JavascriptExecutor js =(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUSer1';");
	}
	//Enter Data in the Text Field using WebElement
	private static void enterTextcontent2()
	{
		WebElement oEle=oBrowser.findElement(By.id("uid1user1name1"));
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].value='DemoUser2';",oEle);
	}
	//Perform click operation on the Button
	private static void clickOnButtonField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	//Perform click operation on the Button
	private static void clickOnButtonField2()
	{
		WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].click();",oEle);
	}
	//Perform click operation on the Checkbox
	private static void clickOnCheckBoxField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk1windows').click();");
	}
	
	// Perform click operation on the CheckBox
	 
	private static void clickOnCheckBoxField2()
	{
		WebElement oEle=oBrowser.findElement(By.id("chk1windows"));
		WebElement oEle1=oBrowser.findElement(By.id("chk2linux"));
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].click();",oEle);
		js.executeScript("arguments[0].click();",oEle1);
	}
	
	 // Perform click operation on the RadioButton
	 
	private static void clickOnRadioButtonField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('rad2firefox').click();");
	}
	
	 //Perform click operation on the RadioButton
	 
	private static void clickOnRadioButtonField2()
	{
		WebElement oEle=oBrowser.findElement(By.id("rad2firefox"));
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].click();",oEle);
	}
	//Identify Multiple Elements
	private static void clikOnLink()
	{
		List<WebElement> olinks=oBrowser.findElements(By.tagName("a"));
		System.out.println(olinks.size());
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].click();",olinks.get(1));
	}
	 // Select Item from Drop Down
	 
	private static void selectItemFromDropDown()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String str="var list=document.getElementById('tools');";
		str+="for(var i=0;i<list.length;i++)";
		str+="{";
		str+="if(list[i].text='Selenium IDE')";
		str+="{";
		str+="list[i].selected='1'";
		str+="}";
		str+="}";
		
		js.executeScript(str);
	}
	private static void selectItems()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oEle);
			oSelect.selectByValue("rc");
			Thread.sleep(2000);
			oSelect.selectByVisibleText("Selenium WebDriver");
			Thread.sleep(2000);
			oSelect.selectByIndex(1);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
