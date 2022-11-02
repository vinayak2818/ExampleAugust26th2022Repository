package com.sgtesting.PatternWhileLoop;

public class WhilePatternNumbers1to5 {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int j=1;
			while(j<=i) 
			{
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i--;
		}

	}

}
