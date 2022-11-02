package com.sgtesting.Abstract;
//in a multilevel inheritance super class and all abstract 3 class contains same instance variable name write a program to execute all these variables
abstract class aa
{
	String name;
	void show()
	{
		System.out.println(name);
	}
}
abstract class bb extends aa
{
	String name;
	bb()
	{
		super.name="sachin";
	}
	void ee()
	{ name="virat";
		System.out.println(name);
	}
}
abstract class cc extends bb
{
	String name;
	
	void ff()
	{ name="rohit";
		System.out.println(name);
	}
}
class dd extends cc
{
dd()
{
	System.out.println("sam");
}
 }


public class InstanceVariableAbstract {

	public static void main(String[] args) {
		dd n=new dd();	
		n.ff();
		n.ee();
		n.show();
		

	}

}
