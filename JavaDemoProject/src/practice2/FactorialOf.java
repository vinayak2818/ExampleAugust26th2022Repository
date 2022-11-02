package practice2;
class Factorial
{
	void factorial(int fact,int a)
	{
		for(int i=a;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}


public class FactorialOf {

	public static void main(String[] args) {
		Factorial a=new Factorial();
		a.factorial(1, 5);
	
	}

}
