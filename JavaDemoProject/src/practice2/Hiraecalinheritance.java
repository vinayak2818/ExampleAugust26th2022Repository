package practice2;
class Practice1
{
	Practice1(String name)
	{
		System.out.println(name);
	}
}
class Practice2 extends Practice1
{
	Practice2(String name) 
	{

	super("Richard");
	}
}
class Practice3 extends Practice1
{
	Practice3()
	{
		super("Sachin");
	}
}

public class Hiraecalinheritance {

	public static void main(String[] args) {
		Practice2 n=new Practice2("Sachin");	
		Practice3 a=new Practice3();
	}

}
