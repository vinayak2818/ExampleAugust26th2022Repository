package com.sgtesting.demoprograms;
class fibonacci {
	int fib(int n)
	{
		
		int b = 1,c,a=0;
		for(int i=0;i<=n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}		
		return n;
	}
}

public class RecursionFibonacciSeries {

	public static void main(String[] args) {
		int n=10;
		fibonacci F=new fibonacci();
		F.fib(n);
		}

	}

