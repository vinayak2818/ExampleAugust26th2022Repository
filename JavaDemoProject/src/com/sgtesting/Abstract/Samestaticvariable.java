package com.sgtesting.Abstract;
abstract class xx
{
	static String name; 

}
abstract class yy extends xx
{
	static String name; 
	yy()
	{
		name="vinayak";
	}

}
abstract class zz extends yy
{
	static String name;
	zz()
	{
		name="sam";
	}
}
class ab extends zz
{
	ab()
	{
		name="niki";
	}
}

public class Samestaticvariable {

	public static void main(String[] args) {
	ab n=new ab();
	System.out.println(zz.name);
	System.out.println(yy.name);
	
		

	}

}
