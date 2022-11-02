package com.sgtesting.Fifthtest;
class Callbyreference
{
	int x,y;
	void call(Callbyreference o)
	{
		o.x+=100;
		o.y-=45;
		System.out.println("within:"+o.x);
		System.out.println("within:"+o.y);
	}
}

public class Nine {

	public static void main(String[] args) {
		Callbyreference a=new Callbyreference();
		
		a.x=10;
		a.y=7;
		System.out.println(a.x);
		System.out.println(a.y);
		a.call(a);
		System.out.println(a.x);
		System.out.println(a.y);

	}

}
