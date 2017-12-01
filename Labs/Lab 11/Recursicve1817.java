package driver_proj0.java;
import java.util.Scanner;
public class Recursicve1817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter characters in one line: ");
		String str = input.nextLine();
		
		char[] array = str.toCharArray();
		System.out.println("Enter a character to find how may times it occurs: ");
		
		String str1 = input.next();
		char ch = str1.charAt(0);
		int occrs = count(array,ch);
		System.out.println("The number of occurrences of the character in the array is: " +occrs);
		
	}
	
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length-1);
	}
	
	public static int count(char[] chars, char ch, int high) {
		if(high>=0) {
			int count=0;
			char ch1 = chars[high];
			if(Character.toUpperCase(ch) == Character.toUpperCase(ch1))
				count++;
			return count + count(chars, ch, high-1);
		}
		else return 0;
	}

}
