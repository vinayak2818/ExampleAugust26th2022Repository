package com.sgtesting.Arraydemo;

public class DoWhileStringReverseOrder {

	public static void main(String[] args) {
		String a[]= {"Apple","Orange","Grapes","Mango","Strawberry"};
		int b=a.length-1;
		do {
			System.out.println(a[b]);
			b--;
		}while(b>=0);

	}

}
