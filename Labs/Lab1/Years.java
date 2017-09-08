package driver_proj0.java;
import java.util.Scanner;
public class Years {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of minutes:");
		int minutes = input.nextInt();
		
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;
		
		System.out.println(minutes + " minutes is approimately " + years + " years and " +days+ " days ");

	}

}
