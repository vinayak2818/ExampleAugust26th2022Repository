package com.sgtesting.Abstract;
//an abstract class contains static block alone ,write a program to execute the static block
abstract class Block
{
	static 
	{
		System.out.println("it is a static block");
	}
}
class Block1 extends Block
{
	Block1() 
	{
	System.out.println("it is a constructor");
	}
}

public class AbstractStaticblock {

	public static void main(String[] args) {
		Block1 n=new Block1();
		

	}

}
