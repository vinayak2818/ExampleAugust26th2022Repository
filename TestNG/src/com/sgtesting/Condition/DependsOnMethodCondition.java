package com.sgtesting.Condition;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnMethodCondition {

	@Test
	public void CreateUser()
	{
		System.out.println("User demoUser1 has created successfully....");
	}
	@Test(dependsOnMethods="CreateUser")
	public void modifyuser()
	{
		System.out.println("User demoUser1 has modified Successfully....");
	}
	@Test(dependsOnMethods="modifyuser" )
	public void deleteUser()
	{
		System.out.println("User demoUsr1 has deleted successfully....");
	}
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Browser,Navigate URL and Login into the Aplication...");
	}
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and Close Aplication");
		System.out.println("___________________________________");
	}
}
