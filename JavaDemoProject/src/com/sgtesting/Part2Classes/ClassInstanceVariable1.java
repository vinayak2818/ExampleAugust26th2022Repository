package com.sgtesting.Part2Classes;
class Employee
{
	String Empname;
	int EmpID;
	String Designation;
	int Salary;
}
class Department
{
	String Deptname;
	int Dpetno;
	int DeptNoofstudents;
	String Deptloc;
}
class Insurance
{
	String insHoldername;
	String InsType;
	int InsAmount;
	String InsNo;
}
public class ClassInstanceVariable1 {

	public static void main(String[] args) {
		Employee Nikhil=new Employee();
		Nikhil.Empname="Nikhil Gowda";
		Nikhil.EmpID=10;
		Nikhil.Designation="Site Engineer";
		Nikhil.Salary=20000;
		System.out.println("Employee name:"+Nikhil.Empname);
		System.out.println("Employee ID:"+Nikhil.EmpID);
		System.out.println("Employee Designation:"+Nikhil.Designation);
		System.out.println("Employee Salary:"+Nikhil.Salary);
		System.out.println("________________________________________");
		Department Mech=new Department();
		Mech.Deptname="Mechanical Emgineering";
		Mech.Dpetno=1;
		Mech.DeptNoofstudents=120;
		Mech.Deptloc="KVGCE";
		System.out.println("Department Name:"+Mech.Deptname);
		System.out.println("Department Number:"+Mech.Dpetno);
		System.out.println("Department Number of Students:"+Mech.DeptNoofstudents);
		System.out.println("Department Location:"+Mech.Deptloc);
		System.out.println("________________________________________");
		Insurance Bajaj=new Insurance();
		Bajaj.insHoldername="Vinayak PL";
		Bajaj.InsType="First Party";
		Bajaj.InsAmount=100000;
		Bajaj.InsNo="10020E12W00Q";
		System.out.println("Insurance Holder:"+Bajaj.insHoldername);
		System.out.println("Insurance Type:"+Bajaj.InsType);
		System.out.println("Insurance Amount:"+Bajaj.InsAmount);
		System.out.println("Insurance Number:"+Bajaj.InsNo);
		
	}

}
