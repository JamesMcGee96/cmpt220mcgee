//package driver_proj0.java;
import java.util.date;
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1 = new Date();
		Date d2 = new Date();
		Date d3 = new Date();
		Date d4 = new Date();
		Date d5 = new Date();
		Date d6 = new Date();
		Date d7 = new Date();
		Date d8 = new Date();
		
		//Set elapsed time
		d1.setTime(10000);
		d2.setTime(100000);
		d3.setTime(1000000);
		d4.setTime(10000000);
		d5.setTime(100000000);
	    d6.setTime(1000000000);
		d7.setTime(10000000000);
		d8.setTime(100000000000);
		
		//Display in String
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		System.out.println(d4.toString());
		System.out.println(d5.toString());
		System.out.println(d6.toString());
		System.out.println(d7.toString());
		System.out.println(d8.toString());
		
		
	}

}
