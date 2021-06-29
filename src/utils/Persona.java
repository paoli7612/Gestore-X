package utils;

public class Persona {

	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		
		this.nome = nome;
		this.cognome = cognome;
		
	}
	
	public String toString() {
		String out = nome + " " + cognome;
		return out;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
}
