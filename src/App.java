import java.sql.Date;

import accountManager.Persona;
import graphic.Home;
import graphic.Register;

public class App {

	public static void main(String[] args) {
		Persona persona = new Persona("Tommaso", "Paoli");
		persona.setMatricola("152542");
		persona.setNascita("21/05/2000");
		System.out.println(persona.toString());
		
		new Home();
	}
	
}
