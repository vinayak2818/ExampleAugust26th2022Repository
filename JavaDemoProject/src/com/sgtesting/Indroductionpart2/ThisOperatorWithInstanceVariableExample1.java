package com.sgtesting.Indroductionpart2;
class Student2
{
	String Firstname;
	String Branchname;
	int marks;
	Student2(String Fn,String Bn,int marks)
	{
		Firstname=Fn;
		Branchname=Bn;
		this.marks=marks; //This operator is used because both are same.
		System.out.println(Firstname);
		System.out.println(Branchname);
		System.out.println(marks);
	}
	void student4()
	{
		System.out.println(Firstname);
		System.out.println(Branchname);
		System.out.println(marks);
	}
}
public class ThisOperatorWithInstanceVariableExample1 {

	public static void main(String[] args) {
		Student2 a=new Student2("Niki","Civil",27);
		a.student4();

	}

}
