package launcher;

import java.util.Scanner;

import gestore.App;

public class Cli  {

	private static App app;

	public static void main(String[] args) {
			
		String filename_data = ask("File di dati: ");
		try {
			app = new App(filename_data);			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
				
		boolean running = true;
		while (running) {
			try {
				if (app.isAuth()) {
					running = home();
				} else {
					running = welcome();
				}				
			} catch (Exception e) {
				System.out.println("[!!! Errore !!!]");
				System.out.println(e.toString());
			}
			
		}
		
	}
	
	private static boolean home() throws Exception {
		println("1: Login\n2: Register\n3: Print\n4: Exit");
		switch (getInteger()) {
			case 1: {
				String username = ask("Username: ");
				String password = ask("Password: ");
				app.login(username, password);
				break;
			}
			
			case 2: {
				String username = ask("Username: ");
				String password = ask("Password: ");
				String ripeti = ask("Ripeti password: ");
				app.register(username, password, ripeti);
				break;
			}
			
			case 3: {
				System.out.print(app.toString());
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
	
	private static boolean welcome() throws Exception {
		println("1: Login\n2: Register\n3: Print\n4: Exit");
		switch (getInteger()) {
			case 1: {
				String username = ask("Username: ");
				String password = ask("Password: ");
				app.login(username, password);
				break;
			}
			
			case 2: {
				String username = ask("Username: ");
				String password = ask("Password: ");
				String ripeti = ask("Ripeti password: ");
				app.register(username, password, ripeti);
				break;
			}
			
			case 3: {
				System.out.print(app.toString());
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
