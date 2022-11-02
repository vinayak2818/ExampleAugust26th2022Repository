package com.sgtesting.demoprograms;
class multiplication
{
	int[]Multiple()
	{
		int n=9;		
		int a[]=new int[10];
		for(int i=1,h=0;i<=10;i++,h++) 
		{
			a[h]=n*i;

		}
		return a;
	}
}

public class Test13 {

	public static void main(String[] args) {
		multiplication M=new multiplication();

		int[]q=M.Multiple();

		for(int j=0;j<10;j++) {
			System.out.println(q[j]);
		}
	}

}
