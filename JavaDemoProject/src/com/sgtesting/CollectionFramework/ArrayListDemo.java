package com.sgtesting.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//addelements();
		 //RemoveElements();
		//readElements1();
		 //readElements2();
		// readElements3();
		 WithoutGenerics();
		
	}
	private static void addelements()
	{
		List<Integer>obj=new ArrayList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		obj.add(600);
		System.out.println("Elements:"+obj);
		List<Integer>obj1=new ArrayList<Integer>();
		obj1.add(111);
		obj1.add(222);
		obj1.add(333);
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);
		
	}
	private static void RemoveElements()
	{
		List<Integer>obj=new ArrayList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements:"+obj);
		obj.remove(2);
		System.out.println("Elements:"+obj);
		obj.remove(Integer.valueOf(100));
		System.out.println("Elements:"+obj);
		obj.removeAll(obj);
		System.out.println("Elements:"+obj);
	}
	private static void readElements1()
	{
		List<Integer>obj=new ArrayList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements:"+obj);
		for(int a:obj)
		{
			System.out.println(a);
		}
	}
	private static void readElements2()
	{
		List<Integer>obj=new ArrayList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements:"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println("Elements:"+obj.get(i));
		}
		
	}
	private static void readElements3()
	{
		List<Integer>obj=new ArrayList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements:"+obj);
		Iterator<Integer>ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	private static void WithoutGenerics()
	{
		ArrayList obj =new ArrayList();
		System.out.println(obj);
		obj.add(100);
		obj.add("Mango");
		obj.add('y');
		obj.add(12.75);
		obj.add(500);
		System.out.println(obj);
	}

}
