package com.sgtesting.PatternDoWhile;

public class DowhilePatternof3 {

	public static void main(String[] args) {
		int i=1;
		do {
			int j=1;
			do {
				System.out.print(" 3 ");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
		

	}

}
