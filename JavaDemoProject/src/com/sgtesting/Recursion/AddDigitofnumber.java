package com.sgtesting.Recursion;
class Addnumber
{
	int findsum(int n)
	{
		int rem, sum=0;
		while(n>0) 
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}

public class AddDigitofnumber {

	public static void main(String[] args) {
		Addnumber A=new Addnumber();
		int n=784597432;
		int b=A.findsum(n);
		System.out.println(b);

	}

}
