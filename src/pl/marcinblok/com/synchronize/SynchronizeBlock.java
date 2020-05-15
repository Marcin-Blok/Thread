package pl.marcinblok.com.synchronize;

import java.util.ArrayList;
import java.util.List;

public class SynchronizeBlock {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		int numberOfProducts = 5;
		
		for (int i = 0; i < numberOfProducts; i++) {
			books.add(Util.generateBook());
		}
		
		BookReader mama = new BookReader("mama", books);
		BookReader tata = new BookReader("tata", books);
		
		mama.t.start();
		tata.t.start();
		
		try {
			mama.t.join();
			tata.t.join();
		} catch (InterruptedException e) {
			System.out.println("Wątek przerwany.");
		}
		
		System.out.println("Koniec programu.");

	}
}
