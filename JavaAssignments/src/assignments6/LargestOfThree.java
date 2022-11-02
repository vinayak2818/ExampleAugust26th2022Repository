package assignments6;
class LargestOfThree
{
	public static void main(String args[])
	{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	if((a>=b)&&(a>=c))
	{
	System.out.println(a+" is a Largest of 3");
	}
	else if ((b>=a)&&(b>=c))
	{
	System.out.println(b+" is a Largest of 3");
	}
	else 
	{
	System.out.println(c+" is a Largestof 3" );
	}
	}
}