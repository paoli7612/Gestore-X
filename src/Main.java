import accountManager.App;
import frames.Home;
import frames.Welcome;
import graphic.Frame;

public class Main {
	
	public static void main(String[] args) {
		if (args.length == 1) {
			if (args[0].equals("print")) {
				App.print();
			}
		} else if (args.length == 2) {
			App.login(args[0], args[1]);
			App.window(App.Welcome);
		} else {
			App.window(App.Home);
		}
	}
	
}
