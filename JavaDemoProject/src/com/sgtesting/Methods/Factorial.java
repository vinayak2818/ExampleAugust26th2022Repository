package com.sgtesting.Methods;
class Factorial1
{
	void fact(int fact,int a)
	{		
		for(int i=a;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}

public class Factorial {

	public static void main(String[] args) {
		Factorial1 f1=new Factorial1();
		f1.fact(1,9);
		f1.fact(1,3);
		f1.fact(1,5);



	}

}
