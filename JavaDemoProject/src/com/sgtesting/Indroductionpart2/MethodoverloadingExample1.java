package com.sgtesting.Indroductionpart2;
class overload
{
	void addition(int x, int y)
	{
		int res=x+y;
		System.out.println(res);
	}
	void addition(int x,int y,int z)
	{
		int res=x+y+z;
		System.out.println(res);
	}
	void addition(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Addition Result:"+sum);
	}
}

public class MethodoverloadingExample1 {

	public static void main(String[] args) {
		overload a=new overload();
		a.addition(12, 12);
		a.addition(2, 2, 2);
		int b[]= {10,20,30,40};
		a.addition(b);

	}

}
