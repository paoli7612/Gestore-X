package data;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import app.Account;

public class Data {
	
	private File file;
	
	public Data(String filename) {
		file = new File(filename);
	}
	
	public void save(List<Account> accounts) throws Exception {
		FileWriter writer = new FileWriter(file);
		
		for (int i=0; i<accounts.size(); i++) {
			writer.write(accounts.get(i).toString());
			System.out.println(accounts.get(i).toString());
			writer.write("\n");
		}
		
		writer.close();
	}
	
	public void load(List<Account> accounts) throws Exception {
		FileReader reader = new FileReader(file);
		
		reader.close();
	}

}
