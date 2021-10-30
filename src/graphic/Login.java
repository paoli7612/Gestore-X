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
import accountManager.App;

public class Login extends Window {


	private Field fUsername;
	private Field fPassword;
	
	public Login(Home home) {
		super("Login", "Confirm", true, home);
						
		fUsername = new Field("Username");
		fPassword = new Field("Password", true);
		
		body.add(Field.sPanel);
		super.setBounds(400, 300, 800, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			dispose();
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
	}
	
}
