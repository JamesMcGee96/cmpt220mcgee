//package driver_proj0.java;
public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course("Intro to Java :)");

        for (int i = 0; i < 20; i++) {
            course.addStudent("Student " + (i + 1));
        }
        
        String[] student = course.getStudent();
        System.out.println(course.getName());
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-12s ", student[i]);
            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }

        }
        System.out.println("Size of Class: " + course.getsizeOfClass());

        System.out.println("\nDropping two students from course..");
        System.out.println("Student #1 dropped.");
        course.dropStudent("Student " + (1));
        System.out.println("Student #8 dropped.");
        course.dropStudent("Student " + (8));

        System.out.println("Displaying students...\n");
        for (int i = 0; i < course.getsizeOfClass(); i++) {
            System.out.printf("%-12s ", student[i]);

            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("\nSize of Class: " + course.getsizeOfClass());
	}

}