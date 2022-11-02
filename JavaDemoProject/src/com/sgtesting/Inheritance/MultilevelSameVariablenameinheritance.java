package com.sgtesting.Inheritance;
class Cricket11
{
	String Player1;
	void player15()
	{
		System.out.println("INDIAN player name:"+Player1);
	}
}
class ipl1 extends Cricket11
{
	String Player1;
	ipl1()
	{
		super.Player1="Dinesh Kartik";
	}
	void player13()
	{

		System.out.println("IPL player name:"+Player1);
	}
}
class Domestic11 extends ipl1
{
	String Player1;	
	Domestic11() 	{
		super.Player1="Rahul Dravid";
		this.Player1="MS Dhoni";
	}
	
	void player()
	{

		System.out.println("DOMESTIC player name:"+Player1);
	}
}

public class MultilevelSameVariablenameinheritance {

	public static void main(String[] args) {
		Domestic11 n=new Domestic11();
		n.player();
		n.player13();
		n.player15();
		
		


	}

}
