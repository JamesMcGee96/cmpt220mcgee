package driver_proj0.java;
import java.util.Scanner;
public class DaysinaMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// Enter Month and Year
		System.out.print("Enter the month as an integer: ");
		int Month = input.nextInt();
		System.out.print(" Enter the year as an integer: ");
		int Year = input.nextInt();
		
		boolean leapYear = 
				(Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0);
			switch (Month)
			
			{
				case 1: System.out.println(
						 "January " + Year + " had 31 days"); break;
				case 2: System.out.println("February " + Year + " had" +
						  ((leapYear) ? " 29 days" : " 28 days")); break;
				case 3: System.out.println(
						 "March " + Year + " had 31 days"); break;
				case 4: System.out.println(
						 "April " + Year + " had 30 days"); break;
				case 5: System.out.println(
						 "May " + Year + " had 31 days"); break;
				case 6: System.out.println(
						 "June " + Year + " had 30 days"); break;
				case 7: System.out.println(
						 "July " + Year + " had 31 days"); break;
				case 8: System.out.println(
						 "August " + Year + " had 31 days"); break;
				case 9: System.out.println(
						 "September " + Year + " had 30 days"); break;
				case 10: System.out.println(
						 "October " + Year + " had 31 days"); break;
				case 11: System.out.println(
						 "November " + Year + " had 30 days"); break;
				case 12: System.out.println(
						 "December " + Year + " had 31 days");
	}
	}
	}
