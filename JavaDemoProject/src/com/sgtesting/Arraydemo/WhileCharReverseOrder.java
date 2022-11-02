package com.sgtesting.Arraydemo;

public class WhileCharReverseOrder {

	public static void main(String[] args) {
		char[] a= {'A','B','C','D','E','F'};
		int b=a.length;
		while(b>=1) {
			b--;
			System.out.println(a[b]);
		}
	}

}
