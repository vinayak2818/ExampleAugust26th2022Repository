package com.sgtesting.Methodreturnvalue;
class Resultant
{
	int [] resultant()
	{
		int a[]= {5,6,7,8,9};
		int b[]= {10,20,30,40,50,60};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=a.length;i<(a.length+b.length);i++) {
			c[i]=b[i-a.length];
		}return c;
	}
}

public class ResultantReturnvalue {

	public static void main(String[] args) {
		Resultant r=new Resultant();
		int p[]=r.resultant();
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i]+" ");
		}

	}

}
