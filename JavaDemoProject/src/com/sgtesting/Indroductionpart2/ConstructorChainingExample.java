package com.sgtesting.Indroductionpart2;
class Employee1
{
	Employee1(String Empname)
	{
		System.out.println("Employee Name:"+Empname);
	}
	Employee1(int Empno)
	{
		this("Vinayak");//Constructor Chaining 
		System.out.println("Employee number:"+Empno);
	}
	Employee1(String job,int sal)
	{
		this(420);//Constructor Chaining
		System.out.println("Employee job:"+job +" Employee Salary:"+sal);
	}
}

public class ConstructorChainingExample {

	public static void main(String[] args) {
		Employee1 a=new Employee1("QA", 25000);

	}

}
