import app.App;

public class Main {
	
	public static void main(String[] args) {
		try {
			if (args.length == 1) {
				if (args[0].equals("print")) {
					App.print();
				}
			} else if (args.length == 2) {
				App.login(args[0], args[1]);
				App.home();
			} else {
				App.welcome();
			}			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
}
