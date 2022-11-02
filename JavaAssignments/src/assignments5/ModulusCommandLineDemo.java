package assignments5;
class ModulusCommandLineDemo
{
    public static void main(String args[])
    {
	int a,b,res;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	res=a%b;
	System.out.println("Modulus Result="+res);
    }
}