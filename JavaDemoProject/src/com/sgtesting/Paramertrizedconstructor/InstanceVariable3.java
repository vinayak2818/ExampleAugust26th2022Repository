package com.sgtesting.Paramertrizedconstructor;

class Animals
{
	String Name;
	String Group;
	String Foodtype;
	String ClassBelongsto;
	Animals(String Nam,String Gro,String Ft,String Cb)
	{
		Name=Nam;
		Foodtype=Gro;
		ClassBelongsto=Ft;
		Group=Cb;
		System.out.println("Animal Name:"+Name);
		System.out.println("Animal Food Type:"+Foodtype);
		System.out.println("Animal Class Belongs to:"+ClassBelongsto);
		System.out.println("Animal Group:"+Group);
		System.out.println("________________________________________");
		
	}
}
class Fruits
{
	String Name;
	String Vitaminavailable;
	String color;
	String Seasonalfruit;
	Fruits(String Nam,String Va,String Col,String Sf)
	{
		Name=Nam;
		color=Col;
		Seasonalfruit=Sf;
		Vitaminavailable=Va;
		System.out.println("Fruit Name:"+Name);
		System.out.println("Fruit Color:"+color);
		System.out.println("Fruit Season Available:"+Seasonalfruit);
		System.out.println("Fruit Vitamin Available:"+Vitaminavailable);
		System.out.println("________________________________________");
	}
}
class Vegetable 
{
	String Name;
	String Vitaminavailable;
	String Flavor ;
	String color;
	Vegetable(String Nam,String Va,String Fl,String Col)
	{
		Name=Nam;
		color=Col;
		Flavor=Fl;
		Vitaminavailable=Va;
		System.out.println("Vegetable Name:"+Name);
		System.out.println("Vegetable color:"+color);
		System.out.println("Vegetable Flavor:"+Flavor);
		System.out.println("Vegetable Vitamin Available:"+Vitaminavailable);
		System.out.println("________________________________________");
	}
}
class Flowers
{
	String Name;
	String Color;
	String Purpose;
	String Represents;
	Flowers(String Nam,String col,String Pp,String Rep)
	{
		Name=Nam;
		Color=col;
		Represents=Pp;
		Purpose=Rep;
		System.out.println("Flower Name:"+Name);
		System.out.println("Flower Color:"+Color);
		System.out.println("Flower Representation:"+Represents);
		System.out.println("Flower Purpose:"+Purpose );
		System.out.println("________________________________________");
	}
}
public class InstanceVariable3 {

	public static void main(String[] args) {
		Animals Wild=new Animals("Lion","Wild Animal","Carnivorous","Mammal");
		Animals Wild1=new Animals("Dog","Domestic Animal","Carnivorous","Mammal");
				
		Fruits Fruit=new Fruits("Mango","vitamin C","Yellow","May to September");
		Fruits Fruit1=new Fruits("Apple","vitamin A","RED and GREEN"," April to July");
		
		Vegetable Veg=new Vegetable("Tamato","vitamin C","tangy","Red");
		Vegetable Veg1=new Vegetable("Chilli","vitamin C","Spicy","Green");
		
		
		Flowers Blossom=new Flowers("Rose","red","Decoration","Love");
		Flowers Blossom1=new Flowers("jasmine","white","Decoration","beauty");
		
	}
}
