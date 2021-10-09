package graphic;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Submit {
	
	private JButton button;
	private JPanel panel;
	
	public Submit(final String text) {
		
		button = new JButton();
		button.setText(text);
		panel = new JPanel();
		panel.add(button);
		
	}
	
	public JPanel getPanel() {
		
		return this.panel;
		
	}

}
