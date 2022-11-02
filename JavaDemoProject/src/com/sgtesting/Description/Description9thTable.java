package com.sgtesting.Description;
/*We will make sure whether we can display multiples of 9
 * Find out the size of array to store multiples of 9
 * Declare the integer Array
 * Assign multiples of 9 into current Array
 * Read the elements from the Array in order
 */

public class Description9thTable {

	public static void main(String[] args) {		
		int count=0;
		int i=9;		
		for(int j=1;j<=10;j++) 
		{
			count++;
			System.out.println(i*j);
		}
		System.out.println("no of elements="+count);
		//Declare 1D Array		
		int k[]=new int[count];
		//Assign multiples of 9 into into Array
		int l=0;
		for(int a=1;a<=10;a++) 
		{
			k[l]=a;
		}
	}

}

