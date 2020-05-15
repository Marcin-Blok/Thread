package pl.marcinblok.com.synchronize;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> prices = new ArrayList<>();
		ArrayDeque<Product> products = new ArrayDeque<>();		

		int numberOfProducts = 5000;

		for (int i = 0; i < numberOfProducts; i++) {
			products.add(Util.generateProduct());
		}

		for (Product product : products) {
			prices.add(product.getPrice());
		}

		for (Product product : products) {
			System.out.println(product);
		}

		long startTime = System.currentTimeMillis();		
		
		PrepareDiscount prepareDiscount1 = new PrepareDiscount("Jurek", products);
		prepareDiscount1.t.start();

		PrepareDiscount prepareDiscount2 = new PrepareDiscount("Marian", products);
		prepareDiscount2.t.start();
//
//		PrepareDiscount prepareDiscount3 = new PrepareDiscount("Katarzyna", products);
//		prepareDiscount3.t.start();
//		
//		PrepareDiscount prepareDiscount4 = new PrepareDiscount("Marian", products);
//		prepareDiscount4.t.start();
//
//		PrepareDiscount prepareDiscount5 = new PrepareDiscount("Katarzyna", products);
//		prepareDiscount5.t.start();

		try {
			prepareDiscount1.t.join();
			prepareDiscount2.t.join();
//			prepareDiscount3.t.join();
//			prepareDiscount4.t.join();
//			prepareDiscount5.t.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		long endTime = System.currentTimeMillis();
		
		for (int i = 0; i < products.size(); i++) {
			if ((products.peek().getPrice() + 200) != prices.get(i)) {
				System.out.println("Nie jest równe");
			}
		}
		
		System.out.println("Czas wykonania pracy: "+(endTime-startTime));
	}
}
