package pl.marcinblok.com.examples;

import pl.marcinblok.com.Shopping;
import pl.marcinblok.com.Working;

public class PriorityExample {

	public static void main(String[] args) {
		Working gotuje = new Working("Praca - gotuj�", Thread.MIN_PRIORITY);
		Shopping spozywcze = new Shopping("Zakupy - spo�ywcze", Thread.MAX_PRIORITY);
		Shopping ubrania = new Shopping("Zakupy - ubrania",Thread.NORM_PRIORITY);
		Working sprzatam = new Working("Praca - sprz�tam", 10);

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
			System.out.println("W�tek przerwany.");
		}

		System.out.println("Koniec programu.");
	}

}
