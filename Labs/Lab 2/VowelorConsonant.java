//package driver_proj0.java;
import java.util.Scanner;
public class VowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// Prompt enter a letter
		System.out.print("Enter a letter: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		if (Character.isLetter(ch))
		{
			switch(Character.toUpperCase(ch))
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(ch + " is a vowel"); break;
				default : System.out.println(ch + " is a consonant"); 
			}
		}
		else
			System.out.println(ch + " is an invalid input");
	}

}
