package com.sgtesting.Inheritance;

class Cricket
{
	void player(String name)
	{
		System.out.println("INDIAN player name:"+name);
	}
}
class ipl extends Cricket
{
	ipl()
	{
		super.player("MS Dhoni");
		
	}
	void player(String name)
	{
		
		System.out.println("IPL player name:"+name);
	}
}
class Domestic extends ipl
{
	Domestic() 
	{
		super.player("Sachin Tendulkar");
	}
	void player(String name)
	{
		
		System.out.println("DOMESTIC player name:"+name);
	}
}

public class MultilevelSamemethodnameinheritance {

	public static void main(String[] args) {
		Domestic n=new Domestic();
		n.player("Suresh Raina");

	}

}
