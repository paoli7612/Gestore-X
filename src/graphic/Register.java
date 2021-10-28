package graphic;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame {

	private Field iNome;
	private Field iCognome;
	private Field iEmail;
	private Field iUsername;
	private Field iPassword;
	private Field iRipetiPassword;
	
	public Register() {
	
		super("Register");
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		
		Field.setWidth(800);
		iNome = new Field("Nome");
		iCognome = new Field("Cognome");
		iEmail = new Field("Email");
		iUsername = new Field("Username");
		iPassword = new Field("Password");
		iRipetiPassword = new Field("Ripeti password");	
		
		this.add(Field.sPanel, BorderLayout.CENTER);
		super.setBounds(400, 300, 800, 600);

	}
	
}
