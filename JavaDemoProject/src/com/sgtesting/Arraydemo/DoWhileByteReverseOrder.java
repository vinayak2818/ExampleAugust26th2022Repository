package com.sgtesting.Arraydemo;

public class DoWhileByteReverseOrder {

	public static void main(String[] args) {
		byte a[]={2,4,6,8,10,12,14};
		int b=a.length-1;
		do {
			System.out.println(a[b]);
			b--;
		}while(b>=0);
	}
}
