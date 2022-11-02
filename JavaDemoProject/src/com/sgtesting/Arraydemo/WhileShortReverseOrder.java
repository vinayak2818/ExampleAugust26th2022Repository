package com.sgtesting.Arraydemo;

public class WhileShortReverseOrder {

	public static void main(String[] args) {
		short a[]= {21,22,23,24,25,26,27,28,29,30};
		int b=a.length-1;
		while(b>=0) {
			System.out.println(a[b]);
			b--;
		}
		

	}

}
