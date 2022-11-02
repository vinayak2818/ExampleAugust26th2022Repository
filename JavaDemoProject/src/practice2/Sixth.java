package practice2;
class demostatic
{
	static
	{
		System.out.println("Static block");
	}
	
}

public class Sixth {

	public static void main(String[] args) {
		demostatic o=new demostatic();

	}

}
