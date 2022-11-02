package com.sgtesting.StringAssignments;
class palindrome
{
	static void palin()
	{
		String s="GADAG";
		StringBuffer s1=new StringBuffer(s);
		s1.reverse();
		String s2=s1.toString();
		
		if(s.equals(s2))
		{
			System.out.println( s+" is a palindrome");
		}else
		{
			System.out.println(s+" is not a palindrome");
		}
		
	}
	static void palin1(String c )
	{
		
		String a=new String();
		char[] b=c.toCharArray();
		for(int i=b.length-1;i>=0;i--)
		{
			a+=String.valueOf(b[i]);
		}
		if(c.equalsIgnoreCase(a))
		{
			System.out.println("it is a palindrome");
		}else
		{
			System.out.println("it is not");
		}
	}
}

public class Palindrome3 {

	public static void main(String[] args) {
		palindrome.palin();
		palindrome.palin1("GAdag");

	}

}
