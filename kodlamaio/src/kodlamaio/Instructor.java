package kodlamaio;

public class Instructor extends User{
	
	String instructorId;
	
	public Instructor() {
	
	}
	
	public Instructor(int userId,String userFirstname, String userLastname, String userPassword,String email, String instructorId) {
		super(userId, userFirstname, userLastname, userPassword, email);
		this.instructorId = instructorId;
		}

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	
	
	
	
	
	
	
	
	
}
