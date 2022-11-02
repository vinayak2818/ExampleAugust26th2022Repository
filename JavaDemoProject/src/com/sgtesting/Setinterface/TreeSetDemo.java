package com.sgtesting.Setinterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements();
		//readElements2();
		ConvertToArray();

	}
	private static void  addElements()
	{
		TreeSet<String>obj=new TreeSet<String>();
		System.out.println("Elements:"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Banana");
		obj.add("Mango");
		System.out.println("Elements:"+obj);
		TreeSet<String>obj1=new TreeSet<String>();
		obj1.add("Blue");
		obj1.add("white");
		obj1.add("Green");
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);		
	}
	private static void removeElements()
	{
		TreeSet<String>obj=new TreeSet<String>();
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
		TreeSet<String>obj=new TreeSet<String>();
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
		TreeSet<String>obj=new TreeSet<String>();
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
		TreeSet<String>obj=new TreeSet<String>();
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
}
