import accountManager.Account;
import accountManager.App;
import accountManager.Data;

public class Main {
	
	public static void main(String[] args) {
		if (args.length == 1) {
			if (args[0].equals("print")) {
				App.print();
			}
		} else {			
			App.exec();
		}
	}
}
