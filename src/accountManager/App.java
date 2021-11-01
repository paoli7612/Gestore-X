package accountManager;

import java.util.ArrayList;
import java.util.List;

import graphic.Home;

public class App {

	public static Data data = new Data("asd");
	public static List<Account> accounts = data.load();;
	public static Home home;
	
	public static Account login;
	
	public static void print() {
		for (int i=0; i<accounts.size(); i++)
		{
			System.out.println(accounts.get(i).toString());
		}
	}
	
	public static void exec() {

		
		if (accounts == null) {
			System.out.println("Errore nel caricamento del'archivio");
		} else {
			home = new Home();			
		}
	}
	
	public static void add(Account a) {
		accounts.add(a);
	}
	
	public static Account getUser(String username) { // or email
		for (int i=0; i<accounts.size(); i++) {
			Account a = accounts.get(i);
			if (a.getUsername().equals(username) || a.getEmail().equals(username)) {
				return a;
			}
		}
		return null;
	}
	
	public static boolean login(String username, String password) {
		
		Account a = getUser(username);
		if (a != null && a.controlPassword(password)) {
			App.login = a;
			return true;
		} else {
			return false;
		}
		
	}
	
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
}
