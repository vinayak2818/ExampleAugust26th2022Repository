package practice2;
class demo
{
	void demo1(int a[][])
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=0;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

public class Trail3 {


	public static void main(String[] args) {
		demo a=new demo();
		int b[][]= {{1,2,3},{2,4,6},{1,3,5}};
		a.demo1(b);
	}
}
