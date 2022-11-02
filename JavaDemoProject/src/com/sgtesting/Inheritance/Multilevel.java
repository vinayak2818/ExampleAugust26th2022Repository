package com.sgtesting.Inheritance;
class College
{
	College()
	{
		System.out.println("K V G College of Enginerring");
	}
}
class Branch extends College
{
	Branch() 
	{
		super();
		System.out.println("Mechanical Engineering");
	}
}
class yearofpassing extends Branch
{
	yearofpassing() 
	{
		super();
		System.out.println("2017 Passed out");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		yearofpassing o=new yearofpassing();

	}

}
