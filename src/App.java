import manager.Persona;

public class App {

	public static void main(String[] args) {

		//new Home();
		
		Persona p = new Persona("Tommaso", "Paoli");
		Persona p2 = new Persona("Marco", "Rossi");
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
	}

}
