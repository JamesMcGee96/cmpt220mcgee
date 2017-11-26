//package driver_proj0.java;
import java.util.*;
public class OutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100,i;
		Random r=new Random();
		Scanner in=new Scanner(System.in);
		int []a=new int[n];
		for(i=0;i<n;i++)
		    a[i]=r.nextInt();
		System.out.println("Your Array");
		for(i=0;i<n;i++)
		    {System.out.print(a[i]+" ");
		    if((i+1)%10==0)
		         System.out.println();
		    }
		System.out.println();
		for(; ;)
		   {System.out.print("What element do you want to see the value: ");
		    i=in.nextInt();
		    if(i<0||i>=n)
		        System.out.println("index Out of Bounds.");
		    else
		        System.out.println(a[i]);
		       
		    }
	}

}
