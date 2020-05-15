package pl.marcinblok.com.wait.notify;

public class Drive implements Runnable {
	Thread t;
	Car car;
	Driver driver;

	public Drive(Driver driver, Car car) {
		t = new Thread(this, driver.getName());
		this.driver = driver;
		this.car = car;
	}

	@Override
	public void run() {
		synchronized (car) {
			car.drive(driver);
		}
	}

}
