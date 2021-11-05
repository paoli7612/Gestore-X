package app;

import java.util.ArrayList;
import java.util.List;

import frames.Home;
import frames.Welcome;

public class App {
	
	private static Data data = new Data("");
	private static List<Account> accounts = new ArrayList<Account>();
	
	public static Account account;
	
	public static Home home = new Home();
	public static Welcome welcome = new Welcome();
	
	public static void login(String username, String password) throws Exception {
		Account account = getUser(username);
		if (account == null) {
			throw new Exception("Username o Email non esistente");
		} else if (!account.controlPassword(password)) {
			throw new Exception("Passowrd non corretta");
		} else {			
			App.account = account;
		}
	}
	
	public static void register(Account account) throws Exception {
		if (getUser(account.getUsername()) != null || getUser(account.getEmail()) != null) {			
			throw new Exception("Email o username gia utilizzati");
		} else {			
			accounts.add(account);
			data.save(accounts);
		}
	}
	
	public static void print() {
		if (account == null) {
			System.out.println("[non autenticato]");
		} else {
			System.out.println("[utente autenticato: " + account.toString() + " ]");
		}
		
		System.out.println("#accounts: " + accounts.size());
		for (int i=0; i<accounts.size(); i++) {
			Account account = accounts.get(i);
			System.out.println(account.toString());
		}
	}

	public static void home() {
		home.show();
	}
	
	public static void welcome() {
		welcome.show();
	}
		
	private static Account getUser(String username) { // or email
		for (int i=0; i<accounts.size(); i++) {
			Account a = accounts.get(i);
			if (a.getUsername().equals(username) || a.getEmail().equals(username)) {
				return a;
			}
		}
		return null;
	}
	
}
