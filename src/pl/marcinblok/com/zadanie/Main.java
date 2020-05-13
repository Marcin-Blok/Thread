package pl.marcinblok.com.zadanie;

public class Main {

	public static void main(String[] args){
	
		Thread mainThread = Thread.currentThread();
		mainThread.setName("Wątek Główny");
		System.out.println(mainThread.getName() + " Początek");
		
		ThreadPainting room1Painting = new ThreadPainting("Malowanie - Pokój 1", 50);
		ThreadFloorLaying room1FloorLaying = new ThreadFloorLaying("Układanie podłogi - Pokój 1", 25);
		ThreadDoorMounting room1DoorMounting = new ThreadDoorMounting("Door Mounting - Pokój 1", 10);
		
		ThreadPainting room2Painting = new ThreadPainting("Malowanie - Pokój 2", 72);
		ThreadFloorLaying room2FloorLaying = new ThreadFloorLaying("Układanie podłogi - Pokój 2", 20);
		ThreadDoorMounting room2DoorMounting = new ThreadDoorMounting("Door Mounting - Pokój 2", 10);
		
		ThreadPainting room3Painting = new ThreadPainting("Malowanie - Pokój 3", 25);
		ThreadFloorLaying room3FloorLaying = new ThreadFloorLaying("Układanie podłogi - Pokój 3", 30);
		ThreadDoorMounting room3DoorMounting = new ThreadDoorMounting("Door Mounting - Pokój 3", 10);
		
		long startTime = System.currentTimeMillis();
		
		room1Painting.t.start();
		room2Painting.t.start();
		room3Painting.t.start();
		
		try {
			room1Painting.t.join();
			room2Painting.t.join();
			room3Painting.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		room1FloorLaying.t.start();			
		room2FloorLaying.t.start();		
		room3FloorLaying.t.start();	
		
		try {
			room1FloorLaying.t.join();
			room2FloorLaying.t.join();		
			room3FloorLaying.t.join();	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
		
		room1DoorMounting.t.start();			
		room2DoorMounting.t.start();	
		room3DoorMounting.t.start();
		
		try {
			room1DoorMounting.t.join();
			room2DoorMounting.t.join();	
			room3DoorMounting.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Czas wykonywania remontu: "+(endTime-startTime));
		// pierwszy test - 15790
		System.out.println(mainThread.getName() + " Koniec");
	}

}
