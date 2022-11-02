package com.sgtesting.WhileLoop;

public class CountofEvenNumber {

	public static void main(String[] args) {
		int i=250;
		int count=0;
		while(i<=500) {
			if(i%2==0) {
				count++;
			}
			i++;
		}
		System.out.println(count);

	}

}
