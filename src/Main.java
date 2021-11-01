import accountManager.Account;
import accountManager.App;
import accountManager.Data;
import graphic.WindowHome;

public class Main {
	
	public static void main(String[] args) {
		if (args.length == 1) {
			if (args[0].equals("print")) {
				App.print();
			}
		} else if (args.length == 2) {
			App.login(args[0], args[1]);
			new WindowHome();
		} else {
			App.welcome();
		}
	}
}
