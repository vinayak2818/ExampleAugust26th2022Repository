package com.sgtesting.Abstract;
//in a hybrid inheritance super class is an abstract class it has some abstract methods write a program to execute all the members of superclass based on the subclass object
abstract class Software
{
	abstract void Software1(String name);
	
}
abstract class Application extends  Software
{
	abstract void Software(String name);
	
	void Software1(String name)
	{
		System.out.println("software name:"+name);
		
	}
	
}
class Build extends Application
{
	Build(String name) 
	{
	 super.Software1(name);
	}
	void Software(String name)
	{
		System.out.println("Application name:"+name);
	}
}
class App extends Software
{
	void Software1(String name)
	{
		System.out.println("Soft name:"+name);
	}
}

public class Hybridabstract {

	public static void main(String[] args) {
		App a=new App();
		a.Software1("Oracle");
		Build n=new Build("Andriod");
		n.Software("Eclipse");
		
		
		

	}

}
