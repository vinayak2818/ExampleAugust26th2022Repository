package com.sgtesting.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		//addElments();
		//removeElements();
		//readElements1();
		//readElements2();
		//readElements3();
		//readElementsListIterator();
		//WithoutGenerics();
		Queuedemo();
	}
	private static void addElments()
	{
		List<Integer>obj=new LinkedList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		obj.add(600);
		System.out.println("Elements:"+obj);
		List<Integer>obj1=new LinkedList<Integer>();
		obj1.add(111);
		obj1.add(222);
		obj1.add(333);
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);
	}
	private static void removeElements()
	{

		List<Integer>obj=new LinkedList<Integer>();
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
		List<Integer>obj=new LinkedList<Integer>();
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
		List<Integer>obj=new LinkedList<Integer>();
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
		List<Integer>obj=new LinkedList<Integer>();
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
	private static void readElementsListIterator()
	{
		List<Integer>obj=new LinkedList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements:"+obj);
		ListIterator<Integer>ite=obj.listIterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
			
		}
		while(ite.hasPrevious())
		{
			System.out.println(ite.previous());
		}
	}
	private static void WithoutGenerics()
	{
		LinkedList obj=new LinkedList();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add("Mango");
		obj.add('y');
		obj.add(12.75);
		obj.add(500);
		System.out.println("Elements:"+obj);
		
	}
	private static void Queuedemo()
	{
		Queue<Integer>obj=new LinkedList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements:"+obj);
		obj.remove();
		System.out.println("Elements:"+obj);
		obj.remove();
		System.out.println("Elements:"+obj);
	}
}
