package launcher;

import java.util.Scanner;

import gestore.App;

public class Cli extends App {

	public Cli() throws Exception {
		
		super(ask("File di dati: "));			
						
		boolean running = true;
		while (running) {
			try {
				if (isAuth()) {
					running = home();
				} else {
					running = welcome();
				}				
			} catch (Exception e) {
				System.out.println("[!!! Errore !!!]");
				System.out.println(e.toString());
			}	
		}
		
		System.out.println("Programma terminato");
		
	}
	
	private boolean home() throws Exception {
		println("1: Login\n2: Register\n3: Print\n4: Exit");
		switch (getInteger()) {
			case 1: {
				String username = ask("Username: ");
				String password = ask("Password: ");
				login(username, password);
				break;
			}
			
			case 2: {
				String username = ask("Username: ");
				String password = ask("Password: ");
				String ripeti = ask("Ripeti password: ");
				register(username, password, ripeti);
				break;
			}
			
			case 3: {
				System.out.print(this.toString());
				break;
			}
			case 4: {
				return false;
			}
			
			default: {
				
			}
		}
		return true;	
	}
	
	private boolean welcome() throws Exception {
		println("1: Login\n2: Register\n3: Print\n4: Exit");
		switch (getInteger()) {
			case 1: {
				String username = ask("Username: ");
				String password = ask("Password: ");
				login(username, password);
				break;
			}
			
			case 2: {
				String username = ask("Username: ");
				String password = ask("Password: ");
				String ripeti = ask("Ripeti password: ");
				register(username, password, ripeti);
				break;
			}
			
			case 3: {
				System.out.print(this.toString());
				break;
			}
			case 4: {
				return false;
			}
			
			default: {
				
			}
		}
		return true;
	}
	
	private static void println(String str) {
		System.out.println(str);
	}
	
	private static void print(String str) {
		System.out.print(str);
	}
	
	@SuppressWarnings("resource")
	public static String getString() {
		return (new Scanner(System.in)).nextLine();	
	}
	
	@SuppressWarnings("resource")
	public static Integer getInteger() {
		return (new Scanner(System.in)).nextInt();
	}
	
	private static String ask(String str) {
		print(str);
		return getString();
	}
	
}
