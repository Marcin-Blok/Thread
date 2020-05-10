package pl.marcinblok.com;

public class MainThreadExample {

	public static void main(String[] args) throws InterruptedException {
		Thread mainThread = Thread.currentThread();
		mainThread.setName("To jest w¹tek g³ówny");
		
		MyThread myThread = new MyThread();
		myThread.t.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(mainThread.getName()+" : "+i);
			mainThread.sleep(1000);
		}
	}
}
