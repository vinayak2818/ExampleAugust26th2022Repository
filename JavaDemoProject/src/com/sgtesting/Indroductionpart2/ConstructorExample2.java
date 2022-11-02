package com.sgtesting.Indroductionpart2;
class Student1
{
	String Firstname;
	String Branchname;
	int marks;
	Student1(String Fn,String Bn,int marks)
	{
		Firstname=Fn;
		Branchname=Bn;
		marks=marks; //both are same.... so the parameters marks has hidden the instance variable
		System.out.println(Firstname);
		System.out.println(Branchname);
		System.out.println(marks);
	}
	void student()
	{
		System.out.println(Firstname);
		System.out.println(Branchname);
		System.out.println(marks);
	}
}

public class ConstructorExample2 {

	public static void main(String[] args) {
		Student1 a=new Student1("Vinayak","Mechanical Engg",66);
		a.student();

	}

}
