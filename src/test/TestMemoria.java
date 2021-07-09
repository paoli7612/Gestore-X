package test;

import utils.Memoria;
import utils.Persona;

/**
 * 
 * @author paoli7612
 * 
 * @apiNote descrizione?
 * 
 * */

public class TestMemoria extends Test {

	public TestMemoria() {
		super("Memoria");
		
		
		try {
			
			Memoria memoria = new Memoria();			
		
			memoria.scrivi(new Persona("Tommaso", "Paoli"));
			memoria.scrivi(new Persona("Mario", "Rossi"));
			memoria.scrivi(new Persona("Luca", "Nervi"));
						
			Persona p = memoria.leggi();
			System.out.println("CIAO");
			p.print();
			
		} catch (Exception e) {
			
			System.out.println("Fallito");
			
		}

		
		
		end();
	}
	
}
