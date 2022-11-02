package com.sgtesting.Indroductionpart2;
class callbyrefer
{
	int x,y;
	void callbyreference(callbyrefer a)
	{
		a.x+=100;
		a.y+=5;
		System.out.println("In this method value of x:"+a.x);
		System.out.println("In this method value of y:"+a.y);
	}
}

public class CallbyReference {

	public static void main(String[] args) {
		callbyrefer a=new callbyrefer();
		a.x=10;
		a.y=3;
		System.out.println("Before Execution, the value of x:"+a.x);
		System.out.println("Before Execution, the value of y:"+a.y);
		a.callbyreference(a);
		System.out.println("After Execution, the value of x:"+a.x);
		System.out.println("After Execution, the value of y:"+a.y);
		
		


	}

}
