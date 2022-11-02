package practice2;
class Student5
{
	Student5(String name)
	{
		System.out.println("Student name:"+name);
	}
}
class Library extends Student5
{
	Library(int i) {
	super("Sachin");
	}
	void display()
	{
		System.out.println(12000);
	}
	
}
class Sports extends Library
{
	Sports()
	{
		super(12000);
		
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		Sports n=new Sports();
		n.display();
		
		

	}

}
