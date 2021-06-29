package test;

import utils.Persona;

public final class TestPersona extends Test{
	
	
	public TestPersona() {
		
		super("persona");
		
		Persona p = new Persona("Tommaso", "Paoli");
		
		p.print();
		
		end();
	}

}
