package com.sgtesting.OverloadingConstructor;
class University
{
	University(String name)
	{
		System.out.println("University Name:"+name);
	}
	University(int rank)
	{
		System.out.println("University Ranking:"+rank);
	}
	University(String loc,int noofcollege)
	{
		System.out.println("University Location:"+loc+" No of Colleges Under University:"+noofcollege);
	}

}

public class UniversityConstructorOverloading {

	public static void main(String[] args) {
		University U1=new University(49);
		University U2=new University("Visvesvaraya Technological University");
		University U3=new University("Belagavi",219);
	}

}


