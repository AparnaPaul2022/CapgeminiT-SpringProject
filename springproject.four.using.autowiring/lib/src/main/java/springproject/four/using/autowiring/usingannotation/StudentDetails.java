package springproject.four.using.autowiring.usingannotation;

public class StudentDetails {
	private String sId;
	private String sName;
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "StudentDetails [sId=" + sId + ", sName=" + sName + "]";
	}
	
	

}
