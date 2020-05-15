package pl.marcinblok.com.wait.notify;

public class Driver {
	private String name;
	private int limit;

	public Driver(String name, int limit) {
		super();
		this.name = name;
		this.limit = limit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", limit=" + limit + "]";
	}

}
