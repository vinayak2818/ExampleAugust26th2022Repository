package com.sgtesting.Indroductionpart2;
//creation of multiple object

public class InstancevariableExample2MultipleObject {
	String Firstname;
	int age;

	public static void main(String[] args) {
		InstancevariableExample2MultipleObject a=new InstancevariableExample2MultipleObject();
		a.age=24;
		a.Firstname="Vinayak";
		System.out.println(a.age);
		System.out.println(a.Firstname);
		InstancevariableExample2MultipleObject a2=new InstancevariableExample2MultipleObject();
		a2.age=25;
		a2.Firstname="Niki";
		System.out.println(a2.age);
		System.out.println(a2.Firstname);

	}

}
