package com.sgtesting.MapInterface;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//addElements();
		//readRemoveElements();
		readElements();

	}
	private static void addElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
	}
	private static void readRemoveElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
		//Read Element
		String val1=obj.get("Lotus");
		System.out.println(val1);
		//Remove Element
		obj.remove("Lotus");
		//Read Element
		String val2=obj.get("Lotus");
		System.out.println(val2);
	}
	private static void readElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
		
		obj.forEach((k,v) -> System.out.println(k+" ==> "+v));
	}
}
