package com.sgtesting.UtilDemo;

public class UnboxingDemo {

	public static void main(String[] args) {
		Integer a=Integer.valueOf(125);
		System.out.println("integer a:"+a);
		//convert into primitive Type
		int b=a.intValue();
		System.out.println("int b:"+b);
		//Unboxing
		int c=a;
		System.out.println("int c:"+c);

	}

}
