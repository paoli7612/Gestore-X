package accountManager;

import java.io.Serializable;

public class Account extends Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String email;
	private String password;
	
	public Account(String nome, String cognome, String email, String username, String password) {
		super(nome, cognome);
		this.username = username;
		this.email = email;
		this.password = password;
	}

	
	@Override
	public String toString() {
		String ret = super.toString();
		ret += " - ";
		ret += email + "(" + username + ")";
		return ret;
	}
	
}
