package pl.marcinblok.com.zadanie;

public class ThreadDoorMounting implements Runnable {

	Thread t;
	
	public ThreadDoorMounting(String name) {
		t = new Thread(this, name);
	}
	
	
	
	@Override
	public void run() {
		
		
	}

}
