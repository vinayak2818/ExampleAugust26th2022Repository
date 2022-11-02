package com.sgtesting.CollectionFramework;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack st=new Stack();
		Pushdemo(st, 100);
		Pushdemo(st, 200);
		Pushdemo(st, 300);
		Pushdemo(st, 400);
		Pushdemo(st, 500);
		popdemo(st);

	}
	private static void Pushdemo(Stack st,int a)
	{
		st.push(a);
		System.out.println(a);
	}
	private static void popdemo(Stack st)
	{
		int a=(int) st.pop();
		System.out.println(a);
	}
}
