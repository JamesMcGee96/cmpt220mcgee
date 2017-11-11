//package driver_proj0.java;
import java.util.Scanner;
import java.util.ArrayList;
public class Excersise1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        ArrayList<Integer> numberList = new ArrayList<Integer>();

	        System.out.print("Enter 5 numbers: ");

	        for (int i = 0; i < 5; i++) {
	          numberList.add(input.nextInt());
	        }

	        sortNumberList(numberList);
	        System.out.println(numberList.toString());
	    }

	    public static void sortNumberList(ArrayList<Integer> numberList) {
	          java.util.Collections.sort(numberList);
	}

}
