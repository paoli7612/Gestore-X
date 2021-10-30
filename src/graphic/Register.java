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

	private FieldGroup fgroup;
	
	public Register(Home home) {
		super("Register", "Confirm", true, home);
						
		fgroup = new FieldGroup(6);
		fgroup.add("Nome");
		fgroup.add("Cognome");
		fgroup.add("Email");
		fgroup.add("Username");
		fgroup.add("Password", true);
		fgroup.add("Ripeti password", true);
		
		body.add(fgroup.getPanel());
		super.setBounds(400, 300, 800, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			System.out.println("ASD");
			
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
	}
	
}
