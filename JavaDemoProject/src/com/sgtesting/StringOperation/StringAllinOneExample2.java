package com.sgtesting.StringOperation;


public class StringAllinOneExample2 {

	public static void main(String[] args) {
		display();
		verifyEmptyString();
		lower();
		Upper();
		replacedemo();
		subStrDemo();
		Comaresstring();
		CompareString();
		ExistanceofString();
		SplitDemo();
		ConvertToCharArray();
		findPosition();
		Converttostring();
		charatDemo();

	}
	private static void display()
	{
		String s=new String("program");
		int s1=s.length();
		System.out.println(s1);
		System.out.println("_______________________________________________");
	}
	private static void verifyEmptyString()
	{
		String s=new String("vinayak");
		boolean s1=s.isEmpty();
		System.out.println(s1);
		System.out.println("_______________________________________________");
		
	}
	private static void lower()
	{
		String s=new String("PROGRAMMING");
		String s1=s.toLowerCase();
		System.out.println(s1);
		System.out.println("_______________________________________________");
		
	}
	private static void Upper()
	{
		String s=new String("programming");
		String s1=s.toUpperCase();
		System.out.println(s1);
		System.out.println("_______________________________________________");
		
	}
	private static void  replacedemo()
	{
		String s=new String("It is a new palace");
		String s1=s.replace("is", "was");
		String s2=s.replace("ew", "Ew");
		System.out.println(s2);
		System.out.println(s1);
		System.out.println("_______________________________________________");
	}
	private static void subStrDemo()
	{
		String s=new String("Programming");
		//First Approach[position]
		String s1=s.substring(3);
		System.out.println(s1);
		//Second Approach[Range]
		String s2=s.substring(3, 7);
		System.out.println(s2);
		System.out.println("_______________________________________________");
	}
	private static void Comaresstring()
	{
		String s="JAVAPROGRAM";
		String s1="javaprogram";
		System.out.println("s and s1 are Equal:"+s.equals(s1));
		System.out.println("ignore the Case Compare:"+s.equalsIgnoreCase(s1));
		System.out.println("_______________________________________________");	
		
	}
	private static void CompareString()
	{
		String s="JAVAPROGRAM";
		String s1="javaprogram";
		System.out.println("s and s1 are Equal:"+s.compareTo(s1));
		System.out.println("ignore the Case Compare:"+s.compareToIgnoreCase(s1));
		System.out.println("_______________________________________________");		
		
	}
	private static void ExistanceofString()
	{
		String s="It is a new palace";
		System.out.println("Starts with:"+s.startsWith("It"));
		System.out.println("Ends with: "+s.endsWith("new"));
		System.out.println("_______________________________________________");	
		
	}
	private static void SplitDemo()
	{
		String s="apple,orange,mango,grape";
		String s1[]=s.split(",");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println("_______________________________________________");
	}
	private static void ConvertToCharArray()
	{
		String s="Testing";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("_______________________________________________");
	}
	private static void findPosition()
	{
		String s="It is a new palace";
		int s1=s.indexOf("a");
		System.out.println(s1);
		System.out.println("_______________________________________________");
	}
	private static void Converttostring()
	{
		int a=125;
		String s=String.valueOf(a);
		System.out.println("Convert int into String :"+s);
		double d=12.45;
		String s1=String.valueOf(d);
		System.out.println("Convert double into String :"+s1);
		System.out.println("_______________________________________________");
	}
	private static void charatDemo()
	{
		String s="Demo";
		char ch=s.charAt(0);
		System.out.println("First Name:"+ch);
		char ch1=s.charAt(3);
		System.out.println("Seccond Name:"+ch1);
	}

}
