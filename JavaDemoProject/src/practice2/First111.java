package practice2;
class maths1
{
	void addition(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}

}
class maths2 extends maths1
{
	void Substraction(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
	}
}
class maths3 extends maths2
{
	void multilplication(int x,int y)
	{
		int res =x*y;
		System.out.println(res);
	}
}
public class First111 {
	public static void main(String[] args) {
		maths3 a=new maths3();
		a.addition(12, 13);
		a.multilplication(5, 4);
		a.Substraction(6, 2);

	}

}
