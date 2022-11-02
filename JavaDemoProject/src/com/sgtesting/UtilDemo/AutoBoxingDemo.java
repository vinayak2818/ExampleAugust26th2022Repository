package com.sgtesting.UtilDemo;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		int a=125;
		System.out.println("int a:"+a);
		//convert it into Wrapper class object
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b:"+b);
		//AutoBoxing
		Integer c=a;
		System.out.println("Integer c:"+c);
	}

}
