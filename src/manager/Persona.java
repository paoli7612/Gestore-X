package manager;

public class Persona {

	static int count;
	
	private String nome;
	private String cognome;
	public int id;
	
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.id = ++count;
	}
	
	@Override
	public String toString() {
	
		return this.id + ") " + this.nome + " " + this.cognome;
	}
	
	
}
