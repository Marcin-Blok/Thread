package pl.marcinblok.com.zadanie;

public class ThreadPainting implements Runnable {

	Thread t;
	
	public ThreadPainting(String name) {
		t = new Thread(this, name);
	}
	
	
	
	
	@Override
	public void run() {
		
		
	}

}
