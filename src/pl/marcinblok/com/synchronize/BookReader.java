package pl.marcinblok.com.synchronize;

import java.util.List;

public class BookReader implements Runnable {
	
	Thread t;
	List<Book> books;
	
	public BookReader(String reader, List<Book> books) {
		t = new Thread(this, reader);
		this.books = books;
	}

	@Override
	public void run() {
		for(Book book : books) {
			synchronized(book) {
				if(!book.isReaded()) {
					book.read(t.getName());
					book.setReaded(true);
				}
			}
		}
	}
	
	

}
