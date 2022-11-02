package com.sgtesting.StringAssignments;
//Reverse the given String Without using Reverse method
//a)TocharArray
//b)CharAt
//c)Substring Reverse the Given String

public class ThirdFirstReverseToCharArray {

	public static void main(String[] args) {
		reverse();
		reverse1();
		reverse2();
	}
	private static void reverse()
	{
		String s="Programming";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");

		}
		System.out.println();
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
			

		}/*
		
		{
			String s1=new String("JavaProgram");
			char c[]= {s1.charAt(10),s1.charAt(9),s1.charAt(8),s1.charAt(7),s1.charAt(6),s1.charAt(5),s1.charAt(4),s1.charAt(3),s1.charAt(2),s1.charAt(1),s1.charAt(0)};
			for(int j=0;j<c.length;j++)
			{
				System.out.print(c[j]+" ");
			}
		}*/
		System.out.println();
	}
	private static void reverse2()
	{
		String s2=new String("Program");
		/*String c[]= {s2.substring(6),s2.substring(5, 6),s2.substring(4, 5),s2.substring(3, 4),s2.substring(2, 3),s2.substring(1, 2),s2.substring(0, 1)};
		for(int z=0;z<c.length;z++)
		{
			System.out.print(c[z]+" ");
		}*/
		String c[]=new String[s2.length()];
		
		for(int z=c.length-1;z>=0;z--)
		{
			 c[z]=s2.substring(z,z+1);
			{
				
				System.out.print(c[z]+" ");
				
			}
			
			
		}
		
	}
	
}

