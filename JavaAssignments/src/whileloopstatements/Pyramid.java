package whileloopstatements;

public class Pyramid {
	//Q: Print the pyramid
	//    *
	//  *   *
	// *  *  *
	//*  *  *  *
	
	public static void main(String[] args) {
		int i = 1;
		do {
			int j = 1;
			do {
				if((i+j) <= 4) {
					System.out.print(" ");
				}else {
					System.out.print("* ");
				}
				j++;
			}while(j <= 4);
			System.out.println();
			i++;
		}while(i <= 4);
	}
}
