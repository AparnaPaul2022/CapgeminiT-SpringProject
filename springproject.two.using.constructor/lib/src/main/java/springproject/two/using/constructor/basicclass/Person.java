package springproject.two.using.constructor.basicclass;

public class Person {

	private Integer personId;
	private String personName;
	private Certificate personCertificate;
	
	public Person(Integer personId, String personName, Certificate personCertificate) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personCertificate = personCertificate;
	}

	@Override
	public String toString() {
		return "Person [personId:" + personId + ", personName:" + personName + ", personCertificate:"
				+ personCertificate + "]";
	}
	
	
}
