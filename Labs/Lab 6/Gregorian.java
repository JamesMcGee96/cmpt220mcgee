//package driver_proj0.java;
import java.util.GregorianCalendar;
public class Gregorian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar gc = new GregorianCalendar();

		gc.setTimeInMillis(1234567898765L);
		
		// Display in Month/Day/Year
		System.out.println(gc.get(gc.MONTH) + "/" +
			gc.get(gc.DAY_OF_MONTH) + "/" + gc.get(gc.YEAR));
		
		// Show time since 1/1/70
		// Display New Date
		System.out.println("From January 1, 1970 using " +
			"1234567898765L the elapsed time is the date ");
		System.out.println(gc.get(gc.MONTH) + "/" +
			gc.get(gc.DAY_OF_MONTH) + "/" + gc.get(gc.YEAR));
	}

}
