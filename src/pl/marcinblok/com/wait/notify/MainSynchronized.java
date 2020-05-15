package pl.marcinblok.com.wait.notify;

public class MainSynchronized {
	public static void main(String[] args) throws InterruptedException {

		Car car = new Car("Iveco");
		car.setKm(200);

		
		Driver d1 = new Driver("Marcin", 2);
		Driver d2 = new Driver("Szymon", 4);
		
		Drive marcin = new Drive(d1, car);
		Drive szymon = new Drive(d2, car);

		marcin.t.start();
		szymon.t.start();

		marcin.t.join();
		szymon.t.join();

		System.out.println("Koniec.");
	}
}
