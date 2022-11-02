package com.sgtesting.forloopdemo;

public class CountOfEven {

	public static void main(String[] args) {
		int count=0;
		for(int i=250;i<=500;i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
