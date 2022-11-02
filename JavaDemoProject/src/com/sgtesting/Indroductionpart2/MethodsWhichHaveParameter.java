package com.sgtesting.Indroductionpart2;
class Maths21
{
	void Addition(int x,int y)
	{
		int res=x+y;
		System.out.println("Addition result:"+res);
	}
}

public class MethodsWhichHaveParameter {

	public static void main(String[] args) {
		//by using multiple object we can get multiple Result
	Maths21 a=new Maths21();
	a.Addition(25,12);
	a.Addition(25, 46);
	a.Addition(7, 6);
	a.Addition(3, 54);

	}

}
