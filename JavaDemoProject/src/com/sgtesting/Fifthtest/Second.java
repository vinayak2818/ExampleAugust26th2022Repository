package com.sgtesting.Fifthtest;
class Demo
{
	void demo(String name)
	{
		System.out.println(name);
	}
}
class Demo1 extends Demo
{
	Demo1()
	{
		super.demo("vinayak");
	}
	void demo(String name )
	{
		System.out.println(name);
	}
}

public class Second {

	public static void main(String[] args) {
		Demo1 a=new Demo1();
		a.demo("pl");
		

	}

}
