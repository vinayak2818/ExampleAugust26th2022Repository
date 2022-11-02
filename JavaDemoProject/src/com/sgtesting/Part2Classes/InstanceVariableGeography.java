package com.sgtesting.Part2Classes;
class Country
{
	String Name;
	String Currency;
	String NoofStates;
	String InCharge;
}
class States
{
	String Name;
	String Area;
	String NoofDistrict;
	String Incharge;
}
class District 
{
	String Name;
	String Area;
	String noofvillage;
	String Incharge;
}
class Village
{
	String Name;
	String Area;
	String Occupation;
	String Incharge;
}
public class InstanceVariableGeography {

	public static void main(String[] args) {
		Country Ind=new Country();
		Ind.Name="INDIA";
		Ind.Currency="Rupees";
		Ind.NoofStates="28 states";
		Ind.InCharge="Prime Minister";
		System.out.println("Country Name:"+Ind.Name);
		System.out.println("Country Currency:"+Ind.Currency);
		System.out.println("Country No of states:"+Ind.NoofStates);
		System.out.println("Country Incharge:"+Ind.InCharge);
		System.out.println("________________________________________");
		States Kar=new States();
		Kar.Name="Karnataka";
		Kar.Area="191,791 sq.km";
		Kar.NoofDistrict="31 districts";
		Kar.Incharge="Chief Minister";
		System.out.println("State Name:"+Kar.Name);
		System.out.println("State Area:"+Kar.Area);
		System.out.println("States No of District:"+Kar.NoofDistrict);
		System.out.println("State Incharge:"+Kar.Incharge);
		System.out.println("________________________________________");
		District Gdg=new District();
		Gdg.Name="Gadag";
		Gdg.Area="4,656 sq.km";
		Gdg.Incharge="MLA";
		Gdg.noofvillage="337 villages";
		System.out.println("District Name:"+Gdg.Name);
		System.out.println("District Area:"+Gdg.Area);
		System.out.println("District Incharge:"+Gdg.Incharge);
		System.out.println("District no of villages:"+Gdg.noofvillage);
		System.out.println("________________________________________");
		Village vil=new Village();
		vil.Name="Ron";
		vil.Area="1292 sq.km";
		vil.Occupation="Agriculture";
		vil.Incharge="Sarpanch";
		System.out.println("Village name:"+vil.Name);
		System.out.println("Village area:"+vil.Area);
		System.out.println("Village Occupation:"+vil.Occupation);
		System.out.println("Village Incharge:"+vil.Incharge);
	}


}
