package sg.testing.Practice;
class Method1
{
	static void method(String name)
	{
		System.out.println(name);
	}
	static void method(int no)
	{
		System.out.println(no);
	}
}

public class Trail5 {

	public static void main(String[] args) {
		Method1.method(2);
		Method1.method("Sachin");

	}

}
