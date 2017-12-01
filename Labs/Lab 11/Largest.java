package driver_proj0.java;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value;
		int max;
		int[] array = new int[8];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eight numbers: ");
		
		for(int i=0; i<8; i++) {
			value=sc.nextInt();
			array[i] = value;
		}
		
		max = array[0];
		max = maximum(array, array.length-1, max);
		System.out.println("Largest number" + "in the array is: " + max);
	}
		public static int maximum(int[]a, int length, int max) {
			if(length >-1) {
				if(a[length]>max) {
					max=a[length];
				}
				return (max = maximum(a,length-1,max));
			}
			else return max;
		
		}

}
