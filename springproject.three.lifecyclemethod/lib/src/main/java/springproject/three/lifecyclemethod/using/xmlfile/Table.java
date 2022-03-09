package springproject.three.lifecyclemethod.using.xmlfile;

public class Table {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Table [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	

}
