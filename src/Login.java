import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

	public Login() {
		
		super("Login");
		
		JPanel header = new JPanel();
			JLabel label = new JLabel("Login");
			label.setFont(new Font("Serif", Font.BOLD, 45));
			header.add(label);
		this.add(header,BorderLayout.NORTH);
			
		JPanel body = new JPanel();
			JPanel a_body = new JPanel();
			a_body.setPreferredSize(new Dimension(400, 32));
				JLabel lUsername = new JLabel("Username");
				a_body.add(lUsername);
				JTextField iUsername = new JTextField(16);
				a_body.add(iUsername);
			body.add(a_body, BorderLayout.NORTH);

			JPanel b_body = new JPanel();
			b_body.setPreferredSize(new Dimension(400, 32));
				JLabel lPassword = new JLabel("Password");
				b_body.add(lPassword);
				JPasswordField iPassword = new JPasswordField(16);
				b_body.add(iPassword);
			body.add(b_body, BorderLayout.CENTER);

			JPanel c_body = new JPanel();
				JButton bLogin = new JButton("Login");
				bLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println(iUsername.getText());
						System.out.println(iPassword.getPassword());
					} 
				});
				c_body.add(bLogin, BorderLayout.SOUTH);
			body.add(c_body, BorderLayout.SOUTH);

		this.add(body, BorderLayout.CENTER);
			
		setBounds(120, 120, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
