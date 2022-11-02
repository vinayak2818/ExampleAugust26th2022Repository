package com.sgtesting.demoprograms;
class maths
{
	maths(int x,int y,String action){
		int res;
		switch(action)
		{
		case "add":
			res=(x+y);
			System.out.println("Addition Results:"+res);
			break;
		case "sub":
			res=(x-y);
			System.out.println("Substraction Results:"+res);
			break;
		case "mul":
			res=(x*y);
			System.out.println("multiplication Results:"+res);
			break;	
		case "div":
			res=(x/y);
			System.out.println("div Results:"+res);
			break;	
		case "mod":
			res=(x%y);
			System.out.println("MODULUS Results:"+res);
			break;
		default:
			System.out.println("invalid action");

		}
	}
}

public class Classdemo7 {

	public static void main(String[] args) {
		maths o1=new maths(10,20,"add");
		maths o2=new maths(20,5,"sub");
		maths o3=new maths(10,20,"mul");
		maths o4=new maths(49,7,"div");
		maths o5=new maths(81,9,"mod");


	}

}
