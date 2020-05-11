package pl.marcinblok.com;

public class MyThread implements Runnable {
	public Thread t;

	public MyThread() {
		t = new Thread(this, "w¹tek pochodny");
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(t.getName() + " : " + i);
			try {
				t.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
