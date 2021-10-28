package data;

import java.io.BufferedReader;
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
		System.out.println(file.getAbsolutePath());
		for (int i=0; i<accounts.size(); i++) {
			writer.write(accounts.get(i).toFile());
		}
		
		writer.close();
	}
	
	public void load(List<Account> accounts) throws Exception {
		FileReader reader = new FileReader(file);
		BufferedReader breader = new BufferedReader(reader);
		String row;
		
		do {
			row = breader.readLine();
			if (row != null) {				
				System.out.println(new Account(row).toString());	
			}
		} while (row != null);
		
		
		reader.close();
	}

}
