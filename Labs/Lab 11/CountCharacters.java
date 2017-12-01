package driver_proj0.java;
import java.io.*;
import java.util.*;
public class CountCharacters {

	static int k = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Type a string to analyze: ");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
			System.out.println("Type a character to check: ");
			String temp = input.nextLine();
			char c = temp.charAt(0);
			int count = count(str, c);
			System.out.println("There are " + count + "" +c+ " 's." );
		}
		
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		public static int count(String str, char a, int high) {
			if(str.equals("")) {
				return 0;
			}
			
			if(high + 1 <= str.length()) {
				if(str.substring(high, high+1).equals(Character.toString(a))) {
					k++
				}
				count(str.substring(high+1,str.length()),a,high);
			}
			return k;
		}
	}

}
