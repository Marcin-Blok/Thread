package pl.marcinblok.com.wait.notify;

public class Car {

	private String name;
	private int km;

	public Car(String name) {
		super();
		this.name = name;
	}

	void drive(Driver driver) {
		do {
			if (driver.getLimit() <= 0) {
				try {
					System.out.println("Czekam... " + driver.getName());
					wait(10000);
					System.out.println("Jadę dalej... " + driver.getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.setLimit(4);
				notify();
			} 

			System.out.println("Prowadzę " + driver.getName() + "... (" + km + ")");
			km--;
			driver.setLimit(driver.getLimit() - 1);
			System.out.println("Konczę " + driver.getName() + "... (" + km + ")");

		} while (km > 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
}
