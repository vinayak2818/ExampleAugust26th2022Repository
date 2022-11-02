package com.sgtesting.demoprograms;

public class FibanceSeries {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		int sum=1					;
		for(int i=3;i<=10;i++) {
			int third=first+second;
			first=second;
			second=third;
			
			sum=sum+third;
			
			}
		System.out.println(sum);

	}

}
