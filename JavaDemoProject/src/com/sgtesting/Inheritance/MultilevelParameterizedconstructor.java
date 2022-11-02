package com.sgtesting.Inheritance;
class Addition
{
	void addition(int x,int y) 
	{
		int res=x+y;
		System.out.println("Addition Result:"+res);
	}
}
class Substration extends Addition
{
	
	Substration() 
	{
		super.addition(5, 4);
		
	}
	void substration(int x,int y) 
	{
		int res=x-y;
		System.out.println("Substraction Result:"+res);
	}
}
class Multiplication extends Substration
{
	
	Multiplication() 
	{
		
		super.substration(40, 12);
	}
	void Multiplication1(int x,int y) 
	{
		int res=x*y;
		System.out.println("Multiplication Result:"+res);
	}
}


public class MultilevelParameterizedconstructor {

	public static void main(String[] args) {
		 Multiplication n=new Multiplication();
		 n.Multiplication1(4, 12);
		 

	}

}
