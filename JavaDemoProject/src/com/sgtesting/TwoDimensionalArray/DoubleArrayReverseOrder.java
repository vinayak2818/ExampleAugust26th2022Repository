package com.sgtesting.TwoDimensionalArray;

public class DoubleArrayReverseOrder {

	public static void main(String[] args) {
		double a[][]= {{12.1,14.2,16.3},{18.4,20.5,22.6},{24.7,26.8,28.9}};
		for(double b=a.length-1;b>=0;b--) {
			for(double c=a[(int) b].length-1;c>=0;c--) {
				System.out.print(a[(int) b][(int) c]+" ");
			}
			System.out.println();
		}
	}
}
