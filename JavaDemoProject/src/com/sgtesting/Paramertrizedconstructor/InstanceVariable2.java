package com.sgtesting.Paramertrizedconstructor;
class Desktop
{
	String Deskname;
	String Color;
	String DeskScreensize;
	String OS;
	Desktop(String Dn,String Col,String Ds,String Os)
	{
		Deskname=Dn;
		Color=Col;
		DeskScreensize=Ds;
		OS=Os;
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
	String Screentype;
	String Material;
	String Weight;
	Laptop(String Cn,String St,String Mat,String Wgt)
	{
		Companyname=Cn;
		Material=St;
		Screentype=Mat;
		Weight=Wgt;
		System.out.println("Laptop Company Name:"+Companyname);
		System.out.println("Laptop Material:"+Material);
		System.out.println("Laptop ScreenType:"+Screentype);
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
	Mobiledevice(String Bn,String Bc,int Pr,String Cs)
	{
		Brandname=Bn;
		Batterycapacity=Bc;
		Price=Pr;
		Cameraspecification=Cs;
		System.out.println("Mobiledevice Company:"+Brandname);
		System.out.println("Mobiledevice Battery Capacity:"+Batterycapacity);
		System.out.println("Mobiledevice Price:"+Price);
		System.out.println("Mobiledevice Camera Specifications:"+Cameraspecification);
		System.out.println("________________________________________");
		
	}
}
public class InstanceVariable2 {

	public static void main(String[] args) {
		Desktop Brand=new Desktop("Dell","Black","21 inches","Windows7");
		Desktop Brand1=new Desktop("Hp","White","18 inches","ubantu");
		
		Laptop comp=new Laptop("Lenavo","Touch Screen","carbon fiber","15 inches");
		Laptop comp1=new Laptop("Dell","LED Screen","carbon fiber and Meatllic","15.9 inches");
		
		Mobiledevice Mob=new Mobiledevice("Redminote9","6000mAh",18000,"48 megapixels");
		Mobiledevice Mob1=new Mobiledevice("Realme Narzo","5500mAh",13500,"120 megapixels");
		
		
	}


}
