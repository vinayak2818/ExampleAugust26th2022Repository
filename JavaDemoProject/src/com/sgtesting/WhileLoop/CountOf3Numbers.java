package com.sgtesting.WhileLoop;

public class CountOf3Numbers {

	public static void main(String[] args) {
		int i=10;
		int count=0;
		while(i<=90) {
			if((i%3==0)&&(i%6==0)&&(i%9==0)) {
				count++;
			}
			i++;
		}
		System.out.println(count);

	}

}
