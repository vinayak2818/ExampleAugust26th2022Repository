package com.sgtesting.Recursion;
class Fibonaccirecu
{
	int Fibo(int n) {
		if(n==0||n==1) {
			return n;
		}
		
		return(Fibo(n-2)+Fibo(n-1));
	}
}
public class RecursionFibonacciSeries {

	public static void main(String[] args) {
		Fibonaccirecu F1=new Fibonaccirecu();
		int f=F1.Fibo(10);
		System.out.println(f);

	}

}
