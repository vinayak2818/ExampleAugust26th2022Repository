package com.sgtesting.Methods;
class Transpose1
{
	void Transpose(int a[][],int b[][])
	{
		for(int i=0;i<a[0].length;i++) {
			for (int j=0;j<a.length;j++) {
				 b[i][j]=(a[j][i]);
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class TransposeMatrix {

	public static void main(String[] args) {
		int a[][]= {{2,4,6},{8,10,12}};
		int b[][]= new int[a[0].length][a.length];
		Transpose1 T=new Transpose1();
		T.Transpose(a, b);
		

	}

}
