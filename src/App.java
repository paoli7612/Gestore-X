import data.Saver;
import manager.Account;
import manager.Persona;

public class App {

	public static void main(String[] args) {

		//new Home();
		

		try {

			Account aa[] = new Account[2];
			
			aa[0] = new Account("Tommaso", "Paoli", "tomaoli@gmail.com", "qwerty");
			aa[1] = new Account("Luca", "Nervi", "luca.nervi@gmail.com", "qwertyqwerty");
			Saver saver = new Saver("C:/qwerty.txt");

			saver.save(aa);
			saver.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
