package com.sgtesting.PatternWhileLoop;

public class WhilePatternofOddbers {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=i) {
				if(k%2!=0)
					System.out.print(k+" ");
				k+=2;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
