package whileloopstatements;

public class NestedWhileLoop1 {
	//Q: Print the below patter
	//1 2 3 4
	//5 6 7 8
	//9 10 11 12
	public static void main(String[] args) {
		int index = 1;
		int i = 1;
		while(i <= 3) {
			int j = 1;
			while(j <= 4) {
				System.out.print(index +" ");
				index++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
