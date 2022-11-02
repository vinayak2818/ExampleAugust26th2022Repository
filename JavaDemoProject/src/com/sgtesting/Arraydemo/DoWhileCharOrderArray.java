package com.sgtesting.Arraydemo;

public class DoWhileCharOrderArray {

	public static void main(String[] args) {
		char a[]= {'a','b','c','d','e','f','g','h'};
		char b=0;
		do {
			System.out.println(a[b]);
			b++;
		}while(b<a.length);

	}

}
