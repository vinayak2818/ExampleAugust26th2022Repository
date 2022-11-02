package com.sgtesting.OverloadingConstructor;
class Library
{
	Library(String bookname){
		System.out.println("Bookname Name:"+bookname);
	}
	Library(int noofbooks){
		System.out.println("Number of Books Avialable:"+noofbooks);
	}
	Library(String timings, int Sittingcapacity){
		System.out.println("Library Timings:"+timings+"Library Sitting Capacity:"+Sittingcapacity);
	}
}	

public class LibConstructorOverloading {

	public static void main(String[] args) {
		Library L1=new Library(120000);
		Library L2=new Library("9AM to 9PM  ",  9500);
		Library L3=new Library("Wings of Fire");
	}
}


