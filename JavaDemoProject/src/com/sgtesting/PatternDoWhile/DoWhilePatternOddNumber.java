package com.sgtesting.PatternDoWhile;

public class DoWhilePatternOddNumber {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		do {
			int j=1;
			do {
				if(k%2!=0)
					System.out.print(k+" ");
				k+=2;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
	}

}
