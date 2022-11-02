package com.sgtasting.DoLoop;

public class DivisibleByTen {

	public static void main(String[] args) {
		int i=100;
		do {
			if(i%10==0) {
				System.out.println(i);
			}
			i++;
		}while (i<=150);


	}

}
