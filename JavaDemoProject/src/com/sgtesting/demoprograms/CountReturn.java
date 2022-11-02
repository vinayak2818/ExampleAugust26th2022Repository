package com.sgtesting.demoprograms;
class count1
{
	int Countofnumber()
	{
		int count=0;
		for(int i=10;i<=20;i++) {
			if(i%2==1) {
				count++;
			}
		}
		return count;
	}
}

public class CountReturn {

	public static void main(String[] args) {
		count1 C=new count1();
		int a=C.Countofnumber();
		
			System.out.println("contof number:"+a);
			
		}

	}


