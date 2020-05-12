package pl.marcinblok.com.examples;

import pl.marcinblok.com.MyThreadExtendsMethod;

public class ExtendsMethodThreadExample {
	public static void main(String[] args) {
		MyThreadExtendsMethod myThreadExtendsMethod = new MyThreadExtendsMethod("Mój wątek");
		myThreadExtendsMethod.start();
	}
}
