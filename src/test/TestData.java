package test;

import utils.Data;

public class TestData extends Test {

	public TestData() {
		super("Data");
		
		Data d = new Data(21, 05, 2000);
		
		d.print();
		
		end();
	}
	
}
