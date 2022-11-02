package com.sgtesting.Indroductionpart2;
class Recurse
{
	int Recursion(int a)
	{
		if(a==1)
		{
			return 1;
		}
		
		return a*Recursion(a-1);
	}
}

public class RecursionExample1 {

	public static void main(String[] args) {
		Recurse a=new Recurse();
		int b=a.Recursion(5);
		System.out.println(b);

	}

}
