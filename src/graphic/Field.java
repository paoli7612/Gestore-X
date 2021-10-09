package graphic;

import java.awt.Dimension;
import java.util.jar.JarInputStream;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Field {
	
	static final Integer USERNAME = 0;
	static final Integer EMAIL = 1;
	static final Integer PASSWORD = 2;
	
	static final String[] LABELS = {"Username", "Email", "Password"};
	
	private JLabel label;
	private JTextField field;
	private JPanel panel;
	
	public Field(final Integer type) {
		panel = new JPanel();
		label = new JLabel(this.LABELS[type]);
		label.setPreferredSize(new Dimension(80, 30));
		panel.add(label);
		
		field = new JTextField();
		field.setColumns(12);
		field.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(field);
		
	}
	
	JPanel getPanel() {
		return this.panel;
	}
	
	
}
