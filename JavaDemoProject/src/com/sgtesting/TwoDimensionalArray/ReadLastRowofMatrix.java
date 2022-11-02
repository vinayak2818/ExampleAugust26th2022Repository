package com.sgtesting.TwoDimensionalArray;

public class ReadLastRowofMatrix {

	public static void main(String[] args) {
		
			int a[][]={{2,4,6},{6,8,10},{12,14,18}};

			for (int i=a.length-1; i<a.length; i++)
			{
				for (int j=0; j<a[i].length; j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}

	}


