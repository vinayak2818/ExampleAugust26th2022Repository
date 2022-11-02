package com.sgtesting.demoprograms;
class Addition1
{
	int [][] ArrayAdd(int a[][],int b[][])
	{
		int c[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}

public class Test12 {

	public static void main(String[] args) {
		Addition1 A=new Addition1();
		int p[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int q[][]= {{2,4,6},{8,10,12},{14,16,18}};				
		int r[][]=A.ArrayAdd(p, q);
		for(int k=0;k<p.length;k++) {
			for(int l=0;l<q.length;l++) {
				System.out.print(r[k][l]+" ");
			}
			System.out.println();
		}
		

	}

}
