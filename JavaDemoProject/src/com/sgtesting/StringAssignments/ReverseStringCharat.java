package com.sgtesting.StringAssignments;
//Reverse the given String Without using Reverse method
//b)CharAt

public class ReverseStringCharat {

	public static void main(String[] args) {
		reverse1();
		

	}
	private static void reverse1() 
	{
		String s1="JavaProgram";
		char ch1[]=s1.toCharArray();
		for(int j=ch1.length-1;j>=0;j--) 
		{
			char ch2=s1.charAt(j);
			{
				System.out.print(ch2+" ");
			}

		}
	}
}
