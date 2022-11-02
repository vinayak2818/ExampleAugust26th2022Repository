package com.sgtesting.Methodreturnvalue;
class Addition
{
	int[][] matrix(int a[][],int b[][])
	{
		int  c[][]=new int[b[0].length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[i][j]+b[i][j];

			}

		}
		return c;
	}
}
public class Returnvalue1 {

	public static void main(String[] args) {
		Addition A=new Addition();
		int p[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int q[][]= {{2,4,6},{8,10,12},{14,16,18}};
		int r[][]=A.matrix(p, q);

		for(int i=0;i<r.length;i++) {
			for(int j=0;j<r[0].length;j++) {
				System.out.print(r[i][j]+" ");
			}System.out.println();
		}

	}

}
