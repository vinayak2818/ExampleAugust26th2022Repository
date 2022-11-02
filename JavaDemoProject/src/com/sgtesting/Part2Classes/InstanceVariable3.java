package com.sgtesting.Part2Classes;

class Animals
{
	String Name;
	String Group;
	String Foodtype;
	String classBelongsto;
}
class Fruits
{
	String Name;
	String VitaminAvailable;
	String color;
	String Seasonalfruit;
}
class Vegetable 
{
	String Name;
	String VitaminAvailable;
	String Flavor ;
	String color;
}
class Flowers
{
	String Name;
	String Color;
	String Purpose;
	String Represents;
}
public class InstanceVariable3 {

	public static void main(String[] args) {
		Animals Wild=new Animals();
		Wild.Name="Lion";
		Wild.Foodtype="Carnivorous";
		Wild.classBelongsto="Mammal";
		Wild.Group="Wild Animal";
		System.out.println("Animal Name:"+Wild.Name);
		System.out.println("Animal Food Type:"+Wild.Foodtype);
		System.out.println("Animal Class Belongs to:"+Wild.classBelongsto);
		System.out.println("Animal Group:"+Wild.Group);
		System.out.println("________________________________________");
		Fruits Eat=new Fruits();
		Eat.Name="Mango";
		Eat.color="yellow";
		Eat.Seasonalfruit="May to September";
		Eat.VitaminAvailable="Vitamin A. Vitamin C";
		System.out.println("Fruit Name:"+Eat.Name);
		System.out.println("Fruit Color:"+Eat.color);
		System.out.println("Fruit Season Available:"+Eat.Seasonalfruit);
		System.out.println("Fruit Vitamin Available:"+Eat.VitaminAvailable);
		System.out.println("________________________________________");
		Vegetable Cook=new Vegetable();
		Cook.Name="Tomato";
		Cook.color="Red";
		Cook.Flavor="sweet,tart,tangy";
		Cook.VitaminAvailable="Vitamin C";
		System.out.println("Vegetable Name:"+Cook.Name);
		System.out.println("Vegetable color:"+Cook.color);
		System.out.println("Vegetable Flavor:"+Cook.Flavor);
		System.out.println("Vegetable Vitamin Available:"+Cook.VitaminAvailable);
		System.out.println("________________________________________");
		Flowers Blossom=new Flowers();
		Blossom.Name="Rose";
		Blossom.Color="Red,Yellow,White";
		Blossom.Represents="Love";
		Blossom.Purpose="Decoration";
		System.out.println("Flower Name:"+Blossom.Name);
		System.out.println("Flower Color:"+Blossom.Color);
		System.out.println("Flower Representation:"+Blossom.Represents);
		System.out.println("Flower Purpose:"+ Blossom.Purpose );
	}
}
