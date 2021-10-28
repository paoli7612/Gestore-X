package accountManager;

import java.sql.Date;

public class Persona {
	
	private String nome;
	private String cognome;
	private Date nascita;
	private char matricola[];
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = new char[6];
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public Date getNascita() {
		return this.nascita;
	}
	
	public void setNascita(Date nascita) {
		this.nascita = nascita;
	}
	
	public String getMatricola() {
		String ret = "";
		for (int i=0; i<6; i++)
			ret += matricola[i];
		return ret;
	}
	
	public void setMatricola(String matricola) {
		for (int i=0; i<6; i++) {
			this.matricola[i] = matricola.charAt(i);
		}	
	}
	
	@Override
	public String toString() {
		String ret = "<%s %s ".formatted(this.nome, this.cognome);
		if (this.matricola != null)
			ret += this.getMatricola();
		return ret + ">";
	}

}
