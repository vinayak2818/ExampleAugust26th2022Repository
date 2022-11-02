package com.sgtesting.Indroductionpart2;
class human1
{
	String name;
	int age;
}
class Brids
{
	String name;
	int noofwings;
}
class Domesticanimal
{
	String name;
	int Quantityofmilk;
}

public class InstancevariableExample3Multipleinstancevariable {

	public static void main(String[] args) {
		human1 a=new human1();
		a.age=24;
		a.name="Vinayak";
		System.out.println("Name:"+a.name);
		System.out.println("Age:"+a.age);
		Brids b=new Brids();
		b.name="Pigeon";
		b.noofwings=2;
		System.out.println("Name:"+b.name);
		System.out.println("Number of wings:"+b.noofwings);
		Domesticanimal c=new Domesticanimal();
		c.name="Cow";
		c.Quantityofmilk=65;
		System.out.println("Name:"+c.name);
		System.out.println("Quantity of milk in litre:"+c.Quantityofmilk);

	}

}
