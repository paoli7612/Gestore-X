package graphic;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Window extends JFrame implements ActionListener {

	private JPanel header;
	protected JPanel body;
	private JPanel footer;
	
	public Window(String name, String text_submit, boolean bback) {
		super(name);
		
		header = new JPanel();
		body = new JPanel();
		footer = new JPanel();
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		super.setVisible(true);
		super.pack();
		
		
		JLabel title = new JLabel(name);
		title.setFont(new Font("Verdana", Font.BOLD, 42));
		header.add(title);
		
		if (text_submit != null) {			
			JButton submit = new JButton(text_submit);
			submit.addActionListener(this);
			footer.add(submit);
		}
		
		if (bback) {			
			JButton exit = new JButton("Back");
			exit.addActionListener((ActionListener) new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new Home();
					dispose();
				}
			});
			footer.add(exit);
		}
		
		this.add(header, BorderLayout.NORTH);
		this.add(body, BorderLayout.CENTER);
		this.add(footer, BorderLayout.SOUTH);
	}
	
	public Window(String name, String text_submit) {
		this(name, text_submit, false);
	}
	
	public Window(String name) {
		this(name, null);
	}
}
