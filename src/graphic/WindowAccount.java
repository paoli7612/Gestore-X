package graphic;

import java.awt.event.ActionEvent;

import accountManager.App;

public class WindowAccount extends Window {

	private FieldGroup fgroup;
	
	public WindowAccount(WindowHome home) {
		super("My Account", "Save", true, home);
		
		fgroup = new FieldGroup(3);
		
		accountManager.Account a = App.login;
		fgroup.add("Nome", a.getNome());
		fgroup.add("Cognome", a.getCognome());
		fgroup.add("Matricola");
		body.add(fgroup.getPanel());
		super.setBounds(400, 300, 800, 400);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			App.login.edit(fgroup.getText(0), 	// Nome
					fgroup.getText(1),	// Cognome
					fgroup.getText(2));	// Matricola
		} catch (Exception e2) {
			// TODO: handle exception
		}

	}
	
}