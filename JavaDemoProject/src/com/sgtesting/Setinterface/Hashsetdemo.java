package com.sgtesting.Setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements();
		//readElements2();
		//ConvertToArray();
		 WithoutGenerics();

	}
	private static void  addElements()
	{
		HashSet<String>obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Mango");
		System.out.println("Elements:"+obj);
		HashSet<String>obj1=new HashSet<String>();
		obj1.add("Blue");
		obj1.add("white");
		obj1.add("Green");
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);		
	}
	private static void removeElements()
	{
		HashSet<String>obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		System.out.println("Elements:"+obj);
		obj.remove("Apple");
		System.out.println("Elements:"+obj);
		obj.removeAll(obj);
		System.out.println("Elements:"+obj);
		
	}
	private static void readElements()
	{
		HashSet<String>obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		System.out.println("Elements:"+obj);
		for(String str:obj)
		{
			System.out.println(str);
		}
	}
	private static void readElements2()
	{
		HashSet<String>obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		System.out.println("Elements:"+obj);
		Iterator<String>ite=obj.iterator();
		while(ite.hasNext())
		{
		System.out.println(ite.next());	
		}
		
	}
	private static void ConvertToArray()
	{
		HashSet<String>obj=new HashSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Grapes");
		System.out.println("Elements:"+obj);
		Object a[]=obj.toArray();
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(a[i]);
		}
	}
	private static void WithoutGenerics()
	{
		HashSet obj=new HashSet();
		System.out.println(obj);
		obj.add(100);
		obj.add("Mango");
		obj.add('y');
		obj.add(12.75);
		System.out.println(obj);
	}
}
