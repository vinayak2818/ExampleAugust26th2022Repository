package com.sgtesting.Arraydemo;

public class WhileCharOrderArray {

	public static void main(String[] args) {
		char[] a= {'A','B','C','D','E','F'};
		char b=0;
		while(b<=a.length-1) 
		{
			System.out.println(a[b]);
			b++;
		}
	}
}
