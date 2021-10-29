package accountManager;

public class Account extends Persona {
	
	private String username;
	private String email;
	private String password;
	
	public Account(String nome, String cognome, String username, String email, String password) {
		super(nome, cognome);
		this.username = username;
		this.email = email;
		this.password = password;
	}

}
