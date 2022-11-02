package com.sgtesting.Fifthtest;
class Obj
{
	static Obj Object()
	{
		return new Obj();
	}
}

public class SixthObjectreturn {

	public static void main(String[] args) {
		Obj a=Obj.Object();
		 
		System.out.println(a);
	}

}
