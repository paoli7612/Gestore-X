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
			if (fgroup.getText("Password").equals(fgroup.getText("Ripeti password"))) {
				try {
					App.register(
							new Account(
								fgroup.getText(0), // nome
								fgroup.getText(1), // cognome
								fgroup.getText(2), // email
								fgroup.getText(3), // username
								fgroup.getText(4)  // password
							)
						);
					this.setVisible(false);					
					App.home.setVisible(true);
				} catch (Exception e2) {
					System.out.println(e2);
				}
			} else {
				throw new Exception("Password ripetuta differentemente");
			}
		} catch (Exception e2) {
			fgroup.reset();
		}
		
	}
	
}
