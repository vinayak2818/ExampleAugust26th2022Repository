package com.sgtesting.Indroductionpart2;
class maths
{
	maths(int x,int y,String action)
	{
		int res;
		switch(action)
		{
		case "add":
			res=x+y;
			System.out.println("Addition Result:"+res);
			break;
		case "sub":
			res=x-y;
			System.out.println("Substraction Result:"+res);
			break;
		case "mul":
			res=x*y;
			System.out.println("Multiplication Result:"+res);
			break;
		case "div":			
			res=x/y;
			System.out.println("Division Result:"+res);			
			break;
		case "mod":
			res=x%y;
			System.out.println("Modulus Result:"+res);
			break;
			default:
				System.out.println("invalid Action");
		
		}
	}
}

public class MathematicalCalculationusingSwitch {

	public static void main(String[] args) {
		maths o=new maths(10,12,"add");
		maths o1=new maths(18,12,"sub");
		maths o2=new maths(5,12,"mul");
		maths o3=new maths(10,4,"div");
		maths o4=new maths(100,12,"mod");
		
		

	}

}
