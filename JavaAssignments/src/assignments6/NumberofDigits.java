package assignments6;
class NumberofDigits
{
	public static void main(String args[])
		{
		int x=Integer.parseInt(args[0]);
		if((x>=0)&&(x<=9))
		{
		System.out.println(x+" is a 1 Digit Number");
		}
		else if ((x>=10)&&(x<=99))
		{
		System.out.println(x+" is a 2 Digit Number");
		}
		else if ((x>=100)&&(x<=999))
		{
		System.out.println(x+" is a 3 Digit Number");
		}
		else if ((x>=1000)&&(x<=9999))
		{
		System.out.println(x+" is a 4 Digit Number");
		}
		else if ((x>=10000)&&(x<=9999))
		{
		System.out.println(x+" is a 5 Digit Number");
		}
		else
		{
		System.out.println(x+" Limit Exceeded");
		}
		}
}