package com.sgtesting.classprograms;
class Calculation1
{
	void Addition(int x,int y) {
		int res=x+y;
		System.out.println("Addition Result:"+res);
	}
}

public class Methodex2 {

	public static void main(String[] args) {
		
		Calculation1 C1=new Calculation1();
		C1.Addition(25, 27);

	}

}
