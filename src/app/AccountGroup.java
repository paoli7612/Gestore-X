package app;

import java.util.ArrayList;
import java.util.List;

import data.Data;

public class AccountGroup {

	private List<Account> accounts;
	private Data data;
	
	public AccountGroup() {
		accounts = new ArrayList<Account>();
		data = new Data("data/users.txt");
	}
	
	public void add(Account account) {
		accounts.add(account);
	}
	
	public void save() {
		try {			
			data.save(this.accounts);
		} catch (Exception e) {
			System.out.println("Errore nel salvataggio degli account sul file");
		}
	}
	
	public void load() {
		try {
			data.load(this.accounts);
		} catch (Exception e) {
			System.out.println("Errore nel caricamento degli account dal file");
		}
	}
	
	public void print() {
		System.out.println(this.toString());
		for (int i=0; i<accounts.size(); i++) {
			System.out.println(accounts.get(i).toString());
		}
	}
	
	@Override
	public String toString() {
		return this.accounts.size() + " items";
	}	
}

