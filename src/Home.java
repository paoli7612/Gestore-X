import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.DocumentListener;

public class Home extends JFrame {

	public Home() {
	
		super("Home");
		
		JPanel header = new JPanel();
		JPanel body = new JPanel();
		JPanel footer = new JPanel();
		
		JPanel l_footer = new JPanel();
		l_footer.setPreferredSize(new Dimension(200, 40));
		JPanel r_footer = new JPanel();
		r_footer.setPreferredSize(new Dimension(200, 40));
				
		JLabel label = new JLabel("Gestione spedizioni");
		label.setFont(new Font("Serif", Font.BOLD, 45));
		header.add(label);
		
		JButton aLogin = new JButton("Login");		
		aLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
				dispose();
			} 
		});
		r_footer.add(aLogin);
		
		JButton aRegister = new JButton("Register");
		aRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Register premuto");
			} 
		});
		r_footer.add(aRegister);
		
		JButton aExit = new JButton("Exit");
		aExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			} 
		});
		l_footer.add(aExit);
		
		footer.add(l_footer, BorderLayout.WEST);
		footer.add(r_footer, BorderLayout.EAST);
		
		this.add(header,BorderLayout.NORTH);
		this.add(body,BorderLayout.CENTER);
		this.add(footer,BorderLayout.SOUTH);
		setBounds(20, 20, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
}
