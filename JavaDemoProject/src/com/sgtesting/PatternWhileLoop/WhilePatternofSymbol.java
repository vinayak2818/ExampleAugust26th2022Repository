package com.sgtesting.PatternWhileLoop;

public class WhilePatternofSymbol {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			int j=1;
			while(j<=4) {
				System.out.print(" * ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
