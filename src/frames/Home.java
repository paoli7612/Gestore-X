package frames;

import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

import accountManager.App;
import graphic.Window;

public class Home extends Window {
	
	public Home() {
		super("Home");
		
		JButton aRegister = new JButton("My account");
		aRegister.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    }
		});
		body.add(aRegister);
		
		JButton aSettings = new JButton("Settings");
		aSettings.addActionListener((ActionListener) new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
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
