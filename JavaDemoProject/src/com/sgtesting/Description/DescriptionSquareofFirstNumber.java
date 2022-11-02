package com.sgtesting.Description;
/*We will make sure whether we can display square of first 10 numbers
 * square of first 10 numbers try to display in reverse order
 * Find out the size of array to store square of first 10 numbers
 * Declare the integer array
 * Assign square of first 10 numbers into current array
 * Read the elements from the array in reverse order
 */

public class DescriptionSquareofFirstNumber {

	public static void main(String[] args) {
		//Find out size of array
		int count=0;
		for(int i=1;i<=10;i++) {
			count++;
			System.out.println(i*i);
		}
		System.out.println("# of elements:"+count);
		//Declare 1d Array
		int s[]=new int[count];
		//Assign square into an array
		int k=0;
		for(int p=1;p<=10;p++)
		{
			s[k]=p;
			k=k+1;
		}
	}

}
