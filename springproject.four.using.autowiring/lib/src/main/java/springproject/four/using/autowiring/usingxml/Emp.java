package springproject.four.using.autowiring.usingxml;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside Address Setter Method");
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Address Construtor1");
	}

	public Emp() {
		super();
		System.out.println("Inside Address Construtor1");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
