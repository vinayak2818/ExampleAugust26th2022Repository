package com.sgtesting.WhileLoop;

public class CountBetween30to90 {

	public static void main(String[] args) {
		int i=30;
		int count=0;
		while (i<=90) {
			if(i%6==0)
			{
				count++;	

			}
			i++;
		}System.out.println(count);


	}

}
