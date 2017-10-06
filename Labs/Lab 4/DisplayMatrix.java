//package driver_proj0.java;
import java.util.Scanner;
public class DisplayMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 

		System.out.print("Enter n: ");
		int n = input.nextInt();

		printMatrix(n);
	}

	/** Method printMatrix displays an n-by-n matrix */
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols ++) {
				System.out.print((int)(Math.random() * 2));
			}
			System.out.println();
		}
	}

}
