/**
 * 
 */
package graphic;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author paoli7612
 *
 */
public final class Login extends Window {
	
	public Login() {
	
		super(400, 400);
		
		
		JPanel panel = new JPanel(); 
		Field femail = new Field(Field.EMAIL);
		Field fpassword = new Field(Field.PASSWORD);
		Submit bsubmit = new Submit("Login");
		
		panel.add(femail.getPanel());
		panel.add(fpassword.getPanel());
		
		panel.add(bsubmit.getPanel());
		
		this.frame.setContentPane(panel);
		
	}

}
