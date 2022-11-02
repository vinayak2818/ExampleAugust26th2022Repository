package com.sgtesting.Part2Classes;
class Desktop
{
	String Deskname;
	String Color;
	String DeskScreensize;
	String OS;
}
class Laptop
{
	String Companyname;
	String ScreenType;
	String Material;
	String Weight;
}
class Mobiledevice
{
	String Brandname;
	String Batterycapacity;
	int Price;
	String Cameraspecification;
}
public class InstanceVariable2 {

	public static void main(String[] args) {
		Desktop LG=new Desktop();
		LG.Deskname="LG";
		LG.Color="Black";
		LG.DeskScreensize="21 inches";
		LG.OS="Windows";
		System.out.println("Desktop Name:"+LG.Deskname);
		System.out.println("Desktop Color:"+LG.Color);
		System.out.println("Desktop Screen Size:"+LG.DeskScreensize);
		System.out.println("Desktop OS:"+LG.OS);
		System.out.println("________________________________________");
		Laptop Brand=new Laptop();
		Brand.Companyname="Dell";
		Brand.Material="plastic and carbon fiber";
		Brand.ScreenType="Touchscreen";
		Brand.Weight="2.12 kg";
		System.out.println("Laptop Company Name:"+Brand.Companyname);
		System.out.println("Laptop Material:"+Brand.Material);
		System.out.println("Laptop ScreenType:"+Brand.ScreenType);
		System.out.println("Laptop Weight:"+Brand.Weight);
		System.out.println("________________________________________");
		Mobiledevice Mob=new Mobiledevice();
		Mob.Brandname="RedmiNote9promax";
		Mob.Batterycapacity="6000mAh";
		Mob.Price=18000;
		Mob.Cameraspecification="48 megapixels";
		System.out.println("Mobiledevice Company:"+Mob.Brandname);
		System.out.println("Mobiledevice Battery Capacity:"+Mob.Batterycapacity);
		System.out.println("Mobiledevice Price:"+Mob.Price);
		System.out.println("Mobiledevice Camera Specifications:"+Mob.Cameraspecification);
		
	}


}
