package com.sgtesting.Methods;
class array
{
	void column(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<=0;j++) {
				System.out.println(a[i][j]);
			}
		}
	}
}
public class ArrayFirstcolumn {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		array A=new array();
		A.column(a);

	}

}
