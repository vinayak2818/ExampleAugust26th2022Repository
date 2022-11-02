package com.sgtesting.Description;
/*We will make sure whether we can display numbers between 71 to 41
 * Among 71 to 41 numbers try to get odd numbers
 * Find out the size of array to store odd numbers between 71 to 41
 * Declare the integer array
 * Assign odd numbers 71 to 41 into current array
 * Read the elements from the array in reverse order
 */

public class DescriptionOdd {

	public static void main(String[] args) 
	{
		//find out size of array
		int count=0;
		for(int i=71;i>=41;i--) 
		{
			if(i%2!=0) {
				count++;
			}
		}
		System.out.println("no of elements:"+count);
		//Declare 1D array
		int odd[]=new int[count];
		//Assign odd numbers in to an Array
		int k=0;
		for(int p=71;p>=41;p--) 
		{
			if(p%2!=0) 
			{
				odd[k]=p;
				k=k+1;
			}
		}
		//Read elements in reverse order
		for(int j=odd.length-1;j>=0;j--) {
			System.out.println(odd[j]);
		}

	}
}
