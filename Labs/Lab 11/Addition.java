package driver_proj0.java;
import java.util.*;
public class Addition {

	static int sum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Enter a number: ");
			Scanner input = new Scanner(System.in);
			String str = input.next();
			int num = Integer.parseInt(str);
			System.out.println("The sum is: "  + sumDigits(num) );
		}
		
		catch(Exception e){
			System.out.println("Exception");
		}
	}
		public static int sumDigits(long n) {
			if(n>0) {
				sum = sum + (int)n%10;
				sumDigits(n/10);
			}
			return sum;
		}
		
	}


