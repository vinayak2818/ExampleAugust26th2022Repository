package com.sgtesting.PatternWhileLoop;

public class WhilePatternEvenNumber {

	public static void main(String[] args) {
		int k=0;
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=i) {
				System.out.print(" "+(k+=2)+" ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
