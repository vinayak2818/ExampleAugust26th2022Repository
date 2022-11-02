package com.sgtesting.Arraydemo;

public class DoWhileByteOrder {

	public static void main(String[] args) {
		byte a[]={2,4,6,8,10,12,14};
		int b=0;
		do {
			System.out.println(a[b]);
			b++;
		}while(b<a.length);
	}
}
