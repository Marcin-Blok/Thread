package pl.marcinblok.com;

public class Shopping implements Runnable {
	
	public Thread t;
	
	public Shopping(String name) {
		t = new Thread(this, name);
	}
	
	public Shopping(String name, int priority) {
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
