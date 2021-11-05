package accountManager;
import java.util.List;

import frames.Welcome;
import graphic.Frame;

public class App {

	public static Data data = new Data("asd");
	public static List<Account> accounts = data.load();
	public static Account account;
	
	/**
	 * 
	 * Stampa lo stato attuale della applicazione: se/chi autenticato e la lista degli account che ha in memoria
	 * 
	 */
	public static void print() {
		if (account == null) {
			System.out.println("[Non autenticato]");
		} else {
			System.out.println("[Autenticato: " + account.toString() + " ]");
		}
	
		System.out.println("Totale: " + accounts.size());
		for (int i=0; i<accounts.size(); i++)
		{
			System.out.println(accounts.get(i).toString());
		}
	}
		
	/**
	 * Ritorna l'utente con il corrispondente username/email
	 * @param String username / email
	 * @return Account
	 */
	public static Account getUser(String username) { // or email
		for (int i=0; i<accounts.size(); i++) {
			Account a = accounts.get(i);
			if (a.getUsername().equals(username) || a.getEmail().equals(username)) {
				return a;
			}
		}
		return null;
	}
	
	/**
	 * Controlla le credenziali di login e se valide imposta l'utente loggato nel parametro user
	 * @param username / email
	 * @param password
	 * @return se le credenziali sono valide e il login è effettuato
	 */
	public static boolean login(String username, String password) {
		
		Account a = getUser(username);
		if (a != null && a.controlPassword(password)) {
			App.login = a;
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Effettua la registrazione dell'account a in memoria
	 * @param a
	 * @return se username / email non esiste gia
	 * @throws Exception
	 */
	public static boolean register(Account a) throws Exception {
		
		if (getUser(a.getUsername()) != null || getUser(a.getEmail()) != null)
			throw new Exception("Email o username gia utilizzati");
		else {			
			if (accounts.add(a)) {
				data.save(accounts);
				return true;
			} else {
				return false;
			}
		}
	}
	
	public static void window(Frame frame) {
		
	}
}
