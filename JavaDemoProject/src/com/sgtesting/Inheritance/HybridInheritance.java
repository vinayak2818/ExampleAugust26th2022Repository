package com.sgtesting.Inheritance;
class Country
{
	Country() 
	{
		System.out.println("India");
	}
}
class State extends Country
{
	State() 
	{
		super();
		System.out.println("Goa");
	}
}
class State1 extends Country
{
	State1()
	{
		super();
		System.out.println("Karnataka");
	}
}
class District extends State1
{
	District() 
	{
		super();
		System.out.println("Gadag");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		State n=new State();
		District o=new District();
		

	}

}
