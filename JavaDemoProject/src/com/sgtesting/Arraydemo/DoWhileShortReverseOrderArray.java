package com.sgtesting.Arraydemo;

public class DoWhileShortReverseOrderArray {

	public static void main(String[] args) {
		short s[]= {11,12,13,14,15,16,17};
		int a=s.length-1;
		do {
			System.out.println(s[a]);
			a--;
		}while(a>=0);

	}

}
