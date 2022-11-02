package com.sgtesting.demoprograms;
class Multiple
{
	Multiple(int x)
	{
		for(int i=10;i>=1;i--) {
			System.out.println(x+"*"+i+"="+x*i);
		}
	}
}

public class Multiplesof8table {

	public static void main(String[] args) {
		int a=8;
		Multiple o1=new Multiple(a);

	}

}
