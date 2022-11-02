package com.sgtesting.NoargsConstructor;
class Country
{
	String Name;
	String Currency;
	String NoofStates;
	String InCharge;
	Country()
	{
		Name="INDIA";
		Currency="Rupees";
		NoofStates="28 states";
		InCharge="Prime Minister";
		System.out.println("Country Name:"+Name);
		System.out.println("Country Currency:"+Currency);
		System.out.println("Country No of states:"+NoofStates);
		System.out.println("Country Incharge:"+InCharge);
		System.out.println("________________________________________");
	}
}
class States
{
	String Name;
	String Area;
	String NoofDistrict;
	String Incharge;
	States()
	{
		Name="Karnataka";
		Area="191,791 sq.km";
		NoofDistrict="31 districts";
		Incharge="Chief Minister";
		System.out.println("State Name:"+Name);
		System.out.println("State Area:"+Area);
		System.out.println("States No of District:"+NoofDistrict);
		System.out.println("State Incharge:"+Incharge);
		System.out.println("________________________________________");
	}
}
class District 
{
	String Name;
	String Area;
	String noofvillage;
	String Incharge;
	District()
	{
		Name="Gadag";
		Area="4,656 sq.km";
		Incharge="MLA";
		noofvillage="337 villages";
		System.out.println("District Name:"+Name);
		System.out.println("District Area:"+Area);
		System.out.println("District Incharge:"+Incharge);
		System.out.println("District no of villages:"+noofvillage);
		System.out.println("________________________________________");
	}
}
class Village
{
	String Name;
	String Area;
	String Occupation;
	String Incharge;
	Village()
	{
		Name="Ron";
		Area="1292 sq.km";
		Occupation="Agriculture";
		Incharge="Sarpanch";
		System.out.println("Village name:"+Name);
		System.out.println("Village area:"+Area);
		System.out.println("Village Occupation:"+Occupation);
		System.out.println("Village Incharge:"+Incharge);
	}
}
public class InstanceVariableGeography {

	public static void main(String[] args) {
		Country Ind=new Country();
		
		States Kar=new States();
		
		District Gdg=new District();
		
		Village vil=new Village();
		
	}


}
