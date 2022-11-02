package com.sgtesting.Fifthtest;
class Para
{
	static
	{
		Para a=new Para("vinayak");
		System.out.println("Static block");
	}
	Para(String name)
	{
		System.out.println(name);
	}
	static void para()
	{
		int a=22;
		System.out.println(a);
	}
}

public class Eight {

	public static void main(String[] args) {
		Para.para();

	}

}
