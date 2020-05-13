package pl.marcinblok.com.synchronize;

import java.util.List;

public class PrepareDiscount implements Runnable {
	
	Thread t;
	List<Product> products;
	
	public PrepareDiscount(String employeeName, List<Product> products) {
		t = new Thread(this, employeeName);
		this.products = products;
	}

	@Override
	public void run() {
		for(Product product : products) {
			if(!product.isDiscount()) {
				product.makeDiscount();
			}
		}
	}

}
