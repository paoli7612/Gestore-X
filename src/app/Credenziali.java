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
	
	public boolean control(String username, String password) {
		return (this.username.equals(username) || this.email.equals(email))
				&& this.password.equals(password);
	}
	
	@Override
	public String toString() {
		return this.email + " " + this.username  + "  " + this.password;
	}
}
