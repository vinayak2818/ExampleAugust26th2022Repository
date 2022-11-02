package practice2;
class block
{
	{
		System.out.println("Instance block");
	}
	static
	{
		System.out.println("static block");
	}
	static void display()
	{
		System.out.println("static method");
	}
	block(String name)
	{
		display();
		System.out.println(name);
	}
}

public class Seventh {

	public static void main(String[] args) {
		block n=new block("Parameterized constructor");

	}

}
