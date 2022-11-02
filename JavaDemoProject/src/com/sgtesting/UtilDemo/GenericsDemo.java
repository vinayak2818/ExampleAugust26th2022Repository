package com.sgtesting.UtilDemo;
class MyGeneric<T>
{
	private T obj=null;

	public void Add(T obj) 
	{
		this.obj = obj;
	}

	public T get() 
	{
		return obj;
	}
	
}
public class GenericsDemo {

	public static void main(String[] args) {
		//With Generic Approach
		MyGeneric<String>obj1=new MyGeneric<String>();
		obj1.Add("mango");
		String s=obj1.get();
		System.out.println(s);
		//Without Generic Approach
		MyGeneric obj2=new MyGeneric();
		obj2.Add("Apple");
		String s2=(String) obj2.get();
		System.out.println(s2);
		obj2.Add(125);
		int a= (int) obj2.get();
		System.out.println(a);

	}
	
}
