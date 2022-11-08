package com.sgtesting.Reflectiondemo;

import java.lang.reflect.Method;

public class Refelctiondemo1 {

	public static void main(String[] args) {
		try {
			Sampledemo obj=new Sampledemo();
			Method method[]=obj.getClass().getMethods();
			for(int i=0;i<method.length;i++)
			{
				String Methodname=method[i].getName();
				System.out.println(Methodname);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
