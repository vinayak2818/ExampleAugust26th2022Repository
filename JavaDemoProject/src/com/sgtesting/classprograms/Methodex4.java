package com.sgtesting.classprograms;
class calculation4
{
	int addition(int x,int y)
	{
		return (x+y);
	}
	int substraction(int a,int b) {
		int res=(a-b);
		return res;
	}
	void multilication()
	{
		int x=this.addition(12, 8);
		int y=this.substraction(15, 11);
		int res=x*y;
		System.out.println("Multiplication Result:"+res);
	}
}

public class Methodex4 {

	public static void main(String[] args) {
		calculation4 C1=new calculation4();
		C1.multilication();
	}

}
