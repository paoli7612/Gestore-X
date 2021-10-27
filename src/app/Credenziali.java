package app;

public class Credenziali {

	private String email;
	private String username;
	private String password;
	
	public Credenziali(String email, String username, String password) {
		this.email = email;
		this.username = username;
		this.password = password;	
	}
	
	@Override
	public String toString() {
		return this.email + " < " + this.username  + " >";
	}
}
