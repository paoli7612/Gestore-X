package test;

import utils.Data;

/**
 * 
 * @author paoli7612
 * 
 * @apiNote descrizione?
 * 
 * */

public class TestData extends Test {

	public TestData() {
		super("Data");
		
		Data d = new Data(21, 05, 2000);
		Data e = new Data(17, 7, 2001);
		
		d.print();
		e.print();
		
		System.out.println(e.compare(d));
		
		end();
	}
	
}
