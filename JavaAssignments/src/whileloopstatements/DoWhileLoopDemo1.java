package whileloopstatements;

public class DoWhileLoopDemo1 {
	//Q: Print the below pattern?
	//*
	//*
	//*
	//*
	//*
	public static void main(String[] args) {
		int i=1;
		
		do {
			System.out.println("*");
			i++;
		}while(i <= 5);
	}
}
