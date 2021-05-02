package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1,"BATUHAN","ÝLBAY","123123","batuhan@xxx.com","12");
		Instructor instructor2 = new Instructor();
		instructor2.setInstructorId("10");
		instructor2.setUserFirstname("hasan");
		instructor2.setUserLastname("asan");
		instructor2.setUserId(3);
		
		
		
		
		Student student = new Student(123,"Batu","ilbay","12341234","batu@xxx.xxx","Java");
		Student student2 = new Student();
		student2.setUserFirstname("Aliveli");
		student2.setUserLastname("veliali");
		student2.setUserId(25);
	
		
		
		
		
		
		UserManager newuser = new UserManager();
		newuser.addUser(instructor);
		newuser.addUser(student);
		newuser.addUser(student2);
		newuser.addUser(instructor2);
		
		
		
		newuser.deleteUser(instructor);
		newuser.deleteUser(student);
		
		InstructorManager instructormanager = new InstructorManager();
		instructormanager.shownInstructor(instructor);
		instructormanager.shownInstructor(instructor2);
		
		
		
		StudentManager studentmanager = new StudentManager();
		studentmanager.applyCourse(student);
		studentmanager.leaveCourse(student);
		
		
		

	}

}
