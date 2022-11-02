package com.sgtesting.Fifthtest;
class Array
{
	static void array()
	{

		try 
		{			
			int a[]= {1,2,3,4,5};
			for(int i=0;i<=a.length;i++) 
			{

				if(i==3)
				{
					throw new Exception("Assign elements into array within the size");
				}
				System.out.println(a[i]);
			}

		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}

public class Tenth {

	public static void main(String[] args) {
		Array.array();


	}

}
