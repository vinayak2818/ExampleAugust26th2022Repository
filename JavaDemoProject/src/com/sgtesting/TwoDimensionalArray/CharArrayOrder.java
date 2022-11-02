package com.sgtesting.TwoDimensionalArray;

public class CharArrayOrder {

	public static void main(String[] args) {
		char a[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		for(char b[]:a) {
			for(char c:b) {
				System.out.print(c+" ");				
			}
			System.out.println();
		}
	}
}
