package com.sgtesting.StringAssignments;


public class SecondPalindrome {

	public static void main(String[] args) {
		palindrome();

	}
	private static void palindrome()
	{
		StringBuffer s=new StringBuffer("GADAG");
		StringBuffer s1=(s.reverse());
		System.out.println(s==s1);
		
		/*StringBuffer s=new StringBuffer("GADAG");
		 boolean s1=((s.reverse()).equals(s));
		 System.out.println(s1);
		*/
	    
	}
	

}
