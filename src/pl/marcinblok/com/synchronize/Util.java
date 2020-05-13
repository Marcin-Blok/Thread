package pl.marcinblok.com.synchronize;

public class Util {
	private static int MAX = 5500;
	private static int MIN = 100;
	private static String chars = "qwertyuiopasdfghjklzxcvbnm";

	public static Product generateProduct() {
		return new Product(generateName(), generatePrice());
	}

	private static String generateName() {
		String name = "";
		for (int i = 0; i < 5; i++) {
			name += chars.charAt(generateIndex(chars.length())); 
		}
		return name;
	}

	private static int generatePrice() {
		return (int) (Math.random() * (MAX - MIN) + MIN);
	}
	
	private static int generateIndex(int maxIndex) {
		return (int) (Math.random() * maxIndex );
	}
}
