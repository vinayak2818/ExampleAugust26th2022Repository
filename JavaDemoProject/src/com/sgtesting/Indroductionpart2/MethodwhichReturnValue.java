package com.sgtesting.Indroductionpart2;
class maths4
{
	int addition(int x,int y)
	{
		return(x+y);
	}
	int Substraction(int x,int y)
	{
		return(x-y);
	}
	void multiplication(int x,int y)
	{
		int res=x*y;
		System.out.println("Multilication Result:"+res);
	}
	//case2
	void Multiple()
	{
		int x=this.addition(10, 1);
		int y=this.Substraction(12, 6);
		int res1=x*y;
		System.out.println("Multilication Results:"+res1);
	}
}


public class MethodwhichReturnValue {

	public static void main(String[] args) {
		//case 1
		maths4 a=new maths4();
		int p=a.addition(15, 12);
		int q=a.Substraction(13, 5);
		a.multiplication(p, q);
		
		
		
		maths4 b=new maths4();
		b.multiplication(b.addition(1, 5), b.Substraction(5, 1));
		
		maths4 c=new maths4();
		c.Multiple();		
		
	}

}
