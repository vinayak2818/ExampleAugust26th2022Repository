package com.sgtesting.CollectionFramework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements();
		//readElements1();
		//readElementsIterator();
		//readElementsEnumeration();
		WithoutGenerics();

	}
	private static void addElements()
	{
		Vector<Integer>obj=new Vector<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		obj.add(600);
		System.out.println("Elements:"+obj);
		Vector<Integer>obj1=new Vector<Integer>();
		obj1.add(111);
		obj1.add(222);
		obj1.add(333);
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);
	}
	private static void removeElements()
	{
		Vector<Integer>obj=new Vector<Integer>();
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
	private static void readElements()
	{
		Vector<Integer>obj=new Vector<Integer>();
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
	private static void readElements1()
	{
		Vector<Integer>obj=new Vector<Integer>();
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
	private static void readElementsIterator()
	{
		Vector<Integer>obj=new Vector<Integer>();
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
	private static void readElementsEnumeration()
	{
		Vector<Integer>obj=new Vector<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements:"+obj);
		Enumeration<Integer>ite=obj.elements();
		while(ite.hasMoreElements())
		{
			System.out.println(ite.nextElement());
			
		}		
	}
	private static void WithoutGenerics()
	{
		Vector obj=new Vector();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add("Mango");
		obj.add('y');
		obj.add(12.75);
		obj.add(500);
		System.out.println("Elements:"+obj);
	}
	
}
