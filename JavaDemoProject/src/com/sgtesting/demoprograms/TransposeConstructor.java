package com.sgtesting.demoprograms;
class Transpose
{
	Transpose(int a[][],int b[][])
	{
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				b[i][j]=(a[j][i]);
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class TransposeConstructor {

	public static void main(String[] args) {
		int p[][]= {{2,4,6},{1,3,5},{7,9,2}};
		int q[][]=new int[p.length][p.length];
		Transpose T1=new Transpose(p,q); 
	}

}
