package com.sgtesting.StringAssignments;
/*The Given String is "Programming"
a)WAP to find the no vowels
*/

public class SixthFindnumberVowels {

	public static void main(String[] args) {
		String s=new String("Programming");
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			char ch1=s.charAt(i);
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
			{
				count++;
			}				
		}
		System.out.println(count);
		
	}

}
