package com.sgtesting.Part2Classes;
class TwoWheeler
{
	String Company;
	String Tyretype;
	String CC;
	int price;
}
class FourWheeler
{
	String Companyname;
	int SeatingCapacity;
	String Fuel;
	String Transmissiontypes;
}
class HeavyVehicle
{
	String Companyname;
	int NoofTyres;
	String Fueltype ;
	String PurposeofUse;
}
public class InstanceVariableVehicle {

	public static void main(String[] args) {
		TwoWheeler Bike=new TwoWheeler();
		Bike.Company="Royal Enfield";
		Bike.Tyretype="Tubeless Tyre";
		Bike.CC="350 cc";
		Bike.price=197000;
		System.out.println("TwoWheeler Company Name:"+Bike.Company);
		System.out.println("TwoWheeler Tyre Type:"+Bike.Tyretype);
		System.out.println("TwoWheeler CC:"+Bike.CC);
		System.out.println("TwoWheeler Price:"+Bike.price);
		System.out.println("________________________________________");
		FourWheeler Car=new FourWheeler();
		Car.Companyname="Maruti800";
		Car.SeatingCapacity=4;
		Car.Fuel="Petrol";
		Car.Transmissiontypes="Manual";		
		System.out.println("FourWheeler Company Name:"+Car.Companyname);
		System.out.println("FourWheeler Seating Capacity:"+Car.SeatingCapacity);
		System.out.println("FourWheeler Fuel Type:"+Car.Fuel);
		System.out.println("FourWheeler Transmission Type:"+Car.Transmissiontypes);
		System.out.println("________________________________________");
		HeavyVehicle Truck=new HeavyVehicle();
		Truck.Companyname="Ashok Leyland";
		Truck.NoofTyres=18;
		Truck.Fueltype="Disel";
		Truck.PurposeofUse="Commercial";
		System.out.println("HeavyVehicle Company Name:"+Truck.Companyname);
		System.out.println("HeavyVehicle No Of Tyres:"+Truck.NoofTyres);
		System.out.println("HeavyVehicle Fuel Type:"+Truck.Fueltype);
		System.out.println("HeavyVehicle Purpose of Use:"+Truck.PurposeofUse);

	}

}

