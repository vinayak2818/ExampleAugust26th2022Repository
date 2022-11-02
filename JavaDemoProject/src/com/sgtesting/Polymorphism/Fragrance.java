package com.sgtesting.Polymorphism;
abstract class FlowerFragrance
{
	abstract void fragrance();
}
class Rose extends  FlowerFragrance
{
	void fragrance()
	{
		String name="classic scent";
		System.out.println("Rose Fragrance:"+name);
	}
}
class   lily extends FlowerFragrance
{
	void fragrance()
	{
		String name="intoxicating scent ";
		System.out.println("Lily Fragrance:"+name);
	}
}
class lavender extends FlowerFragrance
{
	void fragrance()
	{
		String name="distinctive scent";
		System.out.println("Lavender Fragrance:"+name);
	}
}


public class Fragrance {

	public static void main(String[] args) {
		FlowerFragrance smell=null;
		smell=new Rose();
		smell.fragrance();
		smell=new lily();
		smell.fragrance();
		smell=new lavender();
		smell.fragrance();
		

	}

}
