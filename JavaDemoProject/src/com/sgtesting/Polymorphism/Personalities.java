package com.sgtesting.Polymorphism;
abstract class Humanbehaviour
{
	abstract void behaviour();
}
class human1 extends  Humanbehaviour
{
	void behaviour()
	{
		String name="Optimistic";
		System.out.println("Human1 Behaviour:"+name);
	}
}
class  human2 extends Humanbehaviour
{
	void behaviour()
	{
		String name="Pessimistic";
		System.out.println("Human2 Behaviour:"+name);
	}
}
class human3 extends Humanbehaviour
{
	void behaviour()
	{
		String name="Trusting";
		System.out.println("Human3 Behaviour:"+name);
	}
}

public class Personalities {

	public static void main(String[] args) {
		Humanbehaviour person=null;
		person=new human1();
		person.behaviour();
		person=new human2();
		person.behaviour();
		person=new human3();
		person.behaviour();

	}

}
