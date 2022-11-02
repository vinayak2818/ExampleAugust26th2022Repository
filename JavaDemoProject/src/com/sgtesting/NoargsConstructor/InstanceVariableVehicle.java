package com.sgtesting.NoargsConstructor;
class TwoWheeler
{
	String Company;
	String Tyretype;
	String CC;
	int price;
	TwoWheeler()
	{
		Company="Royal Enfield";
		Tyretype="Tubeless Tyre";
		CC="350 cc";
		price=197000;
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
	FourWheeler()
	{
		Companyname="Maruti800";
		SeatingCapacity=4;
		Fuel="Petrol";
		Transmissiontypes="Manual";		
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
	HeavyVehicle()
	{
		Companyname="Ashok Leyland";
		NoofTyres=18;
		Fueltype="Disel";
		PurposeofUse="Commercial";
		System.out.println("HeavyVehicle Company Name:"+Companyname);
		System.out.println("HeavyVehicle No Of Tyres:"+NoofTyres);
		System.out.println("HeavyVehicle Fuel Type:"+Fueltype);
		System.out.println("HeavyVehicle Purpose of Use:"+PurposeofUse);
	}
}
public class InstanceVariableVehicle {

	public static void main(String[] args) {
		TwoWheeler Bike=new TwoWheeler();

		FourWheeler Car=new FourWheeler();

		HeavyVehicle Truck=new HeavyVehicle();


	}

}

