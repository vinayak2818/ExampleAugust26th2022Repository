package assignments6;
class DivisibleByNine
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if (a%9==0)
		{
		System.out.println(a+" is divisible by 9");
		}
		else
		{
		System.out.println(a+" is not divisible by 9");
		}
	}
}