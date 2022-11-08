package com.sgtesting.Reflectiondemo;

import java.lang.reflect.Method;

public class Refelctiondemo3 {

	public static void main(String[] args) {
		try {
			Sampledemo obj=new Sampledemo();
			Method method[]=obj.getClass().getDeclaredMethods();
			for(int i=0;i<method.length;i++)
			{
				method[i].invoke(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
