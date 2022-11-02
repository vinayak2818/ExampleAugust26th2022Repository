package com.sgtesting.demoprograms;
class Array
{
	Array(int a[][])
	{
		for(int i=a.length-1;i>=0;i--) {
			for(int j=a.length-1;j>=0;j--) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();

		}
	}
}
public class TwoDArray {

	public static void main(String[] args) {
		int p[][]= {{2,3,4},{1,4,7},{3,6,9}};
		Array A1=new Array(p);

	}

}
