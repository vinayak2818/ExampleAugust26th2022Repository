package com.sgtesting.ExceptionHandlingClassprograms;
class Stringvalidation
{
	static int getCharacterCount(String str) throws Exception
	{
		if(str==null)
		{
			throw new Exception("please provide the valid String,Never provide Null as input!!");
		}
		return str.length();
	}

}

public class ExceptionHandlingThrowsExampleString {

	public static void main(String[] args) {
		try
		{
			int v1=Stringvalidation.getCharacterCount("vinayak");
			System.out.println(v1);

			int v2=Stringvalidation.getCharacterCount(null);
			System.out.println(v2);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
