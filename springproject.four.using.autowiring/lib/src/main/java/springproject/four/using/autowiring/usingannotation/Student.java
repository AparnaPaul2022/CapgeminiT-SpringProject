package springproject.four.using.autowiring.usingannotation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("studentdetails2")
	private StudentDetails studentdetails;

	public StudentDetails getStudentdetails() {
		return studentdetails;
	}
	
	public void setStudentdetails(StudentDetails studentdetails) {
		this.studentdetails = studentdetails;
		System.out.println("Inside setter method");
	}


	public Student(StudentDetails studentdetails) {
		super();
		this.studentdetails = studentdetails;
		System.out.println("Inside constructor");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentdetails=" + studentdetails + "]";
	}
	
	

}
