package com.sgtesting.demoprograms;
class demo2
{
	demo2 (int a[][],int b[][])
	{
		if(a.length==b.length &&  a[0].length==b[0].length)
		{
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					System.out.print(a[i][j]+b[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("invalid rows and column");
		}
	}
}
public class Classdemo6 {

	public static void main(String[] args) {
		int x[][]= {{1,2,3},{4,5,6}};
		int y[][]= {{10,20,30},{40,50,60}};
		demo2 o1=new demo2(x,y);

	}

}
