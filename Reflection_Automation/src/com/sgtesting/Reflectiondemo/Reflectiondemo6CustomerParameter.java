package com.sgtesting.Reflectiondemo;

import java.lang.reflect.Method;

public class Reflectiondemo6CustomerParameter {

	public static void main(String[] args) {
		executedemo();

	}
	private static void executedemo()
	{
		Customerdetails obj=null;
		try {
			obj=new Customerdetails();
			//Parameters for Two String Parameters
			Class strparam1[]=new Class[2];
			strparam1[0]=String.class;
			strparam1[1]=String.class;
			
			Method method1=obj.getClass().getMethod("getPersonDetails", strparam1);
			method1.invoke(obj,new String("Sachin "),new String(" mumbai"));
			//Parameters for Integer Type
			 Class[] intparam=new Class[1];
			 intparam[0]=Integer.TYPE;
			 Method method2=obj.getClass().getMethod("DisplayEmpNumber", intparam);
			 method2.invoke(obj,  34151);
			 
			 //Parameters of One String Parameter
			 Class strparam2[]=new Class[1];
			 strparam2[0]=String.class;
			 Method method3=obj.getClass().getMethod("ShowStateName", strparam2);
			 method3.invoke(obj,new String(" Karnataka"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
