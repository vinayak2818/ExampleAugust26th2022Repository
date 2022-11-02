package com.sgtesting.Part2Classes;
class Student
{
	String Name;
	int ID;
	String BranchBelongsto;
	String Semester;
}
class University
{
	String Name;
	String Loc;
	String CourseAvailable;
	String belongsto;
}
class Library 
{
	String Belongsto;
	String BookAvailable;
	String Timings;
	int NoofBooks;
}
class Sports
{
	String Name;
	String type;
	int Noofpeople;
	String Loc;
}
public class InstancevariableCollege {

	public static void main(String[] args) {
		Student Boy=new Student();
		Boy.Name="Smith";
		Boy.ID=42;
		Boy.BranchBelongsto="Mechanical Engineering";
		Boy.Semester="4th Sem";
		System.out.println("Student Name:"+Boy.Name);
		System.out.println("Student ID:"+Boy.ID);
		System.out.println("Student Belongs to:"+Boy.BranchBelongsto);
		System.out.println("Student Semester:"+Boy.Semester);
		System.out.println("________________________________________");
		University College=new University();
		College.Name="KVG College of Engineering";
		College.Loc="Mangalore";
		College.CourseAvailable="Engineering Stream";
		College.belongsto="Government";
		System.out.println("College Name:"+College.Name);
		System.out.println("College Location:"+College.Loc);
		System.out.println("College Course Available:"+College.CourseAvailable);
		System.out.println("College Belong to:"+College.belongsto);
		System.out.println("________________________________________");
		Library Lib=new Library();
		Lib.Belongsto="Government";
		Lib.BookAvailable="Engineering Books";
		Lib.NoofBooks=20000;
		Lib.Timings="9AM to 9PM";
		System.out.println("Library Belongs to:"+Lib.Belongsto);
		System.out.println("Library Book Available:"+Lib.BookAvailable);
		System.out.println("Library Number of Books:"+Lib.NoofBooks);
		System.out.println("Library Timing:"+Lib.Timings);
		System.out.println("________________________________________");
		Sports col=new Sports();
		col.Name="Cricket";
		col.Noofpeople=11;
		col.Loc="Indoor";
		col.type="Group";		
		System.out.println("Sport Name:"+col.Name);
		System.out.println("Sport number of People:"+col.Noofpeople);
		System.out.println("Sport Location:"+col.Loc);
		System.out.println("Sport Type:"+col.type);
	}

}
