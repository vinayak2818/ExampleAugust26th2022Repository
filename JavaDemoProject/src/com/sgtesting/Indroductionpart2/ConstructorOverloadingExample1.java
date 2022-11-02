package com.sgtesting.Indroductionpart2;
class Employee
{
	Employee(String Empname)
	{
		System.out.println("Employee Name:"+Empname);
	}
	Employee(int Empno)
	{
		System.out.println("Employee number:"+Empno);
	}
	Employee(String job,int sal)
	{
		System.out.println("Employee job:"+job +" Employee Salary:"+sal);
	}
}

public class ConstructorOverloadingExample1 {

	public static void main(String[] args) {
		Employee a=new Employee("Vinayak");
		Employee a1=new Employee(125);
		Employee a2=new Employee("QA",25000);
		

	}

}
