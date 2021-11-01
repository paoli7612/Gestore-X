package storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import accountManager.Account;

public class Data {
	
	private File file;
	
	public Data(String filename) {
		
		String path = "./data/" + filename + ".txt";
		file = new File(path);
		
	}
	
	public Account read() throws Exception {
		Account a;
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		a = (Account) ois.readObject();
		ois.close();
		fis.close();
		return a;
	}
	
	public void write(Account a) throws Exception {
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(a);
		oos.close();
		fos.close();
	}

}
