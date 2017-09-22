//package driver_proj0.java;
import java.util.Scanner;
public class UniCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Enter Character
		System.out.println(" Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		//Unicode
		System.out.println((int)ch);
	}

}
