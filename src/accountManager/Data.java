package accountManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Data {
	
	private File file;
	
	public Data(String filename) {
		String path = "./data/" + filename + ".txt";
		file = new File(path);
	}
	
	@SuppressWarnings("unchecked")
	public List<Account> read() throws Exception {
		
		List<Account> a = new ArrayList<Account>();
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		a = (List<Account>) ois.readObject();
		ois.close();
		fis.close();
		
		return a;
	}
	
	public void write(List<Account> a) throws Exception {
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(a);
		oos.close();
		fos.close();
	}
	
	public void save(List<Account> a) {
		try {
			write(a);
		} catch (Exception e) {
			System.out.println("Errore salvataggio degli account");
		}
	}
	
	public List<Account> load() {
		try {
			return read();
		} catch (Exception e) {
			try {				
				this.write(new ArrayList<Account>());
			} catch (Exception e2) {
				System.out.println("Errore critico");
				return null;
			}
			return this.load();
		}
	}

}
