package com.sgtesting.Reflectiondemo;

import java.lang.reflect.Method;

public class Refelctiondemo2 {

	public static void main(String[] args) {
		try {
		Sampledemo obj=new Sampledemo();
		Method method[]=obj.getClass().getMethods();
		for(int i=0;i<method.length;i++)
		{
			String Methodname=method[i].getName();
			if(Methodname.startsWith("display"))
			{
				method[i].invoke(obj);
				
			}
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
