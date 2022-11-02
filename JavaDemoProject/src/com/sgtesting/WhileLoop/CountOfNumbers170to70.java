package com.sgtesting.WhileLoop;

public class CountOfNumbers170to70 {

	public static void main(String[] args) {
		int i=170;
		int count=0;
		while(i>=70) {
			if(i%5==0) {
				count++;
			}
			i--;
		}
		System.out.println(count);

	}

}
