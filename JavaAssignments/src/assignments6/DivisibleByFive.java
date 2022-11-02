package assignments6;
class DivisibleByFive
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if (a%5==0)
		{
		System.out.println(a+" is divisible by 5");
		}
		else
		{
		System.out.println(a+" is not divisible by 5");
		}
	}
}