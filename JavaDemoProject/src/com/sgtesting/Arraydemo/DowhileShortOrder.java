package com.sgtesting.Arraydemo;

public class DowhileShortOrder {

	public static void main(String[] args) {
		short s[]= {11,12,13,14,15,16,17};
		int a=0;
		do {
			System.out.println(s[a]);
			a++;
		}while(a<s.length);
	}
}
