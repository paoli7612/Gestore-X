package gestore;

import java.io.Serializable;

public class Credenziali implements Serializable {

	protected String username;
	protected String password;
	
	public Credenziali(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Credenziali(Credenziali credenziali) {
		this(credenziali.getUsername(), credenziali.getPassword());
	}
	
	public String getUsername() {
		return this.username;
	}
	
	protected String getPassword() {
		return this.password;
	}
	
	@Override
	public String toString() {
		return "[username: %s - password: %s]".formatted(getUsername(), getPassword());
	}
	
}
