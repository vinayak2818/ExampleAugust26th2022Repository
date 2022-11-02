package com.sgtesting.Paramertrizedconstructor;
class TwoWheeler
{
	String Company;
	String Tyretype;
	String CC;
	int price;
	TwoWheeler(String Com,String Tt,String Cc,int Pp)
	{
		Company=Com;
		Tyretype=Tt;
		CC=Cc;
		price=Pp;
		System.out.println("TwoWheeler Company Name:"+Company);
		System.out.println("TwoWheeler Tyre Type:"+Tyretype);
		System.out.println("TwoWheeler CC:"+CC);
		System.out.println("TwoWheeler Price:"+price);
		System.out.println("________________________________________");
	}
}
class FourWheeler
{
	String Companyname;
	int SeatingCapacity;
	String Fuel;
	String Transmissiontypes;
	FourWheeler(String Cn,int Sc,String Fl,String Tm)
	{
		Companyname=Cn;
		SeatingCapacity=Sc;
		Fuel=Fl;
		Transmissiontypes=Tm;		
		System.out.println("FourWheeler Company Name:"+Companyname);
		System.out.println("FourWheeler Seating Capacity:"+SeatingCapacity);
		System.out.println("FourWheeler Fuel Type:"+Fuel);
		System.out.println("FourWheeler Transmission Type:"+Transmissiontypes);
		System.out.println("________________________________________");
	}
}
class HeavyVehicle
{
	String Companyname;
	int NoofTyres;
	String Fueltype ;
	String PurposeofUse;
	HeavyVehicle(String Cn,int Nt,String Fl,String Pu)
	{
		Companyname=Cn;
		NoofTyres=Nt;
		Fueltype=Fl;
		PurposeofUse=Pu;
		System.out.println("HeavyVehicle Company Name:"+Companyname);
		System.out.println("HeavyVehicle No Of Tyres:"+NoofTyres);
		System.out.println("HeavyVehicle Fuel Type:"+Fueltype);
		System.out.println("HeavyVehicle Purpose of Use:"+PurposeofUse);
		System.out.println("________________________________________");
	}
}
public class InstanceVariableVehicle {

	public static void main(String[] args) {
		TwoWheeler Bike=new TwoWheeler("Royal Enfield","Tubeless Tyre","350 cc",197000);
		TwoWheeler Bike1=new TwoWheeler("Tvs Vikrant","Tube Tyre","150 cc",77000);

		FourWheeler Car=new FourWheeler("Maruti800",4,"Petrol","Manual");
		FourWheeler Car1=new FourWheeler("bentley",2,"Petrol","Automatic");

		HeavyVehicle Truck=new HeavyVehicle("Ashok Leyland",18,"Disel","Commercial");
		HeavyVehicle Truck1=new HeavyVehicle("TATA bus",4,"Disel","Commercial and Residential");


	}

}

