package pl.marcinblok.com.synchronize;

public class Book {
	private String name;
	private boolean readed;

	public Book(String name) {
		super();
		this.name = name;
	}
	
	public void read(String reader) {
		System.out.println(reader+" czyta książkę "+name+"...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted exception.");
		}
		System.out.println(reader+" przeczytał książkę "+name+"...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}

}
