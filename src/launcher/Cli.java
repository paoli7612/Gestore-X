package launcher;

import java.util.Scanner;
import gestore.App;

public class Cli extends App {

	public Cli() throws Exception {
		super(ask("File di dati: "));					
	}
	
	@Override
	public void run() {
		boolean running = true;
		while (running) {
			try {
				if (isAuth()) {
					running = home();
				} else {
					running = welcome();
				}				
			} catch (Exception e) {
				println("[!!! Errore !!!]");
				print("\t\t");
				println(e.toString());
			}	
		}
		
		println("Programma terminato");		
	}
	
	private boolean home() throws Exception {
		println("1: My account\n2: Logout\n3: Exit");
		switch (getInteger()) {
			case 1: {
				println("-- MY ACCOUNT --");
				println(this.account.toString());
				break;
			}
			
			case 2: {
				println("-- LOGOUT --");
				this.logout();
				break;
			}
			
			case 3: {
				println("-- EXIT --");
				return false;
			}
			
			default: {
				println("-- COMANDO INVALIDO --");
			}
		}
		return true;	
	}
	
	private boolean welcome() throws Exception {
		println("1: Login\n2: Register\n3: Print\n4: Exit");
		switch (getInteger()) {
			case 1: {
				println("-- LOGIN --");
				String username = ask("Username: ");
				String password = ask("Password: ");
				login(username, password);
				break;
			}
			
			case 2: {
				println("-- REGISTER --");
				String username = ask("Username: ");
				String password = ask("Password: ");
				String ripeti = ask("Ripeti password: ");
				register(username, password, ripeti);
				break;
			}
			
			case 3: {
				println("-- PRINT --");
				print(this.toString());
				break;
			}
			case 4: {
				println("-- EXIT --");
				return false;
			}
			
			default: {
				println("-- COMANDO INVALIDO --");
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
