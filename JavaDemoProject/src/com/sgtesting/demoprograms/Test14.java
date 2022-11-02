package com.sgtesting.demoprograms;
class primenumber
{
	int[] prime()
	{
		int cun=0;
		for(int i=10;i<=20;i++) {
			int count=0;
			for(int j=1;j<=20;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				cun++;
			}
		}
		int h[]=new int[cun];
		int c=0;
		for(int i=10;i<=20;i++) {
			int count=0;
			for(int j=1;j<=20;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				h[c]=i;
				c++;
			}
			
		}
		return h;
	}
}



public class Test14 {

	public static void main(String[] args) {
		primenumber P1=new primenumber();
		int a[]=P1.prime();
		for(int c=0;c<a.length;c++) {
			System.out.println(a[c]);
		}
	}

}
