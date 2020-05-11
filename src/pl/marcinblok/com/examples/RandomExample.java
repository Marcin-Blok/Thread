package pl.marcinblok.com.examples;

import pl.marcinblok.com.RandomInt;

public class RandomExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			// 5 - 55
			int min = 5;
			int max = 500;

			// Random 0 -1
			System.out.println(RandomInt.generateIntFromRange(min, max));

		}

	}

}
