package com.sgtesting.TwoDimensionalArray;

public class StringArrayReverseOrder {

	public static void main(String[] args) {
		String s[][]= {{ "Windows","Priority","Digital"},{"Ubuntu","Android","Microsoft"},{"Chrome","Nintendo","Firmware"}};
		for(int b=s.length-1;b>=0;b--) {
			for(int c=s[b].length-1;c>=0;c--) {
				System.out.print(s[b][c]+"   ");
			}
			System.out.println();
		}
		

	}

}
