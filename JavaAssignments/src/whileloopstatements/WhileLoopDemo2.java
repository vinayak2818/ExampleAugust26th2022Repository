package whileloopstatements;

public class WhileLoopDemo2 {
	//Q: Check for the city name "BANGALORE"
	public static void main(String[] args) {
		String city = "BANGALORE";
		
		while(city.equals("BANGALORE")) {
			System.out.println("Inside the loop:");
			city = "RAICHUR";
		}
	}

}
