package app;

/**
 * Applicazione per la gestione delle spedizioni
 */
public class App {

	/**
	 * Metodo principale della applicazione
	 * @param args	Argomenti passati al lancio della applicazione
	 */
	public static void main(String[] args) {
		if (args.length == 1) {	
			System.out.println(args[0]);
			if (args[0].equals("--cli") || args[0].equals("-c")) {
				cli();
			} else if (args[0].equals("--window") || args[0].equals("-w")) {
				window();
			} else if (args[0].equals("--help") || args[0].equals("-h")){
				help();			
			} else {
				System.out.println("Option not found");
				help();
			}
		} else {
			help(true);
			window();
		}
	}

	/**
	 * Avvia la applicazione usando l'interfaccia da linea di comando
	 */
	public static void cli() {
		System.out.println("CLI >> run app");
	}
	
	/**
	 * Avvia la applicazione con l'interfaccia grafica
	 */
	public static void window() {
		System.out.println("WINDOW >> run app");
	}
	
	/**
	 * Stampa l'help della applicazione
	 * @param s se impostato a true mostra una versione ridotta dell'help
	 */
	public static void help(boolean s) {
		if (s) {
			System.out.println("there aren't argument");
			System.out.println("App -> start in window-mode");
		} else {			
			System.out.println("use --cli to start with cli-mode");
			System.out.println("use --win to start with window-mode (default) ");
		}
	}
	
	public static void help() {
		help(false);
	}	
}
