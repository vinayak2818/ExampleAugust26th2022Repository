package com.sgtesting.demoprograms;
class Employee1
{
	Employee1 (String empname)
	{
		System.out.println("employee Name:"+empname);
	}
	Employee1 (int empno)
	{
		System.out.println("employee Number:"+empno);
	}
	Employee1 (String empname,int empno)
	{
		System.out.println("employee Name:"+empname+"employee Number:"+empno);
	}
}
public class Classdemo3 {

	public static void main(String[] args) {
		Employee1 o1=new Employee1(1500);
		Employee1 o2=new Employee1("vinayak lakkundi");
		Employee1 o3=new Employee1("Virat kohli  ",1500);
		

	}

}
