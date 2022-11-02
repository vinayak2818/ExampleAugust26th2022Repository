package com.sgtesting.Paramertrizedconstructor;
class Student
{
	String Name;
	int ID;
	String BranchBelongsto;
	String Semester;
	Student(String Nam,int id,String Ba,String Sem)
	{
		Name=Nam;
		ID=id;
		BranchBelongsto=Ba;
		Semester=Sem;
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
	String Belongsto;
	University(String Nam,String loc,String Ca,String Bt)
	{
		Name=Nam;
		Loc=loc;
		CourseAvailable=Ca;
		Belongsto=Bt;
		System.out.println("College Name:"+Name);
		System.out.println("College Location:"+Loc);
		System.out.println("College Course Available:"+CourseAvailable);
		System.out.println("College Belong to:"+Belongsto);
		System.out.println("________________________________________");
		
	}
}
class Library 
{
	String Belongsto;
	String BookAvailable;
	String Timings;
	int NoofBooks;
	Library(String Bl,String Ba,String Time,int Nb)
	{
		Belongsto=Bl;
		BookAvailable=Ba;
		NoofBooks=Nb;
		Timings=Time;
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
	Sports(String Nam,String Ty,int Np,String loc)
	{
		Name=Nam;
		Noofpeople=Np;
		Loc=loc;
		type=Ty;		
		System.out.println("Sport Name:"+Name);
		System.out.println("Sport number of People:"+Noofpeople);
		System.out.println("Sport Location:"+Loc);
		System.out.println("Sport Type:"+type);
		System.out.println("________________________________________");
		
	}
}
public class InstancevariableCollege {

	public static void main(String[] args) {
		Student Stu=new Student( "smith",11,"Mechanical Engineering","Second Sem");
		Student Stu1=new Student( "Robert",13,"Civil Engineering","Fourth Sem");
		
		University College=new University("KVGCE","Mangalore","Engineering Stream","Government");
		University College1=new University("RV","Bangalore","All Stream","Autonomus");
		
		Library Lib=new Library("KVGCE","Engineering Related","9AM to PM",20000);
		Library Lib1=new Library("RV","All Stream","9AM to PM",120000);
		
		Sports col=new Sports("Cricket","Group",11,"Outdoor");
		Sports col1=new Sports("TableTennis","Single",1,"Indoor");
		
	}

}
