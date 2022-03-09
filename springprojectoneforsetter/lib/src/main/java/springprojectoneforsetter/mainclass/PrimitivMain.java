package springprojectoneforsetter.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springprojectoneforsetter.primitiv.datatypes.Student;

public class PrimitivMain {

	public static void main(String[] args) {
		String springConfigurationFile = "primitiveconfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		
		
		Student student1=context.getBean("student1", Student.class);
		Student student2=context.getBean("student2", Student.class);
		
		System.out.println(student1);
		System.out.println(student1.getStudentId());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getStudentAddress());
		System.out.println("--------------------------------------------------");
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getStudentAddress());
	}

}
