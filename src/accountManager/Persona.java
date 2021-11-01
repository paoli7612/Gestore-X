package accountManager;

import java.io.Serializable;
import java.sql.Date;

public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String cognome;
	private Date nascita;
	private char matricola[];
	
	public Persona(String nome, String cognome){
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
	
	@SuppressWarnings("deprecation")
	public void setNascita(Integer day, Integer month, Integer year) {
		this.setNascita(new Date(year, month, day));
	}
	
	public void setNascita(String nascita) {
		String vv[] = nascita.split("/");
		this.setNascita(Integer.parseInt(vv[0]), Integer.parseInt(vv[1])-1, Integer.parseInt(vv[2])-1900);
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
		String ret = "<%s %s".formatted(this.nome, this.cognome);
		if (this.matricola[0] != 0)
			ret += " " + this.getMatricola();
		if (this.nascita != null)
			ret += " " + this.nascita.toString();
		return ret + ">";
	}
}
