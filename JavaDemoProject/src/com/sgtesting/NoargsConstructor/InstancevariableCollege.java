package com.sgtesting.NoargsConstructor;
class Student
{
	String Name;
	int ID;
	String BranchBelongsto;
	String Semester;
	Student()
	{
		Name="Smith";
		ID=42;
		BranchBelongsto="Mechanical Engineering";
		Semester="4th Sem";
		System.out.println("Student Name:"+Name);
		System.out.println("Student ID:"+ID);
		System.out.println("Student Belongs to:"+BranchBelongsto);
		System.out.println("Student Semester:"+Semester);
		System.out.println("________________________________________");
		
	}
}
class University
{
	String Name;
	String Loc;
	String CourseAvailable;
	String belongsto;
	University()
	{
		Name="KVG College of Engineering";
		Loc="Mangalore";
		CourseAvailable="Engineering Stream";
		belongsto="Government";
		System.out.println("College Name:"+Name);
		System.out.println("College Location:"+Loc);
		System.out.println("College Course Available:"+CourseAvailable);
		System.out.println("College Belong to:"+belongsto);
		System.out.println("________________________________________");
		
	}
}
class Library 
{
	String Belongsto;
	String BookAvailable;
	String Timings;
	int NoofBooks;
	Library()
	{
		Belongsto="Government";
		BookAvailable="Engineering Books";
		NoofBooks=20000;
		Timings="9AM to 9PM";
		System.out.println("Library Belongs to:"+Belongsto);
		System.out.println("Library Book Available:"+BookAvailable);
		System.out.println("Library Number of Books:"+NoofBooks);
		System.out.println("Library Timing:"+Timings);
		System.out.println("________________________________________");
		
	}
}
class Sports
{
	String Name;
	String type;
	int Noofpeople;
	String Loc;
	Sports()
	{
		Name="Cricket";
		Noofpeople=11;
		Loc="Indoor";
		type="Group";		
		System.out.println("Sport Name:"+Name);
		System.out.println("Sport number of People:"+Noofpeople);
		System.out.println("Sport Location:"+Loc);
		System.out.println("Sport Type:"+type);
		
	}
}
public class InstancevariableCollege {

	public static void main(String[] args) {
		Student Boy=new Student();
		
		University College=new University();
		
		Library Lib=new Library();
		
		Sports col=new Sports();
		
	}

}
