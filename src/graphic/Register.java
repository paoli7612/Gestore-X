package graphic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;

import accountManager.Account;

public class Register extends Window {

	private Field fNome;
	private Field fCognome;
	private Field fEmail;
	private Field fUsername;
	private Field fPassword;
	private Field fRipetiPassword;
	
	public Register() {
		super("Register", "Confirm", true);
						
		fNome = new Field("Nome");
		fCognome = new Field("Cognome");
		fUsername = new Field("Username");
		fEmail = new Field("Email");
		fPassword = new Field("Password", true);
		fRipetiPassword = new Field("Ripeti password", true);
		
		body.add(Field.sPanel);
		super.setBounds(400, 300, 800, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (!fPassword.getText().equals(fRipetiPassword.getText())) {
				throw new Exception("Ripeti password non corrisponente");
			}
			Account a = new Account(fNome.getText(), fCognome.getText(), fEmail.getText(), fUsername.getText(), fPassword.getText());
			dispose();
			new Home(a);
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
	}
	
}
