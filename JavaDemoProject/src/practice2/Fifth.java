package practice2;
//can we declare one overloaded method as static and another as instance?
class name
{
	static void display()
	{
		System.out.println("Static method");
	}
	void display1()
	{
		display();
		System.out.println("instace method");
	}
}

public class Fifth {

	public static void main(String[] args) {
		name n=new name();
		n.display1();

	}

}
