//package driver_proj0.java;

import java.util.ArrayList;

public class TestCourse115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course c1 = new Course("Java Programming"); // JA: This class does not exist
		Course c2 = new Course ("Multimedia");
		
		c1.addStudent("Peter Jones");
		c1.addStudent("Brian Smith");
		c1.addStudent("Anne Kennedy");
		c1.addStudent("Corman");
		
		c2.addStudent("Peter Jones");
		c2.addStudent("Steve Smith");
		c2.addStudent("Jon");
		
		System.out.println("Number of Students" +  "in course1: " + c1.getNumberOfStudents());
		
		ArrayList<E> a1 = c1.getStudents();
		for(int i = 0; i<c1. getNumberOfStudents(); i++);
		
	System.out.print(a2.get(i) + ",");
	System.out.println();
	
	c1.dropStudent("Corman");
	System.out.println("\nNew" + "list of course 1 after drop a " + " student Corman: " + c1 );
	
	c2.clear();
	
	System.out.println("\nNew" + "Course2 list after using" + "clear() method; " + c2);
	}

}
