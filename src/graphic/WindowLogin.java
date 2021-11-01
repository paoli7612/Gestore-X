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

public class WindowLogin extends Window {

	private FieldGroup fgroup;
	
	public WindowLogin(Welcome home) {
		super("Login", "Confirm", true, home);
		
		fgroup = new FieldGroup(2);
		fgroup.add("Username");
		fgroup.add("Password", true);
		
		body.add(fgroup.getPanel());
		App.print();
		super.setBounds(400, 300, 800, 400);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			;
			if (App.login(fgroup.getText(0), fgroup.getText(1))) {
				System.out.println("Login effettuato come " + App.login.toString());
				this.setVisible(false);
				new WindowHome();
			} else {
				System.out.println("Login fallito");
				fgroup.reset();
			}
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
	}
	
}
