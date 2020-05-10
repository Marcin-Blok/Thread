package pl.marcinblok.com;

public class IncrementThread implements Runnable {
	Thread t;

	public IncrementThread(String name) {
		t = new Thread(this, "increment thread " + name);
	}

	@Override
	public void run() {
		
//		try {
			do {
				System.out.println(t.getName()+" ("+(++Counter.number)+")");
//				t.sleep(500);
			} while(Counter.number < 100000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
