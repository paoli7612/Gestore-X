package accountManager;

import java.util.ArrayList;
import java.util.List;

import graphic.Home;

public class App {

	private static List<Account> accounts = new ArrayList<Account>();
	
	public static void exec() {
		new Home();
	}
	
	public static void add(Account a) {
		accounts.add(a);
	}
	
}
