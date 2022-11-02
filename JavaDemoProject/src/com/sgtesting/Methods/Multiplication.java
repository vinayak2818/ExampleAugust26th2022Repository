package com.sgtesting.Methods;
class Tables
{
	void Table(int a)
	{
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
}

public class Multiplication {

	public static void main(String[] args) {
		Tables Tab=new Tables();
		Tab.Table(5);
		

	}

}
