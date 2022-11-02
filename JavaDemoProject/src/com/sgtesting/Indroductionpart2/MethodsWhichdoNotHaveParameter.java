package com.sgtesting.Indroductionpart2;
class Maths22
{
	void addition()
	{
		int x,y,res;
		x=25;y=16;
		res=x+y;
		System.out.println("Addition Result:"+res);
	}
}

public class MethodsWhichdoNotHaveParameter {

	public static void main(String[] args) {
		Maths22 a=new Maths22();
		a.addition();
		//a.addition();if we create multiple object, it shows same result
		//Maths22 a1=new Maths22();
		//a1.addition();

	}

}
