package com.sgtesting.Abstract;
//In a multilevel inheritance superclass is an abstract class it has constructor overloading 
abstract class Employee
{
	Employee(String name)
	{
		System.out.println("Employee name:"+name);
	}
	Employee(int sal)
	{
		System.out.println("Employee Salary:"+sal);
	}
}
class Company extends Employee
{
	Company(String name)
	{
		super(name);
		
	}
	Company(int noofemp)
	{
		super(noofemp);
		
	}
	Company(String location,int pincode)
	{
		super("nikhil");
		
	}
	
}
class Designation extends Company
{
	 Designation(String name)
	
	 {
		 super(name);
		 
	 }
	 Designation(int pincode)
	 {
		 super(pincode);
		 
	 }
	 
	 
}

public class MultilevelConstructorOverloading {

	public static void main(String[] args) {
		Designation n=new Designation("Richard");
		Designation n1=new Designation(1257400);
		
		
		
		
		
		

	}

}
