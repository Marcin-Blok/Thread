package pl.marcinblok.com.examples;

import pl.marcinblok.com.MyThread;

public class IsAliveAndJoinExample {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.t.start();
		
		do {
			System.out.println("Wątek poboczny uruchomiony.");
		} while (myThread.t.isAlive());
		
		try {
			myThread.t.join();
		} catch (InterruptedException e) {
			System.out.println("Wątek przerwany.");
		}
		
		System.out.println("Koniec wątku głównego.");
	}
}
