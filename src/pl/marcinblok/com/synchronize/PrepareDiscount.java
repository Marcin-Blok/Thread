package pl.marcinblok.com.synchronize;

import java.util.ArrayDeque;
import java.util.List;

public class PrepareDiscount implements Runnable {

	Thread t;
	ArrayDeque<Product> products;

	public PrepareDiscount(String employeeName, ArrayDeque<Product> products) {
		t = new Thread(this, employeeName);
		this.products = products;
	}

	@Override
	public void run() {
		do {
			Product product = products.poll();
			if(product != null) {
				product.makeDiscount();
//				System.out.println(product);
			}
		} while (!products.isEmpty());
	}

}
