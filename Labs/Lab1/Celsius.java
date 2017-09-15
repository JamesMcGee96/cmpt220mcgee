//package driver_proj0_java;
import java.util.Scanner;
public class Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a temperature in Celsius:");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9/5)*(celsius + 32);// JA: Wrong operation (9 * celsius / 5 + 32)
		System.out.println(" Degrees Celsius "  + celsius +  " is "  + fahrenheit +   " in Fahrenheit");
	}

}
