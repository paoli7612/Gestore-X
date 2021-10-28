
import app.Account;
import app.AccountGroup;

public class App {

	public static void main(String[] args) {

		//new Home();

		AccountGroup ag = new AccountGroup();		
		ag.add(new Account("Tommaso", "Paoli", "paoli7612@gmail.com", "tomaoli", "qwerty"));
		ag.add(new Account("Luca", "Nervi", "lnervi@gmail.com", "lervi", "qwerty"));
		ag.add(new Account("Paolo", "Bitta", "pbitta@gmail.com", "pitta", "qwerty"));
		ag.save();
	}

}
