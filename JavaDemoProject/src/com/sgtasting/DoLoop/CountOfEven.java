package com.sgtasting.DoLoop;

public class CountOfEven {

	public static void main(String[] args) {
		int i=250;
		int count=0;
		do {
			if(i%2==0) {
				count++;
			} 
			i++;
		} while(i<=500);
		System.out.println(count);

	}

}
