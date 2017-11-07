//package driver_proj0.java;
import java.util.ArrayList;
//uml
//Course

//-CourseName: String
//-students: ArrayList
//- numberOfStudents: int

//+Course(courseName:String)
//+getcourseName(): String
//+addStudent(student: String): void
//+dropStudent(student: String): void
//+getStudents(): String[]
//+getNumberof Students(): int
public class Course115 {

	private String CName;
	private ArrayList students;
	
	public void Course (String CN) {
		CName = CN;
		students = new ArrayList();
	}
	
	public void addStudent (String stu) {
		students.add(stu);
	}
	
	public ArrayList getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return students.size();
	}
	
	public String getCourseName() {
		return CName;
	}
	
	public void dropStudent (String stu) {
		students.remove(stu);
	}
	
	public String toString() {
		String s = "";
		s = CName + "(" + students.size() + "students)\n";
		for (int i=0; i< students.size(); i++) {
			s += "(" + (i+1) + ")" + students.get(i) + "\n";
		}
		return s;
		}
	public void clear() {
		students.clear();
	}
}
