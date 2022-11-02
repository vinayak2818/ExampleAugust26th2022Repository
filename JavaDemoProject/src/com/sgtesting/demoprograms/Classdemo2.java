package com.sgtesting.demoprograms;
class human
{
	String Firstname;
	String Lastname;
	int age;
	int salary;
	human(String fn,String ln,int Age,int sal)
	{
		Firstname=fn;
		this.Lastname=ln;
		this.age=Age;
		this.salary=sal;
		System.out.println("Firstname:"+Firstname);
		System.out.println("Lastname:"+Lastname);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		
	}
	void Display()
	{
		System.out.println("Firstname:"+Firstname);
		System.out.println("Lastname:"+Lastname);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);	
	}
}

public class Classdemo2 {

	public static void main(String[] args) {
		human o1=new human("Sachin","Tendulkar",23,15000);
		o1.Display();

	}

}
