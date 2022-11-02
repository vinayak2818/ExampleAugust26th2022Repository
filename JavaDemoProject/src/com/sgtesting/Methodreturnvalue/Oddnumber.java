package com.sgtesting.Methodreturnvalue;
class Odd
{
	int [] odd()
	{
		int count=0;
		for(int i=141;i>=111;i--) {
			if(i%2==1) {
				count++;
			}
		}
		int g[]=new int[count];
		int i=0;
		for(int p=111;p<=141;p++) {
			if(p%2==1) {
				g[i]=p;
				i++;
			}
		}return g;
	}
}

public class Oddnumber {

	public static void main(String[] args) {
		Odd o=new Odd();
		int p[]=o.odd();
		for(int b=0;b<p.length;b++) {
			System.out.println(p[b]);
		}
	}

}
