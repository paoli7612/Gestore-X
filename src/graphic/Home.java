package graphic;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

 

public final class Home extends JFrame {

	public Home() {
	
		super("Home");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		super.setBounds(200, 200, 500, 500);
		
		JPanel panel = new JPanel();
		this.add(panel);
		
		JPanel p_header= new JPanel();
		JLabel l_title = new JLabel("Gestione spedizioni");
		
		l_title.setFont(new Font("Serif", Font.BOLD, 20));
		p_header.add(l_title);
		
		
		JPanel p_footer = new JPanel();
		JButton b_login = new JButton("Login");
		JButton b_register = new JButton("Register");
		p_footer.add(b_login);
		p_footer.add(b_register);
        

		panel.add(p_header);
		panel.add(p_footer);

		
		super.setVisible(true);
	}
	
}
