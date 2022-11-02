package com.sgtesting.StringAssignments;
/*The Given String is "Programming"
a)WAP to find the no vowels
b)WAP to find the no of Consonants
*/

public class FindtheNumberofConsonants {

	public static void main(String[] args) {
		String s=new String("Pro gramming");
		//char ch[]=s.toCharArray();
		s=s.toLowerCase();
		int count = 0;
		int cou=0;
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
			{
				cou++;
			}else if(ch1>='a' && ch1<='z')
			{
				count++;
			}
		}
		System.out.println("Number of Vowels:"+cou);
		System.out.println("Number of Consonants:"+count);

	}

}
