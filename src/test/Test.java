package test;

public class Test
{
	
	private String name;
	
	public Test(String name) {
		
		this.name = name;
				
		System.out.println("<!!> start test " + name);
	}
	
	protected void end()
	{
		System.out.println("<!!> end test " + name);
	}
		
	public static void main(String[] args) {
		
		if (args.length != 1)
		{
			System.out.println("Nome classe da testare non passato correttamente come unico argomento");
			return;
		}
			
		switch (args[0]) {
		case "Persona":
			
			new TestPersona();
			break;

		case "Data":
			new TestData();
			break;
			
		default:
			System.out.println("Nome classa da testare non presente");
			break;
		}
	}	
}
