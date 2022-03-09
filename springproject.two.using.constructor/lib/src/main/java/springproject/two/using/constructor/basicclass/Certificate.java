package springproject.two.using.constructor.basicclass;

public class Certificate {

	private String certificateName;

	public Certificate(String certificateName) {
		super();
		this.certificateName = certificateName;
	}

	@Override
	public String toString() {
		return this.certificateName;
	}
	
	
}
