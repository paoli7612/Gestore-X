package app;

public class Account extends Persona {

	private Credenziali credenziali;
	
	public Account(String nome, String cognome, String email, String username, String password) {
		
		super(nome, cognome);
		credenziali = new Credenziali(email, username, password);
		
	}
	
	public Account(String row) {
		super(row.split("&")[0]);
		credenziali = new Credenziali(row.split("&")[1]);
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + credenziali.toString();
	}
	
	@Override
	public String toFile() {
		return super.toFile() + "&" + credenziali.toFile() + "\n";
	}
	
}
