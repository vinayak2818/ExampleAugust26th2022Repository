package com.sgtesting.demoprograms;

public class DoWhileSerialNumberfrom10to30 {

	public static void main(String[] args) {
		int index = 10;
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print(index+ " ");
				index+=10;
				j++;
			}while(j <= 3);
			System.out.println();
			i++;
		}while(i <= 3);
	}
}
