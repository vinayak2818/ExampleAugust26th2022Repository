package com.sgtesting.Fifthtest;
class Demo2
{
	String name;
	void demo()
	{
		System.out.println(name);
	}
}
class Demo12 extends Demo2
{
	String name;
	Demo12()
	{
		super.name="vinayak";
		this.name="Suresh";
	}
	void demo1()
	{
		System.out.println(name);
	}
}

public class Seventh {

	public static void main(String[] args) {
		Demo12 a=new Demo12();
		a.demo();
		a.demo1();
		

	}

}
