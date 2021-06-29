package utils;

public class Data {
	
	private Integer giorno, mese, anno;
	
	public Data(Integer giorno, Integer mese, Integer anno) {
		
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
		
	}
	
	public String toString() {
		String out = giorno + "/" + mese + "/" + anno;
		return out;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
}
