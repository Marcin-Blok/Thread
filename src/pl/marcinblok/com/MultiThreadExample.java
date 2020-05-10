package pl.marcinblok.com;

public class MultiThreadExample {
	public static void main(String[] args) {
		IncrementThread it1 = new IncrementThread("1");
		IncrementThread it2 = new IncrementThread("2");
		IncrementThread it3 = new IncrementThread("3");
		
		it1.t.start();
		it2.t.start();
		it3.t.start();
	}

}
