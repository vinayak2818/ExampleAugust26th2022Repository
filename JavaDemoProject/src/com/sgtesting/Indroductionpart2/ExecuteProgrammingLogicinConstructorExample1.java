package com.sgtesting.Indroductionpart2;
class demo
{
	demo(int arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	demo(int x,int y)
	{
		int res=x+y;
		System.out.println("Addition Result:"+res);
	}
}

public class ExecuteProgrammingLogicinConstructorExample1 {

	public static void main(String[] args) {
		int a=20;
		int b=23;
		demo f=new demo(a,b);
		int e[]= {10,20,30,40,50,60};
		demo f1=new demo(e);

	}

}
