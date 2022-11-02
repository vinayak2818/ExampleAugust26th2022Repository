package com.sgtesting.demoprograms;

public class CastingPrimeornot {

	public static void main(String[] args) {
		int num=23;
		int cc=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0) 
			{
				cc++;
				break;
			}
		}
		if(cc==0) 
		{
			System.out.println(num+" is a prime number");
		}
		else 
		{
			System.out.println(num+"is not a prime number");
		}
	}

}
