package accountManager;

public class Persona {
	
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	@Override
	public String toString() {
		return "<%s %s>".formatted(this.nome, this.cognome);
	}

}
