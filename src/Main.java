import gestore.App;
import launcher.Cli;

public class Main {
	
	public static void main(String[] args) {

		App app = null;
		try {
			if (args.length == 1) {
				if (args[0].equals("--cli")) {
					app = new Cli();
				} else {
					//appp = new Gui();
				}
				app.run();
			} else {
				System.out.println("Use --cli to open in cli-mode or use --gui do graphical-mode");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
