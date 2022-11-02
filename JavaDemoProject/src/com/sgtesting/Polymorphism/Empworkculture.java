package com.sgtesting.Polymorphism;
abstract class Employeeworkculture
{
	abstract void culture();
}
class Employee1 extends  Employeeworkculture
{
	void culture()
	{
		String name="Clan Culture";
		System.out.println("Employee1 Workculture:"+name);
	}
}
class  Employee2 extends Employeeworkculture
{
	void culture()
	{
		String name="Customer-Focused Culture";
		System.out.println("Employee2 Workculture:"+name);
	}
}
class Employee3 extends Employeeworkculture
{
	void culture()
	{
		String name="Hierarchy Culture";
		System.out.println("Employee3 Workculture:"+name);
	}
}
public class Empworkculture {

	public static void main(String[] args) {
		Employeeworkculture emp=null;
		
		Employee1 d1=new Employee1();
		Employee2 d2=new Employee2();
		Employee3 d3=new Employee3();
		
		emp=d1;
		emp.culture();
		emp=d2;
		emp.culture();
		emp=d3;
		emp.culture();
		
		

	}

}
