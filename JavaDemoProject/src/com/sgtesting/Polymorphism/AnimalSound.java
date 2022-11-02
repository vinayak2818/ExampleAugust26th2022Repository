package com.sgtesting.Polymorphism;
abstract class Animal
{
	abstract void Sound();
}
class Dog extends Animal
{
	void Sound()
	{
		String name="Bark";
		System.out.println("Dog :"+name);
	}
}
class Cat extends Animal
{
	void Sound()
	{
		String name="Meow";
		System.out.println("Cat :"+name);
	}
}
class Cow extends Animal
{
	void Sound()
	{
		String name="Moo";
		System.out.println("Cow :"+name);
	}
}
class Tigers extends Animal
{
	void Sound()
	{
		String name="Roar";
		System.out.println("Tigars :"+name);
	}
}


public class AnimalSound {

	public static void main(String[] args) {
		Animal animal=null;
		animal=new Dog();
		animal.Sound();
		animal=new Cat();
		animal.Sound();
		animal=new Cow(); 
		animal.Sound();
		animal=new Tigers();
		animal.Sound();
	}

}
