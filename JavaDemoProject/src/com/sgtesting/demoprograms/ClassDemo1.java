 package com.sgtesting.demoprograms;
class person
{
	String firstname;
	int age;
	int sal;
}

public class ClassDemo1 {

	public static void main(String[] args) {
		person p=new person();
		p.firstname="santosh";
		p.age=23;
		p.sal=15000;
		System.out.println("First name:"+p.firstname);
		System.out.println("Salary:"+p.sal);
		System.out.println("Age:"+p.age);
		person p1=new person();
		p1.firstname="virat kohli";
		p1.age=33;
		p1.sal=23000;
		System.out.println("First name:"+p1.firstname);
		System.out.println("Salary:"+p1.sal);
		System.out.println("Age:"+p1.age);

	}

}
