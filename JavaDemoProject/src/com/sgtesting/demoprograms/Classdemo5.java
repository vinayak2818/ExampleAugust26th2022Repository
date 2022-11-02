package com.sgtesting.demoprograms;
class demo1
{
	demo1 (int arr[])
	{
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	demo1 (int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition Result:"+res);
	}
}

public class Classdemo5 {

	public static void main(String[] args) {
		int a=20;
		int b=40;
		demo1 o1=new demo1(a,b);
		int kk[]= {10,20,30,40};
		demo1 o2=new demo1(kk);

	}

}
