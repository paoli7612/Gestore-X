package graphic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.DimensionUIResource;

public class Register extends JFrame implements ActionListener {

	private JPanel panel;

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
		panel = new JPanel();
		
		Field.setWidth(800);
		iNome = new Field("Nome");
		iCognome = new Field("Cognome");
		iEmail = new Field("Email");
		iUsername = new Field("Username");
		iPassword = new Field("Password");
		iRipetiPassword = new Field("Ripeti password");
		this.add(Field.sPanel, BorderLayout.CENTER);
		
		JButton button = new JButton("Register");
		button.addActionListener(this);
		Field.sPanel.add(button);
		
		
		super.setBounds(400, 300, 800, 600);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		
	}
	
}
