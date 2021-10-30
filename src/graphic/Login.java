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

	private FieldGroup fgroup;
	
	public Login(Home home) {
		super("Login", "Confirm", true, home);
		
		fgroup = new FieldGroup(2);
		fgroup.add("Username");
		fgroup.add("Password", true);
		
		body.add(fgroup.getPanel());
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
