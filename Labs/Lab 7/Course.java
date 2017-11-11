//package driver_proj0.java;
public class Course {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
	
		private String Name; // JA: Are there the data fields? Why are they inside main?
	    private String[] student = new String[10];
	    private int sizeOfClass;

	    public Course(String courseName) {
	        this.Name = courseName;
	    }

	    public void addStudent(String student) {

	        if (sizeOfClass >= student.length()) {
	            Object temp = new String[student.length() * 2];
	            System.arraycopy(student, 0, temp, 0, student.length());
	            student = (String) temp;
	        }
	        student[sizeOfClass++] = student;
	    }

	    public String[] getStudent() {

	        return student;
	    }

	    public int getNumberOfStudent() {
	        return sizeOfClass;
	    }

	    public String getCourseName() {
	        return Name;
	    }

	    public void dropStudent(String student) {

	        for (int i = 0; i < student.length(); i++) {

	            if (student.equalsIgnoreCase(student[i])) {

	                student[i] = null;
	                sizeOfClass--;
	                while (i < sizeOfClass) {
	                    student[i] = student[i + 1];
	                    i++;
	                }
	                break;
	            }
	        }
	    
	    }

	    public void clear(){
	        student = new String[25];
	        sizeOfClass = 0;
	    }

	    public Object clone() {
	        Course course = null;
	        try {
	            course = (Course)super.clone();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	        course.student = student.clone();
	        course.Name = new String(Name);

	        return course;
	}

}
