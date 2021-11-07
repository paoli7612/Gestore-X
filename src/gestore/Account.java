package gestore;

import java.io.Serializable;

public class Account extends Credenziali implements Serializable {
	
	public Account(Credenziali credenziali) {
		super(credenziali);
	}

	public Account(String username, String password) {
		this(new Credenziali(username, password));
	}

	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}

	public boolean checkUsername(String username) {
		return this.username.equals(username);
	}

}
