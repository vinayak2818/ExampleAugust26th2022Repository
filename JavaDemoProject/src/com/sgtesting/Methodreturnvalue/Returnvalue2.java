package com.sgtesting.Methodreturnvalue;

class Substraction
{
	int[][] matrix(int a[][],int b[][])
	{
		int  c[][]=new int[b[0].length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[i][j]-b[i][j];

			}

		}
		return c;
	}
}
public class Returnvalue2 {

	public static void main(String[] args) {
		Substraction A=new Substraction();
		int p[][]= {{2,2,2,},{3,3,3},{4,4,4}};
		int q[][]= {{1,1,1},{1,1,1},{1,1,1,}};
		int r[][]=A.matrix(p, q);
		for(int i=0;i<r.length;i++) {
			for(int j=0;j<r[0].length;j++) {
				System.out.print(r[i][j]+" ");
			}System.out.println();

		}


	}


}
