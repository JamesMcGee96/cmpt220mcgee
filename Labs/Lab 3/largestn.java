//package driver_proj0.java;

public class largestn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0; 	

		while (Math.pow(n + 1, 3) < 12000) {
			n++; 		
		}

		System.out.println(
			"Largest integer n such that n^3 is less than 12,000: " + n);
	}

}
