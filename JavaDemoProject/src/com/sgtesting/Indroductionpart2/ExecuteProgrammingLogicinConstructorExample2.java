package com.sgtesting.Indroductionpart2;
class demo12
{
	demo12(int a[][],int b[][])
	{
		if((a.length==b.length)&&(a[0].length==b[0].length))
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+b[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Invalid number of rows and column");
		}
	}
}

public class ExecuteProgrammingLogicinConstructorExample2 {

	public static void main(String[] args) {
		int x[][]= {{2,4,6},{1,3,5}};
		int y[][]= {{8,10,12},{7,9,11}};
		demo12 c=new demo12(x,y);


	}

}
