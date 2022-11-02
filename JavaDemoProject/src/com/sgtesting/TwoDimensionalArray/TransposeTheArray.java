package com.sgtesting.TwoDimensionalArray;

public class TransposeTheArray {

	public static void main(String[] args) {		
		int a[][]={{2,4,6},{8,10,12},{14,16,18}};		
		int b[][]= new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) 
		{
			for(int k=0;k<a[i].length;k++) 
			{
				b[i][k]=(a[k][i]);
			
		
				System.out.print(b[i][k]+" ");
			}
			System.out.println();
		}


	}

}
