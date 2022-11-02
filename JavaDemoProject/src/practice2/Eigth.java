package practice2;
//Write a method,It has to return boolean 1D array
class Boolean
{
	boolean[] method() 
	{
		boolean[] a= {true,false};
		return a;
	}
}


public class Eigth {

	public static void main(String[] args) {
		Boolean a=new Boolean();
		boolean b[]=a.method();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
