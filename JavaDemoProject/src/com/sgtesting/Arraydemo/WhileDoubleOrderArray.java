package com.sgtesting.Arraydemo;

public class WhileDoubleOrderArray {

	public static void main(String[] args) {
		double a[]= {3.1,3.2,3.3,3.4,3.5,3.6};
		int b=0;
		while(b<=a.length-1) 
		{
			System.out.println(a[b]);
			b++;			
		}
	}
}
