package pl.marcinblok.com.examples;

import pl.marcinblok.com.Shopping;
import pl.marcinblok.com.Working;

public class OrderExample {
	public static void main(String[] args) {
		Working gotuje = new Working("Praca - gotuję");
		Shopping spozywcze = new Shopping("Zakupy - spożywcze");
		Shopping ubrania = new Shopping("Zakupy - ubrania");
		Working sprzatam = new Working("Praca - sprzątam");
		
		try {
			spozywcze.t.start();
			ubrania.t.start();
			spozywcze.t.join();
			ubrania.t.join();

			sprzatam.t.start();
			gotuje.t.start();
			sprzatam.t.join();
			gotuje.t.join();
		} catch (InterruptedException e) {
			System.out.println("Wątek przerwany.");
		}

		System.out.println("Koniec programu.");
	}
}
