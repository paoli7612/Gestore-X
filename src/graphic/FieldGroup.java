package graphic;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class FieldGroup {

	private JPanel panel;
	
	private List<Field> fields;
	
	public FieldGroup(Integer c) {
		fields = new ArrayList<Field>();
		panel = new JPanel(new GridLayout(c, 2));
	}
	
	public void add(String title, boolean isPassword) {
		Field field = new Field(panel, title, isPassword);
		fields.add(field);
	}
	
	public void add(String title) {
		add(title, false);
	}
	
	public JPanel getPanel() {
		return this.panel;
	}
	
	
}
