package utils;

import java.util.Date;


public class Data extends Date{
	
	@SuppressWarnings("deprecation")
	public Data(Integer giorno, Integer mese, Integer anno) {
		super (anno, mese, giorno);
	}
		
	public int compare(Data other)
	{
		return (int) (this.getTime() - other.getTime());
	}
	
	@SuppressWarnings("deprecation")
	public void print() {
		System.out.println(getDate() +"/"+ getMonth() +"/"+ getYear());
	}
		
}
