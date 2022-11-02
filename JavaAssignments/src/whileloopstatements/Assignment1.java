package whileloopstatements;

public class Assignment1 {
	//Q8: Gender and age factor for marriage?
	
	public static void main(String[] args) {
		String gender = "FEMALE";
		int age = 25;
		
		if(gender.equals("MALE") && ((age >=21) && (age <=50))) {
			System.out.println(gender + " is eligible for marriage");
		}
		else if(gender.equals("FEMALE") && ((age >=18) && (age <=50))) {
			System.out.println(gender + " is eligible for marriage");
		}else {
			System.out.println("Invalid age criteria for the marriage for " + gender);
		}
	}
}
