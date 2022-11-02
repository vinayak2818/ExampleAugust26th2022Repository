package com.sgtesting.classprograms;
class Calculation
{
	void addition()
	{
		int x,y,res;
		x=25;y=55;
		res=x+y;
		System.out.println("addition result:"+res);
	}
}

public class Methodex1 {

	public static void main(String[] args) {
		Calculation O1=new Calculation();
		O1.addition();
		
	}

}
