package com.sgtesting.TwoDimensionalArray;

public class SubstractionOfmatrix {

	public static void main(String[] args) {
		int rows=2,columns=2;
		int [][] firstmatrix={{32,38},{22,35}};
		int [][] secondmatrix= {{17,13},{4,13}};
		int a[][]= new int[rows][columns];
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++) 
			{
				a[i][j]=firstmatrix[i][j]-secondmatrix[i][j];
			}
		}
		System.out.println("Result of two matrix");
		for(int[] row:a) {
			for(int column:row) {
				System.out.print(column+" ");
			}
			System.out.println();
		}

	}

}
