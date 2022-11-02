package com.sgtesting.ExceptionHandlingClassprograms;
class Basicmaths1
{
	static void addition1(int x ,int y)
	{
		int res=x+y;
		System.out.println("Addition Result:"+res);
	}
	static void substraction1(int x ,int y)
	{
		int res=x-y;
		System.out.println("Substraction Result:"+res);
	}
	static void division1(int x ,int y)
	{
		try
		{
		int res=x/y;
		System.out.println("Division Result:"+res);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	static void multiplication1(int x ,int y)
	{
		int res=x*y;
		System.out.println("Multiplication Result:"+res);
	}
	static void modulus1(int x ,int y)
	{
		int res=x%y;
		System.out.println("Modulus Result:"+res);
	}
	static void isevennumber1(int x )
	{
		if(x%2==0) 
		{
			System.out.println(x +" is a Even number");
		}
	}
	static void isoddnumber1(int x)
	{
		if(x%2==1) {
			System.out.println(x +" is a Odd number");
		}
	}
}

public class AfterExceptionHandlingSecondexample {

	public static void main(String[] args) {
		Basicmaths1.addition1(10, 12);
		Basicmaths1.substraction1(40, 10);
		Basicmaths1.division1(24, 0);
		Basicmaths1.multiplication1(5, 4);
		Basicmaths1.modulus1(45, 7);
		Basicmaths1.isevennumber1(62);
		Basicmaths1.isoddnumber1(65);

	}

}
