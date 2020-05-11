package pl.marcinblok.com;

public class MainThreadExample {

	public static void main(String[] args) throws InterruptedException {
		Thread mainThread = Thread.currentThread();
		mainThread.setName("To jest wątek główny");
		
		MyThread myThread = new MyThread();
		myThread.t.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(mainThread.getName()+" : "+i);
			mainThread.sleep(1000);
		}
	}
}
