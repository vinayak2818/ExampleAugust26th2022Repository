package whileloopstatements;

public class NestedForEachLoop {
	//Q: Display the 2 D array
	
	public static void main(String[] args) {
		int arr[][] = {{10, 20, 30}, {40, 50, 60}};
		
		for( int x1[] : arr) {
			for(int x2: x1) {
				System.out.print(x2+" ");
			}
			System.out.println();
		}
	}
}
