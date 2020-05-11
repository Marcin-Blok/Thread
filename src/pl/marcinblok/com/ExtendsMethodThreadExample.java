package pl.marcinblok.com;

public class ExtendsMethodThreadExample {
	public static void main(String[] args) {
		MyThreadExtendsMethod myThreadExtendsMethod = new MyThreadExtendsMethod("Mój wątek");
		myThreadExtendsMethod.start();
	}
}
