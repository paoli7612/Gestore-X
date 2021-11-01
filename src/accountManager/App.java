package accountManager;

import java.util.ArrayList;
import java.util.List;

import graphic.Home;

public class App {

	public static List<Account> accounts = new ArrayList<Account>();
	public static Data data = new Data("asd");
	
	public static void exec() {
		Account a = new Account("Tommaso", "Paoli", "paoli7612@gmail.com", "tomaoli", "qwerty");
		accounts.add(a);
		new Home();
	}
	
	public static void add(Account a) {
		accounts.add(a);
	}
	
}
