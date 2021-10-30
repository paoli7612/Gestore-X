import java.util.ArrayList;
import java.util.List;

import accountManager.Account;
import graphic.Home;

public class App {

	private static List<Account> accounts = new ArrayList<Account>();
		
	public static void main(String[] args) {
		Account a = new Account("Tommaso", "Paoli", "paoli7612@gmail.com", "tomaoli", "qwerty");
		accounts.add(a);
		System.out.println(accounts.get(0).toString());
		new Home();
	}	 
}
