package com.sgtesting.demoprograms;
class Employee2
{
	Employee2(String ename)
	{
		System.out.println("Employee name:"+ename);
	}
	Employee2(int empno)
	{
		this("Santosh");
		System.out.println("Employee number:"+empno);
		
	}
}
public class Classdemo4 {

	public static void main(String[] args) {
		
		Employee2 o=new Employee2(702);
				

	}

}
