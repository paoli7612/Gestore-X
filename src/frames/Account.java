package frames;

import java.awt.event.ActionEvent;

import app.App;
import graphic.FieldGroup;
import graphic.Window;

public class Account extends Window {

	private FieldGroup fgroup;
	
	public Account() {
		super("My Account", "Save", true);
		
		fgroup = new FieldGroup(3);
		
		app.Account a = App.login;
		fgroup.add("Nome", a.getNome());
		fgroup.add("Cognome", a.getCognome());
		fgroup.add("Matricola");
		body.add(fgroup.getPanel());
		super.setBounds(400, 300, 800, 400);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			App.account.edit(fgroup.getText(0), 	// Nome
							fgroup.getText(1),		// Cognome
							fgroup.getText(2));		// Matricola
		} catch (Exception e2) {
			// TODO: handle exception
		}

	}
	
}
