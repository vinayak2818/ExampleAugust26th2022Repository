package com.sgtesting.demoprograms;

public class Test3 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=50;i<=100;i++) {
			if(i%10==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
