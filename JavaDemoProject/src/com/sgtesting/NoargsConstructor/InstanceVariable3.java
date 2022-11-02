package com.sgtesting.NoargsConstructor;

class Animals
{
	String Name;
	String Group;
	String Foodtype;
	String classBelongsto;
	Animals()
	{
		Name="Lion";
		Foodtype="Carnivorous";
		classBelongsto="Mammal";
		Group="Wild Animal";
		System.out.println("Animal Name:"+Name);
		System.out.println("Animal Food Type:"+Foodtype);
		System.out.println("Animal Class Belongs to:"+classBelongsto);
		System.out.println("Animal Group:"+Group);
		System.out.println("________________________________________");
		
	}
}
class Fruits
{
	String Name;
	String VitaminAvailable;
	String color;
	String Seasonalfruit;
	Fruits()
	{
		Name="Mango";
		color="yellow";
		Seasonalfruit="May to September";
		VitaminAvailable="Vitamin A. Vitamin C";
		System.out.println("Fruit Name:"+Name);
		System.out.println("Fruit Color:"+color);
		System.out.println("Fruit Season Available:"+Seasonalfruit);
		System.out.println("Fruit Vitamin Available:"+VitaminAvailable);
		System.out.println("________________________________________");
	}
}
class Vegetable 
{
	String Name;
	String VitaminAvailable;
	String Flavor ;
	String color;
	Vegetable()
	{
		Name="Tomato";
		color="Red";
		Flavor="sweet,tart,tangy";
		VitaminAvailable="Vitamin C";
		System.out.println("Vegetable Name:"+Name);
		System.out.println("Vegetable color:"+color);
		System.out.println("Vegetable Flavor:"+Flavor);
		System.out.println("Vegetable Vitamin Available:"+VitaminAvailable);
		System.out.println("________________________________________");
	}
}
class Flowers
{
	String Name;
	String Color;
	String Purpose;
	String Represents;
	Flowers()
	{
		Name="Rose";
		Color="Red,Yellow,White";
		Represents="Love";
		Purpose="Decoration";
		System.out.println("Flower Name:"+Name);
		System.out.println("Flower Color:"+Color);
		System.out.println("Flower Representation:"+Represents);
		System.out.println("Flower Purpose:"+Purpose );
	}
}
public class InstanceVariable3 {

	public static void main(String[] args) {
		Animals Wild=new Animals();
		
		
		Fruits Eat=new Fruits();
		
		Vegetable Cook=new Vegetable();
		
		Flowers Blossom=new Flowers();
		
	}
}
