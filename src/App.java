
public class App {

	public static void main(String[] args) {
		if (args.length == 1) {
			String arg = args[0];
			if (arg.equals("--cli") || arg.equals("-c")) {
				System.out.println("Start app with cli");
			} else if (arg.equals("--window") || arg.equals("-w")) {
				System.out.println("Start app in graphic mode");
			} else if (arg.equals("--help") || arg.equals("-h")) {
				help();
			} else {
				System.out.println("Argument invalid");
			}
		} else {
			System.out.println("Start app in graphic mode");
		}
	}
	
	public static void help() {
		System.out.println("--help  -h\tShow help of app");
		System.out.println("--cli   -c\tRun app with command line interface");
		System.out.println("--win   -w\tRun app with graphic mode [default]");
	}

}
