import java.util.Scanner;

import app.Account;

public final class App {

	static Account account;
	
	public static void main(String[] args) {		
		try {
			if (args.length == 2) {
				account = new Account(args[0], args[1]);
			} else {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("email:     ");
				String email = sc.nextLine();
				System.out.print("password:  ");
				String password = sc.nextLine();
				
				account = new Account(email, password);
			}
		} catch (Exception e) {
			System.out.println("Credenziali non valide");
			return;
		}
		
	}

}
