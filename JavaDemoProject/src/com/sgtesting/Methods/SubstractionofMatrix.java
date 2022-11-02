package com.sgtesting.Methods;
class Substract
{
	void sub(int a[][],int b[][])
	{
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]-b[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class SubstractionofMatrix {

	public static void main(String[] args) {
		int a[][]= {{2,4,6},{8,10,12},{14,16,18}};
		int b[][]= {{1,3,5},{7,9,11},{13,15,17}};
		Substract s=new Substract();
		s.sub(a,b);
		

	}

}
