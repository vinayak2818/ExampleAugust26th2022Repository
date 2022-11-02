package com.sgtesting.Abstract;
//these are two abstract classes each class contains two abstract methods, write a program to execute all available abstract methods

abstract class Player
{
	abstract void player(String name);
	abstract void player1(String name);
}
abstract class Cricket20 extends Player
{
	abstract void cricket11(String name);
	abstract void cricket12(String name);
	void player(String name)
	{
		System.out.println(name);
	}
	void player1(String name)
	{
		System.out.println(name);
	}
}
class ipl20 extends Cricket20
{
	
	void cricket11 (String name)
	{
		System.out.println(name);
	}
	void cricket12(String name)
	{
		System.out.println(name);
	}
	
}

public class Twoabstractmethod {

	public static void main(String[] args) {
		ipl20 n=new ipl20();
		n.cricket11("Sachin");
		n.cricket12("Suresh");
		n.player("Rohit");
		n.player1("DK");

	}

}
