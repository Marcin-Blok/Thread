package pl.marcinblok.com.zadanie;

public class ThreadFloorLaying implements Runnable {

	public Thread t;
	public int howLong;
	
	public ThreadFloorLaying(String name, int howLong) {
		t = new Thread(this, name);
		this.howLong = howLong;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < howLong; i++) {
			System.out.println(t.getName());
//			try {
//				t.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
		
	}

}
