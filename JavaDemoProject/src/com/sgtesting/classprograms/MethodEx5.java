package com.sgtesting.classprograms;
class Calculation5
{
	void displayElements()
	{
		int a[]= {10,20,30,40,50,60};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	int[] getelements() 
	{
		int a[]= {10,20,30,40,50,60};
		return a;
	}
}

public class MethodEx5 {

	public static void main(String[] args) {
		Calculation5 C1=new Calculation5();
		C1.displayElements();
		System.out.println("_____________________________");
		int b[]=C1.getelements();
		System.out.println("Read reverse order");
		for(int i=b.length-1;i>=0;i--) {
			System.out.println(b[i]);
		}
		int c[]=C1.getelements();
		System.out.println("read second half of elements");
		for(int i=c.length/2;i<c.length;i++) {
			System.out.println(c[i]);
		}
		System.out.println("read first half of elements");
		for(int i=0;i<c.length/2;i++) {
			System.out.println(c[i]);
		}

	}

}
