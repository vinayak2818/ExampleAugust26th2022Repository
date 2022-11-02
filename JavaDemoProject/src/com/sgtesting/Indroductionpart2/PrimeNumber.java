package com.sgtesting.Indroductionpart2;
class prime
{
	void verifyprimenumber(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is a prime number");
		}else
		{
			System.out.println(num+" is not a prime number");
		}
	}
	boolean isprime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}else
		{
			return false;
		}
	}
}


public class PrimeNumber {

	public static void main(String[] args) {
		prime a=new prime();
		a.verifyprimenumber(113);
		
		boolean c=a.isprime(13);
		if (c==true)
		{
			System.out.println("it is a prime");
		}else
		{
			System.out.println("it is not a prime");
		}
		System.out.println("display numbers between 20 to 60");
		for(int i=20;i<60;i++)
		{
			if(a.isprime(i)==true)
			{
				System.out.println(i);
			}
		}

	}

}
