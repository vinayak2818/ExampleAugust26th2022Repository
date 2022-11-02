package com.sgtesting.Chianingconstructor;
class Laptop
{
	Laptop(String name){

		System.out.println("Laptop Name:"+name);
	}
	Laptop(int price)
	{
		this("HP");
		System.out.println("Laptop Price:"+price);
	}
	Laptop(String screensize,String ramsize){
		this(57532);
		System.out.println("Laptop Screensize:"+screensize+"Laptop ram Capacity:"+ramsize);
	}
}	

public class LapChainingconstructor {

	public static void main(String[] args) {

		Laptop L1=new Laptop("15.9 Inches","8 GB");
	}
}


