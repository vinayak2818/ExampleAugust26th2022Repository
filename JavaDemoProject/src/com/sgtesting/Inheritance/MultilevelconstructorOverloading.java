package com.sgtesting.Inheritance;
class Employee1
{
	Employee1(String name)
	{
		System.out.println("Employee name:"+name);
	}
	Employee1(String cname,int Noofemployee) 
	{
		this("Santosh");
		System.out.println("Company name:"+cname + "Number of Employees:"+Noofemployee);
	}
}
class Designation1 extends Employee1
{	
	Designation1() 
	{
		super("S G Testing",12000);
		
	}
	void designation(String Position) 
	{
		System.out.println("Designation of Employee:"+Position);
	}
}
class Salary extends Designation1
{
	Salary()
	{
		super();
	}
	void Salary1(String sal)
	{
		System.out.println("Salary:"+sal);
	}
	
}
public class MultilevelconstructorOverloading {

	public static void main(String[] args) {
		Designation1 n=new Designation1();
		n.designation("manager");


	}

}
