package com.sgtesting.demoprograms;
class Array2
{
	char[] Array1(char b[])
	{
		
		return b ;
	}
}

public class Test11 {

	public static void main(String[] args) {
		char a[]= {'a','b','c','d','e','f'};
		Array2 A=new Array2();
		char c[]=A.Array1(a);
		for(int i=c.length-1;i>=0;i--) {
			System.out.println(c[i]);
		}

	}

}
