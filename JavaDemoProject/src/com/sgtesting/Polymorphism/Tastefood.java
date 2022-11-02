package com.sgtesting.Polymorphism;
abstract class foodtaste
{
	abstract void feel();
}
class lemon extends  foodtaste
{
	void feel()
	{
		String name="Sour";
		System.out.println("Lemon taste:"+name);
	}
}
class  salt extends foodtaste
{
	void feel()
	{
		String name="Salty";
		System.out.println("Salt taste:"+name);
	}
}
class cake extends foodtaste
{
	void feel()
	{
		String name="Sweet";
		System.out.println("Cake taste:"+name);
	}
}

public class Tastefood {

	public static void main(String[] args) {
		foodtaste Feel=null;
		lemon q=new lemon();
		cake f=new cake();
		salt y=new salt();
		
		Feel=q;
		Feel.feel();
		Feel=f;
		Feel.feel();
		Feel=y;
		Feel.feel();

	}

}
