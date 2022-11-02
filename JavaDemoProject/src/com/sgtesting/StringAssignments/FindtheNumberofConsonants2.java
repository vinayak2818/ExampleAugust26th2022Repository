package com.sgtesting.StringAssignments;

public class FindtheNumberofConsonants2 {

	public static void main(String[] args) {
		String s=new String("Programming");
		s=s.toLowerCase();
		int count = 0;
		int cou=0;
		for(int i=0;i<s.length();i++)
		{
			//char ch1=s.charAt(i);
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				cou++;
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z' )
			{
				count++;
			}
		}
		System.out.println("Number of Vowels:"+cou);
		System.out.println("Number of Consonants:"+count);

	}

	}


