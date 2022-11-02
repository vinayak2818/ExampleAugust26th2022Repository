package com.sgtesting.Recursion;
class Noofelements1
{
	int elements(int n){
		int a=0;
		int r;
		while(n>0) 
		{
			r=n%10;
			a=(a*10 )+r;
			n=n/10;
			
		}
		return a;
	}
	
}
public class Reverselength {

	public static void main(String[] args) {
		Noofelements1 o=new Noofelements1();
int n=56784;
int z=o.elements(n);
	System.out.println(z);
		

	}

}
