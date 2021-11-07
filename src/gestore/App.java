package gestore;

import java.util.ArrayList;
import java.util.List;

public class App {

	private Data data;
	private List<Account> accounts;
	private Account account;
	
	public App(String filename_data) throws Exception {
		this.data = new Data(filename_data);
		accounts = new ArrayList<Account>();
		
		try {
			load();
		} catch (Exception e) {
			data.reset();
			load();
		}
	}
	
	public void load() throws Exception {
		accounts = this.data.read();		
	}
	
	private void save() throws Exception {
		this.data.write(accounts);
	}
	
	public void login(String username, String password) throws Exception {
		Account account = getAccount(username);
		if (account == null) {			
			throw new Exception("Account non trovato");
		} else {
			if (account.checkPassword(password)) {
				this.account = account;
			} else {
				throw new Exception("Credenziali non valide");
			}
		}
	}
	
	public void register(String username, String password) throws Exception {
		if (!existAccount(username)) {
			Account a = new Account(username, password);
			accounts.add(a);
			save();
		} else {
			throw new Exception("Username gia utilizzato");
		}
	}

	public void login(Credenziali credenziali) throws Exception {
		login(credenziali.getUsername(), credenziali.getPassword());
	}
	
	public void register(Credenziali credenziali) throws Exception {
		register(credenziali.getUsername(), credenziali.getPassword());
	}
	
	@Override
	public String toString() {
		String ret = new String();
		
		if (this.account == null) {			
			ret += "Non autenticato" + "\n";
		} else {
			ret += "Autenticato: " + this.account.getUsername() + " " + "\n";
		}
		
		ret += "\tAccount salvati: " + accounts.size() + "\n";
		
		for (int i=0; i<accounts.size(); i++) {
			Account a = accounts.get(i);
			ret += a.toString() + "\n";
		}
	
		
		return ret;
	}
	
	private Account getAccount(String username) {
		for (int i=0; i<accounts.size(); i++) {
			Account a = accounts.get(i);
			if (a.checkUsername(username)) {
				return a;
			}
		}
		return null; // nesssun account trovato
	}
	
	private boolean existAccount(String username) {
		return getAccount(username) != null;
	}
	
}
