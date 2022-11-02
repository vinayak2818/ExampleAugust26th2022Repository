package com.sgtesting.classprograms;
class calculation32
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


public class Methodex3same {

	public static void main(String[] args) {
		calculation32 o=new calculation32();
		o.multiplication(o.addition(5, 10),o.substraction(10, 4));

	}

}
