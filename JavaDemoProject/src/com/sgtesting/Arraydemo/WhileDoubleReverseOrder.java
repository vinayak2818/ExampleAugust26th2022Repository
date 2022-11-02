package com.sgtesting.Arraydemo;

public class WhileDoubleReverseOrder {

	public static void main(String[] args) {
		double a[]= {3.1,3.2,3.3,3.4,3.5,3.6};
		int b=a.length-1;
		while(b>=0) {
			System.out.println(a[b]);
			b--;
		}

	}

}
