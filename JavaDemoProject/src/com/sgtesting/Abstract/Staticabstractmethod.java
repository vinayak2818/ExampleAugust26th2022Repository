package com.sgtesting.Abstract;
//In a multilevel inheritance super class and all abstract 3 class contains same static variable name write a program to execute all these variables
abstract class Static
{
	static String name;
	void display()
	{
		System.out.println(name);
	}
}
abstract class Static1 extends Static
{
	Static1()
	{
		Static.name="niki";
	}
	static String name;
	void dislay1()
	{
		System.out.println(name);
	}
}
abstract class Static2 extends Static1
{
	Static2()
	{
		Static1.name="sam";
	}
	static String name;
	void display2()
	{
		System.out.println(name);
	}
}
class Static3 extends Static2
{
	Static3()
	{
		Static2.name="vin";
	}
}

public class Staticabstractmethod {

	public static void main(String[] args) {
		
		Static3 o=new Static3();
		o.dislay1();
		o.display();
		o.display2();

	}

}
 