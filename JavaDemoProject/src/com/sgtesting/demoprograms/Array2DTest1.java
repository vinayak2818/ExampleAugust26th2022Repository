package com.sgtesting.demoprograms;

public class Array2DTest1 {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int b[][]= {{11,12,13},{14,15,16},{17,18,19}};
		for(int i=0;(i<a.length)&& (i<b.length);i++) {
			for(int j=0;(j<a.length)&&(j<b.length);j++) {
				System.out.print(a[i][j]+b[i][j] +" ");
			}
			System.out.println();
		}
		

	}

}
