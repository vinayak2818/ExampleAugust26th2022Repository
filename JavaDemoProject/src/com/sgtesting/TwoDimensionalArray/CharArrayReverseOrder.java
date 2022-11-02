package com.sgtesting.TwoDimensionalArray;

public class CharArrayReverseOrder {

	public static void main(String[] args) {
		char a[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		for(int b=a.length-1;b>=0;b--) {
			for(int c=a[b].length-1;c>=0;c--) {
				System.out.print(a[b][c]+" ");
			}
			System.out.println();
		}

	}

}
