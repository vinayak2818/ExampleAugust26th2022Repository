package com.sgtesting.Arraydemo;

public class DoWhileStringOrderArray {

	public static void main(String[] args) {
		String a[]= {"Apple","Orange","Grapes","Mango","Strawberry"};
		int b=0;
		do {
			System.out.println(a[b]);
			b++;
		}while(b<a.length);

	}

}
