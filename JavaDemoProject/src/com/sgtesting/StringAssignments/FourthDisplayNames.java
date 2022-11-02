package com.sgtesting.StringAssignments;
//The given String is Bangalore and Mysore ,WAP to display "Mysore and Bangalore"

public class FourthDisplayNames {

	public static void main(String[] args) {
		String s=new String("Bangalore and Mysore");
		String s1[]=s.split("and");
		for(int i=s1.length-1;i>=0;i--) {
		System.out.print(s1[i]+" ");
		}

	}

}
