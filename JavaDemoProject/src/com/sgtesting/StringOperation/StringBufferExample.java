package com.sgtesting.StringOperation;

public class StringBufferExample {

	public static void main(String[] args) {
		appenddemo();
		insertDemo();
		deleteDemo();
		Reversedemo();

	}
	private static void appenddemo()
	{
		StringBuffer s=new StringBuffer("Java");
		s.append(" Programming");
		System.out.println(s);
		System.out.println("______________________________________");
	}
	private static void insertDemo()
	{
		StringBuffer s=new StringBuffer("It is a Book");
		s.insert(8, "new ");
		System.out.println(s);
		System.out.println("______________________________________");
	}
	private static void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new book");
		s.delete(6, 10);
		System.out.println(s);
		System.out.println("______________________________________");
		
	}
	private static void Reversedemo()
	{
		StringBuffer s=new StringBuffer("Testing");
		s.reverse();
		System.out.println(s);
	}

}
