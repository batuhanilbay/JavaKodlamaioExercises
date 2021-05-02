package kodlamaio;

public class StudentManager {
	
	public void applyCourse(Student student) {
		
		System.out.println("The student entered the course:  " + student.getCourses());
		System.out.println("The student applyin the course:  " + student.getUserFirstname() + student.getUserLastname());
	
	}
	
	public void leaveCourse(Student student) {
		System.out.println("The student left the course:  " + student.getCourses());
		System.out.println("The student leaving the course:  " + student.getUserFirstname() + student.getUserLastname());
	}
	

}


