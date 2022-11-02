package sg.testing.Practice;
class Sports
{
	String playername;
	int NoofPlayer;
	String Sportname;
	Sports(String pn,int np,String sn)
	{
		 playername=pn;
		 NoofPlayer=np;
		 Sportname=sn;
		System.out.println("player name:"+playername);
		System.out.println("Number of player:"+NoofPlayer);
		System.out.println("Sports Name:"+Sportname);
	}
}


public class ParameterizedConstructor {

	public static void main(String[] args) {
		Sports n=new Sports("Sachin",11,"cricket");

	}

}
