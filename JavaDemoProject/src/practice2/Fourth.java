package practice2;
class student1
{
	student1() 
	{
		System.out.println("new");
	}
	student1(String name)
	{
		this();
		System.out.println(name);
	}
}

public class Fourth {

	public static void main(String[] args) {
		student1 n=new student1("sachin");
		

	}

}
