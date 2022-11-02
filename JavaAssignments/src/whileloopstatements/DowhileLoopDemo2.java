package whileloopstatements;

public class DowhileLoopDemo2 {
	//Q: Print the below pattern
	//10 20 30
	//40 50 60
	//70 80 90
	
	public static void main(String[] args) {
		int index = 10;
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print(index+ " ");
				index+=10;
				j++;
			}while(j <= 3);
			System.out.println();
			i++;
		}while(i <= 3);
	}
}
