package kodlamaio;

public class User {
	
	
	int userId;
	String userFirstname;
	String userLastname;
	String userPassword;
	String email;
	
	
	
	public User() {
		
	}



	public User(int userId, String userFirstname, String userLastname, String userPassword, String email) {
		super();
		this.userId = userId;
		this.userFirstname = userFirstname;
		this.userLastname = userLastname;
		this.userPassword = userPassword;
		this.email = email;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUserFirstname() {
		return userFirstname;
	}



	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
	}



	public String getUserLastname() {
		return userLastname;
	}



	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}



	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	
	
	
	
	
	
	

}
