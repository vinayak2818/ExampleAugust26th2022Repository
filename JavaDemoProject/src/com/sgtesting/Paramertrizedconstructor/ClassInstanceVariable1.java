package com.sgtesting.Paramertrizedconstructor;
class Employee
{
	String Empname;
	int Empid;
	String Designation;
	int Salary;
	Employee(String En,int Ei,String Des,int Sal)
	{

		Empname=En;
		Empid=Ei;
		Designation=Des;
		Salary=Sal;

		System.out.println("Employee name:"+Empname);
		System.out.println("Employee ID:"+Empid);
		System.out.println("Employee Designation:"+Designation);
		System.out.println("Employee Salary:"+Salary);
		System.out.println("________________________________________");

	}
}
class Department
{
	String Deptname;
	int Deptno;
	int DeptNoofstudents;
	String Deptloc;
	Department(String Dn,int Dptn,int Ns,String Dl)
	{
		Deptname=Dn;
		Deptno=Dptn;
		DeptNoofstudents=Ns;
		Deptloc=Dl;
		System.out.println("Department Name:"+Deptname);
		System.out.println("Department Number:"+Deptno);
		System.out.println("Department Number of Students:"+DeptNoofstudents);
		System.out.println("Department Location:"+Deptloc);
		System.out.println("________________________________________");
	}
}
class Insurance
{
	String InsHoldername;
	String Instype;
	int Insamount;
	String Insno;
	Insurance(String In,String It,int Ia,String Insn)
	{
		InsHoldername=In;
		Instype=It;
		Insamount=Ia;
		Insno=Insn;
		System.out.println("Insurance Holder:"+InsHoldername);
		System.out.println("Insurance Type:"+Instype);
		System.out.println("Insurance Amount:"+Insamount);
		System.out.println("Insurance Number:"+Insno);
		System.out.println("________________________________________");
	}

}
public class ClassInstanceVariable1 {

	public static void main(String[] args) {
		Employee Person=new Employee("Nikhil",120,"Site Engineer",20000);
		Employee Person1=new Employee("Samarth",119,"Quality Engineer",25000);			

		Department Branch=new Department("Mechanical Engineering",1,120,"KVGCE");
		Department Branch1=new Department("Civil Engineering",2,110,"KVGCE");

		Insurance Type=new Insurance("Bajaj","First Party",10000,"1001ER15QW05");
		Insurance Type1=new Insurance("Reliance","Second Party",50700,"1001RR15QW05");



	}

}
