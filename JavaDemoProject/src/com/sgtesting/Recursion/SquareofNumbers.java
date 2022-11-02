package com.sgtesting.Recursion;
class Square
{
	void printSquare(int n) {
		
		int a=0,b=0;
		
		for(int i=0;i<=n;i++) {
			
			a=a+i+b;
			System.out.print(a+" ");
			b=i;
		}
	}
}

public class SquareofNumbers {

	public static void main(String[] args) {
		int n=10;
		Square S=new Square();		
		S.printSquare(n);

	}

}
