package graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import accountManager.Account;
import accountManager.Data;

public class Welcome extends Window {
	
	private WindowLogin login = new WindowLogin(this);
	private WindowRegister register = new WindowRegister(this);
	
	public Welcome() {
		super("Welcome");
		setVisible(true);
		
		JButton aRegister = new JButton("New account");
		aRegister.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        register.setVisible(true);
		        dispose();
		    }
		});
		body.add(aRegister);
		
		JButton aLogin = new JButton("Login");
		aLogin.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	login.setVisible(true);
		        dispose();
		    }
		});
		body.add(aLogin);
		
		super.setBounds(400, 300, 800, 400);
	}
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
	}

}