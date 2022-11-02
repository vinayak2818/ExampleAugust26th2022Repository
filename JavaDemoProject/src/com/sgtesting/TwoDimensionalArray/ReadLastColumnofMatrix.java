package com.sgtesting.TwoDimensionalArray;

public class ReadLastColumnofMatrix {

	public static void main(String[] args) {
		int a[][]={{2,4,6},{6,8,10},{12,14,18}};

		for (int i=0; i<a.length; i++)
		{
			for (int j=2; j<a.length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
