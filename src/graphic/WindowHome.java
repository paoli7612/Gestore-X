package graphic;

import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

import accountManager.App;

public class WindowHome extends Window {
	
	private Window wAccount = new WindowAccount(this);
	
	public WindowHome() {
		super("Home");
		
		JButton aRegister = new JButton("My account");
		aRegister.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        wAccount.setVisible(true);
		    }
		});
		body.add(aRegister);
		
		JButton aSettings = new JButton("Settings");
		aSettings.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        wAccount.setVisible(true);
		    }
		});
		body.add(aSettings);
		
		setVisible(true);
		super.setBounds(400, 300, 1200, 800);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}