package com.sgtesting.Paramertrizedconstructor;
class Country
{
	String Name;
	String Currency;
	String noofStates;
	String PM;
	Country(String Nam,String Cu,String No,String Ic)
	{
		Name=Nam;
		Currency=Cu;
		noofStates=No;
		PM=Ic;
		System.out.println("Country Name:"+Name);
		System.out.println("Country Currency:"+Currency);
		System.out.println("Country No of states:"+noofStates);
		System.out.println("Country Incharge:"+PM);
		System.out.println("________________________________________");
	}
}
class States
{
	String Name;
	String Area;
	String NoofDistrict;
	String Incharge;
	States(String Nam,String Are,String Nd,String Ic)
	{
		Name=Nam;
		Area=Are;
		NoofDistrict=Nd;
		Incharge=Ic;
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
	District(String Nam,String Are,String Nd,String Ic)
	{
		Name=Nam;
		Area=Are;
		Incharge=Nd;
		noofvillage=Ic;
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
	Village(String Nam,String Are,String Oc,String Ic)
	{
		Name=Nam;
		Area=Are;
		Occupation=Oc;
		Incharge=Ic;
		System.out.println("Village name:"+Name);
		System.out.println("Village area:"+Area);
		System.out.println("Village Occupation:"+Occupation);
		System.out.println("Village Incharge:"+Incharge);
		System.out.println("________________________________________");
	}
}
public class InstanceVariableGeography {

	public static void main(String[] args) {
		Country coun=new Country("INDIA","Rupees","28 states","Narendra modi");
		Country coun1=new Country("United States"," Dollar","50 states","Joe Biden");
		
		States stat=new States("Karnataka","191,791 sq.km","31 districts","Basavaraj Bommai");
		States stat1=new States("Goa","3,702 sq.km","2 districts","Pramod Sawant ");
		
		District Dis=new District("Gadag","4,656 sq.km","Shivkumar Udasi","337 villages");
		District Dis1=new District("Kopal","7,190 sq.km","Raghavendra Hitnal","149 villages");
		
		Village vil=new Village("Ron","1292 sq.km","Agriculture","Sarpanch");
		Village vil1=new Village("Lakkundi","207.81 sq.km","Agriculture","Sarpanch");
		
	}


}
