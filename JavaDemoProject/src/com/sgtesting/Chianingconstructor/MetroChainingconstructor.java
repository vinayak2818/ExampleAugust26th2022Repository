package com.sgtesting.Chianingconstructor;
class Metrocity
{
	Metrocity(String name)
	{
		System.out.println("Metrocity Name:"+name);
	}
	Metrocity(int rank)
	{
		this("mumbai");
		System.out.println("Metrocity Ranking:"+rank);
	}
	Metrocity(String belongsto,int noofPopulation)
	{
		this(1);
		System.out.println("Metrocity Belongs to:"+belongsto+" No of Population in Metrocity:"+noofPopulation);
	}

}

public class MetroChainingconstructor {

	public static void main(String[] args) {
		
		Metrocity M1=new Metrocity("India",18414288);
	}

}
