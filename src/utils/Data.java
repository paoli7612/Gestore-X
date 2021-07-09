package utils;

import java.util.Date;

/**
 * 
 * @author paoli7612
 * @brief Tipo di dato Data
 *
 */
public class Data extends Date{
	
	public Data(Integer giorno, Integer mese, Integer anno) {
		super (anno, mese, giorno);
	}
		
	public int compare(Data other)
	{
		return (int) (this.getTime() - other.getTime());
	}
	
	public void print() {
		System.out.println(getDate() +"/"+ getMonth() +"/"+ getYear());
	}
		
}
