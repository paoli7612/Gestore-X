package data;

import java.io.File;
import java.io.FileWriter;

import manager.Account;

public class Saver {

	private FileWriter writer;
	
	public Saver(String filename) throws Exception {
		File file = new File(filename);
		this.writer = new FileWriter(file);	
	}
	
	public void save(Account accounts[]) throws Exception {
		for (int i=0; i<accounts.length; i++) {
			this.writer.write(accounts[i].toString());
		}
	}
	
	public void close() throws Exception {
		writer.close();
	}
	
}
