package com.sgtesting.Arraydemo;

public class DoWhileLongReverseOrder {

	public static void main(String[] args) {
		long l[]= {1l,3l,5l,7l,9l,11l,13l,15l,17l};
		int a=l.length-1;
		do {
			System.out.println(l[a]);
			a--;
		}while(a>=0);

	}

}
