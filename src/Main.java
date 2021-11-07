import gestore.App;

public class Main {
	
	public static void main(String[] args) {

		try {
			
			App app = new App("asd");
							
			app.login("2000iloapi@gmail.com", "qwerty");

			System.out.println(app.toString());
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
}
