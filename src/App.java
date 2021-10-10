import java.util.Scanner;

public final class App {

	static String email;
	static String password;
	
	public static void main(String[] args) {
		
		if (args.length == 2) {
			email = args[0];
			password = args[1];
		} else {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("email:    ");
			email = sc.nextLine();
			System.out.print("password: ");
			password = sc.nextLine();
		}
		
		System.out.println("Email: " + email + " -  Password: " + password);
		
		
	}

}
