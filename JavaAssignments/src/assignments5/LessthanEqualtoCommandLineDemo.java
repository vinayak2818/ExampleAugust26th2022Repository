package assignments5;
class LessthanEqualtoCommandLineDemo
{
    public static void main(String[] args)

    {
	int a,b;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	boolean res=(a<=b);
	System.out.println("Lessthan or Equalto Result="+res);
	
    }
}