package com.sgtesting.TwoDimensionalArray;

public class DoubleArrayOrder {

	public static void main(String[] args) 
	{
		double a[][]= {{2.1,4.2,6.3},{8.4,10.5,12.6},{14.7,16.8,18.9}};
		for(double b[]:a) 
		{
			for(double c:b) 
			{
				System.out.print(c+"  ");
			}
			System.out.println();
		}
	}
}
