import accountManager.Persona;

public class App {

	public static void main(String[] args) {
		Persona persona = new Persona("Tommaso", "Paoli");
		persona.setMatricola("152542");
		System.out.println(persona.toString());
	}
	
}
