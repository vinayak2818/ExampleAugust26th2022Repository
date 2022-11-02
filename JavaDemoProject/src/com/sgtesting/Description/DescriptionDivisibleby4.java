package com.sgtesting.Description;
/*We will make sure whether we can display numbers between 100 to 150
 * Among 100 to 150 numbers try to get the number which are divisible by four
 * Find out the size of array to store numbers between 100 to 150 which are divisible by four
 * Declare the integer Array
 * Assign numbers 100 to 150 which are divisible by four into current Array
 * Read the elements from the Array in reverse order
 */

public class DescriptionDivisibleby4 {

	public static void main(String[] args) {
		//Find the size of Array
		int count=0;
		{
			for(int i=100;i<=150;i++) 
			{
				if(i%4==0) {
					count++;
				}
			}
		}
		System.out.println("no of elements="+count);
		//Declare 1D Array
		int four[]=new int[count];
		//Assign numbers 100 to 150 which are divisible by four into Array
		int k=0;
		for(int l=100;l<=150;l++) {
			if(l%4==0) {
				four[k]=l;
				k=k+1;
			}
		}
		//Read elements in reverse order
		for(int m=four.length-1;m>=0;m--) 
		{
			System.out.println(four[m]);

		}
	}
}