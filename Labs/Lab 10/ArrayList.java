package driver_proj0.java;
import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner s = new Scanner(System.in);
	       int element,n,i;
	       System.out.println("Enter number of elements to be inserted in a list");
	       n=s.nextInt();
	       List list = (List) new ArrayList();
	       System.out.println("Enter list elements");
	       for(i=0;i<n;i++){
	          
	           element=s.nextInt();
	           list.add(i, element);
	          
	       }
	       System.out.println("Unsorted elements");
	       Iterator iterator = list.iterator();
	       while(iterator.hasNext()){
	           System.out.println(iterator.next());
	       }
	       i=0;
	       Collections.sort(list);
	       System.out.println("Sorted elements");
	       Iterator iterator1 = list.iterator();
	       while(iterator1.hasNext()){
	           System.out.println(iterator1.next());
	       }
	}

}
