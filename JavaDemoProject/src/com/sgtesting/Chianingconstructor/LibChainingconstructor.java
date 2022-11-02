package com.sgtesting.Chianingconstructor;
class Library
{
	Library(String bookname){
		System.out.println("Bookname Name:"+bookname);
	}
	Library(int noofbooks){
		this("Ignited Minds");
		System.out.println("Number of Books Avialable:"+noofbooks);
	}
	Library(String timings, int Sittingcapacity){
		this(128000);
		System.out.println("Library Timings:"+timings+"Library Sitting Capacity:"+Sittingcapacity);
	}
}	

public class LibChainingconstructor {

	public static void main(String[] args) {

		Library L1=new Library("9AM to 9PM  ",  29500);

	}
}


