package com.sgtesting.Fifthtest;
abstract class Poly
{
	abstract void cricket();
}
class Domestic extends Poly
{
	public void cricket()
	{
		System.out.println("Sachin");
	}
}
class International extends Poly
{
	public void cricket()
	{
		System.out.println("Suresh");
	}
}

public class Third {

	public static void main(String[] args) {
		Poly a=null;
		
		a=new Domestic();
		a.cricket();
		
		a=new International();
		a.cricket();

	}

}
