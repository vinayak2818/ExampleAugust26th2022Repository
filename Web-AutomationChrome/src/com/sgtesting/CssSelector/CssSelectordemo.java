package com.sgtesting.CssSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectordemo {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		//AbsoluteCss();
		//RelativeCSSusingTagName();
		//relativeCSSUsingTagNameWithIDAttributeValue();
		//relativeCSSUSingIDAttributeValue();
		//ralativeCSSusingTagNameWithClassAttributeValue();
		//relativeCSSUSingClassAttributevalue();
		//relativeCSSUSingClassAttributenamevalue();
	//	relativeCSSUSingClassMultipleAttributenamevalue();
		//relativeCSSUSingWithoutTagnameonlyAttributenamevalue();
		//relativeCSSUSingTagNAmeWithPartialAttributevalue();
		//relativeCSSUSingWithTagnamewithAttributename();
		//relativeCSSUSingWithTagnamewithAttributename_1();
		//relativeCSSUSingWithTagnamewithAttributename_2();
		//relativeCSSUSingParentElementReference();
		//relativeCSSUSingNthchildConcept();
		relativeCSSUSingSiblingsconcept();
	}
	private static void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-AutomationChrome\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}
	private static void Navigate()
	{

		try {
			oBrowser.get("file:///E:/HTML/xpath_xpathaxes_samplehtmlfiles/Sample.html");
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	private static void AbsoluteCss()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("userdemo1");
	}
	/*
	 * Case 1:Identify the Element based on <tagName>
	 * Syntax:<tagName>
	 */
	private static void RelativeCSSusingTagName()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("vinayak");
	}
	/*
	 * Case 2:Identify the Element based on <tagName> with id Attribute value()
	 * Syntax:<tagName>#<id attribute value>
	 */
	private static void relativeCSSUsingTagNameWithIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#uid1user1name1")).sendKeys("userdemo1");
	}
	/*
	 * Case 3:Identify the Element based on id Attribute value alone
	 * Syntax:#<id attribute value>
	 */
	private static void relativeCSSUSingIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#uid1user1name1")).sendKeys("userdemo1");
	}
	/*
	 * Case 4:Identify the Element based on <tagname> with class Attribute 
	 * Syntax:<tagName>.<class attribute value>
	 */
	private static void ralativeCSSusingTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.user1name1")).sendKeys("userdemo1");
	}
	/*
	 * Case 5:Identify the Element based on class Attribute value alone 
	 * Syntax:.<class attribute value>
	 */
	private static void relativeCSSUSingClassAttributevalue()
	{
		oBrowser.findElement(By.cssSelector(".user1name1")).sendKeys("userdemo1");
	}
	/*
	 * Case 6:Identify the Element based on TagName with Attribute name and value combination 
	 * Syntax:<tagname>[attributename='attributevalue']
	 */
	private static void relativeCSSUSingClassAttributenamevalue()
	{
		oBrowser.findElement(By.cssSelector("input[class='user1name1']")).sendKeys("userdemo1");
	}
	/*
	 * Case 7:Identify the Element based on TagName with Multiple Attribute name and value combination 
	 * Syntax:<tagname>[attributename='attributevalue'][attributename='attributevalue']
	 */
	private static void relativeCSSUSingClassMultipleAttributenamevalue()
	{
		oBrowser.findElement(By.cssSelector("input[class='submit1btn1'][value='Submit']")).click();
	}
	/*
	 * Case 8:Identify the Element based on TagName without Attribute name and value combination 
	 * Syntax:*[attributename='attributevalue']
	 */
	private static void relativeCSSUSingWithoutTagnameonlyAttributenamevalue()
	{
		oBrowser.findElement(By.cssSelector("input[class='submit1btn1'][value='Submit']")).click();
	}
	/*
	 * Case 9:Identify the Element based on Partial Matching of Attribute value combination 
	 * Syntax:<tagname>[attributename^='partial attributevalue']
	 * Syntax:<tagname>[attributename$='partial attributevalue']
	 * Syntax:<tagname>[attributename*='partial attributevalue']
	 */
	private static void relativeCSSUSingTagNAmeWithPartialAttributevalue()
	{
		//oBrowser.findElement(By.cssSelector("input[id^='btn1']")).click();
		//oBrowser.findElement(By.cssSelector("input[id*='mit1']")).click();
		oBrowser.findElement(By.cssSelector("input[id$='button1']")).click();
	}
	/*
	 * Case 10:Identify the Element based on TagName with Attribute name 
	 * Syntax:<tagname>[attributename]
	 */
	private static void relativeCSSUSingWithTagnamewithAttributename()
	{
		//Display Number of links available
		List<WebElement> olinls=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of links are:"+olinls.size());
	}
	private static void relativeCSSUSingWithTagnamewithAttributename_1()
	{
		//Display name of links
		List<WebElement>olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement olink=olinks.get(i);
			String linkname=olink.getText();
			System.out.println(linkname);
		}
	}
	private static void relativeCSSUSingWithTagnamewithAttributename_2()
	{
		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		//element is not Attached to the page document
		List<WebElement>olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement olink=olinks.get(i);
			String linkname=olink.getText();
			if(linkname.endsWith("Apache"))
			{
				olink.click();
			}
		}
	}
	/*
	 * Case 11:Identify the Element based on Parent Tag Details 
	 * Syntax:parent Element>Child Element
	 */
	private static void relativeCSSUSingParentElementReference()
	{
		
		oBrowser.findElement(By.cssSelector("form#frm2>input")).click();		
	}
	/*
	 * Case 12:Identify the Element based on nth child 
	 * Syntax:nth-child(number)
	 */
	private static void relativeCSSUSingNthchildConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3>:nth-child(7)")).sendKeys("userdemo7");
		oBrowser.findElement(By.cssSelector("form#frm3>:nth-child(3)")).sendKeys("userdemo3");
	}
	/*
	 * Case 13:Identify the Element based on Siblings
	 * Syntax:<tagName>+<tagName>+<tagName>
	 */
	private static void relativeCSSUSingSiblingsconcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3>input+input+input+input+input")).sendKeys("userdemo5");
		
	}
	

}
