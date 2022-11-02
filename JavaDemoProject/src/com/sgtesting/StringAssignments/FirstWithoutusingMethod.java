package com.sgtesting.StringAssignments;
//Without using LengthMethod 
//Find out the no of Characters in the given Array

public class FirstWithoutusingMethod {

	public static void main(String[] args) {
		//Length();
		Length1();
	}
	/*private static void Length()
	{
		StringBuffer s=new StringBuffer("Programming");
		int s1= s.length();
		System.out.println(s1);
	}*/
	private static void Length1()
	{
		String s2="Program";
		char a[]=s2.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
 