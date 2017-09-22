//package driver_proj0.java;
import java.util.Scanner;
public class Add3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// 3 Random #s 
		int digit1 = (int)(Math.random() * 10);
		int digit2 = (int)(Math.random() * 10);
		int digit3 = (int)(Math.random() * 10);

		// Prompt enter sum
		System.out.println(
			"What is " + digit1 + " + " + digit2 + " + " + digit3 + "? ");
		int answer = input.nextInt();
		
		System.out.println(
			digit1 + " + " + digit2 + " + " + digit3 + " = " + answer + " is " +
			(digit1 + digit2 + digit3 == answer));
	}

}
