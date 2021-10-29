package graphic;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Window extends JFrame implements ActionListener {

	private JPanel header;
	protected JPanel body;
	private JPanel footer;
	
	public Window(String name) {
		super(name);
		
		header = new JPanel();
		body = new JPanel();
		footer = new JPanel();
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		super.setVisible(true);
		
		
		JLabel title = new JLabel("Register");
		title.setFont(new Font("Verdana", Font.BOLD, 42));
		header.add(title);
		
		JButton submit = new JButton("Confirm");
		submit.addActionListener(this);
		footer.add(submit);
		
		this.add(header, BorderLayout.NORTH);
		this.add(body, BorderLayout.CENTER);
		this.add(footer, BorderLayout.SOUTH);
	}
	
}
