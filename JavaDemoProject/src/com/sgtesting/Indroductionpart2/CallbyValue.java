package com.sgtesting.Indroductionpart2;
class callbyvalue1
{
	void Calculate(int x,int y)
	{
		x+=100;
		y-=1;
		System.out.println("In this method value of x:"+x);
		System.out.println("In this method value of y:"+y);
	}
}

public class CallbyValue {

	public static void main(String[] args) {
		int x,y;
		x=10;y=5;
		System.out.println("Before execution the value of x:"+x);
		System.out.println("Before execution the value of y:"+y);
		callbyvalue1 a=new callbyvalue1();
		a.Calculate(x, y);
		System.out.println("After execution the value of x:"+x);
		System.out.println("After execution the value of y:"+y);
	}

}
