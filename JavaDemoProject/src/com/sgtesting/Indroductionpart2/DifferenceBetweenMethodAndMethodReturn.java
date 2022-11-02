package com.sgtesting.Indroductionpart2;
class Array
{
	void DisplayArray()
	{
		int a[]= {10,20,30,40,50,60};
		System.out.println("Reading without Returning File:");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
	}
	int[] Array1()
	{
	
		int a[]= {10,20,30,40,50,60,70,80};
		return a;
	}
}

public class DifferenceBetweenMethodAndMethodReturn {

	public static void main(String[] args) {
		Array a=new Array();
		a.DisplayArray();
		System.out.println("Reverse order");
		 
		int f[]=a.Array1();
		for(int i=f.length-1;i>=0;i--)
		{
			System.out.println(f[i]);
		}
		System.out.println("HalfArray reverse");
		int h[]=a.Array1();
		for(int i=h.length-1;i>=h.length/2;i--)
		{
			System.out.println(h[i]);
		}
		System.out.println("FirstHalf");
		int e[]=a.Array1();
		for(int i=0;i<e.length/2;i++)
		{
			System.out.println(e[i]);
		}
		

	}

}
