package com.sgtesting.demoprograms;

public class Test2 {

	public static void main(String[] args) {
		int count=0;
		for(int i=60;i<=100;i++) {
			if(i%9==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
