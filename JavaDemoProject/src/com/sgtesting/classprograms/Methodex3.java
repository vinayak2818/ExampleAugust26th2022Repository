package com.sgtesting.classprograms;
class calculation3
{
	int addition(int x,int y)
	{
		return(x+y);
	}
	int substraction(int a,int b)
	{
		int res=a-b;
		return res;
	}
	void multiplication(int x,int y) {
		int res=x*y;
		System.out.println("Multiplication Result:"+res);
	}
}

public class Methodex3 {

	public static void main(String[] args) {
		calculation3 o=new calculation3();
		int p=o.addition(10, 25);
		int q=o.substraction(25, 15);
		o.multiplication(p, q);

	}

}
