package com.sgtesting.StringOperation;

public class StringExample1 {

	public static void main(String[] args) {
		String s="Java";
		String s1="java";
		String s2="Java";
		
		String s3=new String("Java");
		String s4=new String("java");
		String s5=new String("Java");
		
		System.out.println((s==s1));
		System.out.println((s==s2));
		System.out.println((s==s3));
		System.out.println((s3==s5));
		System.out.println((s1==s4));

	}

}
