package manager;

public class Credenziali {

	private String username;
	private String password;
	
	public Credenziali(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public boolean controlUsername(String username) {
		return this.username.equals(username);
	}
	
	public boolean controlPassword(String password) {
		return this.password.equals(password);
	}
	
	public boolean control(Credenziali credenziali) {
		return this.controlPassword(credenziali.password) &&
				this.controlUsername(credenziali.username);
	}

	@Override
	public String toString() {
		return this.username + " " + this.password.replaceAll(".", "*");
	}
	
}
