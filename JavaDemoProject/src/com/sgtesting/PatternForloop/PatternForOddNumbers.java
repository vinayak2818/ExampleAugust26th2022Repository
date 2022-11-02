package com.sgtesting.PatternForloop;

public class PatternForOddNumbers {

	public static void main(String[] args) 
	{
		int k=1;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				if(k%2!=0)
				{
					System.out.print(k+" ");
					k+=2;
				}
			}System.out.println();
		}

	}

}
