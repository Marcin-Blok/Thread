package pl.marcinblok.com.synchronize;

public class Product {
	private String name;
	private int price;
	private boolean discount;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public synchronized boolean isDiscount() {
		return discount;
	}

	public void setDiscount(boolean discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", discount=" + discount + "]";
	}

	public synchronized void makeDiscount() {
//		System.out.println("Produkt - "+name);
//		System.out.println("zmieniam cenę");
		price = price - 200;
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		discount = true;
//		System.out.println("Zmieniłem.");
	}

}
