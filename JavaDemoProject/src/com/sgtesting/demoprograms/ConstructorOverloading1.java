package com.sgtesting.demoprograms;
class Employee
{
	Employee(String empname){
		System.out.println("Employee Name:"+empname);
	}
	Employee(int empno){
		System.out.println("Employee Name:"+empno);
	}
	Employee(String job, int sal){
		System.out.println("Employee Job:"+job+"Employee Salary:"+sal);
	}
}

public class ConstructorOverloading1 {

	public static void main(String[] args) {
	Employee o1=new Employee(7902);
	Employee o2=new Employee("Manager  ",  9500);
	Employee o3=new Employee("Santosh");
	}

}
