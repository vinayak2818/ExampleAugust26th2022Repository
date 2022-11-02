package com.sgtesting.Abstract;
//If an abstract class contains parameterized constructor write a program to execute the parameterized constructor
abstract class Cricket
{
	Cricket(String name) 
	{
		System.out.println("Player name:"+name);
	}
}
class IPL extends Cricket
{
	IPL()
	{
		super("Suresh Raina");
	}
}

public class AbParameterizedConstrctorAb {

	public static void main(String[] args) {
		IPL n=new IPL();
		

	}

}
