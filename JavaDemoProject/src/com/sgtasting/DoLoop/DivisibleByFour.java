package com.sgtasting.DoLoop;

public class DivisibleByFour {

	public static void main(String[] args) {
		int i=1;
		do {
			if(i%4==0) {
				System.out.println(i);
			}
			i++;
		} while (i<=50);


	}

}
