package com.sgtesting.Recursion;
class Noofelements
{
	int elements(int n){
		int count=0;
		while(n>0) 
		{
			n=n/10;
			count=count+1;
		}
		return count;
	}
	
}

public class CountofNumbers {

	public static void main(String[] args) {
		int arr[]= {78,254876,214,124,456,5555};
		
		Noofelements o=new Noofelements();
		for(int i=0;i<arr.length;i++) {
			int count=o.elements(arr[i]);
			System.out.println("The length of the number "+arr[i]+" is "+count);
		}
		

	}

}
