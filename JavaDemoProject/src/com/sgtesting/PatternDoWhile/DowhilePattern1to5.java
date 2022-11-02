package com.sgtesting.PatternDoWhile;

public class DowhilePattern1to5 {

	public static void main(String[] args) {
		int i=5;
		do {
			int j=1;
			do {
				System.out.print(j+" ");
				j++;
			}while(j<=i);
			System.out.println();
			i--;
		}while(i>=1);
		

	}

}
