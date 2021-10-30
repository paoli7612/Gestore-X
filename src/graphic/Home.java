package graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import accountManager.Account;

public class Home extends Window {
	
	public Home() {
		super("Home");
		
		JButton aRegister = new JButton("New account");
		aRegister.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        new Register();
		        dispose();
		    }
		});
		body.add(aRegister);
		
		JButton aLogin = new JButton("Login");
		aLogin.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //new Login();
		        dispose();
		    }
		});
		body.add(aLogin);
		
		super.setBounds(400, 300, 800, 400);
	}
	
	public Home(Account a) {
		this();
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		

	}

}
