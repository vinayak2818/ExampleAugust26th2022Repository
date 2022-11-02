package com.sgtesting.StringOperation;
class Sample
{
	String Firstname;
	int age;
	Sample(String fn,int age)
	{
		Firstname=fn;
		this.age=age;
	}
	public String toString()
	{
		return "Firstname of student is "+Firstname+" and "+age;
	}
}

public class SrtingRepresentationofObjectExample1 {

	public static void main(String[] args) {
		Sample obj=new Sample("Santosh",19);
		System.out.println(obj);

	}
	

}
