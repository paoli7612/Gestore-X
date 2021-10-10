import java.util.Scanner;

public final class App {

	static boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("LOGIN (y/n)");
		return sc.nextLine().equals("y");
	}
	
	static void menu() {
		System.out.println("MENU");	
	}
	
	static void exit() {
		System.out.println("EXIT ...");
	}
	
	public static void main(String[] args) {
		
		if (login()) {
			menu();
		} else {
			exit();
		}
		
	}

}
