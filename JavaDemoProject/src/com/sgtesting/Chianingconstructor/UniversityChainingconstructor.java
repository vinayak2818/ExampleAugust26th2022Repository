package com.sgtesting.Chianingconstructor;
class University
{
	University(String name)
	{
		System.out.println("University Name:"+name);
	}
	University(int rank)
	{
		this("IIT Madras");
		System.out.println("University Ranking:"+rank);
	}
	University(String loc,int noofcollege)
	{
		this(1);
		System.out.println("University Location:"+loc+" Degrees offered Under University:"+noofcollege);
	}

}

public class UniversityChainingconstructor {

	public static void main(String[] args) {
		University U1=new University("Chennai",16);
	}

}


