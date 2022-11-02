package com.sgtesting.Fifthtest;
class Encapsulation
{
	private String name;
	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
}

public class Fourth {

	public static void main(String[] args) {
		Encapsulation a=new Encapsulation();
		int b=a.age=22;
		System.out.println(b);
		a.getClass();
		a.setName("vinayak");
		String v=a.getName();
		System.out.println(v);
		
		
		

	}

}
