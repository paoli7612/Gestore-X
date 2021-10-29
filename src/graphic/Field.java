package graphic;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class Field {

	static JPanel sPanel = new JPanel(new GridLayout(9, 2));

	private JTextField input;
	private JLabel label;
	
	public Field(String title, boolean isPassword) {
		
		if (isPassword) {
			input = new JPasswordField(16);
		} else {			
			input = new JTextField(16);
		}
		label = new JLabel(title);
		
		input.setFont(new Font("Verdana", Font.PLAIN, 22));
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Verdana", Font.PLAIN, 22));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBorder(new EmptyBorder(0, 0, 0, 16));
		
		sPanel.add(label);
		sPanel.add(input);	
	}
	
	public Field(String title) {
		this(title, false);
	}
		
	public String getText() {
		return this.input.getText();
	}
}
