package whileloopstatements;

public class NestedForEachLoop2 {
	//Q: Print character 2 D array
	public static void main(String[] args) {
		char ch[][] = {{'A', 'B'}, {'C', 'D'}, {'E', 'F'}};
		
		for(char ch1[] : ch) {
			for(char ch2: ch1) {
				System.out.print(ch2 + " ");
			}
			System.out.println();
		}
	}

}
