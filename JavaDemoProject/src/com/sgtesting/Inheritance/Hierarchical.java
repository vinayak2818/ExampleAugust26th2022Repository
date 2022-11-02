package com.sgtesting.Inheritance;
class Employee
{
	void Employeename(String name)
	{		
		System.out.println("Employee name:"+name);
	}
}
class Company extends Employee

{
	Company(String name)
	{
		super.Employeename(name);
	}
	void Companyanme(String cn)
	{	
		
		System.out.println("Company name:"+cn);
	}
}
class Designation extends Employee
{
	void Designationname(String Pos)
	{		
		
		System.out.println("Designation:"+Pos);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Company o=new Company("vinayak");
		o.Companyanme("S G Testing");
		o.Employeename("vinayak");
		

		Designation n=new Designation();
		n.Designationname("Manager");
		n.Employeename("santosh");
	}

}
