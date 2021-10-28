package app;

public class Persona {

	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Persona(String row) {
		String vv[] = row.split("\\|");
		this.nome = vv[0];
		this.cognome = vv[1];
	}
	
	@Override
	public String toString() {
		return nome + " " + cognome;
	}
	
	public String toFile() {
		return nome + "|" + cognome;
	}
}
