package com.sgtesting.ExceptionHandlingClassprograms;
class Basicmaths
{
	static void addition(int x ,int y)
	{
		int res=x+y;
		System.out.println("Addition Result:"+res);
	}
	static void substraction(int x ,int y)
	{
		int res=x-y;
		System.out.println("Substraction Result:"+res);
	}
	static void division(int x ,int y)
	{
		int res=x/y;
		System.out.println("Division Result:"+res);
	}
	static void multiplication(int x ,int y)
	{
		int res=x*y;
		System.out.println("Multiplication Result:"+res);
	}
	static void modulus(int x ,int y)
	{
		int res=x%y;
		System.out.println("Modulus Result:"+res);
	}
	static void isevennumber(int x )
	{
		if(x%2==0) 
		{
			System.out.println(x +" is a Even number");
		}
	}
	static void isoddnumber(int x)
	{
		if(x%2==1) {
			System.out.println(x +" is a Odd number");
		}
	}
}

public class BeforeExceptionHandlingFirstexample {

	public static void main(String[] args) {
		Basicmaths.addition(10, 12);
		Basicmaths.substraction(40, 10);
		Basicmaths.division(24, 0);
		Basicmaths.multiplication(5, 4);
		Basicmaths.modulus(45, 7);
		Basicmaths.isevennumber(62);
		Basicmaths.isoddnumber(65);

	}

}
