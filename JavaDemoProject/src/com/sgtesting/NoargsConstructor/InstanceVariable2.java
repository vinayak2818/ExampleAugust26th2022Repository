package com.sgtesting.NoargsConstructor;
class Desktop
{
	String Deskname;
	String Color;
	String DeskScreensize;
	String OS;
	Desktop()
	{
		Deskname="LG";
		Color="Black";
		DeskScreensize="21 inches";
		OS="Windows";
		System.out.println("Desktop Name:"+Deskname);
		System.out.println("Desktop Color:"+Color);
		System.out.println("Desktop Screen Size:"+DeskScreensize);
		System.out.println("Desktop OS:"+OS);
		System.out.println("________________________________________");
		
	}
}
class Laptop
{
	String Companyname;
	String ScreenType;
	String Material;
	String Weight;
	Laptop()
	{
		Companyname="Dell";
		Material="plastic and carbon fiber";
		ScreenType="Touchscreen";
		Weight="2.12 kg";
		System.out.println("Laptop Company Name:"+Companyname);
		System.out.println("Laptop Material:"+Material);
		System.out.println("Laptop ScreenType:"+ScreenType);
		System.out.println("Laptop Weight:"+Weight);
		System.out.println("________________________________________");
		
	}
}
class Mobiledevice
{
	String Brandname;
	String Batterycapacity;
	int Price;
	String Cameraspecification;
	Mobiledevice()
	{
		Brandname="RedmiNote9promax";
		Batterycapacity="6000mAh";
		Price=18000;
		Cameraspecification="48 megapixels";
		System.out.println("Mobiledevice Company:"+Brandname);
		System.out.println("Mobiledevice Battery Capacity:"+Batterycapacity);
		System.out.println("Mobiledevice Price:"+Price);
		System.out.println("Mobiledevice Camera Specifications:"+Cameraspecification);
		
	}
}
public class InstanceVariable2 {

	public static void main(String[] args) {
		Desktop LG=new Desktop();
		
		Laptop Brand=new Laptop();
		
		Mobiledevice Mob=new Mobiledevice();
		
		
	}


}
