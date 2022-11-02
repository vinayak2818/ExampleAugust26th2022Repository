package com.sgtesting.Test1;

public class SumofNumbersDivisibleby10 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=50;i<=100;i++) 
		{
			if(i%10==0) 
			{			
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
