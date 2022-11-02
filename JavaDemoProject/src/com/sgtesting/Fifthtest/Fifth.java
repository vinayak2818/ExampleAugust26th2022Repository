package com.sgtesting.Fifthtest;
class FinalBlock
{
	void add()
	{
		int x=2;
		int y=3;
		int res=x+y;
		System.out.println(res);
	}
	void mult()
	{
		try
		{
			int x=2;
			int y=3;
			int res=x*y;
			System.out.println(res);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("it always Excutes");
		}
	}
	void sub()
	{
		int x=8;
		int y=3;
		int res=x-y;
		System.out.println(res);
	}
}


public class Fifth {

	public static void main(String[] args) {
		FinalBlock a=new FinalBlock();
		a.add();
		a.mult();
		a.sub();

	}

}
