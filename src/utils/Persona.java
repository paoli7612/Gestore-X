package utils;

/**
 * 
 * @author paoli7612
 * @brief Tipo di dato Persona
 * 
 * 
 */
public class Persona {

	private int id;
	private String nome;
	private String cognome;
	
	/**
	 * Creiamo la nostra persona unicamente salvandoci il nome e il cognome;
	 * di conseguenza ci ricaviamo il suo identificativo
	 * 
	 * Supessivamente settiamo i parametri con i \setter
	 * 
	 * @param nome nome della persona
	 * @param cognome cognome della persona
	 */
	public Persona(String nome, String cognome) {
		
		this.nome = nome;
		this.cognome = cognome;
		
	}

	
	/**
	 * Usiamo questo costruttore quando ricarichiamo i dati delle persone dal file;
	 * abbiamo quindi subito tutti i dati della persone (anagrafica, id, credenziali ecc.)
	 * 
	 * @param id
	 */
	public Persona(String id) {
		
		
		// carica tutti i dati della persona dal file con quel'id
		
	}
	
	/**
	 * Usiamo la conversione della Persona in stringa ricordandoci solo nome, cognome e id
	 * 
	 */
	public String toString() {
		String out = id + "> " + nome + " " + cognome;
		return out;
	}
	
	/**
	 * println del toString della persona
	 */
	public void print() {
		System.out.println(this.toString());
	}
	
	public byte[] toBytes() {
		
		return this.nome.getBytes();
		
	}
	
}
