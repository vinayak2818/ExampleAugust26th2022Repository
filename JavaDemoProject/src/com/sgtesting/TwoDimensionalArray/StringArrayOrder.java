package com.sgtesting.TwoDimensionalArray;

public class StringArrayOrder {

	public static void main(String[] args) {
		String s[][]= {{ "Windows","Priority","Digital"},{"Ubuntu","Android","Microsoft"},{"Chrome","Nintendo","Firmware"}};
		for(int b=0;b<s.length;b++) {
			for(int c=0;c<s[b].length;c++) {
				System.out.print(s[b][c]+"   ");
			}
			System.out.println();
		}
	}
}
