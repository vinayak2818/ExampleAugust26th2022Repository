package com.sgtesting.PatternForloop;

public class PatternForEvenNumber {

	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++)
			{	
				if(k%2==0)
				{
					System.out.print(" "+(k+=2)+" ");
				}
				
			}System.out.println();
		}

	}

}
