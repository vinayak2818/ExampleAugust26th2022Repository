package com.sgtesting.NoargsConstructor;
class Employee
{
	String Empname;
	int EmpID;
	String Designation;
	int Salary;
	
	
	Employee()
	{

		Empname="Nikhil Gowda";
		EmpID=10;
		Designation="Site Engineer";
		Salary=20000;
		
		System.out.println("Employee name:"+Empname);
		System.out.println("Employee ID:"+EmpID);
		System.out.println("Employee Designation:"+Designation);
		System.out.println("Employee Salary:"+Salary);
		System.out.println("________________________________________");

	}
}
	class Department
	{
		String Deptname;
		int Dpetno;
		int DeptNoofstudents;
		String Deptloc;
		Department()
		{
			Deptname="Mechanical Emgineering";
			Dpetno=1;
			DeptNoofstudents=120;
			Deptloc="KVGCE";
			System.out.println("Department Name:"+Deptname);
			System.out.println("Department Number:"+Dpetno);
			System.out.println("Department Number of Students:"+DeptNoofstudents);
			System.out.println("Department Location:"+Deptloc);
			System.out.println("________________________________________");
		}
	}
	class Insurance
	{
		String InsHoldername;
		String InsType;
		int InsAmount;
		String InsNo;
		{
			InsHoldername="Vinayak PL";
			InsType="First Party";
			InsAmount=100000;
			InsNo="10020E12W00Q";
			System.out.println("Insurance Holder:"+InsHoldername);
			System.out.println("Insurance Type:"+InsType);
			System.out.println("Insurance Amount:"+InsAmount);
			System.out.println("Insurance Number:"+InsNo);
			System.out.println("________________________________________");
		}
		
	}
	public class ClassInstanceVariable1 {

		public static void main(String[] args) {
			Employee Nikhil=new Employee();
			
			Employee venky=new Employee();
			
			Department Mech=new Department();
			
			Department civil=new Department();
			
			Insurance Bajaj=new Insurance();
			
			Insurance Kotak=new Insurance();
			

		}

	}
