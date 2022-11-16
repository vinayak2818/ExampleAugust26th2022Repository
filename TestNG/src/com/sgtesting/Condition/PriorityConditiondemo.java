package com.sgtesting.Condition;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityConditiondemo {
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("user Demouser1 has Created Successfully....");
	}
	@Test(priority = 2)
	public void modifyUser()
	{
		System.out.println("User demoUser1 has modified successfully...");
	}

	@Test(priority = 3)
	public void deleteUser()
	{
		System.out.println("User demoUser1 has deleted successfully...");
	}
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Browser, Navigate URL and Login into the Application");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and Close Application..");
		System.out.println("+++++++++++++++++++++++++++++");
	}
	

}
