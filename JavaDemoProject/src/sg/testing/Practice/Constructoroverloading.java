package sg.testing.Practice;
class Brids
{
	Brids(String name)
	{
		System.out.println("Brid name:"+name);
	}
	Brids(String name2,String name1)
	{
		
		System.out.println("Brid name:"+name2+"  Brid name:"+name1);
	}
}
public class Constructoroverloading {

	public static void main(String[] args) {
		Brids n=new Brids("Sparrow");
		Brids n1=new Brids("Egale","Parrot");
		
		

	}

}
