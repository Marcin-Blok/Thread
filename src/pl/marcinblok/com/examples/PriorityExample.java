package pl.marcinblok.com.examples;

import pl.marcinblok.com.Shopping;
import pl.marcinblok.com.Working;

public class PriorityExample {

	public static void main(String[] args) {
		Working gotuje = new Working("Praca - gotuję", Thread.MIN_PRIORITY);
		Shopping spozywcze = new Shopping("Zakupy - spożywcze", Thread.MAX_PRIORITY);
		Shopping ubrania = new Shopping("Zakupy - ubrania",Thread.NORM_PRIORITY);
		Working sprzatam = new Working("Praca - sprzątam", 10);

		spozywcze.t.start();
		ubrania.t.start();
		sprzatam.t.start();
		gotuje.t.start();

		try {
			spozywcze.t.join();
			ubrania.t.join();
			sprzatam.t.join();
			gotuje.t.join();
		} catch (InterruptedException e) {
			System.out.println("Wątek przerwany.");
		}

		System.out.println("Koniec programu.");
	}

}
