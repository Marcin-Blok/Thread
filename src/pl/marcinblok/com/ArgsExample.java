package pl.marcinblok.com;

public class ArgsExample {
	public static void main(String[] args) {
		
		// połączenie do bazy
		// nazwa bazy = args[0]
		
		for(String arg : args) {
			System.out.println(arg);
		}
	}
}
