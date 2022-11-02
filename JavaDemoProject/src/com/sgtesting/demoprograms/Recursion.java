package com.sgtesting.demoprograms;
class count
{
	int countofnumber(int n)
	{
		int count=0;
		while(n>0){
			n=n/10;
			

			count++;

		}
		System.out.println(count);
		return n;
	}
}

public class Recursion {

	public static void main(String[] args) {
		int n=243565;
		count O=new count();
		O.countofnumber(n);

	}

}
