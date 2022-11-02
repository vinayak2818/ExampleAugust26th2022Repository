package com.sgtesting.Arraydemo;

public class WhileLongReverseOrder {

	public static void main(String[] args) {
		long a[]= {2l,4l,6l,8l,10l,12l,14l,16l,18l,20l};
		int b=a.length-1;
		while(b>=0) {
			System.out.println(a[b]);
			b--;
		}
		

	}

}
