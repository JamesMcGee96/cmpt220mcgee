//package driver_proj0.java;
import java.util.Scanner;
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       int n;
	       int i;
	       
	       System.out.print("Enter a Number : ");
	       n = sc.nextInt();
	
	       StaackofIntegers stackOfIntegers = new StaackofIntegers();
	      
	       i=2;
	
	       while (n > 1) {
	          
	           if (n % i == 0) {
	               stackOfIntegers.push(i);
	               n = n / i;
	           } else {
	               i++;
	           }
	       }
	      
	       System.out.println("Prime Factors are: ");
	       stackOfIntegers.print();
	}
}

