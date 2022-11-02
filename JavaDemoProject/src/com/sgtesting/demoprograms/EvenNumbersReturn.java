package com.sgtesting.demoprograms;
class Evennumber
{
	int[] even() 
	{
		int count=0;
		for(int i=20;i<=40;i++) {
			if(i%2==0) {
				count++;
			}
		}
		int Even[]=new int[count];
		int p=0;
		for(int j=20;j<=40;j++) {
			if(j%2==0) {
				Even[p]=j;
				p++;
			}
		}return Even;
	}
}

public class EvenNumbersReturn {

	public static void main(String[] args) {
		Evennumber E=new Evennumber();
		int a[]=E.even();
		for(int k=a.length-1;k>=0;k--) {
			System.out.println(a[k]);
		}

	}

}
