package com.sgtesting.TwoDimensionalArray;

public class AdditionofMatrix {

	public static void main(String[] args) {
		int rows=2,columns=2;
		int [][] firstmatrix={{2,4},{6,8}};
		int [][] secondmatrix= {{10,12},{14,16}};
		int sum[][]= new int[rows][columns];
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++) 
			{
				sum[i][j]=firstmatrix[i][j]+secondmatrix[i][j];
			}
		}
		System.out.println("sum of two matrix");
		for(int[] row:sum) {
			for(int column:row) {
				System.out.print(column+" ");
			}
			System.out.println();
		}
	}

}
