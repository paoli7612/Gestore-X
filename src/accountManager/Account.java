package accountManager;

import java.io.Serializable;

public class Account extends Persona implements Serializable {
	
	public static int count;
	public Integer id;
	
	private String username;
	private String email;
	private String password;
	
	public Account(String nome, String cognome, String email, String username, String password) {
		super(nome, cognome);
		this.username = username;
		this.email = email;
		this.password = password;
		this.id = ++Account.count;
	}

	public String getUsername() {
		return this.username;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public boolean controlPassword(String password) {
		return this.password.equals(password);
	}
	
	@Override
	public String toString() {
		String ret = super.toString();
		ret += " - ";
		ret += email + "(" + username + ")";
		return ret;
	}

	public void edit(String nome, String cognome, String matricola) {
		setNome(nome);
		setCognome(cognome);
		setMatricola(matricola);
		App.data.save(App.accounts);
	}
	
}
