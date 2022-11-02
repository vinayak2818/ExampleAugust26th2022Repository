package com.sgtesting.Arraydemo;

public class DoWhileCharReverseOrder {

	public static void main(String[] args) {
		char a[]= {'a','b','c','d','e','f','g','h'};
		int b=a.length-1;
		do {
			System.out.println(a[b]);
			b--;
		}while(b>=0);
		

	}

}
