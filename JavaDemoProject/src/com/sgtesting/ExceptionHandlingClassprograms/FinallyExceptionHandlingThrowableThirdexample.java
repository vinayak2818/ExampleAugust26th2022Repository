package com.sgtesting.ExceptionHandlingClassprograms;
class Basicmaths4
{
	static void addition4(int x ,int y)
	{
		int res=x+y;
		System.out.println("Addition Result:"+res);
	}
	static void substraction4(int x ,int y)
	{
		int res=x-y;
		System.out.println("Substraction Result:"+res);
	}
	static void division4(int x ,int y)
	{
		try
		{
		int res=x/y;
		System.out.println("Division Result:"+res);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("this block Execute always!!!");
		}
	}
	static void multiplication4(int x ,int y)
	{
		int res=x*y;
		System.out.println("Multiplication Result:"+res);
	}
	static void modulus4(int x ,int y)
	{
		int res=x%y;
		System.out.println("Modulus Result:"+res);
	}
	static void isevennumber4(int x )
	{
		if(x%2==0) 
		{
			System.out.println(x +" is a Even number");
		}
	}
	static void isoddnumber4(int x)
	{
		if(x%2==1) {
			System.out.println(x +" is a Odd number");
		}
	}
}


public class FinallyExceptionHandlingThrowableThirdexample {

	public static void main(String[] args) {
		Basicmaths4.addition4(10, 12);
		Basicmaths4.substraction4(40, 10);
		Basicmaths4.division4(24, 0);
		Basicmaths4.multiplication4(5, 4);
		Basicmaths4.modulus4(45, 7);
		Basicmaths4.isevennumber4(62);
		Basicmaths4.isoddnumber4(65);

	}

}
