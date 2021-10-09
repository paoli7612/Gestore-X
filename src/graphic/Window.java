package graphic;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Window {
	
	protected JFrame frame;
	
	public Window(int width, int height) {
		this.frame = new JFrame();
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(width, height);
	}
		
	public void start() {
		this.frame.setVisible(true);
	}

}
