package com.sgtesting.MapInterface;

import java.util.Hashtable;

public class LegacyHashtabledemo {

	public static void main(String[] args) {
		//addElements();
		readAndRemoveElements();

	}
	private static void addElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
	}
	private static void readAndRemoveElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
		//Read Element
		String val1=obj.get("Camel");
		System.out.println(val1);
		//Remove Element
		obj.remove("Camel");
		//Read Element
		String val2=obj.get("Camel");
		System.out.println(val2);
		
	}
}
