package kodlamaio;

public class UserManager {
	
	
	public void addUser(User user) {
		System.out.println("User is added: " + user.userId);
		System.out.println("User is added: " + user.getUserFirstname() +  user.getUserLastname());
		
	}
	
	public void deleteUser(User user) {
		System.out.println("The user has been deleted: " + user.userId);
		System.out.println("The user has been deleted: " + user.getUserFirstname() +  user.getUserLastname());
		
	}
	
	public void updatedUser(User user) {
		System.out.println("The user has been updated: " + user.userId);
		System.out.println("The user has been updated: " + user.getUserFirstname() +  user.getUserLastname());
		
	}
	
	

	
}
