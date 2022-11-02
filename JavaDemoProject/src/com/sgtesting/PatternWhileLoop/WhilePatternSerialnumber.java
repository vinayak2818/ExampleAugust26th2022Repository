package com.sgtesting.PatternWhileLoop;

public class WhilePatternSerialnumber {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		while(i<=5) 
		{
			int j=1;
			while(j<=i) 
			{
				System.out.print(k++ +" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
