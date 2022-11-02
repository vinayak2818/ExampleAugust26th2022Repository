package com.sgtesting.Arraydemo;

public class DoWhileDoubleOrder {

	public static void main(String[] args) {
		double d[]= {21.1,22.2,33.3,44.4,55.5,66.6,77.7};
		int a=0;
		do {
			System.out.println(d[a]);
			a++;
		}while(a<d.length);
	}
}
