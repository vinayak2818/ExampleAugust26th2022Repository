package com.sgtesting.PatternDoWhile;

public class DoWhilePatternEvenNumber {

	public static void main(String[] args) {
		int k=0;
		int i=1;
		do 
		{
			int j=1;
			do 
			{
				if(k%2==0) 

					System.out.print(" "+(k+=2)+" ");
				j++;

			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);


	}

}
