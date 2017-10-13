package driver_proj0.java;
import java.util.Scanner;
public class Location {

	private static final String maxValue = null;
	private String column;
	private String row;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter how many columns and rows are in the array: ");
	        int column = input.nextInt();// # columns from user
	        int row = input.nextInt();// # rows from user
	        double[][] array = new double[row][column];//2 dimensional array

	        System.out.println("Enter the array:");
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                array[i][j] = input.nextDouble();
	            }
	        }

	        Location loc = Location.locateLargest(array);

	        System.out.println("The largest is element is "
	                + loc.maxValue + " at (" + loc.row + ", " + loc.column + ")");

  
	}

	private static Location locateLargest(double[][] m) {
		// TODO Auto-generated method stub
		return null;
	}
}
