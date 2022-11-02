package com.sgtasting.DoLoop;

public class DivisibleByseven {

	public static void main(String[] args) {
		int i=100;
		do {
			if(i%7==0) {
				System.out.println(i);
			}
			i--;
		}while (i>=50);


	}

}
