package graphic;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.DimensionUIResource;

public class Field {

	static JPanel sPanel = new JPanel();
	static Integer sWidth;
	
	private JPanel panel;
	private JTextField input;
	private JLabel label;
	
	public Field(String title) {
		panel = new JPanel();
		input = new JTextField();
		label = new JLabel(title);
		
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		
		label.setPreferredSize(new DimensionUIResource(sWidth/4, 30));
		input.setPreferredSize(new DimensionUIResource(sWidth/4, 30));
		
		panel.add(label);
		panel.add(input);
		
		panel.setPreferredSize(new DimensionUIResource(sWidth, 30));
		
		sPanel.add(panel);
	}
	
	public static void setWidth(Integer width) {
		sWidth = width;
	}
}
