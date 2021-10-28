package app;

public class Account extends Persona {

	private Credenziali credenziali;
	
	public Account(String nome, String cognome, String email, String username, String password) {
		
		super(nome, cognome);
		credenziali = new Credenziali(email, username, password);
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + credenziali.toString();
	}
	
}
