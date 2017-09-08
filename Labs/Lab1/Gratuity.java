package driver_proj0.java;
import java.util.Scanner;
public class Gratuity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and gratuity rate:");
		double subtotal = input.nextDouble();
		double gratRate = input.nextDouble();
		
		double gratuity = subtotal * (gratRate/100);
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" +gratuity+ " and total is $" +total);
		
	}

}
