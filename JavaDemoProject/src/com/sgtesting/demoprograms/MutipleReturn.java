package com.sgtesting.demoprograms;
class Multiple1
{
	int[] multi(int a)
	{
		int p=0;
		int h[]=new int[10];
		for(int i=1;i<=10;i++) 
		{
			h[p]=a*i;
			p++;
		}
		return h;
	}
}

public class MutipleReturn {

	public static void main(String[] args) {
		Multiple1 M=new Multiple1();
		int a[]=M.multi(6);
		for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}

	}

}
