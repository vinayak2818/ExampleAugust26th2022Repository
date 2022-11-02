package com.sgtasting.DoLoop;

public class CountOfNumberDemo {

	public static void main(String[] args) {
		int i=170;
		int count=0;
		do {
			if(i%5==0) {
				count++;
			}
			i--;
		}while(i>=70);
		System.out.println(count);

	}

}
