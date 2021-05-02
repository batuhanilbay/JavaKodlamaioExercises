package kodlamaio;

public class Student extends User{
	
	String courses;
	
	public Student() {
		
	}
	
	public Student(int userId,String userFirstname,String userLastname,String userPassword,String email,String courses) {
		super(userId, userFirstname, userLastname, userPassword, email);
		this.courses = courses;
		
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	

	
}
