package pl.marcinblok.com;

public class Working implements Runnable {
	public Thread t;

	public Working(String name) {
		t = new Thread(this, name);
	}
	
	public Working(String name, int priority) {
		t = new Thread(this, name);
		t.setPriority(priority);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(t.getName() + " : " + i);
			try {
				t.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
