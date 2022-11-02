package com.sgtesting.OverloadingConstructor;
class Metrocity
{
	Metrocity(String name)
	{
		System.out.println("Metrocity Name:"+name);
	}
	Metrocity(int rank)
	{
		System.out.println("Metrocity Ranking:"+rank);
	}
	Metrocity(String belongsto,int noofPopulation)
	{
		System.out.println("Metrocity Belongs to:"+belongsto+" No of Population in Metrocity:"+noofPopulation);
	}

}

public class MetroConstructorOverloading {

	public static void main(String[] args) {
		Metrocity M1=new Metrocity(3);
		Metrocity M2=new Metrocity("Bangalore");
		Metrocity M3=new Metrocity("India",8499399);
	}

}
