package com.sgtesting.Test1;

public class CountofNumbersDivisibleBy9 {

	public static void main(String[] args) {
		int count=0;
		for(int j=60;j<=100;j++) 
		{
			if(j%9==0) 
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
