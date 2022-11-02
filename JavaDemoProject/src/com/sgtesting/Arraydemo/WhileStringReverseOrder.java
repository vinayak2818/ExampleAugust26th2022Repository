package com.sgtesting.Arraydemo;

public class WhileStringReverseOrder {

	public static void main(String[] args) {
		String a[]= {"Apple","Orange","Grapes","Mango","Strawberry"};
		int b=a.length-1;
		while(b>=0) {
			System.out.println(a[b]);
			b--;
		}

	}

}
