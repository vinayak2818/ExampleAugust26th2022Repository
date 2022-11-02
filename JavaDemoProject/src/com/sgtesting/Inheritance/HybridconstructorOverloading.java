package com.sgtesting.Inheritance;
class Employee2
{
	Employee2()
	{
		String name="Mechanical Engineering";
		System.out.println("Branch name:"+name);
	}
	Employee2(String cname,int Noofemployee) 
	{
		this();
		System.out.println("Company name:"+cname + "  Number of Employees:"+Noofemployee);
	}
}
class Designation2 extends Employee2
{	
	Designation2() 
	{
		super("S G Testing",12000);
		this.designation("Manager");
	}
	void designation(String Position) 
	{
		System.out.println("Designation of Employee:"+Position);
	}
}
class Employeename extends Employee2
{
	Employeename() {
		super("Dell",120);

	}
	void empname(String name)
	{
		System.out.println("Employee name :"+name);
	}
}
class Joiningdate extends Employeename
{
	Joiningdate() {
		super.empname("Richard");
		System.out.println("21-SEPT-2022");
	}
}
public class HybridconstructorOverloading {

	public static void main(String[] args) {
		Joiningdate n=new Joiningdate();
		Designation2 o=new Designation2();
	}

}
