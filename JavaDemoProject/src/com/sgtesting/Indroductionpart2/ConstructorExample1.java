package com.sgtesting.Indroductionpart2;
class Human
{
	String name;
	int age;
	String job;
	Human(String fn,int Age,String Job)
	{
		name=fn;
		age=Age;
		job=Job;
		System.out.println(name);
		System.out.println(age);
		System.out.println(job);
		
	}
}

public class ConstructorExample1 {

	public static void main(String[] args) {
		Human a=new Human("Vinayak",25,"QA");
		Human a1=new Human("Niki",27,"Contractor");

	}

}
