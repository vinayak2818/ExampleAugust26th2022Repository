package com.sgtesting.product;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Product {

	@Test
	public void createProduct()
	{
		System.out.println("User Demoproduct1 has Created Successfully.....");
	}
	@Test
	public void modifyproduct()
	{
		System.out.println("User DemoProduct1 had Modified Successfully....");
	}
	@Test
	public void deleteProduct()
	{
		System.out.println("User demoproduct1 has deleted Successfully....");
	}
	@BeforeClass
	public void Setup()
	{
		System.out.println("Launch Browser,Navigate URL and Login into the Aplication...");
	}
	@AfterClass
	public void teardown()
	{
		System.out.println("Logout from the Application and Close Application...");
		System.out.println("_________________________________");
	}

}
