package com.sgtesting.ExceptionHandlingClassprograms;
class Basicmaths2
{
	static void addition2(int x ,int y)
	{
		int res=x+y;
		System.out.println("Addition Result:"+res);
	}
	static void substraction2(int x ,int y)
	{
		int res=x-y;
		System.out.println("Substraction Result:"+res);
	}
	static void division2(int x ,int y)
	{
		try
		{
		int res=x/y;
		System.out.println("Division Result:"+res);
		}catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
	static void multiplication2(int x ,int y)
	{
		int res=x*y;
		System.out.println("Multiplication Result:"+res);
	}
	static void modulus2(int x ,int y)
	{
		int res=x%y;
		System.out.println("Modulus Result:"+res);
	}
	static void isevennumber2(int x )
	{
		if(x%2==0) 
		{
			System.out.println(x +" is a Even number");
		}
	}
	static void isoddnumber2(int x)
	{
		if(x%2==1) {
			System.out.println(x +" is a Odd number");
		}
	}
}

public class ExceptionHandlingThrowableFirstexample {

	public static void main(String[] args) {
		Basicmaths2.addition2(10, 12);
		Basicmaths2.substraction2(40, 10);
		Basicmaths2.division2(24, 0);
		Basicmaths2.multiplication2(5, 4);
		Basicmaths2.modulus2(45, 7);
		Basicmaths2.isevennumber2(62);
		Basicmaths2.isoddnumber2(65);

	}

}
