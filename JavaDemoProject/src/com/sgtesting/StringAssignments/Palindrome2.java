package com.sgtesting.StringAssignments;
class practice
{
	static void verifypali(String str)
	{
		String newstr=new String();
		char c[]=str.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			newstr+=String.valueOf(c[i]);
		}
		if(str.equalsIgnoreCase(newstr))
		{
			System.out.println(str+" is a palindrome!!!");
		}
		else
		{
			System.out.println(str+" is not a palindrome!!!");
		}
	}
}

public class Palindrome2 {

	public static void main(String[] args) {
		
		practice.verifypali("gadag");

	}

}
