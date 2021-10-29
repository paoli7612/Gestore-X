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

public class Register extends Window {

	private Field fNome;
	private Field fCognome;
	private Field fEmail;
	private Field fUsername;
	private Field fPassword;
	private Field fRipetiPassword;
	
	public Register() {
		super("Register");
						
		fNome = new Field("Nome");
		fCognome = new Field("Cognome");
		fEmail = new Field("Email");
		fUsername = new Field("Username");
		fPassword = new Field("Password", true);
		fRipetiPassword = new Field("Ripeti password", true);
		
		body.add(Field.sPanel);
		super.setBounds(400, 300, 800, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(
				fNome.getText() + " " + fCognome.getText()
				);
	}
	
}
