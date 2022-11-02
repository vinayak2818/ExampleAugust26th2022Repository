package com.sgtesting.ExceptionHandlingClassprograms;
class Basicmaths3
{
	static void addition3(int x ,int y)
	{
		int res=x+y;
		System.out.println("Addition Result:"+res);
	}
	static void substraction3(int x ,int y)
	{
		int res=x-y;
		System.out.println("Substraction Result:"+res);
	}
	static void division3(int x ,int y)
	{
		try
		{
		int res=x/y;
		System.out.println("Division Result:"+res);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void multiplication3(int x ,int y)
	{
		int res=x*y;
		System.out.println("Multiplication Result:"+res);
	}
	static void modulus3(int x ,int y)
	{
		int res=x%y;
		System.out.println("Modulus Result:"+res);
	}
	static void isevennumber3(int x )
	{
		if(x%2==0) 
		{
			System.out.println(x +" is a Even number");
		}
	}
	static void isoddnumber3(int x)
	{
		if(x%2==1) {
			System.out.println(x +" is a Odd number");
		}
	}
}

public class ExceptionHandlingThrowableSecondexample {

	public static void main(String[] args) {
		Basicmaths3.addition3(10, 12);
		Basicmaths3.substraction3(40, 10);
		Basicmaths3.division3(24, 0);
		Basicmaths3.multiplication3(5, 4);
		Basicmaths3.modulus3(45, 7);
		Basicmaths3.isevennumber3(62);
		Basicmaths3.isoddnumber3(65);

	}

}
