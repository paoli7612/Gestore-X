
public class App {

	private enum mode_t { CLI, WINDOW };
	
	public static void main(String[] args) throws Exception {
		if (args.length == 1) {
			String arg = args[0];
			if (arg.equals("--cli") || arg.equals("-c")) {
				run(mode_t.CLI);
			} else if (arg.equals("--window") || arg.equals("-w")) {
				run(mode_t.WINDOW);
			} else if (arg.equals("--help") || arg.equals("-h")) {
				help();
			} else {
				System.out.println("Argument invalid");
			}
		} else {
			System.out.println("Start app in graphic mode");
		}
	}
	
	public static void run(mode_t mode) throws Exception {
		if (mode == mode_t.CLI) {
			System.out.println("Run app cli-mode");
		} else if (mode == mode_t.WINDOW) {
			System.out.println("Run app window-mode");
		} else {
			throw new Exception("Invalid run");
		}
	}
	
	public static void help() {
		System.out.println("--help  -h\tShow help of app");
		System.out.println("--cli   -c\tRun app with command line interface");
		System.out.println("--win   -w\tRun app with graphic mode [default]");
	}

}
