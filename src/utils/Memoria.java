package utils;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class Memoria {
		
	FileInputStream istream;
	FileOutputStream ostream;
	
	public Memoria() throws FileNotFoundException {
		
		String path = System.getProperty("user.dir") ;
		String filename = "data.bin";
				
		System.out.println(path + "/" + filename);
		
		this.ostream = new FileOutputStream(filename);
		this.istream = new FileInputStream(filename);		
	}
	
	public void scrivi(Persona p) throws IOException {
		
		ostream.write(p.toBytes(), 0, 10);
	}
	
	public Persona leggi() throws IOException {
		
		System.out.println(istream.readNBytes(100));
		
		return new Persona("Ciao", "NO");
	}
}
