package pl.marcinblok.com;

public class RandomInt {
	
	// Gdy random 0 -> 0 (+5) -> 5
	// Gdy random 1 -> 55 (+5-5) -> 55

	// Math.random() 0 - 1
	// Math.random(max) 0 - max // 0 - 55
	// Math.random(max-min) 0 - (max-min) // 0 - 50
	// Math.random(max-min) + min // min - (max-min) // 5 - 55

	public static int generateIntFromRange(int min, int max) {
		return (int)(Math.random() * (max-min)+5);
	}
}
