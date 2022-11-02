package com.sgtesting.StringOperation;

public class StringBuilderExamleAllinOne {

	public static void main(String[] args) {
		appenddemo();
		insertDemo();
		deleteDemo();
		Reversedemo();

	}
	private static void appenddemo()
	{
		StringBuilder s=new StringBuilder("Java");
		s.append(" Programming");
		System.out.println(s);
		System.out.println("______________________________________");
	}
	private static void insertDemo()
	{
		StringBuilder s=new StringBuilder("It is a Book");
		s.insert(8, "new ");
		System.out.println(s);
		System.out.println("______________________________________");
	}
	private static void deleteDemo()
	{
		StringBuilder s=new StringBuilder("It is a new book");
		s.delete(6, 10);
		System.out.println(s);
		System.out.println("______________________________________");
		
	}
	private static void Reversedemo()
	{
		StringBuilder s=new StringBuilder("Testing");
		s.reverse();
		System.out.println(s);
	}

}
