package com.sgtesting.StringAssignments;
//The given String is "The temple is at the top of the hill

public class FifthReverseString1 {

	public static void main(String[] args) {
		reverseString();
		reverse();
		Revrse1();
		Reversrse("The temple is at the top of hill");

	}
	private static void reverseString()
	{
		String s=new String("The temple is at the top of hill");
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
		}
	}
	private static void reverse() {
		StringBuffer s2=new StringBuffer("The temple is at the top of hill");
		StringBuffer s3=s2.reverse();
		System.out.println("_______________________________________");
		System.out.println(s3);
	}
	private static void Revrse1()
	{
		String s="The temple is at the top of hill";
		String c[]=s.split(" ");
		for(int j=0;j<c.length;j++)
		{
			StringBuffer a= new StringBuffer(c[j]);
			System.out.print(a.reverse()+" ");
		}
		System.out.println();
	}
	private static void Reversrse(String str)
	{
		String s[]=str.split(" ");
		String wordreverse=new String();
		for(int z=0;z<s.length;z++)
		 {
			String rev=new String();
			char ch[]=s[z].toCharArray();
			 for(int v=ch.length-1;v>=0;v--) 
			 {
				rev+=String.valueOf(ch[v]); 
			 }
			 wordreverse+=rev.concat(" ");
		}
		System.out.println(wordreverse);
	}

}


