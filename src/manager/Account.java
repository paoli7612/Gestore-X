package manager;

public class Account extends Persona {

	private Credenziali credenziali;
	
	public Account(String nome, String cognome, Credenziali credenziali) {
		super(nome, cognome);
		this.credenziali = credenziali;
	}
	
	public Account(String nome, String cognome, String username, String password) {
		super(nome, cognome);
		this.credenziali = new Credenziali(username, password);
	}
	
	public boolean login(String username, String password) {
		return this.credenziali.control(new Credenziali(username, password));
	}
	
	@Override
	public String toString() {
		return super.toString() + " [ " + credenziali.toString() + " ]";
	}		
}
