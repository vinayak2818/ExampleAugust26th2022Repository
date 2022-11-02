package com.sgtesting.Methodreturnvalue;
class Even
{
	int []evennumber()
	{
		int count=0;
		for(int i=50;i<=80;i++) 
		{
			if(i%2==0)
			{
				count++;
			}
		}
		
		int even[]=new int[count];
		int k=0;
		for(int p=50;p<=80;p++) 
		{
			if(p%2==0) 
			{
				even[k]=p;
				
				k++;
			}
			
		}return even;
		

	}
}
public class Returnvalue3 {

	public static void main(String[] args) {
		Even E=new Even();
		int p[]=E.evennumber();
		for(int a=0;a<p.length;a++) 
		{

			System.out.println(p[a]);
			
		}

	}
}




